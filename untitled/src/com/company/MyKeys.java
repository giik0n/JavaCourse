package com.company;

/*
 * @author Alexander Panyshchev
 * @since 6/25/20
 * @version 1.0
 *Task:
 *
 */
class MyKeys
{
    Integer key;
    MyKeys(Integer k)
    {
        key = k;
    }
    public boolean equals(Object o)
    {
        return ((MyKeys) o).key == this.key;
    }
}
