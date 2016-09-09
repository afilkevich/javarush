package com.javarush.test.level25.lesson05.home01;

/**
 * Created by Александр on 14.07.2016.
 */
public class LoggingStateThread extends Thread
{
    private Thread target;
    private State state;

    public LoggingStateThread(Thread target)
    {
        super();
        this.target = target;
        System.out.println(target.getState());
        state = target.getState();
        setDaemon(true);
    }

    @Override
    public void run()
    {

        while (state!=State.TERMINATED)
        {
            if (target.getState() != state)
            {
                state = target.getState();
                System.out.println(state);
            }

        }
    }
}
