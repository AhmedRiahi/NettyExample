import netty.client.NettyClient;
import netty.server.NettyServer;

public class MiddlewareApp {


    public static void main(String[] args) throws Exception {
        new Thread(new Runnable() {
            public void run() {
                try {
                    new NettyServer(8080).run();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                new NettyClient("localhost", 8080).startup();
            }
        }).start();
    }
}
