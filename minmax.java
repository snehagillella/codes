
class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        Arrays.sort(a);
        
        return new pair(a[0],a[(int)n-1]);
    }
}
