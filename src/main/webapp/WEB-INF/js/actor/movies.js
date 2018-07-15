//初始化方法
$(document).ready(function(){
    var myVideo = $('#myVideo')[0];
    var tol = 0;
    // playBySeconds(100);
    myVideo.addEventListener("loadedmetadata", function () {
        tol = myVideo.duration;//获取总时长
    });
    //播放时间点更新时
    myVideo.addEventListener("timeupdate", function () {
        var currentTime = myVideo.currentTime;//获取当前播放时间
        $('#ctime').val(currentTime);
        // console.log(currentTime);//在调试器中打印
    });
    //音量改变时
    myVideo.addEventListener("volumechange", function () {
        var volume = myVideo.volume;//获取当前音量
        console.log(volume);//在调试器中打印
    });
    //change time
    $('#submit-time').click(function () {
        var video=$('#myVideo')[0];
        var time=$('#time').val();
        video.currentTime=time;
    });
    //change time
    $('#submit-exceed').click(function () {
        var video=$('#myVideo')[0];
        video.currentTime=video.currentTime + 10;
    });
    //change name
    $('#submit-name').click(function () {
        var name=$('#name').val();
        window.location.href="http://localhost:8080/alarm/actor/movies?name="+name;
    });
});


//设置音量
function setVol(num) {
    video.volume = num;
}

//设置播放点
function playBySeconds(num) {
    video.currentTime = num;
}

//start
function play() {
    video.play();
}

//暂停
function pause() {
    video.pause();
}