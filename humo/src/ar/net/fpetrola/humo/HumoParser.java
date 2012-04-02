/*
 * Humo Language
 * Copyright (C) 2002-2010, Fernando Damian Petrola
 *
 * Distributable under GPL license.
 * See terms of license at gnu.org.
 */

package ar.net.fpetrola.humo;

import java.util.HashMap;
import java.util.Map;

public class HumoParser
{
    protected Map<CharSequence, CharSequence> productions= new HashMap<CharSequence, CharSequence>();

    public int parse(StringBuilder sourcecode, int first)
    {
	int last= first, current= first;

	for (char currentChar; last < sourcecode.length() && (currentChar= sourcecode.charAt(last++)) != '}';)
	{
	    if (currentChar == '{')
	    {
		current= parse(sourcecode, last);
		productions.put(sourcecode.subSequence(first, last - 1), sourcecode.subSequence(last, current));
		last= first= ++current;
	    }
	    else
	    {
		CharSequence production= productions.get(sourcecode.subSequence(current, last));
		if (production != null)
		{
		    StringBuilder value= new StringBuilder(production);
		    parse(value, 0);
		    int[] edges= ClearCharSequence.findEdges(sourcecode, current, last);  // Just to beautify debugging process
		    sourcecode.replace(current= edges[0], edges[1], value.toString());
		    last= current+= value.length();
		}
	    }
	}

	return last - 1;
    }
}
