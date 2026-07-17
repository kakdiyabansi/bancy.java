class bank 
{
    double p,r;
    int n;
    void setdata(double pa, double ra, int ny)
	{
        p = pa;
        r = ra;
        n = ny;
    }
     double simpleInterest()
	{
        return (p*r*n/100);
    }
}
    class bank_para
    {
       public static void main(String[] args)
    	{
          bank b1 = new bank();
          bank b2 = new bank();
          b1.setdata(5000,12,5);
          b2.setdata(20000,12,5);
          double s1 = b1.simpleInterest();
		  double sim=b2.simpleInterest();
          System.out.println("Simple interest 1 is: " + s1);
          System.out.println("Simple interest +2 is: " + sim);
        }
    }
