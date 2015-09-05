/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var elem2 = document.getElementById("image1");
//            if (elem2) { // check if elem2 is null
elem2.addEventListener("click", myfuncR, false);
function myfuncR(event) {
    this.src = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSwHaUxx4XN2h-GT_T_-WdN0k1R7GfLG9p9G1id76cGu94F5kzm";
}
function reset() {
    document.getElementById("image1").src = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRJnL5igxe0cbVXfKFRru_4AhveDBDF3XSydUoPLdBvFb0I6AXB";
}

