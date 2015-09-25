package remotedisplay.law.mythirdgitprj;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by Administrator on 2015/9/25.
 */
public class helloservice extends Service
{
    public helloservice()
    {
        super();
    }

    @Override
    public void onCreate()
    {
        super.onCreate();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }
}
