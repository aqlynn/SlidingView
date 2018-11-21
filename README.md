# SlidingView
右滑退出当前界面，继承自RelativeLayout

##使用
```java
mySlidingView.setSlidingTipListener(new MySlidingView.SlidingTipListener() {
            @Override
            public void onSlidFinish() {
                finish();
            }
});
```