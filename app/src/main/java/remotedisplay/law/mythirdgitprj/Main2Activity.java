package remotedisplay.law.mythirdgitprj;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout555);

        TextView tv = (TextView) findViewById(R.id.textView3);
        tv.setText("This is lawrence Leung and I still miss Alice .... :-(((");
    }
}
