public class Stats{
    public static void main(String[] args){
        double[] arr1 = {1,2,3};
        double[] arr2 = {2,4,7};
        System.out.println(linearRegression(arr1, arr2));
    }


public static double linearRegression(double[] x, double[] y){
    int n = x.length;
    double xsum = 0, ysum = 0, x2sum = 0, xysum = 0;
    for (int i = 0; i < n; i++){
        ysum+= y[i];
        xsum += x[i];
        x2sum += (x[i] * x[i]);
        xysum += (x[i] * y[i]);
    }
    return (n*xysum-(xsum*ysum))/((n*x2sum-(xsum * xsum)));
}

}