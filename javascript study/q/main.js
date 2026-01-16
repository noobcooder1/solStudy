/* 가위 바위 보 게임 (v0.3.0)

[기존 기능]
- 가위바위보 기능
- 유저 가위바위보 입력 시 예외처리 추가
v0.3.0 에서 추가 된 기능
- 유저 가위바위보 입력을 입력창에서 받도록 수정



todo:
- 가위바위보 게임을 단판이 아닌 무한으로 가능하게 변경
// t1.addEventListener('click', btn_listener);

// 선언 */
var userRpc = "";
var comRpc = "";

var rpcInputText;
var wrongCount = 0;  // 틀린 횟수 (전역 변수)

// ***** 중요 ******
window.onload = function () {
    rpcInputText = document.getElementById("rpc_input_text");       // 연결
}

function rpcInputButtonClick() {
    userRpc = document.getElementById("rpc_input_text").value;

    // 올바른 입력인지 확인
    if (userRpc != "가위" && userRpc != "바위" && userRpc != "보") {
        wrongCount++;
        if (wrongCount >= 3) {
            while (true) {
                let conresult = confirm("경고를 무시하였기에, 혼나게됩니다. 알림을 멈추려면 네를 누르세요.");
                if (conresult) {
                    wrongCount = 0;
                    alert("다시는 그러지마세요.");
                    break;
                } else {
                    alert("제대로 선택하지않았기에 알겠다고 선택할때까지 반복됩니다.");
                }
            }
        } else {
            alert(wrongCount + `번 틀렸습니다. ${3 - wrongCount}번 더 틀리면 혼나게됩니다.`);
        }
        return;  // 함수 종료 → 다시 입력할 수 있음!
    }

    // 올바른 입력이면 틀린 횟수 초기화
    wrongCount = 0;

    // 컴퓨터 난수 발생 시키기 (1~3)
    comRpc = Math.floor(Math.random() * 3 + 1);
    if (comRpc == 1) {
        comRpc = "가위";
    }
    if (comRpc == 2) {
        comRpc = "바위";
    }
    if (comRpc == 3) {
        comRpc = "보";
    }

    dw("유저:" + userRpc);
    br();
    dw("컴:" + comRpc);
    br();

    var winDrawLose = "";
    switch (userRpc) {
        case "가위":
            switch (comRpc) {
                case "가위":
                    winDrawLose = "DRAW";
                    break;
                case "바위":
                    winDrawLose = "패배";
                    break;
                case "보":
                    winDrawLose = "승리";
                    break;
            }
            break;
        case "바위":
            switch (comRpc) {
                case "가위":
                    winDrawLose = "승리";
                    break;
                case "바위":
                    winDrawLose = "DRAW";
                    break;
                case "보":
                    winDrawLose = "패배";
                    break;
            }
            break;
        case "보":
            switch (comRpc) {
                case "가위":
                    winDrawLose = "패배";
                    break;
                case "바위":
                    winDrawLose = "승리";
                    break;
                case "보":
                    winDrawLose = "DRAW";
                    break;
            }
            break;
    }
    dw(winDrawLose);
    br();
    hr();

    // 결과를 먼저 표시하고, 약간의 지연 후 계속할지 물어보기
    setTimeout(function () {
        let playAgain = confirm("계속하시겠습니까?");
        if (playAgain) {
            // 입력창 비우기
            document.getElementById("rpc_input_text").value = "";
            document.getElementById("rpc_input_text").focus();  // 입력창에 포커스
        } else {
            alert("게임을 종료합니다. 감사합니다!");
        }
    }, 100);  // 100ms 지연
}