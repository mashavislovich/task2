/**
 * Created by Мария on 03.10.2016.
 */
public class task2
{
    public static void main(String[] args)

    {
        if(args.length<1)// проверка есть ли данные в массиве
        {
            System.out.println("Имя не введено");

        }
        if(args.length>0)
        {
            System.out.println("Hello," + args[0]);
        }
    }



}
