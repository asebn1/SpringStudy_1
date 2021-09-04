package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    // 다른곳에서 생성 막음 ( 외부에서 new 사용 불가 )
    private SingletonService(){}

    // 호출
    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }

}
