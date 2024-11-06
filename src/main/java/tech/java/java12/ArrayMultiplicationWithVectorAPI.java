package tech.java.java12;

public class ArrayMultiplicationWithVectorAPI {

  public static void main(String[] args) {

    int[] array1 = {1, 2, 3, 4, 5};
    int[] array2 = {5, 4, 3, 2, 1};

    /*int[] result = multiplyArrays(array1, array2);

    System.out.print("Result of multiplication: ");
    for (int value : result) {
      System.out.print(value + " ");
    }*/
  }

  /*public static int[] multiplyArrays(int[] a, int[] b) {
    if (a.length != b.length) {
      throw new IllegalArgumentException("Arrays must be of the same length");
    }

    int[] result = new int[a.length];

    VectorSpecies<Integer> species = IntVector.SPECIES_256;

    for (int i = 0; i < a.length; i += species.length()) {
      IntVector vectorA = IntVector.fromArray(species, a, i);
      IntVector vectorB = IntVector.fromArray(species, b, i);

      IntVector vectorResult = vectorA.mul(vectorB);

      vectorResult.intoArray(result, i);
    }
    return result;
  }*/
}
