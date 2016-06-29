package com.example.TrainiaTeam.Trainia;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.facebook.*;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import org.json.JSONObject;

import java.io.InputStream;
import java.util.Arrays;

public class FacebookFragment extends Fragment {


    private String name,get_gender,Date_Of_Birth;
    private AccessTokenTracker mTokenTracker;
    private ProfileTracker mProfileTracker;
    private CallbackManager mcallbackManager;
    private ImageView profilePicImageView;
    private FacebookCallback<LoginResult> mcallback = new FacebookCallback<LoginResult>() {
        @Override
        public void onSuccess(LoginResult loginResult) {
            LoginManager.getInstance().logInWithReadPermissions(getActivity(), Arrays.asList("user_photos", "user_friends", "user_birthday", "user_location"));
            GraphRequest request = GraphRequest.newMeRequest(
                    AccessToken.getCurrentAccessToken(),
                    new GraphRequest.GraphJSONObjectCallback() {
                        @Override
                        public void onCompleted(
                                JSONObject object,
                                GraphResponse response) {
                            name = object.optString("name");
                            get_gender = object.optString("gender");
                            Date_Of_Birth = object.optString("birthday");

                            Log.d(name, "name");
                            Log.d(get_gender,"gender");
                            Log.d(Date_Of_Birth,"birthday");


                        }
                    });
            Bundle parameters = new Bundle();
            parameters.putString("fields", "id,name,link,gender,birthday");
            request.setParameters(parameters);
            request.executeAsync();

            AccessToken accessToken = loginResult.getAccessToken();
            com.facebook.Profile profile = com.facebook.Profile.getCurrentProfile();
            displayWelcomeMessage(profile);
            new LoadProfileImage(profilePicImageView).execute(profile.getProfilePictureUri(200, 200).toString());

            Intent i = new Intent(getActivity(), Sign_up_2.class);
            startActivity(i);
            ((Activity) getActivity()).overridePendingTransition(0, 0);



        }

        @Override
        public void onCancel() {
            Toast.makeText(getActivity().getApplicationContext(), "Oops, No Internet Connection", Toast.LENGTH_LONG).show();
            Intent i = new Intent(getActivity(), Sign_In.class);
            startActivity(i);
            ((Activity) getActivity()).overridePendingTransition(0, 0);


        }

        @Override
        public void onError(FacebookException e) {
            Toast.makeText(getActivity().getApplicationContext(),"Sorry, An Error Has Occurred",Toast.LENGTH_LONG).show();
            Intent i = new Intent(getActivity(), Sign_In.class);
            startActivity(i);
            ((Activity) getActivity()).overridePendingTransition(0, 0);


        }
    };
    public FacebookFragment() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getActivity().getApplicationContext());
        mcallbackManager = CallbackManager.Factory.create();

        mTokenTracker   = new AccessTokenTracker() {
            @Override
            protected void onCurrentAccessTokenChanged(AccessToken oldToken, AccessToken newToken) {

            }
        };
        mProfileTracker  = new ProfileTracker() {
            @Override
            protected void onCurrentProfileChanged(com.facebook.Profile oldProfile, com.facebook.Profile newProfile) {
                displayWelcomeMessage(newProfile);
            }
        };
        mTokenTracker.startTracking();
        mProfileTracker.startTracking();

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_facebook_fragment, container, false);
    }


    public void displayWelcomeMessage(com.facebook.Profile profile)
    {
        if(profile != null)
        {
            // mtextDetail.setText("welcome" + profile.getName()+"/n");
        }
    }



    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LoginButton loginButton = (LoginButton) view.findViewById(R.id.login_button);
        loginButton.registerCallback(mcallbackManager, mcallback);
        loginButton.setReadPermissions("user_friends");
        loginButton.setFragment(this);

        profilePicImageView = (ImageView) view.findViewById(R.id.profilePicture);
    }

    @Override
    public void onResume() {
        super.onResume();
        com.facebook.Profile profile = com.facebook.Profile.getCurrentProfile();
        displayWelcomeMessage(profile);
    }

    @Override
    public void onStop() {
        super.onStop();
        mTokenTracker.startTracking();
        mProfileTracker.startTracking();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        mcallbackManager.onActivityResult(requestCode, resultCode , data);
    }
    private class LoadProfileImage extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        public LoadProfileImage(ImageView bmImage) {
            this.bmImage = bmImage;
        }

        protected Bitmap doInBackground(String... uri) {
            String url = uri[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new java.net.URL(url).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) {

            if (result != null) {


                Bitmap resized = Bitmap.createScaledBitmap(result, 200, 200, true);
                bmImage.setImageBitmap(ImageHelper.getRoundedCornerBitmap(getContext(),resized,250,200,200, false, false, false, false));

            }
        }
    }
}
