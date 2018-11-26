package subsystem;

import net.dv8tion.jda.core.hooks.ListenAdapter;

public class NoGood extends ListenAdapter {
	public void MessageRecieved(MessageReceivedEvent event) {
		
		if (event.getauthor().isBot()) return;
		//botception is bad
		 Message message = event.getMessage();
	     String content = message.getContentRaw();
	     
	     if (content.equals("!nogood"))
	     {
	    	 MessageChannel channel = event.getChannel();
	    	 int num = (int)(Math.round(Math.random() * 5 + 1));
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
	
	
	
