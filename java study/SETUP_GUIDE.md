# ☕ Java Study 프로젝트 - 완벽한 작업 환경 구성 완료!

## 🎯 구성 완료 사항

Java 스터디를 위한 **완벽한 개발 환경**이 모두 준비되었습니다!

### ✅ 완료된 작업

1. **Maven 프로젝트 구조**
   - pom.xml 설정 완료
   - Java 11 기반 설정
   - 모든 필수 의존성 추가

2. **디렉토리 구조**
   ```
   java study/
   ├── src/
   │   ├── main/
   │   │   ├── java/com/soldesk/study/
   │   │   │   └── HelloWorld.java (샘플)
   │   │   └── resources/
   │   │       └── logback.xml
   │   └── test/
   │       └── java/com/soldesk/study/
   │           └── HelloWorldTest.java (테스트 샘플)
   ├── target/ (빌드 결과)
   ├── pom.xml
   ├── README.md
   ├── .gitignore
   └── .idea/ (IntelliJ 설정)
   ```

3. **포함된 라이브러리**
   - ✅ JUnit 5.9.2 (테스트 프레임워크)
   - ✅ SLF4J 2.0.5 (로깅 API)
   - ✅ Logback 1.4.5 (로깅 구현)
   - ✅ Lombok 1.18.30 (선택사항)

4. **테스트 및 빌드**
   - ✅ 전체 빌드 성공 (BUILD SUCCESS)
   - ✅ 테스트 2개 모두 통과
   - ✅ JAR 파일 생성 완료

---

## 🚀 실행 방법

### 1️⃣ 프로젝트 열기 (IntelliJ IDEA)
```bash
File > Open > java study 폴더 선택
```
프로젝트가 자동으로 Maven 프로젝트로 인식됩니다.

### 2️⃣ 터미널에서 직접 실행
```bash
cd /Users/a1/soldeskStudy/java\ study
```

#### 의존성 설치 및 빌드
```bash
mvn clean install
```

#### 컴파일
```bash
mvn compile
```

#### 테스트 실행
```bash
mvn test
```

#### 프로그램 실행
```bash
mvn exec:java -Dexec.mainClass="com.soldesk.study.HelloWorld"
```

#### JAR 파일 생성
```bash
mvn package
```

---

## 📝 새로운 Java 파일 추가하기

### 1. 메인 코드 추가 (src/main/java)
```bash
src/main/java/com/soldesk/study/YourClassName.java
```

예시:
```java
package com.soldesk.study;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        System.out.println("5 + 3 = " + add(5, 3));
    }
}
```

### 2. 테스트 코드 추가 (src/test/java)
```bash
src/test/java/com/soldesk/study/YourClassNameTest.java
```

예시:
```java
package com.soldesk.study;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        assertEquals(8, Calculator.add(5, 3));
    }
}
```

### 3. 실행
```bash
# 특정 클래스 실행
mvn exec:java -Dexec.mainClass="com.soldesk.study.Calculator"

# 테스트 실행
mvn test
```

---

## 🔍 현재 상태 확인

### 최근 빌드 결과
```
BUILD SUCCESS
Tests run: 2, Failures: 0, Errors: 0
```

### 출력 예시
```
안녕하세요! Java 스터디 환경이 완벽하게 구성되었습니다.
This Java Study environment is properly configured!
숫자: 10
메시지: Java 프로그래밍
```

---

## 📚 로깅 설정

로깅은 자동으로 설정되어 있습니다:
- **콘솔 출력**: 모든 로그 표시
- **파일 저장**: `logs/application.log`

로그 레벨 설정:
```xml
<!-- src/main/resources/logback.xml -->
<logger name="com.soldesk.study" level="debug" />
```

---

## 🛠️ IntelliJ IDEA 팁

### 클래스 실행
1. 파일에서 `main` 메서드 우클릭
2. "Run 'ClassName.main()'" 클릭

### 테스트 실행
1. 테스트 파일에서 `@Test` 메서드 우클릭
2. "Run 'ClassName.testMethod()'" 클릭

### Maven 명령 실행
1. View > Tool Windows > Maven
2. 원하는 명령 더블클릭

---

## 📋 체크리스트

- ✅ Maven 프로젝트 구조
- ✅ Java 11 설정
- ✅ JUnit 5 테스트 프레임워크
- ✅ SLF4J/Logback 로깅
- ✅ 샘플 코드 및 테스트
- ✅ README.md 문서
- ✅ .gitignore 설정
- ✅ IntelliJ 설정 파일
- ✅ 빌드 및 테스트 성공

---

## 🎓 학습 팁

1. **패키지 구조 유지**: `com.soldesk.study` 패키지에서 작업
2. **테스트 먼저**: TDD 방식으로 학습
3. **로깅 활용**: `System.out.println` 대신 로거 사용
4. **빌드 확인**: 정기적으로 `mvn clean install` 실행

---

## 🆘 문제 해결

### Maven 의존성 오류
```bash
mvn clean install -U
```

### IDE 인식 안 됨
- Maven > Reload Projects (IntelliJ)
- IDE 재시작

### 포트 충돌
Maven 기본 포트 8080 확인

---

**이제 문제 없이 Java 파일을 실행할 수 있습니다!** 🎉

