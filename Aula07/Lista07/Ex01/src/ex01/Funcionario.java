
package ex01;

public class Funcionario {
    
    private String nomeFun;
    private float salFun;

    public String getNomeFun() {
        return nomeFun;
    }

    public void setNomeFun(String nomeFun) {
        this.nomeFun = nomeFun;
    }

    public float getSalFun() {
        return salFun;
    }

    public void setSalFun(float salFun) {
        this.salFun = salFun;
    }
    
    public void aumentaSalario(float aumentoPorCento){
        float aumento = getSalFun() + (getSalFun() * (aumentoPorCento/100));
        setSalFun(aumento);
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nomeFun=" + nomeFun + ", salFun=" + salFun + '}';
    }
    
    
    
}
