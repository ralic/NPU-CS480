/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//< script id = "EnlargeDecrease" >
var btnE = document.getElementById("enlarge");
var btnD = document.getElementById("decrease");
btnE.addEventListener("click", funcE, false);
btnD.addEventListener("click", funcD, false);
function funcE(event) {
    elem = document.getElementById("image1");
    elem.height = elem.height * 1.1;
    elem.width = elem.height * 1.1;
}
function funcD(event) {
    elem = document.getElementById("image1");
    elem.height = elem.height * 0.9;
    elem.width = elem.height * 0.9;
}
//< /script>