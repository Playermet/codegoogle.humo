package ar.net.fpetrola.humo;

public class DebuggingParserListener extends DefaultParserListener implements ParserListener
{
    private volatile boolean pause;
    private volatile boolean step;

    public void startProductionCreation(CharSequence aName)
    {
	performStep();
    }

    private void performStep()
    {
	while (pause)
	    ;

	if (step)
	    pause= true;
    }

    public void stop()
    {
	pause= true;
	step= false;
    }

    public void continueExecution()
    {
	step= false;
	pause= false;
    }

    public void step()
    {
	step= true;
	pause= false;
    }

    public void getProduction(CharSequence key, CharSequence value)
    {
	if (value != null && value != null && value.length() > 50)
	    performStep();
    }
}
