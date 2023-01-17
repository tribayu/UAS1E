import java.util.ArrayList;
import java.util.Scanner;

public class UAS1E {

    private String UserID;
    private String UserName;
    ArrayList<massages>MY_Massages;
    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public ArrayList<massages> getMY_Massages() {
        return MY_Massages;
    }

    public void setMY_Massages(ArrayList<massages> MY_Massages) {
        this.MY_Massages = MY_Massages;
    }

    public void main(String[] args) {

        class Messages {
            public void setUserID(String userID) {
            }

            public void setUserName(String userName) {
            }

            public void setWhatYouPosts(String msg) {
            }

            private void setMY_MESSAGES(ArrayList<UAS1E.Messages> xMsg) {
            }

        }

        UAS1E social = new UAS1E();
        social.setUserID("001");
        social.setUserName("@whitehat");
        System.out.println("USER ID : " + social.getUserID());
        System.out.println("USER NAME : " + social.getUserName());
        int jum_msg = 3;
        Scanner sc = new Scanner(System.in);
        ArrayList<UAS1E.Messages> xMsg = new ArrayList<>();
        for (int index = 0; index < jum_msg; index++) {
            UAS1E.Messages msg = new UAS1E.Messages();
            msg.setUserID(social.getUserID());
            msg.setUserName(social.getUserName());
            System.out.print("Post Message " + String.valueOf(index + 1) + " = ");
            String _msg = sc.nextLine();
            msg.setWhatYouPosts(_msg);
            xMsg.add(msg);
        }
        social.setMY_MESSAGES(xMsg);
        social.setUserID("001");
        social.setUserName("@whitehat");
        social.setMY_Massages(new ArrayList<>());
        //TODO :
        //  BUATLAH METHOD ShowPosts untuk menampilkan
        //  pesan yang telah di posting oleh user
        social.ShowPosts(social);

    }

    private void ShowPosts(UAS1E social) {
    }

    private void setMY_MESSAGES(ArrayList<Messages> xMsg) {
    }


    public class Messages {
        public void setUserID(String userID) {
        }

        public void setUserName(String userName) {
        }

        public void setWhatYouPosts(String msg) {
        }
    }
}



