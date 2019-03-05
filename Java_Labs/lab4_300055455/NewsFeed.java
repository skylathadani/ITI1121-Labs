/* *
 * Use static array for NewsFeed
 * with constant MAX_SIZE
 * */

import java.util.Arrays;
public class NewsFeed {

    private Post[] messages;
    private int size;
    public static final int MAX_SIZE = 25;

    public NewsFeed() {
    	this.messages = new Post[MAX_SIZE];
      this.size = 0;
    }

    public void add(Post message) {

      messages[this.size] = message;
      

      this.size++;

      
    }

    public Post get(int index) {
	     return messages[index];
    }

    public int size() {
	     return size;
    }

	  public void sort(){
			int i, j, argMin;
			Post tmp;
			for (i = 0; i < size - 1; i++) {
				argMin = i;
				for (j = i + 1; j < size(); j++) {
					if (messages[j].compareTo(messages[argMin]) < 0) {
						argMin = j;
					}
				}

  			tmp = messages[argMin];
  			messages[argMin] = messages[i];
  			messages[i] = tmp;
		  }

	  }

  	public NewsFeed getPhotoPost(){
  		NewsFeed photo = new NewsFeed();

      for(int i = 0; i<this.size;i++){
        if(this.messages[i] instanceof PhotoPost){
          photo.add(this.messages[i]);
        }
      }

      return (photo);
  	}

  	public NewsFeed plus(NewsFeed other){

      //int count = 0;

      NewsFeed n = new NewsFeed();
      for(int i = 0; i < this.size();i++ ){
        n.add(this.messages[i]);
        //count++;
      }
      for(int j = 0; j < other.size();j++){
        n.add(other.messages[j]);
      }

      n.sort();

      return n;

  	 
  	}

}
