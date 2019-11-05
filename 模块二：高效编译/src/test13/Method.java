package test13;

import org.junit.Test;

public class Method {
    int a=0, b=0;

    public void method1() {
        int r2 = a;
        b = 1;
    }

    public void method2() {
        int r1 = b;
        a = 2;
    }
  @Test
    public void test(){
        method1();
        method2();
      System.out.println(a+","+b);
  }

}
