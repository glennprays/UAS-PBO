/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author glenn
 */
public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private int idCategory;
    private String photo;

    public User(int id, String name, String email, String password, int idCategory, String photo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.idCategory = idCategory;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public String getPhoto() {
        return photo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    
}
