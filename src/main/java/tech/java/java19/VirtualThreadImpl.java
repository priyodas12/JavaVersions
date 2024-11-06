package tech.java.java19;

public class VirtualThreadImpl {

  public static void main(String[] args) {
    var t1 = Thread.ofPlatform().start(() -> {
      for (int i = 0; i < 10; i++) {
        System.out.println(Thread.currentThread() + " --- " + i);
      }
    });

    var t2 = Thread.ofVirtual().start(() -> {
      for (int i = 0; i < 10; i++) {
        System.out.println(Thread.currentThread() + " *** " + i);
      }
    });

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

  }

}
