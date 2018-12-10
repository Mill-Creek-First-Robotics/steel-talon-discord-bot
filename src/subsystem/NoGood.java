package subsystem;

import net.dv8tion.jda.core.hooks.ListenerAdapter;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class NoGood extends ListenerAdapter {
    public void onMessageReceived(MessageReceivedEvent event) {
        
        if (event.getAuthor().isBot()) return;
        //botception is bad
         Message message = event.getMessage();
         String content = message.getContentRaw();
         
         if (content.equals("!nogood") || content.equals("no good"))
         {
             MessageChannel channel = event.getChannel();
             int num = (int)(Math.random() * 5);
             //^^ random number generator
             switch(num)//sends a message based off of "num"
             {
             case 1:
                 channel.sendMessage("That's NO G00D.").queue();
             break;
             case 2:
                 channel.sendMessage("Nein gut").queue();
             break;
             case 3:
                 channel.sendMessage("No bueno").queue();
             break;
             case 4:
                 channel.sendMessage("Sacre bleu").queue();
             break;
             case 5:
                 channel.sendMessage("malus").queue();
             break;
             case 6:
                 channel.sendMessage("nu e bine").queue();
             break;
             case 7:
                 channel.sendMessage("Mi povas").queue();
             break;
             }
             
         }
    }
        
        
        
        
}
	
	
	
