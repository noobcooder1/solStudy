document.getElementById("hi").innerHTML +=
    `<label>id:<input type="text" id = "id"></label><br>
<label>pw:<input type="password" id = "pw"></label><br>
<button onclick="login()">login</button>&nbsp;&nbsp;&nbsp;&nbsp;<button onclick="join()">회원가입</button><br><br>`

function login() {
    // sessionStorage에서 저장된 회원 정보 가져오기 (브라우저 닫으면 삭제됨)
    let savedId = sessionStorage.getItem("savedId");
    let savedPw = sessionStorage.getItem("savedPw");
    let savedName = sessionStorage.getItem("savedName");

    let inputId = document.getElementById("id").value;
    let inputPw = document.getElementById("pw").value;

    if (!savedId) {
        alert("가입된 회원이 없습니다. 회원가입 후 이용해주세요.");
    }
    else if (inputId !== savedId) {
        alert("없는 아이디입니다. 아이디가 없으시면 회원가입 후 이용해주세요.");
    }
    else if (inputPw !== savedPw) {
        alert("비밀번호가 일치하지 않습니다.");
    }
    else {
        alert(`${savedName}(${inputId}) 회원님 반갑습니다!`);
        window.location.href = "file:///Users/a1/Desktop/rpg/rpgmain.html";
    }
}

function ok() {
    let gender = document.querySelector('input[name="sex"]:checked');
    if (gender) {
        alert(`성별 : ${gender.value}`);
    }
    else {
        alert("성별을 선택해주세요");
    }
}

function join() {
    window.location.href = "testjoin.html";
}
