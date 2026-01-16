# Java Study 프로젝트

이 프로젝트는 Java 스터디를 위한 완벽하게 구성된 개발 환경입니다.

## 프로젝트 구조

```
java study/
├── pom.xml                           # Maven 설정 파일
├── .gitignore                        # Git 무시 파일
├── README.md                         # 이 파일
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/soldesk/study/   # 메인 소스 코드
    │   │       └── HelloWorld.java   # 예제 파일
    │   └── resources/
    │       └── logback.xml           # 로깅 설정
    └── test/
        └── java/
            └── com/soldesk/study/    # 테스트 코드
                └── HelloWorldTest.java # 테스트 예제
```

## 필요 사항

- Java 11 이상
- Maven 3.6.0 이상

## 설치 및 설정

### 1. Maven 의존성 설치
```bash
mvn clean install
```

### 2. 프로젝트 컴파일
```bash
mvn compile
```

### 3. 테스트 실행
```bash
mvn test
```

### 4. 애플리케이션 실행
```bash
mvn exec:java -Dexec.mainClass="com.soldesk.study.HelloWorld"
```

### 5. JAR 파일 생성
```bash
mvn package
```

## IDE 설정

### IntelliJ IDEA
1. File > Open... > java study 폴더 선택
2. 프로젝트가 자동으로 Maven 프로젝트로 인식됩니다
3. 우상단 "Load Maven Changes" 클릭

### VSCode
1. Extension: Extension Pack for Java 설치
2. 폴더 열기 > java study 폴더 선택

## 포함된 라이브러리

- **JUnit 5**: 단위 테스트
- **SLF4J & Logback**: 로깅
- **Lombok**: 코드 생성 라이브러리 (선택사항)

## 사용법

새로운 Java 파일을 추가하려면:

1. `src/main/java/com/soldesk/study/` 디렉토리에 새 파일 생성
2. 파일명은 PascalCase로 (예: `Calculator.java`)
3. 패키지는 `package com.soldesk.study;` 사용

테스트 코드 추가:

1. `src/test/java/com/soldesk/study/` 디렉토리에 테스트 파일 생성
2. 파일명은 `클래스명Test.java` 형식 (예: `CalculatorTest.java`)
3. `@Test` 어노테이션으로 테스트 메서드 표시

## 트러블슈팅

### Maven 의존성 문제
```bash
mvn clean install -U
```

### IDE에서 인식되지 않음
- Maven 캐시 삭제: `rm -rf ~/.m2/repository`
- IDE 재시작

### 인코딩 문제
IDE에서 UTF-8 인코딩 설정 확인

## 추가 정보

더 많은 Java 학습 자료는 공식 Java 문서를 참고하세요:
https://docs.oracle.com/en/java/javase/11/

---
Happy Learning! 🚀

