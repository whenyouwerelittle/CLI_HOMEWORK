package COM;
public class Main {
    public static void main(String[] args) {
          // 시작하면 모든 사용자 정보를 로그아웃 상태로 전환한다.
            System.out.println("You are started");
            Container.init();
            new App().run();
            Container.close();
            System.out.println("You are here");
    }
}
