// 랜덤 숫자 생성
var random = Math.floor(Math.random() * 10) + 1;
var s = "주사위를 굴려 ( " + random + " ) 이 나왔습니다.";

let count = Math.floor(Math.random() * 100) + 1;

var random2 = Math.floor(Math.random() * 100) + 1;
var s2 = "주사위를 굴려 ( " + random2 + " ) 이 나왔습니다.";

// 출력 영역 가져오기
const output = document.getElementById("output");

// 텍스트 출력
output.innerHTML = s + "<br>" + s2 + "<br>";

// 이미지 반복 출력 + 번호 표시
for (let i = 1; i <= count; i++) {
    output.innerHTML += `
    <div class="image-box">
      <img src="이미지/미라클.jpg" alt="미라클">
      <span class="number">${i}</span>
    </div>
  `;
}