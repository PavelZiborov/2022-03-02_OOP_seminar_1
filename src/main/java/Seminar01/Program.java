package Seminar01;

public class Program {
    public static void main(String[] args) {
    /*
    1.Прочитать прикреплённые в архиве лекции а так же выучить всю теорию, изученную на лекциях.
    2.На любом языке C++ или C# реализовать следующий набор классов, при этом должна быть выделена их иерархия:
	2.1.Транспортное средство
	2.2.Автомобиль
	2.3.Мотоцикл
	2.4.Грузовик
	2.5.Велосипед
    Во всех классах должны быть написаны: цвет, модель, количество колёс, вес и скорость а так же метод ехать.
    В классе Program реализовать метод который будет работать с любым наследником класса ровно так же как и с родителем,
    то есть показать значение всех его публичных свойств и вызвать метод ехать.
     */

        Transport bicycle = new Bicycle("Black", 15, 30);
        System.out.println(bicycle.getInfo());

        Transport motocycle = new Motorcycle();
        System.out.println(motocycle.getInfo());


        System.out.println("Демонстрация движения:");
        Demo(motocycle);
        Demo(bicycle);

    }

    public static void Demo(Transport o){
        System.out.println(o);
        o.move();
        o.stop();
        System.out.println("-------");
    }
}