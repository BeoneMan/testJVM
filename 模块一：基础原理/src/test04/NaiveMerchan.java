package test04;

public class NaiveMerchan extends  Merchant {
    @Override
    public Double actionPrice(double price, Customer customer) {
        return 0.0;
    }
}
/*
* Classfile /D:/IdeaProjects/testJVM/out/production/基础原理1/test04/NaiveMerchan.class
  Last modified 2019-11-4; size 633 bytes
  MD5 checksum 11ff73ca3e5f7d8b21044dc21cac121d
  Compiled from "NaiveMerchan.java"
public class test04.NaiveMerchan extends test04.Merchant
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #5.#22         // test04/Merchant."<init>":()V
   #2 = Methodref          #23.#24        // java/lang/Double.valueOf:(D)Ljava/lang/Double;
   #3 = Methodref          #4.#25         // test04/NaiveMerchan.actionPrice:(DLtest04/Customer;)Ljava/lang/Double;
   #4 = Class              #26            // test04/NaiveMerchan
   #5 = Class              #27            // test04/Merchant
   #6 = Utf8               <init>
   #7 = Utf8               ()V
   #8 = Utf8               Code
   #9 = Utf8               LineNumberTable
  #10 = Utf8               LocalVariableTable
  #11 = Utf8               this
  #12 = Utf8               Ltest04/NaiveMerchan;
  #13 = Utf8               actionPrice
  #14 = Utf8               (DLtest04/Customer;)Ljava/lang/Double;
  #15 = Utf8               price
  #16 = Utf8               D
  #17 = Utf8               customer
  #18 = Utf8               Ltest04/Customer;
  #19 = Utf8               (DLtest04/Customer;)Ljava/lang/Number;
  #20 = Utf8               SourceFile
  #21 = Utf8               NaiveMerchan.java
  #22 = NameAndType        #6:#7          // "<init>":()V
  #23 = Class              #28            // java/lang/Double
  #24 = NameAndType        #29:#30        // valueOf:(D)Ljava/lang/Double;
  #25 = NameAndType        #13:#14        // actionPrice:(DLtest04/Customer;)Ljava/lang/Double;
  #26 = Utf8               test04/NaiveMerchan
  #27 = Utf8               test04/Merchant
  #28 = Utf8               java/lang/Double
  #29 = Utf8               valueOf
  #30 = Utf8               (D)Ljava/lang/Double;
{
  public test04.NaiveMerchan();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method test04/Merchant."<init>":()V
         4: return
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Ltest04/NaiveMerchan;

  public java.lang.Double actionPrice(double, test04.Customer);
    descriptor: (DLtest04/Customer;)Ljava/lang/Double;
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: dconst_0
         1: invokestatic  #2                  // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
         4: areturn
      LineNumberTable:
        line 6: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Ltest04/NaiveMerchan;
            0       5     1 price   D
            0       5     3 customer   Ltest04/Customer;

  public java.lang.Number actionPrice(double, test04.Customer);
    descriptor: (DLtest04/Customer;)Ljava/lang/Number;
    flags: ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=4, locals=4, args_size=3
         0: aload_0
         1: dload_1
         2: aload_3
         3: invokevirtual #3                  // Method actionPrice:(DLtest04/Customer;)Ljava/lang/Double;
         6: areturn
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Ltest04/NaiveMerchan;
}
SourceFile: "NaiveMerchan.java"
* */