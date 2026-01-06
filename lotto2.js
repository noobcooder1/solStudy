let lotto = [];
let input = [];
let bonusc;
let bonusLotto;
let rank;

window.onload = function () {
    document.getElementById("hello").innerHTML = '<img src="../이미지/미라클.jpg" alt="미라클">';
    alert("지금부터 로또게임을 시작합니다. 1부터 45까지의 숫자를 6번 입력해서 많이 맞히면 맞힐수록 보상이 높아집니다.");
    setTimeout(checkLotto, 1000);
};

function setLotto() {
    while (lotto.length < 7) {
        let num = Math.floor(Math.random() * 45) + 1;
        if (!lotto.includes(num)) {
            lotto.push(num);
        }
    }
    bonusLotto = lotto.pop();
}

function selectLotto() {
    input.push(parseInt(prompt("첫 번째 번호를 고르세요.")));
    input.push(parseInt(prompt("두 번째 번호를 고르세요.")));
    input.push(parseInt(prompt("세 번째 번호를 고르세요.")));
    input.push(parseInt(prompt("네 번째 번호를 고르세요.")));
    input.push(parseInt(prompt("다섯 번째 번호를 고르세요.")));
    input.push(parseInt(prompt("여섯 번째 번호를 고르세요.")));
}


function checkLotto() {
    setLotto();
    selectLotto();
    let correct = 0;
    let getMoney = 0;
    let bonusCorrect = [];

    //로또 번호 체크부분
    for (let i = 0; i < lotto.length; i++) {
        if (lotto.includes(input[i])) {
            document.getElementById("hello").innerHTML += `<br> ${input[i]} 맞았습니다.<br>`;
            correct++;
        }
        else {
            bonusCorrect.push(input[i]);
        }
    }

    //보너스 번호 체크부분
    if (input.includes(bonusLotto)) {
        document.getElementById("hello").innerHTML += "<br>보너스 당첨<br>";
        bonusc = "성공";
    }
    else {
        bonusc = "실패";
    }


    //등수 체크부분
    if (correct == 6) {
        getMoney = 100000000000;
        rank = "1등";
    }
    if (5 == correct && bonusc == "성공") {
        getMoney = 10000000000;
        rank = "2등"
    }
    if (correct == 5 && bonusc == "실패") {
        getMoney = 1000000000;
        rank = "3등"
    }
    if (correct == 4) {
        getMoney = 1000000;
        rank = "4등"
    }
    if (correct == 3) {
        getMoney = 100000;
        rank = "5등"
    }
    else {
        document.getElementById("hello2").innerHTML += "<br><br> 아쉽게도 순위에 들지못했어요. 다음엔 성공하시길!";
        rank = "꽝";
        getMoney = 0;
    }

    document.getElementById("hello").innerHTML += "<br><br>당첨번호는 " + lotto + "이고, 당신이 입력한 번호는" + input + "입니다. <br>";
    document.getElementById("hello").innerHTML += "맞힌 번호는 " + correct + `개이므로 ${rank}입니다.<br>`;
    document.getElementById("hello").innerHTML += "보너스 번호는 " + bonusLotto + "입니다. 보너스 맞히기 " + bonusc + "하였습니다.<br>";
    document.getElementById("hello").innerHTML += "당첨금은 " + getMoney + "원입니다.";
}
