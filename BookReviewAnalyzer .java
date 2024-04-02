import java.util.*;

class BookReview {
    String title;
    int rating;

    public BookReview(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }
}

public class BookReviewAnalyzer {
    public static void main(String[] args) {
        List<BookReview> bookReviews = new ArrayList<>();
        bookReviews.add(new BookReview("Book1", 4));
        bookReviews.add(new BookReview("Book2", 7));
        bookReviews.add(new BookReview("Book3", 2));
        bookReviews.add(new BookReview("Book4", 8));
        bookReviews.add(new BookReview("Book5", 5));

        int[] ratingRanges = {1, 5, 6, 10};
        int[] ratingRangeCounts = new int[ratingRanges.length / 2];
  …
