package com.example.myapplication.rating;

public class rating {

    /*rating style*/
//    style="?android:attr/ratingBarStyleIndicator" //중간사이즈별
//    style="?android:attr/ratingBarStyleSmall" //작은별
//    style="?android:attr/ratingBarStyle" // 기본적용 별
//    android:isIndicator="true" //  true : 수정불가능상태입니다.  false : 사용자(유저) 입장에서 별을 늘리고 줄일수있습니다.
//    android:numStars="5" // 별의최대갯수는 5개로 설정한것입니다.
//    android:rating="5" // 기본값? 처음별이 채워지는갯수입니다.
//    android:stepSize="1" // 1로설정할시 1개 2개 3개 4개 5개 로만 표현되고, 0.5로 설정할시 반개도 설정가능합니다.

    /*rating style*/
//    <style name="starRatingBar" parent="@android:style/Widget.RatingBar">
//        <item name="android:indeterminateOnly">false</item>
//        <item name="android:progressDrawable">@drawable/custom_ratingbar_full</item>
//        <item name="android:minHeight">27dp</item>
//        <item name="android:maxHeight">27dp</item>
//        <item name="android:thumb">@null</item>
//    </style>

/*    ratingBar1.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> {
        if (fromUser && rating >= 1.0) {
            ratingBarText1.setText(String.valueOf(rating));
            chefScore1 = rating;
        }
    });*/

//progressDrawable
/*<layer-list xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:id="@android:id/background"
    android:drawable="@drawable/custom_ratingbar_full_empty" />

    <item android:id="@android:id/secondaryProgress"
    android:drawable="@drawable/custom_ratingbar_full_empty" />

    <item android:id="@android:id/progress"
    android:drawable="@drawable/custom_ratingbar_full_filled" />
</layer-list>*/

// empty star && full_filled star
/*    <item android:state_pressed="true"
    android:state_window_focused="true"
    android:drawable="@drawable/rating_empty" />

    <item android:state_focused="true"
    android:state_window_focused="true"
    android:drawable="@drawable/rating_empty" />

    <item android:state_selected="true"
    android:state_window_focused="true"
    android:drawable="@drawable/rating_empty" />

    <item android:drawable="@drawable/rating_empty" />*/


}
