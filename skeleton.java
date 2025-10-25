//
// Start class User
//
public class User {

  // Used to keep track of the next User ID number to be assigned
  private static int ID_counter;
  private final int userID;  //Primary key
  private String name;
  private String phoneNumber;
  private String email;
  private String address;  
  private String bio;
  private int rating;
  private int timesRated;

  //Default constructor only given name
  public User(name, phoneNumber, email, address, bio) {
	userID = ID_counter++;
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.email = email;
	this.address = address;
	this.bio = bio;
	rating = -1; // default rating is hidden
 	timesRanked = 0;
  }
  
  // accessors
  private int getUserID() {
    return userID;
  }
  private int getName() {
    return name;
  }
  private int getPhoneNumber() {
    return phoneNumber;
  }
  private int getEmail() {
    return email;
  }
  private int getAddress() {
    return address;
  }
  private int getBio() {
    return bio;
  }
  private int getRating() {
    return rating;
  }
  private int getTimesRated() {
    return timesRated;
  }
  
  // mutators
  private void setUserID(userID) {
    this.userID = userID;
  }
  private void setName(name) {
    this.name = name;
  }
  private void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  private void setEmail(String email) {
    this.email = email;
  }
  private void setAddress(String address) {
    this.address = address;
  }
  private void setBio(String bio) {
    this.bio = bio;
  }
  private int setRating(int rating) {
    this.rating = rating;
  }
  private int setTimesRated(int timesRated) {
    this.timesRated = timesRated;
  }

  // Use cases
  //NOTE: These User methods are shared with Moderator!!!
  //Returns a user based on the search input (i.e. name, userID, etc.)
  public void modifySelf(String name, int phoneNumber, String email, String address, String bio) {
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.email = email;
	this.address = address;
	this.bio = bio;
  }

  //Removes user from the system after a confirmation is given
  public void deleteSelf() {
	Scanner scan = new Scanner(System.in);
	System.out.println(“Are you sure you want to delete your account? Please type \“Yes\” if you do:”);
	if (scan.nextLine().equals(“Yes”) {
	  //Code to delete self here
	}
	else {System.out.println(“\“Yes\” was not typed, cancelling deletion.”);}
  }


  /* Given the attributes an item, create an item associated with the  
  PosterID */
  public int addListing(Community community, String itemName, String quality, 
                        String description, String tags) {
	Listing listing = new Listing(userID, community, quality, description, 
                                   tags, true);
	return listing.getListingID();
  }

  // search use case
  public User searchUser(int userID) {
	//return bio and contact info, etc
  }
  public User searchModerator(int moderatorID) {
	//return bio and contact info, etc
  }
  public Listing searchListing(String keywords) {
	//return the listing
  }

  /* Given an listingID, remove the listing from listing and database */
  public void removeListing(int listingID) {
	
  }

  /* Given an itemID, the parameters are all the updated to the status 
  that the user inputs as a parameter */
  public void updateListing(int listingID, String itemName, String condition){
    
  }

  public void contactModerator(Community community) {
	
  }

  public void submitReview(User responder, User poster, description, rating){
	// create an instance of review
  }

  public void updateReview(User responder, User poster, description, rating){
    //returns the removed review
  }

  public Review removeReview(reviewID){
    //returns the removed review
  }

  public void bookmarkItem(int listingID){

  }

  public int removeBookmark(int listingID, int userID){
    //return listingID of the removed bookmark
  }

    /* claim item use case (similar to removing an item as a moderator, since who claims the item doesn’t really matter too much.) */
  public boolean claimItem(int listingID){
    //return true if item is able to be claimed
  }

  public ClaimedItem removeClaim(int claimedItemID){
    //return ClaimedItem object
  }

  public void addImage(String permaLink){
    //only works if there is no permaLink yet; potentially combine this with updateImage
  }

  public String updateImage(String permaLink){
    //return the permalink of updated image
  }

  public String removeImage(int listingID){
    //return removed permalink of the image
  }

  public void addCommunity(String location, String communityName){

  }

  public String modifyCommunity(String location, String communityName){
    //return the updated name/location of community
  }

  public Community removeCommunity(int communityID){
    //return the removed Community object
  }

  public Community searchCommunity(String communityName, String                    communityLocation){
    //return any resulting Community objects
  }
  
}
//
// End class User
//

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

//
// Start class claimedItem
//
public class ClaimedItem{
  private static int ID_counter;
  private final int claimedItemID;  // Primary key
  private final int listingID;  // Foreign key
  private final int userID;  //Foreign key
  private final String claimDate;

  //Constructor
  public ClaimedItem(int listingID, int userID) {
    claimedItemID = ID_counter++;
    this.listingID = listingID;
    this.usedID = userID;
    claimDate = currentDate(); // implement currentDate(); later
  }

  //Accessors
  private int getListingID() {
	return listingID;
  }

  private int getUserID() {
	return userID;
  }

  private String getClaimDate() {
	return claimDate;
  }

  //Mutators
  private void setListingID(int listingID){
    this.listingID = listingID
  }

  private void setUserID(int userID){
    this.userID = userID;
  }

  private void setClaimDate(int claimDate){
    this.claimDate = claimDate;
  }
}
//
// End class claimedItem
//

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

//
// Start class BookmarkedListing
//
public class BookmarkedListing{
  private static int ID_counter;
  private final int bookmarkedListingID;  //Primary key
  private final int listingID;  //Foreign key
  private final int userID;  //Foreign key
  private String bookmarkDate;

  public BookmarkedListing(listingID, userID) {
	bookmarkedListingID = ID_counter++;
	this.listingID = listingID;
	this.userID = userID;
	bookmarkDate = currentDate();
  private int getBookmarkedListingID() {
	return bookmarkedListingID();
  }

  private int getListingID() {
	return listingID;
  }

  private int getUserID() {
	return userID;
  }

  private String getBookmarkDate() {
    return bookmarkDate;
  }
}
//
// End class BookmarkedListing
//

//
// Start class Review
//
public class Review{
  private int ID_counter;
  private final int reviewID;  //Primary key
  private final int userID;  //Foreign key
  private final int posterID;  //Foreign key
  private String description;
  private int rating;
  private String reviewDate;

  public Review(userID, posterID, description, rating) {
	reviewID = ID_counter++;
	this.userID = userID;
	this.posterID = posterID;
	this.description = description;
	this.rating = rating;
	reviewDate = currentDate();
  }

  //Accessors
  private int getReviewID() {
	return reviewID;
  }
  private int getUserID() {
	return userID;
  }
  private int getPosterID() {
	return posterID;
  }
  private int getDescription() {
	return description;
  }
  private int getRating() {
	return rating;
  }

  //Mutator
  private void setDescription(String description){
    this.description = description;
  }

  private void setReviewDate(){
    reviewDate = currentDate();
  }

  private void setRating(int rating){
    this.rating = rating;
  }
}
