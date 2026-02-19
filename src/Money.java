package PACKAGE_NAME;

public final class Money
{
  private final int money;              //Будет хранить кол-во денег
  private final ArrayList<String> curr; //Будет хранить в себе значение валюты


//Конструктор с параметрами с полным заполнением полей всех переменных
    public Money(int money,ArrayList<String> array)
    {
        this.money=money;
        //Копируем исходный массив
        this.curr=new ArrayList<>(array);

    }
    //Геттер для возвращения суммы денег
    public int getMoney()
    {
        return money;
    }

    //Возвращаем копию массива, хранящего валюты
    public ArrayList<String> getCurr()
    {
        return new ArrayList<String> (curr);
    }
    //Этот геттер создал для подтверждения и проверки, что в результате на самом деле будет отличный объект
    //В реализации он должен быть удален
    public ArrayList<String> getCurrDelete()
    {
        return curr;
    }

}

