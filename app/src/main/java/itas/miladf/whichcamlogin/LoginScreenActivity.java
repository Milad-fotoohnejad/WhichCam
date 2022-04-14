package itas.miladf.whichcamlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.UriMatcher;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.VideoView;

public class LoginScreenActivity extends AppCompatActivity {

    VideoView videoView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        videoView  =findViewById(R.id.videoView);

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.camback);

        videoView.setVideoURI(uri);

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        videoView.start();

    }



    public void login2(View view) {
        Log.d("milad22", "Login clicked");
        EditText tittle = (EditText) findViewById(R.id.username);
        String username = tittle.getText().toString();
        //pass the username to MainActivity
        EditText pass = (EditText) findViewById(R.id.password);
        String password = pass.getText().toString();
        Intent intent = new Intent(this, Gallery.class);
        intent.putExtra("Username", username);
        intent.putExtra("Password", password);

        Toast.makeText(getApplicationContext(), "Welcome " + username, Toast.LENGTH_LONG).show();
        startActivity(intent);
    }
}