
function addNewWEField() {
    // console.log("Adding new field..");

    let newNode = document.createElement('textarea');
    newNode.classList.add('form-control');
    newNode.classList.add('weField');
    newNode.classList.add('mt-2');
    newNode.setAttribute('rows', 3);
    newNode.setAttribute('placeholder', 'Enter here');

    let weOb = document.getElementById('we');
    let weAddButtonOb = document.getElementById('weAddButton');

    weOb.insertBefore(newNode, weAddButtonOb);

}

function addNewAQField() {
    let newNode = document.createElement('textarea');
    newNode.classList.add('form-control');
    newNode.classList.add('aqField');
    newNode.classList.add('mt-2');
    newNode.setAttribute('rows', 3);
    newNode.setAttribute('placeholder', 'Enter here');

    let aqOb = document.getElementById('aq');
    let aqAddButtonOb = document.getElementById('aqAddButton');

    aqOb.insertBefore(newNode, aqAddButtonOb);
}

//generate cv
function generateCV() {
    // console.log("generating cv..");
    let nameField = document.getElementById("nameField").value;
    let objectiveField = document.getElementById("objectiveField").value;

    let nameT1 = document.getElementById("nameT1");

    nameT1.innerHTML = nameField;

    //direct
    //name
    document.getElementById("nameT2").innerHTML = nameField;
    document.getElementById("objectiveT").innerHTML = objectiveField;
    //contact
    document.getElementById("contactT").innerHTML = document.getElementById("contactField").value;
    //address
    document.getElementById("addressT").innerHTML = document.getElementById("addressField").value;
    //links
    document.getElementById("fbT").innerHTML = document.getElementById("fbField").value;

    document.getElementById("instaT").innerHTML = document.getElementById("instaField").value;

    document.getElementById("linkedT").innerHTML = document.getElementById("linkedField").value;

    //we
    let wes = document.getElementsByClassName("weField");
    let str = "";
    for (const e of wes) {
        str = str + `<li> ${e.value}</li>`;
    }

    document.getElementById("weT").innerHTML = str;

    //aq

    let aqs = document.getElementsByClassName("aqField");
    let str1 = '';
    for (const e of aqs) {
        str1 += `<li> ${e.value}</li>`
    }

    document.getElementById("aqT").innerHTML = str1;

    //code for setting image
    let file = document.getElementById('imgField').files[0];

    console.log(file);

    let reader = new FileReader();

    reader.readAsDataURL(file);

    // console.log(reader.result);

    //set the image to  template

    reader.onloadend=function(){
        document.getElementById('imgTemplate').src = reader.result;
    }

    document.getElementById("cv-form").style.display = 'none';
    document.getElementById('cv-template').style.display = 'block'

}

//printing cv

function printCV() {
    window.print();
}