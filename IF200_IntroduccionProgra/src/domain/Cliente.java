package domain;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Dell
 */
public class Cliente {
    
    //atributos globales (no estan dentro del main) se van a poder usar en mi clase. 
    private String Fullname;
    private String Adress;
    private String id;
    private String phone;
    private int age;

    //contrl + alt + insert para generar el constructor automaticamente
    public Cliente (String Fullname, String Adress, String id, String phone, int age) {
        this.Fullname = Fullname;
        this.Adress = Adress;
        this.id = id;
        this.phone = phone;
        this.age = age;
    }
    public Cliente() {
    }

    public String getName() {
        return Fullname;
    }

    public void setName(String name) {
        this.Fullname = name;
    }

    public String getLastName() {
        return Adress;
    }

    public void setLastName(String lastName) {
        this.Adress = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
