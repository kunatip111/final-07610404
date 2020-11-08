package com.example.speedrecords;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "users")
public class data {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "result")
    public String result;

    @ColumnInfo(name = "distance")
    public String distance;

    @ColumnInfo(name = "time")
    public String time;

    public Boolean isMore;

    public data(int id , Boolean isMore, String dis , String tim , String re) {
        this.result = re;
        this.distance = dis;
        this.time = tim;
        this.isMore = isMore;
    }

}
