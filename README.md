# SpringStudy

# 공부내용 (1회차)
1. 프로젝트 환경설정
    - 프로젝트 생성
    - 라이브러리 살펴보기
    - View 환경설정
    - 빌드하고 실행하기
2. 스프링 웹 개발 기초
    - 정적 컨텐츠
    - MVC와 템플릿 엔진
    - API
3. 회원 관리 예제 - 백엔드 개발
    - 비즈니스 요구사항 정리
    - 회원 도메인과 리포지토리 만들기
    - 회원 리포지토리 테스트 케이스 작성
    - 회원 서비스 개발
    - 회원 서비스 테스트
4. 스프링 빈과 의존관계
    - 컴포넌트 스캔과 자동 의존관계 설정자바 코드로 직접 스프링
    - 빈 등록하기
5. 회원 관리 예제 - 웹 MVC 개발
    - 회원 웹 기능 - 홈 화면 추가
    - 회원 웹 기능 - 등록
    - 회원 웹 기능 - 조회
6. 스프링 DB 접근 기술
    - H2 데이터베이스 설치
    - 순수 Jdbc
    - 스프링 통합 테스트
    - 스프링 JdbcTemplate
    - JPA
    - 스프링 데이터 JPA
7. AOP
    - AOP가 필요한 상황
    - AOP 적용
    
### 설치
- java 11
- intelliJ

### start.spring.io
- 스프링 기반 프로젝트를 만들어주는 사이트
1. Project(필요한 라이브러리 툴)
    - Maven Project : 과거 많이 사용
    - Gradle Project : 요즘 많이 사용
2. Language
    - Java
3. Spring Boot : 해당버전
4. Project Metadata
    - Group : 기업 도메인 명
    - Artifact : 프로젝트 명
5. Dependencies
    - spring web
    - thymeleaf : html 만들어주는 템플릿 엔진
    
### AOP 필요한 상황
→ 공통관심사항 VS 핵심관심사항 분리
- 모든 메소드의 호출 시간을 측정
---
# 스프링 (공부 2회차)

: JAVA 웹 프레임워크. → JAVA기술(JSP, MyBatis, JPA 등 여러가지)들을 편리하기 사용하기 위함.

1. **필수**
    - **스프링 프레임워크** : 자주 쓰이는 기능(클래스) 집합
    - 스프링 부트 : 기능들을 편리하게 사용할 수 있도록 도와줌
2. 선택
    - 스프링 데이터, 세션, 시큐리티, Rest Docs, 배치, 클라우드

→ 스프링의 진짜 핵심!

 : 자바 언어 기반 →  < **객체 지향** 언어 >  → 좋은 객체 지향 애플리케이션을 개발 가능!

### 객체지향 특징

- 추상화, 캡슐화, 상속
- **다형성 : 운전자 - 자동차(역할)**

                         **k3 아반떼 테슬라(구현)**

**역할 : 인터페이스**

**구현 : 클래스**

→ 인터페이스를 먼저 설계 !

### 좋은 <객체 지향 설계>의 5가지 원칙 : SOLID

1. SRP: 단일 책임 원칙(single responsibility principle)
    - 하나의 클래스는 하나의 **책임**. (하나의 책임이라는 것은 모호함)
    - 중요한 기준은 변경. 변경이 있을 때 파급효과 적으면 단일 책임 잘따른 것.
2.  OCP: 개방-폐쇄 원칙 (Open/closed principle)
    - 확장에는 열려있으나 변경에는 닫힘.
    - **다형성** 활용. **역할/구현.**
    - EX) 배우 역할 → 장동건, 원빈 구현
3. LSP: 리스코프 치환 원칙 (Liskov substitution principle)
    - 인터페이스 규약을 다 지켜야함. 컴파일 성공해도 확인해야함.
    - EX) 엑셀을 밟으면 뒤로가도록 구현. (잘못됨)
4. ISP: 인터페이스 분리 원칙 (Interface segregation principle)
    - 인터페이스 여러개 > 범용 인터페이스 하나
    - EX) 자동차 인터페이스 → 운전 인터페이스, 정비 인터페이스 **분리**
5. DIP: 의존관계 역전 원칙 (Dependency inversion principle)
    - 추상화에 의존 > 구체화 의존
    - 인터페이스에 의존하라는 뜻. 구현 클래스에 의존하지 않고
    - **역할에 의존하기!**

→ 다형성만으로는 OCP, DIP를 지킬 수 없다. **스프링 기술로 다형성 + OCP, DIP 지원 !**

- 스프링 기술
    - DI : 의존관계, 의존성 주입
    - DI 컨테이너 제공
    - 클라이언트 코드 변경없이 기능 확장
    - 쉽게 부품 교체하듯 개발

### 프로젝트 시작

1. https://start.spring.io
2. Generate 파일 생성
3. IntelliJ import - build.gradle 파일 선택

---

### 테스트

- ctrl + shift + T
- 화장실 → ㅎㅈㅅ → gwt → given, when, then
1. given : 값 생성
2. when : 생성한 값 입력
3. given : 검증 → Assertions.assertThat( A ).isEqualTo( B );

---

### 회원 등록/조회 : member(패키지)

- 역할 : 클라이언트 → 회원서비스 → 메모리 회원 저장소
1. 서비스
    1. 인터페이스
        - MemberService **(interface) :** join, findMember
    2. 구현
        - MemberServiceImpl **(class)** : ****join(save), findMember(findById), **memberRepository ( ①사용 )**
2. 저장소 : **store**
    1. 인터페이스  —— **①**
        - MemberRepository **(interface) :** save, findById
    2. 구현
        - MemoryMemberRepository **(class) :** save, findById, **store**
            - Member **(class)** : id, name, grade
                - Grade **(enum)** : BASIC, VIP

실행 : memberApp

---

### 주문/할인 : order / discount

- 역할 : 클라이언트 → 주문서비스 - 메모리 회원 저장소

                                                           - 정액 할인 정책

1. 주문 (order)
    1. 인터페이스
        - OrderService : createOrder
    2. 구현
        - OrderServiceImpl : createOrder, **memberRepository(①), discountPolicy(②)**
            - Order : id, itemName, itemPrice, discountPrice, **toString, calculatePrice**

1. 할인 (discount)
    1. 인터페이스  **—— ②**
        - DiscountPolicy
    2. 구현
        - FixDiscountPolicy

실행 : orderApp

---

### 새로운 할인정책 개발 → 문제발생(좋은설계위반)

- OCP, DIP 위반.
- 만족하도록 수정 → 구현객체를 생성하고 연결하는 클래스 따로 생성 → AppConfig

---

### AppConfig (공연기획자)

- 구현 객체 생성 (배우설정)
- 생성자를 통해 연결
- EX) Appconfig → MemoryMemberRepository(**class**) → MemberServiceImpl(**class**)

---

### IoC, DI, 그리고 컨테이너

1. 제어의 역전(IoC : Inversion of Control)
    - 프로그램의 제어 흐름을 직접 제어하는 것이 아니라 외부에서 관리하는 것(AppConfig 처럼)
2. 의존관계 주입(DI : Dependency Injection)
    1. 정적인 클래스 의존관계 : 애플리케이션 실행하지 않아도 분석 가능
    2. 동적인 클래스 의존관계 : 실행 시점에 실ㅈ 생성된 객체 인스턴스의 참조가 연결된 의존관계

    → 정적 클래스 다이어그램이 변하지 않는다.

3. IoC 컨테이너 = DI 컨테이너
    - AppConfig 처럼 객체를 생성하고 관리하면서 의존관계를 연결

---

### 스프링으로 변환하기

AppConfig변경 

- 클래스에 @Configuration 추가
- 모든 함수에 @Bean 추가

### 스프링 컨테이너

- ApplicationContext : 스프링 컨테이너(인터페이스)
1. 스프링 컨테이너는 @Congifuration 이 붙은 AppConfig를 설정 정보로 함.
2. 여기서 @Bean이라 적힌 메서드 모두 호출 → 스프링 컨테이너에 등록
- ac.getBean() 메서드로 찾을 수 있음 (키 = Bean이름, 클래스타입)

### 스프링 컨테이너 생성

1. 생성

```java
**ApplicationContext** ac = new **AnnotationConfigApplicationContext**(AppConfig.class) 
```

1. 가져오기

```java
// 기존
MemberService memberService = appConfig.memberService();

// 스프링
MemberService memberService = ac.getBean("memberService", MemberService.class);
```

### 스프링 출력 시 (TEST)

```java
// bean 1개 추출
ac.getBean(Bean 이름, 타입); // 인스턴스 조회
ac.getBean(타입); // 대상 없으면 예외 발생

// 모든 Bean 키(이름) 추출
ac.getBeanDefinitionNames(); 

// 특정 타입의 '키(이름)', '타입(value)' 모두 추출
Map<String, MemberRepository> beansOfType = ac.getBeansOfType(MemberRepository.class);

// Bean 비교
assertThat(memberRepository).isInstanceOf(MemberRepository.class);

// 오류 test
assertThrows(NoSuchBeanDefinitionException.class,
                () -> ac.getBean(MemberRepository.class));
```

### 스프링 빈 조회 -상속관계

- 부모타입 조회 → 자식 타입도 조회

### 싱글톤 컨테이너

: 고객의 요청이 올 때마다 객체 생성X → 이미 만들어진 객체를 공유해서 효율적으로 사용

(방법 : private로 new키워드 막기)

1. 장점
- 스프링 빈 : 싱글톤으로 관리되는 빈
    - 싱글톤 패턴을 위한 지저분한 코드X
    - DIP, OCP, 테스트, private 생성자로부터 자유롭게 싱글톤 사용가능!
1. 주의점
- 상태를 유지하게 설계X → **무상태**로 설계
- 가급적 읽기만 (의존적 필드X)
- 스프링 빈의 필드에 공유값을 설정하면 큰 장애 발생가능

### 롬복(Lombok)과 최신 트렌드

- 추가방법

→ build.gradle 에 설정 추가

```java
//lombok 설정 추가 시작
configurations {
 compileOnly {
 extendsFrom annotationProcessor
 }
}
//lombok 설정 추가 끝

dependencies {
 implementation 'org.springframework.boot:spring-boot-starter'
 //lombok 라이브러리 추가 시작
 compileOnly 'org.projectlombok:lombok'
 annotationProcessor 'org.projectlombok:lombok'
 testCompileOnly 'org.projectlombok:lombok'
 testAnnotationProcessor 'org.projectlombok:lombok'
 //lombok 라이브러리 추가 끝
 testImplementation('org.springframework.boot:spring-boot-starter-test') {
 exclude group: 'org.junit.vintage', module: 'junit-vintage-engine'
 }
```

1. 기존코드

```java
@Component
public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }
}
```

1. 변경 후 코드

```java
@Component
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;
}
```

### 빈 생명주기 콜백 시작

- DB 커넥션 풀, 네트워크 소켓처럼, 애플리케이션 시작 시점에 필요한 **연결 미리** 해두고 종료시점에 연결 종료
- **의존관계 주입**이 **완료**된 후 **초기화 작업**
- **스프링 빈 라이프사이클**
    - 스프링 컨테이너 생성 → 스프링 빈 생성 → 의존관계 주입 → 초기화 콜백 → 사용 → 소멸 전 콜백 → 스프링 종료
- 방법
    1. 인터페이스 InitializingBean, DisposableBean
    2. 빈 등록 초기화, 소멸메서드 **(코드를 고칠 수 없는 외부 라이브러리를 초기화, 종료해야 하면 사용)**
        - @Bean(initMethod = "init", destroyMethod = "close")

            → init, close는 메서드 명 

    3. 애노테이션  **(많이 사용)**
        - @PostConstruct : 생성자 이후 실행
        - @PreDestory : 종료시

### 프로토타입 스코프

- 기존 싱글톤 스코프 : 조회 시, **같은 인스턴스의 스프링 빈 반환**
- 프로토타입 스코프 : **새로운 인스턴스 생성 → 반환**

### DL (의존관계 탐색)

1. 스프링 의존
    - ObjectProvider
2. 자바 표준

    → build.gradle의 dependencies에 **implementation 'javax.inject:javax.inject:1'** 추가

    - Provider

### 웹 - provider 사용

- LogDemoController
    1. 요청한 url
    - LogDemoService
        - logic : [uuid][requestURL] service id
    - MyLogger
        - log : [uuid][requestURL] message
        - setRequestURL

### 스코프와 프록시 (ObjectProvider 제거)

- @Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
- 

### 어노테이션 모음. [ @ ]

@Test : 테스트

@BeforeEach : 테스트를 실행하기 전 실행

- @Configuration : 설정정보, 싱글톤 보장
- 방법1 : @Bean : 스프링 빈(컨테이너) 등록
- 방법2 : @ComponentScan : 스프링 빈 등록 (@Component, @Controller, @Service, @Repository, @Configuration)
    - @Component 붙은 클래스 스캔
    - @Autowired : 생성자 위에 사용. 자동 의존관계. = getBean(MemberRepository.class)
    1. 옵션처리 ( 주입할 대상 없을때 )
        - @Autowired(required=false) : 메서드 자체가 호출X
        - org.springframework.lang.@Nullable : null 입력
        - Optional<> : Optional.empty 입력
    2. 생성자 자동생성 ( final 붙어야함 )
        - @RequiredArgsConstructor
    3. 타입 매칭
        - Qualifier("이름")

@DisplayName : 단순 함수 설명
