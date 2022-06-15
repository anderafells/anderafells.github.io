package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    public ReviewRepository() {
        Review popOfPink = new Review(1L, "PopOfPink", ("https://images.unsplash.com/photo-1604902396830-aca29e19b067?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTl8fG5haWwlMjBwb2xpc2h8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"),
                "The girls go WILD for Pink");
        Review dreamGreen = new Review(2L, "DreamGreen", ("https://images.unsplash.com/photo-1636725560335-5c87b2d84bb6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjB8fGdyZWVuJTIwbmFpbCUyMHBvbGlzaHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"),
                "Can't go wrong with green, it's a MONEY magnet!");
        Review royaltyPurple = new Review(3L, "RoyaltyPurple", ("https://images.unsplash.com/photo-1526336686748-bd7bb2f1df84?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8cHVycGxlJTIwbmFpbCUyMHBvbGlzaHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"),
                "C'mon it's a STATEMENT all by itself!");


        reviewsList.put(popOfPink.getId(), popOfPink);
        reviewsList.put(dreamGreen.getId(), dreamGreen);
        reviewsList.put(royaltyPurple.getId(), royaltyPurple);
    }

    public ReviewRepository(Review... reviewsToAdd) {
        for (Review review : reviewsToAdd) {
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
