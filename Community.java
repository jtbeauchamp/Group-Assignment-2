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
