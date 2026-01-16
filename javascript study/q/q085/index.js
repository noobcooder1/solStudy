//js
var isOpened = false;

var btn;
var imgCat;

window.onload = function(){
    btn = document.getElementById("btn");
    imgCat = document.getElementById("cat");
    btn.addEventListener("click",popup);
}

function popup(){
    if(isOpened == false){
        imgCat.style.display = "block";
        isOpened = true;
    } else {
        imgCat.style.display = "none";
        isOpened = false;
    }
}


