package test.docker_learn;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.spi.ErrorHandler;
import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;

/**
 * Hello world!
 *
 */
public class App 
{
	public static final Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
    	logger.addAppender(new ConsoleAppender(new SimpleLayout(),"System.out"));
    	while(true){
		logger.debug("My first log4j log");
    		logger.info("First Info Message");
        	System.out.println( "Hello World!" );
	}
    }
}
