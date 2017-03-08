public class Trapezio{
    private double altura;
    private double basemai;
    private double basemen;
    public void setAltura(){
        this.altura=altura;
    }
    public void setBasemai(){
        this.basemai=basemai;
    }
    public void setBasemen(){
        this.basemen=basemen;
    }
    if(baseMaior > baseMenor){    
        this.basemai = basemai;
        this.basemen = basemen;
        this.altura = altura;
    }    else if(baseMaior == baseMenor){
            System.out.println("ERROR");
         }    else{
                    System.out.println("ERROR");
              }
    }
    public double calculararea(){
        this.area=((this.basemen+this.basemai)*this.altura)/2;   
    }
    public double calcularperimetro(){
    //não consegui
    }
}
