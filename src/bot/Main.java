
package bot;

import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import subsystem.PingPong;

public class Main {

	public static void main(String[] args) throws Exception {
		//
		// Initialization
		//
		
		// Connect to Discord
		// TODO: Keep the bot token only on the server.
		JDA jda = new JDABuilder("NTA2NTM5ODIwNzE4NDg5NjEw.DrjpLw.TxLhECMBuOjX5I3ifawtn0KPbLM").build();
		jda.awaitReady();
		System.out.println("Connected to Discord!");
		
		// Attach Event Listeners
		jda.addEventListener(new PingPong());
		
		System.out.println("Listeners attached!");
		
		
	}

}
 