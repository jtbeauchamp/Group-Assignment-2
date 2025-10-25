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
