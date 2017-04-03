public class Principal{  //não consegui fazer o o cirulo e os perimetros do triangulo e trapezio
        public static void main(String [] agrs){
                Quadrado q = new Quadrado();
                Triangulo t = new Triangulo();
                Retangulo r = new Retangulo();
                Trapezio tp = new Trapezio();
                q.set(4);
                t.setBase(2);
                t.setAltura(2);
                r.setBase(4);
                r.setAltura(2);
                tp.setBasemai(4);
                tp.setBasemen(3);
                tp.setAltura(2);
                System.out.println(q.calculararea());
                System.out.println(q.calcularperimetro());
                System.out.println(t.calculararea());
                System.out.println(t.calcularperimetro());
                System.out.println(c.calculararea());
                System.out.println(c.calcularperimetro());
                System.out.println(r.calculararea());
                System.out.println(r.calcularperimetro());
                System.out.println(tp.calculararea());
                System.out.println(tp.calcularperimetro());
        }
}
