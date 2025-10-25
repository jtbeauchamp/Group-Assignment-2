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

  public void updateUser(String name, int phoneNumber, String email, String         
                         address, String bio){

  }

  public User removeUser(int userID){
    //returns the removed user
  }
}
//
// End class Moderator
//

//
// Start class Community
//
/* Community is a system of users within a specific area that allows users to connect with each other and allow easier notifying of nearby items. */
public class Community{
  private static int ID_counter;
  private final int communityID;  //Primary key
  private String communityName;
  private String location; // an address around which the community is centered
  private String description;

  public Community(communityName, location, description) {
    communityID = ID_counter++; //[0, 1, 2, 3, ...]
    this.communityName = communityName;
    this.location = location;
    this.description = description;
  }

  // accessors
  private int getCommunityID() {
    return communityID;
  }
  private String getCommunityName() {
    return communityName;
  }
  private String getLocation() {
    return location;
  }
  private String getDescription() {
    return description;
  }
  // mutators
  private void setCommunityName(communityName) {
    this.communityName = communityName;
  }
  private void setLocation(location) {
    this.location = location;
  }
  private void setDescription(description) {
    this.description = description;
  }
}
//
// End class Community
//
