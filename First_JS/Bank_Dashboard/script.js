document.addEventListener("DOMContentLoaded", function () {
    // Logic for handling navigation tabs
    const tabs = document.querySelectorAll(".tabs a");
  
    tabs.forEach((tab) => {
      tab.addEventListener("click", function (event) {
        event.preventDefault();
        tabs.forEach((t) => t.classList.remove("active"));
        tab.classList.add("active");
  
        // Add your logic based on the clicked tab
        const tabText = tab.innerText.trim();
        alert(`Navigated to ${tabText} tab.`);
      });
    });
  
    // Logic for handling user profile button
    const userProfileBtn = document.querySelector(".user-profile");
    userProfileBtn.addEventListener("click", function () {
      const userName = userProfileBtn.querySelector("span").innerText.trim();
      alert(`Clicked on user profile for ${userName}.`);
    });
  
    // Additional logic can be added for other interactive elements on the page
  
    // Example: Logic for handling the "Save" button in the payment section
    const saveButton = document.querySelector(".save-button");
    saveButton.addEventListener("click", function () {
      alert("Clicked on Save button in the payment section.");
    });
  
    // Example: Logic for handling the "More settings" button in the payment section
    const settingsButton = document.querySelector(".settings-button");
    settingsButton.addEventListener("click", function () {
      alert("Clicked on More settings button in the payment section.");
    });
  
    // You can continue adding similar logic for other interactive elements on your page.
  });
  