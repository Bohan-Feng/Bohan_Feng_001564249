/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 *
 * @author harshalneelkamal
 */

import java.util.Map;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;


public class AnalysisHelper {

    public void allusers(){
        for(User u :DataStore.getInstance().getUsers().values() ){
            System.out.println((u));
        }
    }

    //Find Average number of likes per comment.
    public void getAverageLikesPerCommets() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int likeNumber = 0;
        int commentNumber = comments.size();
        for (Comment c : comments.values()) {
            likeNumber += c.getLikes();
        }
        
        System.out.println("average of likes per comments: " + likeNumber / commentNumber + "\n");
            
    }

    public void GetMostLikedCommentPost(){
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        
        int maxVal = -1;
        Post mostlikedComment = (Post) null;

        for (Post p : posts.values()) {
            for (Comment c : p.getComments()) {
                if (c.getLikes() >= maxVal) {
                    maxVal = c.getLikes();
                    mostlikedComment = p;
                }
            }

        }

        System.out.println("the post with most liked comments is " + mostlikedComment + "\n");
    }

    public void GetMostCommentPost(){
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        int maxVal = -1;
        Post mostComment = (Post) null;
        for(Post p : posts.values()){
            if(p.getComments().size() >= maxVal){
                maxVal = p.getComments().size();
                mostComment = p;
            }
        }

        System.out.println("the post with most comments is " + mostComment + "\n");
    }

    public void GetTop5InactivePostUser(){
        Map<Integer, Integer> user_postNum = GetUserPostNumber();
        Map<Integer,User> users = DataStore.getInstance().getUsers();
        Map<Integer, Integer> topInactive = TopInactiveKeys(user_postNum); 
        System.out.println("top 5 inactive users based on total posts number");
        int count = 0;
        for(int i : topInactive.keySet()){
            count ++;
            if(count <= 5)
            System.out.println("\t"+users.get(i));
        }
        System.out.println();
    }

    public Map<Integer, Integer> TopKeys(final Map<Integer, Integer> map){
        LinkedHashMap<Integer, Integer> reverseSortMap = new LinkedHashMap<>();

        map.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .forEachOrdered(x -> reverseSortMap.put(x.getKey(), x.getValue()));

        return reverseSortMap;
    }

    public Map<Integer, Integer> TopInactiveKeys(final Map<Integer, Integer> map){
        LinkedHashMap<Integer, Integer> SortMap = new LinkedHashMap<>();

        map.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue())
        .forEachOrdered(x -> SortMap.put(x.getKey(), x.getValue()));

        return SortMap;
    }

    public Map<Integer, Integer> GetUserPostNumber(){
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        Map<Integer, Integer> user_postNum = new HashMap<Integer, Integer>();
        for(Post p : posts.values()){
            if(user_postNum.keySet().contains(p.getUserId()))
                user_postNum.put(p.getUserId(), user_postNum.get(p.getUserId()) + 1);
            else
                user_postNum.put(p.getUserId(), 1); 
        }
        return user_postNum;
    }

    public void GetTop5InactiveCommentUser(){
        Map<Integer, Integer> user_commnet = GetUserCommentNumber();
        Map<Integer,User> users = DataStore.getInstance().getUsers();
        Map<Integer,Integer> top5 = TopInactiveKeys(user_commnet); 
        System.out.println("top 5 inactive users based on total comment number");
        int count = 0;
        for(int i : top5.keySet()){
            count ++;
            if(count <= 5)
            System.out.println("\t"+users.get(i));
        }
    }

    public Map<Integer, Integer> GetUserCommentNumber(){
        Map<Integer, Integer> user_commentNum = new HashMap<Integer, Integer>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        for(User u : users.values()){
            if(user_commentNum.keySet().contains(u.getId()))
                user_commentNum.put(u.getId(), user_commentNum.get(u.getId()) + u.getComments().size());
            else
                user_commentNum.put(u.getId(), u.getComments().size()); 
        }
        return user_commentNum;
    }
    
    public Map<Integer,Integer> GetUserLikesNumber(){
        Map<Integer, Integer> user_likes = new HashMap<Integer, Integer>();
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        for(Comment c : comments.values()){
            if(user_likes.keySet().contains(c.getUserId()))
                user_likes.put(c.getUserId(), user_likes.get(c.getUserId()) + c.getLikes());
            else{
                user_likes.put(c.getUserId(), c.getLikes());
            }
        }
        return user_likes;
    }

    public void GetTop5InactiveUser(){
        Map<Integer,User> users = DataStore.getInstance().getUsers();
        Map<Integer, Integer> overallData = new HashMap<>();

        Map<Integer, Integer> likesData = GetUserLikesNumber();
        Map<Integer, Integer> commentsData = GetUserCommentNumber();
        Map<Integer, Integer> postsData = GetUserPostNumber();

        for(int key: likesData.keySet()){
            if(overallData.keySet().contains(key)){
                overallData.put(key, overallData.get(key) + likesData.get(key));
            }
            else{
                overallData.put(key, likesData.get(key));
            }
        }
        for(int key: commentsData.keySet()){
            if(overallData.keySet().contains(key)){
                overallData.put(key, overallData.get(key) + commentsData.get(key));
            }
            else{
                overallData.put(key, commentsData.get(key));
            }
        }
        for(int key: postsData.keySet()){
            if(overallData.keySet().contains(key)){
                overallData.put(key, overallData.get(key) + postsData.get(key));
            }
            else{
                overallData.put(key, postsData.get(key));
            }
        }

        Map<Integer, Integer> topInactive = TopInactiveKeys(overallData);
        Map<Integer, Integer> top = TopKeys(overallData);

        System.out.println("\ntop 5 inactive users overall");
        int count  = 0;
        for(int i : topInactive.keySet()){
            if(count++ < 5)
            System.out.println("\t"+users.get(i));
        }

        System.out.println("\ntop 5 proactive users overall");
        int count2  = 0;
        for(int i : top.keySet()){
            if(count2++ < 5)
            System.out.println("\t"+users.get(i));
        }    
    }
}
