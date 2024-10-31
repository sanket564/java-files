package except;

public class Aptitude {
	static int percent=56;	
static void submit() throws AptitudeException
{
if(percent>95)
{
System.out.println("drives");	
}
else
{
throw new AptitudeException("no drives");	
}
}
public static void main(String[] args)
{
try
{
submit();	
}
catch(AptitudeException e)
{
System.out.println(e.getmessage());	
}
}
}
class AptitudeException extends Exception
{
String textmsg;
AptitudeException(String textmsg)
{
this.textmsg=textmsg;	
}
public String getmessage()
{
return textmsg;	
}
}