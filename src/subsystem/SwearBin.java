package subsystem;

import net.dv8tion.jda.core.hooks.ListenerAdapter;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;



public class SwearBin extends ListenerAdapter {
    
	private String[] badWords = {
			"fuck","shit","damn","minorities","nigg","chink","dammit","gaymer","owo","uwu","yiff","hentai","loli","shota","bomboclat","boku no pico","nigeria","africa","chris","jason","vesper","cheesecakecg","roblox" 
	};
		
		
	
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) return;
        // We don't want to respond to other bot accounts, including ourself
        Message message = event.getMessage();
        String content = message.getContentRaw().toLowerCase(); // We don't want swears to be case sensitive.
        // getContentRaw() is an atomic getter
        // getContentDisplay() is a lazy getter which modifies the content for e.g. console view (strip discord formatting)
        for (int i = 0; i < badWords.length; i++) {
	        if (content.contains(badWords[i])) {
	            MessageChannel channel = event.getChannel();
	            channel.sendMessage("Hey! Do you kiss your mother with that keyboard?").queue(); // Important to call .queue() on the RestAction returned by sendMessage(...)
	        }
        }
    }
}
