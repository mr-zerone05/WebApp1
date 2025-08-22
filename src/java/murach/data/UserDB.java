/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package murach.data;

import murach.business.User;

public class UserDB {

    // Tạm thời chỉ in ra console thay vì lưu DB
    public static void insert(User user) {
        System.out.println("User đã được thêm: "
                + user.getFirstName() + " "
                + user.getLastName() + " (" + user.getEmail() + ")");
    }
}

