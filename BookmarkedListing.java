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
