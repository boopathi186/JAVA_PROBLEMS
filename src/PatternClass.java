import java.util.Scanner;

class Patterns {


    public void TopRightAngle(int len) {
        int count = 1;
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= i; j++) {
                if (count < 10) {
                    System.out.print(count + "  ");

                } else {
                    System.out.print(count + " ");
                }
                count++;
            }

            System.out.println();
        }
    }

    public void TopLeftAngle(int len) {
        int count = 1;
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= len - i; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i; k++) {
                if (count < 10) {
                    System.out.print("  " + count);

                } else {
                    System.out.print(" " + count);
                }
                count++;
            }
            System.out.println();
        }
    }

    public void BottomRightAngle(int len) {
        int count = 1;
        for (int i = len; i >= 1; i--) {
            for (int j = len; j > i; j--) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i; k++) {
                if (count < 10) {
                    System.out.print("  " + count);

                } else {
                    System.out.print(" " + count);
                }
                count++;
            }
            System.out.println();
        }
    }

    public void BottomLeftAngle(int len) {
        int count = 1;
        for (int i = len; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (count < 10) {
                    System.out.print(count + "   ");

                } else {
                    System.out.print(count + "  ");
                }
                count++;
            }
            System.out.println();
        }
    }

    public void TopAngle(int len) {
        int count = 1;
        for (int i = 1; i <= len; i++) {
            for (int k = len; k >= i; k--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                if (count < 10) {
                    System.out.print("   " + count);

                } else {
                    System.out.print("  " + count);
                }
                count++;
            }
            System.out.println();
        }
    }

    public void BootomAngle(int len) {
        int count = 1;
        for (int i = len; i >= 1; i--) {
            for (int k = len; k >= i; k--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                if (count < 10) {
                    System.out.print(count + "    ");

                } else {
                    System.out.print(count + "  ");
                }
                count++;
            }
            System.out.println();
        }
    }

    public void Hollow(int len) {
       int count=1;
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= len; j++) {
                if ((i == 1 || i == len) || (j == 1 || j == len)) {
                    if (count < 10) {
                        System.out.print(count+"  ");

                    } else {
                        System.out.print(count+" ");
                    }
                    count++;
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

public class PatternClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patterns p = new Patterns();
        //  int len = sc.nextInt();
        //   System.out.print("Enter the type of Pattern : ");
        // String str = sc.next();
//        switch (str) {
//            case "TopRightAngle":
//                p.TopRightAngle(len);
//                break;
//            case "TopLeftAngle":
//                p.TopLeftAngle(len);
//                break;
//            case "BottomRightAngle":
//                p.BottomRightAngle(len);
//                break;
//            case "BottomLeftAngle":
//                p.BottomLeftAngle(len);
//                break;
//            case "TopAngle":
//                p.TopAngle(len);
//                break;
//            case "BootomAngle":
//                p.BootomAngle(len);
//                break;
//            default:
//                System.out.println("No pattern here");
//        }
//        p.BootomAngle(len);
//        p.BottomRightAngle(len);
//        p.BottomLeftAngle(len);
//        p.TopAngle(len);
//        p.TopLeftAngle(len);
//        p.TopRightAngle(len);
          p.Hollow(5);
    }
}
