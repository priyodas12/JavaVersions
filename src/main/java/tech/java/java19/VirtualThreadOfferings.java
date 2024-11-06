package tech.java.java19;

import java.util.stream.Stream;

public class VirtualThreadOfferings {

  public static void main(String[] args) {
    var listOfThread = Stream.iterate(1, i -> i + 1)
        .limit(10)
        .map(i -> Thread.ofVirtual().unstarted(() -> {
          if (i == 1) {
            System.out.println(Thread.currentThread() + " is started");
          }
          try {
            Thread.sleep(10);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
          if (i == 1) {
            System.out.println(Thread.currentThread() + " is completed");
          }
        })).toList();

    listOfThread.forEach(System.out::println);

    listOfThread.forEach(Thread::start);

    for (Thread thread : listOfThread) {
      try {
        thread.join();
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}

//VirtualThread[#22]/runnable@ForkJoinPool-1-worker-1 is started
//VirtualThread[#22]/runnable@ForkJoinPool-1-worker-8 is completed
