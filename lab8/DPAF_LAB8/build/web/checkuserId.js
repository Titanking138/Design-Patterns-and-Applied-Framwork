/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var xhr;
var useridField;
var statusField;
function init() {
    useridField = document.getElementById("userid");
    statusField = document.getElementById("status");
}
function doChecking() {
    var url = "CheckUserId?userid=" + escape(useridField.value);
    xhr = createXHRObject();
    xhr.open("GET", url, true);
    xhr.onreadystatechange = callback;
    xhr.send(null);
}
function createXHRObject() {
    var xhrObject;
    try {
        // Opera 8.0+, Firefox, Safari
        xhrObject = new XMLHttpRequest();
    } catch (e) {
        // Internet Explorer Browsers
        try {
            xhrObject = new ActiveXObject("Msxml2.XMLHTTP");
        } catch (e) {
            try {
                xhrObject = new ActiveXObject("Microsoft.XMLHTTP");
            } catch (e) {
                // Something went wrong
                alert("Your browser broke!");
                return false;
            }
        }
    }
    return xhrObject;
}
function callback() {
    if (xhr.readyState == 4) {
        if (xhr.status == 200) {
            setMessaage(xhr.responseXML);
        }
    }
}
function setMessaage(responseXML) {
    var statusElement = responseXML.getElementsByTagName("status")[0];
    var status = statusElement.childNodes[0].nodeValue;
    if (status == "NotAvailable") {
        statusField.innerHTML = "<font color=red>This User Id is already exist. Please try with different.</font>";
    } else {
        statusField.innerHTML = "<font color=green>This is valid UserID.</font>";
    }
}