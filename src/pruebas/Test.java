/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebas;

public class Test {
static int total = 10;
public static void main (String args []) {
new Test();
}
public Test () {
System.out.println("In test");
System.out.println(this);
int temp = this.total;
if (temp > 5) {
System.out.println(temp);
}}}