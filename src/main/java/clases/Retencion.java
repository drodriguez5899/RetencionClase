/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author David
 */
public class Retencion {
    private double salario,retencion,salarioNeto;
    
    public Retencion(String salarioStr){
        this.salario = Double.parseDouble(salarioStr);
        if(this.salario<=1000){
            this.retencion =0;
        }
        if(this.salario>1000 && this.salario<=3000){
            this.retencion =10;
        }
        if(this.salario>3000){
            this.retencion =20;
        }
        this.salarioNeto =this.salario-this.salario*this.retencion/100;
        
    }
    public double getSalario(){
        return salario;
    }
    public double getRetencion(){
        return retencion;
    }
     public double getSalarioNeto(){
        return salarioNeto;
    }
    
}
