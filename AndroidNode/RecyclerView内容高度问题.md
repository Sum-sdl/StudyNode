### RecyclerView内容高度计算问题

##### 场景说明
 有些场景下，需要将RecyclerView当作GridLayout使用，LinearLayout使用
 这个时候就会想到内容一次性加载的问题和高度展示问题。
 
 **内容超出一个屏幕很多时**
 不要使用该方法来加载内容，超出部分绘制只是无用功，损耗性能，影响用户体验。
 
 有其他方案可以更好的实现相关功能(RecyclerView的viewType灵活使用)
 
#### 使用说明
- RecyclerView的内容高度设置warp_content时，父容器是NestedScrollView和RecyclerView这两个情况下，自身的高度会自动计算来适应内容高度，无需手动计算。

- ListView嵌套时，就需要手动设置自身高度来适应内容高度