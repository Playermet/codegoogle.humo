package ar.net.fpetrola.humo;

public class DefaultParserListener implements ParserListener
{
    public DefaultParserListener()
    {
    }
    public void startProductionParsing(StringBuilder sourcecode, int first)
    {
    }
    public void startParsingLoop(StringBuilder sourcecode, int first, int current, int last, char currentChar)
    {
    }
    public void endParsingLoop(StringBuilder sourcecode, int first, int current, int last, char currentChar)
    {
    }
    public void beforeParseProductionBody(StringBuilder sourcecode, int first, int current, int last, char currentChar)
    {
    }
    public void beforeProductionSearch(StringBuilder sourcecode, int first, int current, int last, char currentChar)
    {
    }
    public void afterProductionFound(StringBuilder sourcecode, int first, int current, int last, char currentChar, StringBuilder name, StringBuilder production)
    {
    }
    public void beforeProductionReplacement(StringBuilder sourcecode, int first, int current, int last, char currentChar, StringBuilder value, int startPosition, int endPosition)
    {
    }
    public void afterProductionReplacement(StringBuilder sourcecode, int first, int current, int last, char currentChar, StringBuilder value, int startPosition, int endPosition)
    {
    }
    public void endProductionParsing(StringBuilder sourcecode, int first, int current, int last)
    {
    }
    public void afterParseProductionBody(StringBuilder sourcecode, int first, int current, int last, char currentChar, CharSequence name, CharSequence value)
    {
    }
}