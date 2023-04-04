public class Arrayquestion {


    public int bSearch(int[] a,int start , int end,int key){

        if(start>end)
            return -1;

        int middle = start + (end-start)/2;

        if(a[middle]== key)
            return middle;

        if(a[middle] > key)
            return bSearch(a,start,middle-1,key);

        return bSearch(a,middle+1,end,key);
    }
int searchRight(int[] a,int  mid){
        int initial = a[mid];
        int index = mid;
      for (int i=mid;i<a.length;i++)
          if(a[i] == initial)
              index = i;
          else
              break;

          return index;
}

    int searchLeft(int[] a,int  mid){
        int initial = a[mid];
        int index = mid;
        for (int i=mid;i>=0;i--)
            if(a[i] == initial)
                index = i;
            else
                break;

        return index;
    }


    public static void main(String[] args) {
Arrayquestion arr = new Arrayquestion();
      int[] array = {5,5,5,5,7,7,8,8,10,10,10};

        int mid = arr.bSearch(array,0,array.length-1,7);

        int start = -1;
        int end = -1;

if(mid!=-1){
    start = arr.searchLeft(array,mid);
    end = arr.searchRight(array,mid);
}

        System.out.println(start);
        System.out.println(end);

    }
}
