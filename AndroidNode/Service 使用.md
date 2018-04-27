# View 实例化流程以及相关属性说明


### 1.Service
继承Context，常用来在后台一直工作

### 2.IntentService
* 每次通过创建HandlerThread完成一个队列事件操作的耗时操作，全部工作完成IntentService销毁
* 如果在上次onHandleIntent没有执行完成的情况下，再次启动该服务，不会创建新的服务，直接通过onStartCommand
    将数据发送到HandlerThread的消息队列，等待执行
* 


### 3.JobIntentService
源码：android.support.v4.app.JobIntentService

#####相同点:
*工作模式跟IntentService一样*

#####区别：
*JobIntentService内部通过AsyncTask来执行工作,有线程池缓存*
*IntentService直接通过创建HandlerThread的子线程looper来完成*

####我的测试Demo
https://github.com/Sum-sdl/AndriodDevelopLibrary/blob/master/sample/src/main/java/com/sum/andrioddeveloplibrary/testActivity/ServiceTestActivity.kt