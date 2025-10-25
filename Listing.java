//
// Start class Listing
//
public class Listing{
  private static int ID_counter;
  private final int listingID;  // Primary key
  private final int posterID;  // Foreign key
  private final int communityID;  // Foreign key
  private String name;
  private String condition;
  private String tags;
  private String description;
  private boolean isAvailable;
  private String permaLink;  //Stores image URL

  //Constructors (one without permaLink, and one with it)
  public Listing(int posterID, int communityID, String name, String condition, 
                 String description, String tags){
    listingID = listingID++;
    this.posterID = posterID;
    this.communityID = communityID;
    this.name = name;
    this.condition = condition;
    this.description = description;
    this.tags = tags;
    isAvailble = true;
  }

  public Listing(int posterID, int communityID, String name, String condition, 
                 String description, String tags, String permaLink){
    super(posterID, communityID, name, condition, description, tags, isAvailable);
    this.permaLink = permaLink;
  }


  //Accessor
  private int getListingID(){
    return listingID;
  }

  private int getPosterID(){
    return posterID;
  }

  private int getCommunityID(){
    return communityID;
  }

  private String setName(){
    return name;
  }

  private String getCondition(){
    return condition;
  }

  private String getDescription(){
    return description;
  }

  private String getTags(){
    return tags;
  }

  private boolean getAvailability(){
    return isAvailable;
  }

  private String getPermalink(){
    return permalink;
  }

  //Mutatorss
  private void setListingID(int listingID){
    this.listingID = listingID;
  }

  private void setPosterID(int posterID){
    this.posterID = posterID;
  }

  private void setCommunityID(int communityID){
    this.communityID = communityID;
  }

  private void setName(String name){
    this.name = name;
  }

  private void setCondition(String condition){
    this.condition = condition;
  }

  private void setDescription(String description){
    this.description = description;
  }

  private void setTags(String tags){
    this.tags = tags;
  }

  private void setAvailability(boolean isAvailable){
    this.isAvailable = isAvailable;
  }

  private void setPermalink(permalink) {
	this.permalink = permalink;
  }
}
//
// End class Listing
//
