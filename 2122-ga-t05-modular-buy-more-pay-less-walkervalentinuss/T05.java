//12S21011 - Aldi Jeremi Simamora
//12S21012 - Walker Valentinus Simanjuntak
//12S21024 - Anju Saimaias Pardede
import java.util.*;
import java.lang.Math;

public class T05 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double[] totalPrice = new double[3];
        double totalPriceOutput;
        
        totalPriceOutput = 0;
        addArray(totalPrice, totalPriceOutput);
        output(totalPrice, totalPriceOutput);
    }
    
    public static void addArray(double[] yyTotalPrice, double yyTotalPriceOutput) {
        String[] iSBN = new String[3];
        int[] quantity = new int[3];
        
        quantity[0] = 0;
        quantity[1] = 0;
        quantity[2] = 0;
        double[] price = new double[3];
        
        price[0] = 0;
        price[1] = 0;
        price[2] = 0;
        yyTotalPrice[0] = 0;
        yyTotalPrice[1] = 0;
        yyTotalPrice[2] = 0;
        int n, quantity0, quantity1, quantity2;
        
        n = 0;
        quantity0 = 0;
        quantity1 = 0;
        quantity2 = 0;
        String book0, book1, book2;
        
        book0 = "book";
        book1 = "book";
        book2 = "book";
        int zero, one, two;
        
        zero = 0;
        one = 1;
        two = 2;
        do {
            iSBN[n] = input.nextLine();
            if (iSBN[n].equals("---")) {
                n = 3;
            } else {
                if (iSBN[n].equals(iSBN[0])) {
                    if (zero == 0) {
                        book0 = iSBN[n];
                    }
                    if (iSBN[0].equals(book0)) {
                        n = 0;
                        price[n] = Double.parseDouble(input.nextLine());
                        quantity[n] = Integer.parseInt(input.nextLine());
                        quantity0 = quantity0 + quantity[n];
                        zero = 3;
                        n = n + 1;
                    } else {
                        if (one == 1) {
                            book1 = iSBN[n];
                        }
                        if (iSBN[0].equals(book1)) {
                            n = 1;
                            price[n] = Double.parseDouble(input.nextLine());
                            quantity[n] = Integer.parseInt(input.nextLine());
                            quantity1 = quantity1 + quantity[n];
                            zero = 3;
                            n = n + 1;
                        } else {
                            n = 2;
                            price[n] = Double.parseDouble(input.nextLine());
                            quantity[n] = Integer.parseInt(input.nextLine());
                            quantity2 = quantity2 + quantity[n];
                            zero = 3;
                            n = 0;
                        }
                    }
                } else {
                    if (iSBN[n].equals(iSBN[1])) {
                        if (one == 1) {
                            book1 = iSBN[n];
                        }
                        if (iSBN[1].equals(book1)) {
                            n = 1;
                            price[n] = Double.parseDouble(input.nextLine());
                            quantity[n] = Integer.parseInt(input.nextLine());
                            quantity1 = quantity1 + quantity[n];
                            one = 3;
                            n = n + 1;
                        } else {
                            n = 2;
                            price[n] = Double.parseDouble(input.nextLine());
                            quantity[n] = Integer.parseInt(input.nextLine());
                            quantity2 = quantity2 + quantity[n];
                            one = 3;
                            n = 0;
                        }
                    } else {
                        if (iSBN[n].equals(iSBN[2])) {
                            if (two == 2) {
                                book2 = iSBN[n];
                            }
                            if (iSBN[2].equals(book2)) {
                                n = 2;
                                price[n] = Double.parseDouble(input.nextLine());
                                quantity[n] = Integer.parseInt(input.nextLine());
                                quantity2 = quantity2 + quantity[n];
                                two = 3;
                                n = 0;
                            }
                        }
                    }
                }
            }
        } while (n < 3);
        if (quantity0 >= 20) {
            price[0] = price[0] - price[0] * 12 / 100;
        } else {
            if (quantity0 >= 10) {
                price[0] = price[0] - price[0] * 5 / 100;
            } else {
                if (quantity0 >= 5) {
                    price[0] = price[0] - price[0] * 2 / 100;
                }
            }
        }
        yyTotalPrice[0] = price[0] * quantity0;
        if (quantity1 >= 20) {
            price[1] = price[1] - price[1] * 12 / 100;
        } else {
            if (quantity1 >= 10) {
                price[1] = price[1] - price[1] * 5 / 100;
            } else {
                if (quantity1 >= 5) {
                    price[1] = price[1] - price[1] * 2 / 100;
                }
            }
        }
        yyTotalPrice[1] = price[1] * quantity1;
        if (quantity2 >= 20) {
            price[2] = price[2] - price[2] * 12 / 100;
        } else {
            if (quantity2 >= 10) {
                price[2] = price[2] - price[2] * 5 / 100;
            } else {
                if (quantity2 >= 5) {
                    price[2] = price[2] - price[2] * 2 / 100;
                }
            }
        }
        yyTotalPrice[2] = price[2] * quantity2;
    }
    
    public static double output(double[] yyTotalPrice, double yyTotalPriceOutput) {
        yyTotalPriceOutput = yyTotalPrice[0] + yyTotalPrice[1] + yyTotalPrice[2];
        System.out.println(toFixed(yyTotalPriceOutput,2));
        
        return yyTotalPriceOutput;
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
