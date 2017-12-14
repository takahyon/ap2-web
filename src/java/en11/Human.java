/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en11;

/**
 *
 * @author iwashita
 */
public class Human {
    //フィールド
    private String name;    //氏名
    private int age;      //点数

    //コンストラクタ
    public Human(String n, int p) {
        this.name = n;
        this.age = p;
    }

    //フィールドnameを返すメソッド
    public String getName() {
        return name;
    }
    //フィールドageを返すメソッド
    public int getAge() {
        return age;
    }
    //評価を返すメソッド
    public String getKind() {
        if (age >= 12) {
            return "大人";
        } else if (age >= 6&& age <12) {
            return "こども";
        } else{
            return "乳幼児";
        }
    }

}
