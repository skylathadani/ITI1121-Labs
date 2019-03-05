import java.util.Calendar;
import java.util.Date;

public class Post implements Likeable, Comparable<Post> {

    protected int likes;
    private Date timeStamp;
    private String userName;

    public Post(String userName) {
      Date rightNow = Calendar.getInstance().getTime();
      //System.out.println(rightNow);
      this.timeStamp = rightNow;
      this.userName = userName;
      this.likes = 0; 
    }

    public String getUserName() {
	     return userName;
    }

    public Date getTimeStamp() {
	     return timeStamp;
    }

    public void like(){
      this.likes++;
    }

    public int getLikes(){
      return likes;
    }



    // Implement the methods required by the interface Likeable.
    // This file will not compile unless they are present with the correct name and signature.

    public String toString() {
    	String str = new String();
    	str = getClass().getName() + ": " + timeStamp + ", " + userName + ", likes = " + likes;
    	return  str;
    }


  	public int compareTo(Post other){
  		return(this.timeStamp.compareTo(other.timeStamp));
  	}

  	public boolean isPopular(){
  		if(this.likes > 100){
        return true;
      }
      return false;
  	}

}
