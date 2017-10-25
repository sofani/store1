"use strict";
window.onload = function() { 
    var $ = function(id) { return document.getElementById(id); };
    
    var slides = [
        {href:"8601_cover.jpg", title:"Yemane Barya (zemen)"}, 
        {href:"jr01_cover.jpg", title:"Abraham Afewerki(semay)"},
        {href:"pf01_cover.jpg", title:"Helen Meles (fkri)"},
        {href:"pf02_cover.jpg", title:"yohannes shishay(gize)"},
        {href:"8601_cover.jpg", title:"Day's End"}
    ];
    myapp.slideshow.loadImages(slides).startSlideShow($("image"), $("caption"));
    
    $("play_pause").onclick = myapp.slideshow.createToggleHandler();
    $("change_speed").onclick = function() {
        var msg = "Current speed is ".concat(myapp.slideshow.getSpeed,
            " milliseconds.\n", 
            "Please enter a new speed in milliseconds (200 min).");
        var ms = prompt(msg, 2000);
        myapp.slideshow.changeSpeed(ms).startSlideShow();
    };
    $("change_caption").onclick = function() {
        var index = parseInt($("caption").title);
        var caption = prompt("Please enter a new caption.");
        myapp.slideshow.changeCaption(index, caption).startSlideShow();
    };
};