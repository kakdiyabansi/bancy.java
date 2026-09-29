class Multi_Runnable implements Runnable
{
    public void run()
    {
        System.out.println("thread is running.");
    }

    public static void main(String args[])
    {
        Multi_Runnable m1 = new Multi_Runnable();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}

	