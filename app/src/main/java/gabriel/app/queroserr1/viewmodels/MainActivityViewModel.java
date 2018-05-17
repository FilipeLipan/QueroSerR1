package gabriel.app.queroserr1.viewmodels;

import android.arch.lifecycle.ViewModel;

import com.google.firebase.auth.FirebaseUser;

public class MainActivityViewModel extends ViewModel {
    private FirebaseUser mUser;
    private String uid, name, email;

    public MainActivityViewModel() {
    }



    public FirebaseUser getmUser() {
        return mUser;
    }

    public void setmUser(FirebaseUser mUser) {
        this.mUser = mUser;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
