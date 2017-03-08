public class Triangulo extends FigurasGeometricas{
    private double base;
    private double altura;
    public void setBase(){
        this.base=base;
    }
    public void setAltura(){
        this.altura=altura;
    }
    public double calculararea(){
        this.area=(this.altura*this.base)/2;
        return this.area;
    }
    public double calcularperimetro(){
        //não consegui
    }
}
