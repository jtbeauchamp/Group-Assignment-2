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
  public int addListing(Community community, String itemName, String quality, String description, String tags) {
	Listing listing = new Listing(userID, community, quality, description, tags, true);
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

  public Community searchCommunity(String communityName, String communityLocation){
    //return any resulting Community objects
  }
  
}
//
// End class User
//
