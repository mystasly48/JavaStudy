class Chapter2 {
  public static void main (String[] args) {
    question7();
  }

  public static void question1() {
    System.out.println(2001);
    System.out.println('O');
    System.out.println(2.71828);
    System.out.println(false);
  }

  public static void question2() {
    int a = 1;
    System.out.println(a);
  }

  public static void question3() {
    int[] ints = new int[3];
    ints[0] = 1000;
    ints[1] = 1001;
    ints[2] = 4096;
    System.out.println(ints[2]);
    System.out.println(ints.length);

    long[] longs = { 1L, 2L, 3L, 4L, 5L, 6L, 7L };
    System.out.println(longs[2]);
    System.out.println(longs.length);
  }

  public static void question4() {
    int [][] a = new int[2][3];
    byte [][] b = {
      { 1, 2 },
      { 3, 4 },
      { 5, 6 }
    };
    a[1][1] = 10;
    System.out.println(a[0][0]);
    System.out.println(b[1][1]);

    // 出力結果
    // 0
    // 4
    // 理由
    // 配列 a[0][0] には初期化のみで代入はされていなかった。
    // 配列 b[1][0] には 3 が、配列 b[1][1] には 4 が代入されていた。
  }

  public static void question5() {
    int a = 522 + (105 * 2) + 155;
    System.out.println(a);
  }

  public static void question6() {
    double a = (498 + (98 * 3) + 298) * 1.05;
    System.out.println(a);
  }

  public static void question7() {
    // (1 + 2 + 3 + 4 + 5) / 5 = 3
    int a = (82 + 78 + 65 + 59 + 77) / 5;
    System.out.println(a);
  }
}