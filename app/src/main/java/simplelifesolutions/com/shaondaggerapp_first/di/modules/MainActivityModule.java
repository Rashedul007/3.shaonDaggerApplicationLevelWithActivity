package simplelifesolutions.com.shaondaggerapp_first.di.modules;


import dagger.Module;
import dagger.Provides;
import simplelifesolutions.com.shaondaggerapp_first.MainActivity;
import simplelifesolutions.com.shaondaggerapp_first.adapter.MyRecyclerAdapter;
import simplelifesolutions.com.shaondaggerapp_first.di.scopes.MyActivityScope;

@Module
public class MainActivityModule {

    private final MainActivity mMainActivity;

    public MainActivityModule(MainActivity mActivity)
    {
            this.mMainActivity = mActivity ;
    }


    @MyActivityScope
    @Provides
    public MyRecyclerAdapter provideRecyclerAdapter()
    {
        return new MyRecyclerAdapter(mMainActivity.getApplicationContext());
    }


}
