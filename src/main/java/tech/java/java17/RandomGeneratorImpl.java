package tech.java.java17;

import java.util.random.RandomGenerator;


public class RandomGeneratorImpl {

  public static void main(String[] args) {
    RandomGenerator randomGenerator = RandomGenerator.getDefault();
    var doubles = randomGenerator.doubles().boxed().takeWhile(x -> x > (.5)).limit(10).toList();
    System.out.println(doubles);
  }

}

