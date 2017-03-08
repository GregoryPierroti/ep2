public class Retangulo extendFigurasGeometricas {
  private double base;
  private double altura;
  public void setBase(){
    this.base=base;
  }
  public void setAltura(){
    this.altura=altura;
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
