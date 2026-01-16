let lotto1, lotto2, lotto3, lotto4, lotto5, lotto6;
let input1, input2, input3, input4, input5, input6;
let bonusc;

window.onload = function () {
    document.getElementById("hello").innerHTML = '<img src="이미지/미라클.jpg" alt="미라클">';
    alert("지금부터 로또게임을 시작합니다. 1부터 45까지의 숫자를 6번 입력해서 많이 맞히면 맞힐수록 보상이 높아집니다.");
    setTimeout(checkLotto, 1000);
};

function setLotto() {
    lotto1 = Math.floor(Math.random() * 45) + 1;
    lotto2 = Math.floor(Math.random() * 45) + 1;
    lotto3 = Math.floor(Math.random() * 45) + 1;
    lotto4 = Math.floor(Math.random() * 45) + 1;
    lotto5 = Math.floor(Math.random() * 45) + 1;
    lotto6 = Math.floor(Math.random() * 45) + 1;
    bonusLotto = Math.floor(Math.random() * 45) + 1;
}

function selectLotto() {
    input1 = parseInt(prompt("첫 번째 번호를 고르세요."));
    input2 = parseInt(prompt("두 번째 번호를 고르세요."));
    input3 = parseInt(prompt("세 번째 번호를 고르세요."));
    input4 = parseInt(prompt("네 번째 번호를 고르세요."));
    input5 = parseInt(prompt("다섯 번째 번호를 고르세요."));
    input6 = parseInt(prompt("여섯 번째 번호를 고르세요."));
}


function checkLotto() {
    setLotto();
    selectLotto();
    let correct = 0;
    let getMoney = 0;
    let bonusCorrect = [];
    if (input1 == lotto1) {
        document.getElementById("hello").innerHTML += "<br>첫 번째 숫자 당첨<br>";
        correct++;
        getMoney += 1000;
    }
    else {
        bonusCorrect.push(input1);
    }
    if (input2 == lotto2) {
        document.getElementById("hello").innerHTML += "<br>두 번째 숫자 당첨<br>";
        correct++;
        getMoney += 1000;
    }
    else {
        bonusCorrect.push(input2);
    }
    if (input3 == lotto3) {
        document.getElementById("hello").innerHTML += "<br>세 번째 숫자 당첨<br>";
        correct++;
        getMoney += 1000;
    }
    else {
        bonusCorrect.push(input3);
    }
    if (input4 == lotto4) {
        document.getElementById("hello").innerHTML += "<br>네 번째 숫자 당첨<br>";
        correct++;
        getMoney += 1000;
    }
    else {
        bonusCorrect.push(input4);
    }
    if (input5 == lotto5) {
        document.getElementById("hello").innerHTML += "<br>다섯 번째 숫자 당첨<br>";
        correct++;
        getMoney += 1000;
    }
    else {
        bonusCorrect.push(input5);
    }
    if (input6 == lotto6) {
        document.getElementById("hello").innerHTML += "<br>여섯 번째 숫자 당첨<br>";
        correct++;
        getMoney += 1000;
    }
    else {
        bonusCorrect.push(input6);
    }
    if (bonusCorrect.includes(bonusLotto)) {
        document.getElementById("hello").innerHTML += "<br>보너스 당첨<br>";
        bonusc = "성공";
        getMoney += 1000;
    }
    else {
        bonusc = "실패";
    }
    document.getElementById("hello").innerHTML += "<br><br>당첨번호는 " + lotto1 + ", " + lotto2 + ", " + lotto3 + ", " + lotto4 + ", " + lotto5 + ", " + lotto6 + "입니다.<br>";
    document.getElementById("hello").innerHTML += "맞힌 번호는 " + correct + "개입니다.<br>";
    document.getElementById("hello").innerHTML += "보너스 번호는 " + bonusLotto + "입니다. 보너스 맞히기 " + bonusc + "하였습니다.<br>";
    document.getElementById("hello").innerHTML += "당첨금은 " + getMoney + "원입니다.";
}
