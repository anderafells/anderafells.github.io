package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    public ReviewRepository(){
        Review popOfPink = new Review(1L, "PopOfPink", image, "The girls go WILD for Pink" );
        Review dreamGreen = new Review(2L, "DreamGreen", fg,"Can't go wrong with green, it's a MONEY magnet!" );
        Review royaltyPurple = new Review(3L, "RoyaltyPurple", image,"C'mon it's a STATEMENT all by itself!");

        reviewsList.put(popOfPink.getId(), popOfPink);
        reviewsList.put(dreamGreen.getId(), dreamGreen);
        reviewsList.put(royaltyPurple.getId(), royaltyPurple);
    }

    public ReviewRepository(Review ...reviewsToAdd){
        for(Review review: reviewsToAdd){
            reviewsList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewsList.values();
    }

}
