//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 /*     Реализовать свой иммутабельный класс,
        который будет внутри себя содержать поле с изменяемым классом*/

        int x=500;
        ArrayList<String>test =new  ArrayList<String>();
        ArrayList<String>test2 =new  ArrayList<String>();
        test.add("Евро");
        test.add("Рубли");
        test.add("Доллары");

        Money One=new Money(x,test);
        //Возвращаем копию массива
        test2=One.getCurr();
        //Здесь сравнение с ВРЕМЕННЫМ методом, для подтверждения, что реально создалась копия
        boolean tests=test2==One.getCurrDelete();

        System.out.println("Результат проверки ссылок 2х объектов: "+tests);
        System.out.println("Содержимое test 2: " + test2);
        System.out.println("Результат возвращения переменной money: "+One.getMoney());

        tests=One.getCurr() == One.getCurr();
        System.out.println("Результат проверки ссылок 2х копий объектов: "+tests);


        }
    }
}
