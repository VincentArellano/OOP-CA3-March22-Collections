package com.dkit.gd2.johnloane;

import java.util.Comparator;

public class ComparatorStudentName implements Comparator<Student>
{
    @Override
    public int compare( Student t1, Student t2)
    {
        return t1.getName().compareTo(t2.getName());
    }
}
