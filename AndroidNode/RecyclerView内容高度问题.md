### RecyclerView内容高度计算问题

#### 场景说明
 有些场景下，需要将RecyclerView当作GridLayout使用，LinearLayout使用
 这个时候就会想到内容一次性加载的问题和高度展示问题。
 
 **内容超出一个屏幕很多时**，
 不要使用该方法来加载内容，超出屏幕部分的View计算绘制只是无用功，损耗性能，影响用户体验。
 
 有其他方案可以更好的实现相关功能(RecyclerView的viewType灵活使用来代替一次性加载问题)
 
#### 使用说明

 - RecyclerView的内容高度设置warp_content时，父容器是NestedScrollView和RecyclerView这两个情况下，自身的高度会自动计算来适应内容高度，无需手动计算item高度来设置高度。
 
 - ListView嵌套时，就需要手动item高度来设置自身高度，适应全部的内容高度
 
 - 以上场景是ScrollView中嵌套ListView，超出一个屏幕的情况下，需要设置自身高度适应内容。（**很不推荐该方法**）