import java.util.Arrays;
import java.util.List;

public class BubbleSort<T extends Comparable<T>> {
    public static void main(String[] args)
    {
    }

    private void sort(List<T> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            for (int j = 0; j < list.size()-1; j++)
            {
                if (list.get(j).compareTo(list.get(j+1)) > 0)
                {
                    swapAtIndex(list,j,j+1);
                }
            }
        }
    }
    private void swapAtIndex(List<T> list, int one, int two)
    {
        T temp = list.get(one);
        list.set(one,list.get(two));
        list.set(two, temp);
    }

    private void sortRec(List<T> list)
    {
        _sortRec(list,0,list.size()-1);
    }

    private void _sortRec(List<T> list, int l, int r)
    {
        if (l >= r)
        return;
        else {
            bubblen(list,l,r);
            _sortRec(list,l,r-1);
        }
    }

    private void bubblen(List<T> list, int l, int r)
    {
        if (l >= r)
            return;
        else {
            if (list.get(l).compareTo(list.get(l+1)) > 0)
            {
                swapAtIndex(list,l,l+1);
            }
            bubblen(list,l+1,r);
        }
    }
}
