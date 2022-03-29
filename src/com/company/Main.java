package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	//task44();
    //task69();
    //task94();
    //task119();
    task144();
    }

    /** Дан целочисленный массив с количеством элементов n.
     * Напечатать те его элементы, индексы которых являются степенями двойки (1, 2, 4, 8, 16, ...).*/
    public static void task44() {
        int arr[]=new int [34];
        Random rnd = new Random();
        for (int row = 1; row < arr.length; row++) {
            arr[row] = rnd.nextInt(10);
            System.out.print(arr[row] + " ");
        }
        System.out.println();

        for (int i = 1; i < arr.length; i = i * 2) {
            System.out.println(arr[i] + " (" + i + ")");
        }

    }

    /**Найти произведение элементов массива вещественных чисел, меньших заданного числа.*/
    public static void task69()
    {
        int arr[]=new int [10];
        Random rnd = new Random();
        for (int row = 0; row < arr.length; row++) {
            arr[row] = rnd.nextInt(10);
            System.out.print(arr[row] + " ");
        }
        System.out.println();

        int n;
        double p = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        n =in.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < n && arr[i] != 0)
            {
                p *= arr[i];
            }
        }
        System.out.println("Произведение элементов массива, меньших заданного числа: " + p);
    }

    /**Удалить элемент массива целых чисел, равный квадрату 5-го элемента.
    Если таких элементов нет, выдать сообщение «элементы для удаления не найдены».*/
    public static void task94()
    {
        int arr[]=new int [20];
        Random rnd = new Random();
        for (int row = 1; row < arr.length; row++) {
            arr[row] = rnd.nextInt(10) + 2;
            System.out.print(arr[row] + " ");
        }

        System.out.println();

        int pos = arr[5];
        int k = 0;
        System.out.println(pos);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == Math.pow(pos, 2))
            {
                k = i;
            }
        }
        if (k == 0)
        {
            System.out.println("Элементы для удаления не найдены.");
        }
        else
        {
            for (int i = k; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            System.out.println("Новый массив: ");
            for (int i = 1; i < arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    /**Из заданного массива создать три массива, в одном из которых содержатся элементы кратные 2,
    в другом кратные 5, в третьем оставшиеся элементы.*/
    public static void task119()
    {
        int arr[]=new int [20];
        int[] arr_kr2=new int [20];
        int[] arr_kr5=new int [20];
        int[] arr_ost=new int [20];
        int kr2=0, kr5 = 0, ost = 0;
        Random rnd = new Random();
        for (int row = 1; row < arr.length; row++) {
            arr[row] = rnd.nextInt(30);
            System.out.print(arr[row] + " ");
            if (arr[row] % 2 == 0)
            {
                arr_kr2[kr2] = arr[row];
                kr2++;
            }
            if (arr[row] % 5 == 0)
            {
                arr_kr5[kr5] = arr[row];
                kr5++;
            }
            if (arr[row] % 2 != 0 && arr[row] % 5 != 0)
            {
                arr_ost[ost] = arr[row];
                ost++;
            }
        }
        System.out.println();

        for (int i = 0; i < kr2; i++) {
            System.out.print(arr_kr2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < kr5; i++) {
            System.out.print(arr_kr5[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < ost; i++) {
            System.out.print(arr_ost[i] + " ");
        }
        System.out.println();
    }

    /**Дана последовательность n различных целых чисел. Найти сумму ее членов,
    расположенных между максимальным и минимальным значениями (в сумму включить и оба этих числа).*/
    public static void task144()
    {
        int arr[]=new int [20];
        Random rnd = new Random();
        for (int row = 1; row < arr.length; row++) {
            arr[row] = rnd.nextInt(20)+1;
            System.out.print(arr[row] + " ");
        }

        System.out.println();

        int min = arr[1];
        int max = arr[1];
        int minPos = 1;
        int maxPos = 1;
        int sum = 0;

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i])
            {
                min = arr[i];
                minPos = i;
            }
            if (max < arr[i])
            {
                max = arr[i];
                maxPos = i;
            }
        }

        if (minPos > maxPos)
        {
            for (int i = maxPos; i <= minPos; i++) {
                sum += arr[i];
            }
        }
        if (minPos < maxPos)
        {
            for (int i = minPos; i <= maxPos; i++) {
                sum += arr[i];
            }
        }

        System.out.println("Сумма между максимальным и минимальным значениями " + max + " и " + min + ": ");
        System.out.println(sum);
    }

}
