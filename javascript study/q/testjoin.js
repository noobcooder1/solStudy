document.getElementById("join1").innerHTML += `
<input type="text" id="name" minlength="2" maxlength="30" placeholder="이름"><br><br>
<input type="text" id="id" minlength="4" maxlength="12" placeholder="아이디"><br><br>
<input type="password" id="pw" minlength="6" maxlength="20" required placeholder="비밀번호"><br><br>
<input type="password" id="pw2" minlength="6" maxlength="20" required placeholder="비밀번호 확인"><br><br>
<input type="email" id="email" name = "이메일" placeholder="이메일"><br><br>
<input type="date" id="birthday" name = "생일" placeholder="생년월일"><br><br>
<button id="btn" type="button">가입</button>
`

// 모든 코드를 window.onload 안에 넣어서 DOM이 완전히 로드된 후 실행
window.onload = function () {
    let name = document.getElementById("name");
    let id = document.getElementById("id");
    let pw = document.getElementById("pw");
    let pw2 = document.getElementById("pw2");
    let email = document.getElementById("email");
    let birthday = document.getElementById("birthday");
    let btn = document.getElementById("btn");

    btn.addEventListener("click", check);

    function check() {
        if (!name.value || !id.value || !pw.value || !pw2.value || !email.value || !birthday.value) {
            alert("모든 정보를 입력해주세요.");
        }
        else if (pw.value !== pw2.value) {
            alert("비밀번호가 일치하지 않습니다.");
        }

        else if (name.value.length < 2 || id.value.length < 4 || pw.value.length < 6 || email.value.length < 6) {
            alert("입력한 정보가 너무 짧습니다. 이름 최소 2자이상, 아이디 최소 4자이상, 비밀번호 최소 6자이상, 이메일 최소 6자이상입력하세요.");
        }

        // 세션은(브라우저 닫으면 삭제됨)
        else {
            sessionStorage.setItem("savedId", id.value);
            sessionStorage.setItem("savedPw", pw.value);
            sessionStorage.setItem("savedName", name.value);

            alert("환영합니다. 회원가입이 완료되었습니다!");
            location.href = "test.html";
        }
    }
}
