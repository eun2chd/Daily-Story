<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Daily-Login</title>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@400;500;700&display=swap" rel="stylesheet">
    <script src="https://kit.fontawesome.com/582f2d7ab6.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="/css/signin.css">
</head>

<body>
    <div class="wrap">
        <div class="login">
            <h2>Log-in</h2>
            <div class="login_sns">
                <li><a href=""><img src="/imges/google.png" alt=""></a></li>
                <li><a href=""><img src="/imges/naver.png" alt=""></a></li>
                <li><a href=""><img src="/imges/kakao.png" alt=""></a></li>
            </div>
            <div class="login_id">
                <h4>E-mail</h4>
                <input type="email" name="" id="" placeholder="Email">
            </div>
            <div class="login_pw">
                <h4>Password</h4>
                <input type="password" name="" id="" placeholder="Password">
            </div>
            <div class="login_etc">
                <div class="checkbox">
                    <input type="checkbox" name="" id=""> 아이디 저장
                </div>
                <div class="forgot_pw">
                    <a href="">비밀번호를 잊으셨나요??</a>
                </div>

            </div>

            <div class="make-account">
                <a href="/auth/signup_term">게정이 없으신가요?</a>
            </div>




            <div class="submit">
                <input type="submit" value="로그인">
            </div>
        </div>
    </div>
</body>

</html>