
    var base_url = window.location.origin;

    /*var lastActiveTimeMs = new Date().getTime(); //This is set to current time on page load
    var SESSION_TIMEOUT_MILLIS = 9*1000; //35 mins in milliseconds
    var CHECK_TIME_MILLIS = 10*1000; //1 mins in milliseconds

    setTimeout(fnCheckTimeout, CHECK_TIME_MILLIS); //Check the timeout once in a minute
    function fnCheckTimeout(){
    var curMs = new Date().getTime();
        alert(curMs);
        if( (curMs-lastActiveTimeMs)>SESSION_TIMEOUT_MILLIS ){
            //window.location.href = 'signout.html';
            window.location.replace(base_url+"/payment/login");
        }
    }

    function myFunction() {
      myVar = setTimeout(alertFunc, 1000);
    }
    */

function logout(){
window.location.replace(base_url+"/payment/login");

}

