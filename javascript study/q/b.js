let correctNumber = Math.floor(Math.random() * 10) + 1;
window.onload = function () {
    document.getElementById("hello").innerHTML = '<img src="이미지/미라클.jpg" alt="미라클">';

    setTimeout(startGame, 1000);
};

function startGame() {
    while (true) {
        let max = prompt("1부터 10까지의 숫자중 랜덤한 정수하나를 맞추는 게임을 합니다. 숫자를 입력하세요.");
        if (max != correctNumber) {
            alert("틀렸습니다.");
        }
        else {
            alert("맞았습니다.");
            window.location.href = "./bb.html";
            break;
        }
    }
}
