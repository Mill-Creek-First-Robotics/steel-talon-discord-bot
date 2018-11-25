
package bot;

import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import subsystem.PingPong;
import subsystem.PointManager;

public class Main {

    public static void main(String[] args) throws Exception {
        //
        // Initialization
        //
        JDA jda = null;
        // Connect to Discord
        if (args.length > 0) jda = new JDABuilder(args[0]).build();
        else {
            System.out.println("You need to pass a bot token as an argument!");
            return;
        }
        
        jda.awaitReady();
        System.out.println("Connected to Discord!");
        
        // Attach Event Listeners
        jda.addEventListener(new PingPong());
        jda.addEventListener(new PointManager());
        
        System.out.println("Listeners attached!");
        
        
    }

}
 