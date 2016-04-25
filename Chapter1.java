// エンコードは "Shift-JIS" で保存しないと逝く
// または "-encoding UTF-8"  を指定してコンパイル
// javac -encoding UTF-8 Chapter1.java

class Chapter1 {
  public static void main (String[] args) {
    question3();
  }

  public static void question1() {
    System.out.println("Hello World!");
  }

  public static void question2() {
    // 出力する
    System.out.println("こんにちは日本");
  }

  public static void question3() {
    System.out.println("Javaの学習を始めます");
  }
}