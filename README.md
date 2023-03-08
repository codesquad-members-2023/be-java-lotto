# 사다리 게임
---------------

### 사다리 게임 1단계 (23.03.06)
* 학습 키워드
  * enum, mvc 패턴
* 클래스 설계
  * InputClass : 사용자 입력을 받는 클래스
  * OutputClass : 결과를 출력하는 클래스
  * LadderController : model과 view의 이벤트 처리
  * GeneratorInterface: 사다리 생성 인터페이스
  * Ladder : GeneratorInterface 구현체
* 기능 목록
  * [x] 사용자에게 참여할 사람 숫자를 입력받는 기능
  * [x] 사용자에게 사다리 높이를 입력받는 기능
  * [x] 입력받은 데이터로 사다리를 생성하는 기능
  * [x] 생성한 사다리를 출력하는 기능
* 트러블 슈팅
  * main 메서드의 역할에 대한 고민(controller 필드를 생성자에서 추가, main 메서드에서 주입)
  * -> controller가 여러개인데 하나의 모델 인스턴스를 공유해야 하니까 main에서 주입
  
### 사다리 게임 2단계 (23.03.07)
* 학습 키워드
  * 리팩토링의 정의와 필요성
  * MVC 패턴을 사용해야 하는 이유
  * 컨트롤러의 역할
  * enum의 정의와 올바른 사용법
* 리펙터링 목록
  * 코드 리뷰 적용
    * [x] MVC 패턴 적용 유지
    * [x] 인터페이스 제거
    * [x] 컨트롤러 메서드 변경
    * [x] enum 제거
  * [x] 모든 메서드 10라인 이하로 리팩터링
  * [x] 인덴트 1이하로 리펙터링
  * [x] 네이밍 컨벤션 점검
* 클래스 설계
  * InputClass : 사용자 입력을 받는 클래스
  * OutputClass : 결과를 출력하는 클래스
  * ApplicationController : model과 view의 이벤트 처리
  * Ladder : 사다리를 생성하는 클래스
* 기능 목록
* 트러블 슈팅
  * View에서 입력받은 String을 어느단에서 변환하는것이 가장 자연스러울까?
  * 인덴트를 줄이는 방법은 어떤것이 있을까?
    * 스트림을 이용하면 인덴트를 1정도 줄이는 효과를 볼수가 있었다.
    * 역시 가장 좋은 방법은 메서드를 최소 단위로 분리하는 것이다...!

### 사다리 게임 3단계 (23.03.07 ~ 23.03.08)
* 학습 키워드
  * [ ] 자바의 정석을 이용한 지네릭 개념 학습
* 리펙터링 목록
  * 코드 리뷰 적용
    * [x] InputView와 OutputView 하나의 View 클래스로 합치기
    * [x] isEven 메서드 이름 변경
    * [x] OutputView 지역변수 상수 적용
  * [x] 사용자의 숫자를 입력받는 기능을 이름을 입력받는 기능으로 변경
  * [ ] ladder 자료구조를 베열에서 ArrayList로 변경
  * [x] 사다리의 길이를 이름 길이에 맞게 늘임
  * [x] 사다리가 겹치지 않게 조정
* 클래스 설계
  * ViewClass : 사용자 입력과 결과 출력을 처리하는 클래스
  * ApplicationController : model과 view의 이벤트 처리
  * Ladder : 사다리를 생성하는 클래스
* 기능 목록
  * [x] 사용자의 이름을 입력받는 기능
  * [x] 사다리와 플레어이어 이름을 같이 출력하는 기능
    * [x] 사용자의 이름은 5글자로 제한한다.
    * [x] 사용자의 이름은 쉼표로 구분한다.
* 트러블 슈팅
  * 사다리가 한 행에 최소한 하나씩은 있어야 한다.
  * 입력한 사용자의 이름에 맞게 정렬하는게 필요할것 같다.

### 사다리 게임 4단계 (23.03.08)
* 학습 키워드
  * 패키지 분리의 이유와 원칙
  * 단위 테스트의 목적과 사용법
* 리펙터링 목록
  * 기능별 단위 테스트를 추가
* 클래스 설계
* 기능 목록
* 트러블 슈팅

### 사다리 게임 5단계 (23.03.09)
* 학습 키워드
  * getter 사용을 최소화 하고 setter 사용을 지양해야 하는 이유
* 리펙터링 목록
* 클래스 설계
* 기능 목록
  * [ ] "춘식이" 를 입력하면 프로그램을 종료하는 기능
  * [ ] 사용자의 이름을 입력하면 개인별 결과를 출력하는 기능
  * [ ] "all"을 입력하면 전체 사용자의 실행결과를 출력하는 기능
* 트러블 슈팅

### 사다리 게임 6단계 (23.03.10)
* 학습 키워드
  * GUI의 정의와 적용법
  * 변경에 유리한 구조란 무엇일까?
* 리펙터링 목록
* 클래스 설계
* 기능 목록
* 트러블 슈팅
* 결과

## 코드 리뷰

* [텍스트와 이미지로 살펴보는 코드스쿼드의 온라인 코드 리뷰 과정](https://github.com/code-squad/codesquad-docs/blob/master/codereview/README.md)

* [동영상으로 살펴보는 코드스쿼드의 온라인 코드 리뷰 과정](https://youtube.com/watch?v=lFinZfu3QO0&si=EnSIkaIECMiOmarE)
