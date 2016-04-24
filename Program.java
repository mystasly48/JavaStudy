class Program {
  public static void main (String[] args) {
    System.out.println("3 Billion Devices Run Java");
  }

  public static void tajigen1() {
    int[][] a = new int[2][3];
    int[][] b = {
      { 1, 2 },
      { 3, 4 },
      { 5, 6 }
    };
    a[1] [1] = 10;
    System.out.println(a[1][1]);
    System.out.println(b[1][1]);
  }

  public static void tajigen2() {
    int[][] tajigenArray = {
      { 0, 1, 2},
      { 3, 4, 5}
    };
    System.out.println(tajigenArray[0][0]);
    System.out.println(tajigenArray[0][2]);
    System.out.println(tajigenArray[1][0]);
    System.out.println(tajigenArray[1][2]);

    /*
    int[][] tajigenArray = new int[2][3];
    tajigenArray[0][0] = 0;
    tajigenArray[0][1] = 1;
    tajigenArray[0][2] = 2;
    tajigenArray[1][0] = 3;
    tajigenArray[1][1] = 4;
    tajigenArray[1][2] = 5;

    System.out.println(tajigenArray[0][0]);
    System.out.println(tajigenArray[0][2]);
    System.out.println(tajigenArray[1][0]);
    System.out.println(tajigenArray[1][2]);
    */
  }
}