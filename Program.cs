using System;
using System.Collections.Generic;

namespace Variables
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] intArray = new int[4];
            List<int> intList = new List<int>() { 1, 2, 3 };
            intList.Add(4);
            intList.Add(5);
            Console.WriteLine(intList);
        }

        static bool SecondTestFunction(int i)
        {
            return i < 100;
        }
    }
}