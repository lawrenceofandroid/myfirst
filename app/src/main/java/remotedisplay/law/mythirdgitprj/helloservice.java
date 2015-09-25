package remotedisplay.law.mythirdgitprj;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by Administrator on 2015/9/25.
 */
public class helloservice extends Service
{
    public helloservice()
    {
        super();
    }

    /**
     * Hello, this is Service Start Up !!!!!
     */
    @Override
    public void onCreate()
    {
        super.onCreate();
        Toast.makeText(this, "I am in Service  !!!", Toast.LENGTH_SHORT).show();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }
}
