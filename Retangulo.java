public class Retangulo extends FigurasGeometricas {
  private double base;
  private double altura;
  public Retangulo(double retaBase, double altura){
      this.retaBase = retaBase;
      this.altura = altura;
  }
  if(base!=altura){
      this.base=base;
      this.altura=altura;
   }  else{
        System.out.println("base e altura não podem ter mesmo valor");
      }
   public double calculararea(){
      this.area=this.base*this.altura;
      return this.area;
   }
   public double calcularperimetro(){
      this.perimetro=this.base*2+this.altura*2;
   }
}
