class x implements Runnable
{
    public void run()
    {
        for(int i = 1; i < 5; i++)
        {
            System.out.println("from Thread x: " + i);
        }

        System.out.println("Exit from x");
    }
}

class y implements Runnable
{
    public void run()
    {
        for(int i = 1; i < 5; i++)
        {
            System.out.println("from Thread y: " + i);
        }

        System.out.println("Exit from y");
    }
}

class Thread_Ex
{
    public static void main(String args[])
    {
        x x1 = new x();
        Thread t1 = new Thread(x1);
        t1.start();

        y y1 = new y();
        Thread t2 = new Thread(y1);
        t2.start();
    }
}

			