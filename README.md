# SpringStudy
스프링 공부. SpringStudy.

### 공부내용
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
