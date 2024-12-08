//package com.hackru.harmonihealth.models;
//
//import java.time.LocalDateTime;
//import java.util.UUID;
//
//import lombok.Getter;
//import lombok.Setter;
//
//@Getter
//@Setter
//public class MatchEntity {
//    private UUID matchId;
//    private UUID user1Id;
//    private UUID user2Id;
//    private LocalDateTime matchTimestamp;
//    private boolean isActive;
//    private MatchStatus status;
//    private LocalDateTime lastInteractionDate;
//
//    public enum MatchStatus {
//        PENDING,        // Initial match, waiting for both users to accept
//        ACTIVE,         // Both users accepted the match
//        EXPIRED,        // Match expired due to inactivity
//        UNMATCHED      // One or both users unmatched
//    }
//
//    // Default constructor
//    public MatchEntity() {
//        this.matchId = UUID.randomUUID();
//        this.matchTimestamp = LocalDateTime.now();
//        this.isActive = true;
//        this.status = MatchStatus.PENDING;
//        this.lastInteractionDate = LocalDateTime.now();
//    }
//
//    // Constructor with user IDs
//    public MatchEntity(UUID user1Id, UUID user2Id) {
//        this();
//        this.user1Id = user1Id;
//        this.user2Id = user2Id;
//    }
//
//
//
//    public boolean isActive() {
//        return isActive;
//    }
//
//
//
//
//    public void setStatus(MatchStatus status) {
//        this.status = status;
//        this.lastInteractionDate = LocalDateTime.now();
//    }
//
//    public void updateLastInteractionDate() {
//        this.lastInteractionDate = LocalDateTime.now();
//    }
//
//    // Helper methods
//    public boolean involves(UUID userId) {
//        return user1Id.equals(userId) || user2Id.equals(userId);
//    }
//
//    public UUID getOtherUserId(UUID userId) {
//        if (user1Id.equals(userId)) return user2Id;
//        if (user2Id.equals(userId)) return user1Id;
//        throw new IllegalArgumentException("User ID not found in match");
//    }
//}