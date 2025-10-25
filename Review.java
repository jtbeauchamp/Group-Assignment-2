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
//
// End class Review
//
