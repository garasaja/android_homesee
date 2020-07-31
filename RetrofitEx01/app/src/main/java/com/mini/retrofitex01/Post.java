package com.mini.retrofitex01;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post {
    private int userId;
    private int id;
    private String title;
   // @SerializedName("body") // text값을 숨기고 싶을때 body로 대체함 , 일종의 닉네임?
    private String createDate;

}
