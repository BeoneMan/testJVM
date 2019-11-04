package test04;

public class Merchant {
    public Number actionPrice(double price, Customer customer) {
        return 0;
    }
}

/*Classfile /D:/IdeaProjects/testJVM/out/production/基础原理1/test04/Merchant.class
Last modified 2019-11-4; size 510 bytes
        MD5 checksum f728e0b1793c46a631c31c4ed9ba126c
        Compiled from "Merchant.java"
public class test04.Merchant
        minor version: 0
        major version: 52
        flags: ACC_PUBLIC, ACC_SUPER
        Constant pool:
        #1 = Methodref          #4.#20         // java/lang/Object."<init>":()V
        #2 = Methodref          #21.#22        // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        #3 = Class              #23            // test04/Merchant
        #4 = Class              #24            // java/lang/Object
        #5 = Utf8               <init>
   #6 = Utf8               ()V
           #7 = Utf8               Code
           #8 = Utf8               LineNumberTable
           #9 = Utf8               LocalVariableTable
           #10 = Utf8               this
           #11 = Utf8               Ltest04/Merchant;
           #12 = Utf8               actionPrice
           #13 = Utf8               (DLtest04/Customer;)Ljava/lang/Number;
           #14 = Utf8               price
           #15 = Utf8               D
           #16 = Utf8               customer
           #17 = Utf8               Ltest04/Customer;
           #18 = Utf8               SourceFile
           #19 = Utf8               Merchant.java
           #20 = NameAndType        #5:#6          // "<init>":()V
           #21 = Class              #25            // java/lang/Integer
           #22 = NameAndType        #26:#27        // valueOf:(I)Ljava/lang/Integer;
           #23 = Utf8               test04/Merchant
           #24 = Utf8               java/lang/Object
           #25 = Utf8               java/lang/Integer
           #26 = Utf8               valueOf
           #27 = Utf8               (I)Ljava/lang/Integer;
           {
public test04.Merchant();
        descriptor: ()V
        flags: ACC_PUBLIC
        Code:
        stack=1, locals=1, args_size=1
        0: aload_0
        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
        4: return
        LineNumberTable:
        line 3: 0
        LocalVariableTable:
        Start  Length  Slot  Name   Signature
        0       5     0  this   Ltest04/Merchant;

public java.lang.Number actionPrice(double, test04.Customer);
        descriptor: (DLtest04/Customer;)Ljava/lang/Number;
        flags: ACC_PUBLIC
        Code:
        stack=1, locals=4, args_size=3
        0: iconst_0
        1: invokestatic  #2                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        4: areturn
        LineNumberTable:
        line 5: 0
        LocalVariableTable:
        Start  Length  Slot  Name   Signature
        0       5     0  this   Ltest04/Merchant;
        0       5     1 price   D
        0       5     3 customer   Ltest04/Customer;
        }
        SourceFile: "Merchant.java"*/
