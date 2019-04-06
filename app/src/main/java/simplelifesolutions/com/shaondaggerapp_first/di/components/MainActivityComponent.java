package simplelifesolutions.com.shaondaggerapp_first.di.components;

import dagger.Component;
import simplelifesolutions.com.shaondaggerapp_first.MainActivity;
import simplelifesolutions.com.shaondaggerapp_first.Retrofit.APIInterface;
import simplelifesolutions.com.shaondaggerapp_first.adapter.MyRecyclerAdapter;
import simplelifesolutions.com.shaondaggerapp_first.di.modules.MainActivityModule;
import simplelifesolutions.com.shaondaggerapp_first.di.scopes.MyActivityScope;


@MyActivityScope
@Component(modules = {MainActivityModule.class} , dependencies = {ApiServicesComponent.class} )
public interface MainActivityComponent {

   /* MyRecyclerAdapter getRecyclerAdapter();  //inject this

    APIInterface getApiInterfaceCall();  //inject this*/


       void injectMainActivity(MainActivity mainActivity);
}
