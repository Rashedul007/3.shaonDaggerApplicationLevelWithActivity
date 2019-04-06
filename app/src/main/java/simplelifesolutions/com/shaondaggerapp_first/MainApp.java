package simplelifesolutions.com.shaondaggerapp_first;

import android.app.Application;

import simplelifesolutions.com.shaondaggerapp_first.di.components.ApiServicesComponent;
import simplelifesolutions.com.shaondaggerapp_first.di.components.DaggerApiServicesComponent;
import simplelifesolutions.com.shaondaggerapp_first.di.modules.ContextModule;

public class MainApp extends Application {

    private ApiServicesComponent mApiServiceComp;

    public static MainApp getAppInstance(MainActivity mAct)
    {
        return (MainApp) mAct.getApplication();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        mApiServiceComp = DaggerApiServicesComponent.builder()
                           // .contextModule(new ContextModule(this))
                            .build();
    }


    public ApiServicesComponent getAPIserviceComponents()
    {
        return mApiServiceComp ;
    }

}
