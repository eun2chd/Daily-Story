window.onload = function () {

    verifyEmail = function () {

        var emailVal = document.getElementById('email').value;
        var regExp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;

        console.log(emailVal);


        if (emailVal.match(regExp) != null) {
            alert('Good!');
        }
        else {
            alert('Error');
        }
    };


}