using System;
public class Program
{
    public static void Main()
    {
    double first = 0.0;
    double second = 0.0;
    double sum = 0.0;
    double difference = 0.0;
    double product = 0.0;
    Console.WriteLine("Input 1st integer : ");
    first = Convert.ToDouble(Console.ReadLine());
    Console.WriteLine("Input 2nd integer : ");
    second = Convert.ToDouble(Console.ReadLine());
    Console.WriteLine("=================");
    sum = first + second;
    difference = first - second;
    product = first * second;
    Console.WriteLine("Sum of two integers : " + sum);
    Console.WriteLine("Difference of two integers : " + difference);
    Console.WriteLine("Product of two integers : " + product);
    }
}