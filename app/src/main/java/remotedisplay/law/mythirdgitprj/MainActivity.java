package remotedisplay.law.mythirdgitprj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               finish ();
            }
        });

        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setText (now ());
    }


    /**
     * Return the current Date Time on String
     *
     * @return
     */
    private String now ()
    {
     return new java.util.Date ().toString();
    }

    /**
     *
     * @param str  Message to be Toast on Screen
     * @return Return the original String
     */
    private String displayMessage (String str)
    {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
        return str;
    }
}
