package subsystem;

/**
 * Manages the .properites file for storing point info
 *
 */
public class UserPointsDataStore extends DataStore {
   public UserPointsDataStore(){
       super("userpoints.prefs");
   }
    
   public int getPoints(String userId){
       return Integer.parseInt(this.props.getProperty(userId + ".pts"));
   }
   
   public void addPoints(String userId, int amount){
       this.props.setProperty(userId + ".pts", Integer.toString(getPoints(userId) + amount));
       this.saveProps();
   }
   
   public void setPoints(String userId, int amount){
       this.props.setProperty(userId + ".pts", Integer.toString(amount));
       this.saveProps();
   }
   
   public boolean isUserInDataStore(String userId){
       return this.props.containsKey(userId + ".pts");
   }
}
