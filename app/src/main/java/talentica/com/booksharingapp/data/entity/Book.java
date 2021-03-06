package talentica.com.booksharingapp.data.entity;

import java.util.List;

public class Book {

    private String bookName;
    private List<Auther> authersName;
    private String isbn13;
    private String isbn10;
    private String publisherName;
    private String publishDate;
    private String[] publisherURLs;
    private String binding;
    private String bookPrice;
    private String bookCondition;
    private String[] tags;
    private String genre;
    private String commentByOwner;

   public String getBookName(){

     return bookName;
  }

    public void  setBookName(String bookName){

         this.bookName=bookName;
    }


    public List<Auther> getAuthersName(){

        return authersName;
    }

    public void  setAuthersName(List<Auther> autherName){

        this.authersName=autherName;
    }


    public String getIsbn13Numbers(){

        return isbn13;

    }



    public void  setIsbn13Numbers(String isbn13){

        this.isbn13=isbn13;
    }

    public String getIsbn10Numbers(){

        return isbn10;

    }



    public void  setIsbn10Numbers(String isbn10){

        this.isbn10=isbn10;
    }


    public String[] getPublisherURLs(){

        return publisherURLs;
    }


    public void  setPublishDate(String publishDate){

        this.publishDate=publishDate;
    }

    public String getPublishDate(){

        return publishDate;
    }


    public void  setPublisherURLs(String[] publisherURLs){

        this.publisherURLs=publisherURLs;
    }


    public String getPublisher(){

        return publisherName;
    }


    public void  setPublisher(String publisherName){

        this.publisherName=publisherName;
    }



    public String getBinding(){

        return binding;
    }

    public void  setBinding(String binding){

        this.binding=binding;
    }
    public String getBookPrice(){

        return this.bookPrice;
    }

    public void  setBookPrice(String bookPrice){

        this.bookPrice=bookPrice;
    }

    public String getBookCondition(){

        return bookCondition;
    }

    public void  setBookCondition(String bookCondition){

        this.bookCondition=bookCondition;
    }

    public String[] getBookTags(){

        return tags;
    }

    public void  setBookTags(String[] tags){

        this.tags=tags;
    }


    public String getBookGenre(){

        return genre;
    }

    public void  setBookGenre(String genre){

        this.genre=genre;
    }


    public String getCommentByOwner(){

        return commentByOwner;
    }

    public void  setCommentByOwner(String commentByOwner){

        this.commentByOwner=commentByOwner;
    }

    public class Auther {
        private String name;
        private String mailId;

        public String getBookTags(){

            return name;
        }

        public void  setBookTags(String name){

            this.name=name;
        }


        public String getBookGenre(){

            return mailId;
        }

        public void  setBookGenre(String mailId){

            this.mailId=mailId;
        }
    }


    public  class PublisherAdress{
        private String street1;
        private String street2;
        private String country;
        private String city;
        private String state;
        private String zip;

        public String getStreet1(){

            return street1;
        }

        public void  setStreet1(String street1){

            this.street1=street1;
        }


        public void  setStreet2(String street2){

            this.street2=street2;
        }

        public String getStreet2(){

            return street2;
        }

        public void  setCountry(String country){

            this.country=country;
        }

        public String getCountry(){

            return country;
        }

        public void  setCity(String city){

            this.city=city;
        }

        public String getCity(){

            return city;
        }

        public void  setState(String state){

            this.state=state;
        }

        public String getState(){

            return state;
        }


        public String getZip(){

            return zip;
        }

        public void  setZip(String zip){

            this.zip=zip;
        }

    }
}
