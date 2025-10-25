//
// Start class Moderator
//
public class Moderator extends User{
  private static int ID_counter;
  private final int moderatorID;  //Primary key
  public Moderator(String name, String phoneNumber, String email, String address, String bio) {
    super(name, phoneNumber, email, address, bio);
  }

  // Same as user removeListing but skips checking if the user posted the listing.
  @Override
  public void removeListing(int listingID){

  }

  //Creates a moderator (this class is unique in that moderators can create/manage other moderators, subject to change during implementation)
  public void createModerator(int userID){

  }

  public void updateModerator(int moderatorID){

  }

  public int removeModerator(int moderatorID){
    //return the removed moderator’s ID
  }

  public void updateUser(String name, int phoneNumber, String email, String address, String bio){

  }

  public User removeUser(int userID){
    //returns the removed user
  }
}
//
// End class Moderator
//
