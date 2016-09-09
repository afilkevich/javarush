package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    public Solution(Integer a){}
    public Solution(Object o){}
    public Solution(){}

     Solution(Boolean h){}
     Solution(Short s){}
     Solution(Double g){}

    protected Solution(Long t){}
    protected Solution(long a){}
    protected Solution(float s){}

    private Solution(Integer s,Short h){}
    private Solution(char j){}
    private Solution(char g,String s){}
}

