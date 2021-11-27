package BicycleRentalApplication;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {

    String fName;
    String lName;
    String Email;
    String Password;

    public static File UsersFile = new File("UsersFile.txt");
    public static ArrayList<User> Users = new ArrayList<>();

    public User(String fName, String lName, String Email, String Password) {
        this.fName = fName;
        this.lName = lName;
        this.Email = Email;
        this.Password = Password;
    }



    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
    
    

    // To add Users to Arraylist, THEN to Users File
    public static void writeUser(User user) throws Exception {
        Users.add(user);
        FileOutputStream os = new FileOutputStream(UsersFile);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(Users);
        os.close();
        oos.close();

    }

    public static void UpdateUsers() throws Exception {
        FileOutputStream os = new FileOutputStream(UsersFile);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(Users);
        os.close();
        oos.close();
    }

    // To retrieve Users information from Users File to Arraylist
    public static void readUsers() throws FileNotFoundException, IOException, ClassNotFoundException {

        FileInputStream UsersObjIS = new FileInputStream(UsersFile);
        ObjectInputStream ReadObj = new ObjectInputStream(UsersObjIS);
        Users = (ArrayList<User>) ReadObj.readObject();

        UsersObjIS.close();
        ReadObj.close();

    }

    public static int isUserExist(String email, String password) {

        for (int i = 0; i < Users.size(); i++) {
            if (Users.get(i).getEmail().equals(email) && Users.get(i).getPassword().equals(password)) {
                return i;
            }
        }
        return -1;
    }

    //clear arraylist 
//    public static void clear() throws Exception {
//        try (FileOutputStream os = new FileOutputStream(PetObjects);
//                ObjectOutputStream oos = new ObjectOutputStream(os)) {
//            foundPets.clear();
//            oos.writeObject(foundPets);
//            lostPets.clear();
//            oos.writeObject(lostPets);
//            adoptionPets.clear();
//            oos.writeObject(adoptionPets);
//        }
//    }
    
        @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
