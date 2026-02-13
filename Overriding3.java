// class Shape {
//     void perimeter() {
//         System.out.println("Perimeter of Shape");
//     }
//     void area() {
//         System.out.println("Area of Shape");
//     }
// }

// class Square extends Shape {
//     int a = 3;

//     void perimeter() {
//         System.out.println("Perimeter of Square is " + (4 * a));
//     }
//     void area() {
//         System.out.println("Area of Square is " + (a * a));
//     }
// }

// class Rectangle extends Shape {
//     int l = 5, b = 7;

//     void perimeter() {
//         System.out.println("Perimeter of Rectangle is " + (2 * (l + b)));
//     }
//     void area() {
//         System.out.println("Area of Rectangle is " + (l * b));
//     }
// }

// public class Overriding3 {
//     public static void main(String[] args) {
//         Shape sq ;
//         sq = new Square();
//         sq.perimeter();
//         sq.area();

//         sq = new Rectangle();
//         sq.perimeter();
//         sq.area();
//     }
// }
