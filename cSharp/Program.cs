using System;
using System.Collections.Generic;

namespace cSharp
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = new int[] { 1, 2, 3, 2, 4, 3, 5, 6, 7, 8, 5 };
            var set = new HashSet<Int32>();

            int firstDuplicate = -1;
            int indexOfFirstDuplicate = -1;

            for (int i = 0; i < arr.Length; i++)
            {
                int value = arr[i];
                if (set.Add(value))
                {
                    set.Add(value);
                }
                else
                {
                    firstDuplicate = value;
                    indexOfFirstDuplicate = i;
                    break;
                }
            }

            Console.WriteLine("First Duplicate on Index = " + indexOfFirstDuplicate + " Value = " + firstDuplicate);
        }
    }
}
