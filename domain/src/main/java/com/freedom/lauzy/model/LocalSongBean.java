package com.freedom.lauzy.model;

/**
 * Desc :  原设计仅为本地音乐Bean。添加至播放队列时，网络数据经映射转换后也采用了此对象。
 * Author : Lauzy
 * Date : 2017/8/9
 * Blog : http://www.jianshu.com/u/e76853f863a9
 * Email : freedompaladin@gmail.com
 */
public class LocalSongBean {
    public long id; //音乐ID
    public String title; //音乐名
    public long duration; //时长
    public String songLength;
    public String path; //路径
    public long albumId; //专辑ID
    public String albumName; //专辑名
    public Object albumCover;//专辑封面
    public long artistId; //歌手ID
    public String artistName; //歌手名
    public long size;//大小
    public String type;//类型
}
