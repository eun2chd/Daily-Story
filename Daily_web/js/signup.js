window.onload = function () {

    verifyEmail = function () {

        $Img = document.querySelector(".check_Img");

        var emailVal = document.getElementById('email').value;
        var regExp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;

        console.log(emailVal);

        if (emailVal.match(regExp) != null) {
            $Img.src = "../imges/check.png"

        }
        else {
            $Img.src = "../imges/remove.png"
        }

        if (emailVal != null) {
            console.log('빈값');
        }


    };


}