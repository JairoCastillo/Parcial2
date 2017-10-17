
public class usuario {
private String nombre,apellido,direccion,tipo;
private int cedula,numero,edad,peso,altura,celular,puesto;


public usuario(String nombre,String apellido,String tipo,int numero,int edad,int peso,int altura,int celular,String direccion,int puesto) {
	this.nombre=nombre;
	this.apellido=apellido;
	this.tipo=tipo;
	this.numero=numero;
	this.edad=edad;
	this.peso=peso;
	this.altura=altura;
	this.celular=celular;
	this.direccion=direccion;
	this.puesto=puesto;

}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellido() {
    return apellido;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}
   
public String getTipo() {
    return tipo;
}

public void setTipo(String tipo) {
    this.tipo = tipo;
}

public int getNumero() {
    return numero;
}

public void setNumero(int numero) {
    this.numero = numero;
}

public int getEdad() {
    return edad;
}

public void setEdad(int edad) {
    this.edad = edad;
}

public int getPeso() {
    return peso;
}

public void setPeso(int peso) {
    this.peso = peso;
}
public int getAltura() {
    return altura;
}

public void setAltura(int altura) {
    this.altura= altura;
}
public int getCelular() {
    return celular;
}

public void setCelular(int celular) {
    this.celular= celular;
}

public String getDireccion() {
    return direccion;
}

public void setDireccion(String direccion) {
    this.direccion = direccion;
}

public int getPuesto() {
    return puesto;
}

public void setPuesto(int puesto) {
    this.puesto = puesto;
}

}
