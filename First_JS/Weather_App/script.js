const apikey = "df7c0a03fe44bfaf23674c0665cfe077";

const main = document.getElementById("main");
const form = document.getElementById("form");
const search = document.getElementById("search");

const url = (city) =>
  `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${apikey}`;

async function getWeatherByLocation(city) {
  try {
    var div = document.getElementById("hidden_div");
    div.style.display = '';
    const resp = await fetch(url(city), { mode: "cors" });

    if (!resp.ok) {
      throw new Error(`HTTP error! Status: ${resp.status}`);
    }

    const respData = await resp.json();
    console.log(respData);

    addWeatherToPage(respData);
    div.style.display = 'none';
  } catch (error) {
    div.style.display = 'none';
    console.error("Error fetching weather data:", error.message);
  }
}

function addWeatherToPage(data) {
 
    const tempCelsius = KtoC(data.main.temp);
    const humidity = data.main.humidity;
    const windSpeed = data.wind.speed;
    const cityName = data.name;
    const country = data.sys.country;
    const sunriseTimestamp = data.sys.sunrise * 1000; // Convert to milliseconds
    const sunsetTimestamp = data.sys.sunset * 1000; // Convert to milliseconds
    const weatherMain = data.weather[0].main;
    const weatherDescription = data.weather[0].description;
  
    const weather = document.createElement("div");
    weather.classList.add("weather");
  
    weather.innerHTML = `
      <h2><img src="https://openweathermap.org/img/wn/${data.weather[0].icon}@2x.png" /> ${tempCelsius}°C <img src="https://openweathermap.org/img/wn/${data.weather[0].icon}@2x.png" /></h2>
      <small>${weatherMain} - ${weatherDescription}</small>
      <p>City: ${cityName}, ${country}</p>
      <div class="more-info">
        <p>Humidity: <span>${humidity}%</span></p>
        <p>Wind Speed: <span>${+Math.trunc(windSpeed * 3.16)} km/h</span></p>
        <p>Sunrise: <span>${new Date(sunriseTimestamp).toLocaleTimeString()}</span></p>
        <p>Sunset: <span>${new Date(sunsetTimestamp).toLocaleTimeString()}</span></p>
        <p>Pressure: <span>${data.main.pressure} hPa</span></p>
        <!-- Add more information as needed -->
      </div>
    `;
  
    // cleanup
    main.innerHTML = "";
    main.appendChild(weather); 
  }
  

function KtoC(K) {
  return Math.floor(K - 273.15);
}

form.addEventListener("submit", (e) => {
  e.preventDefault();

  const city = search.value;

  if (city) {
    getWeatherByLocation(city);
  }
});
