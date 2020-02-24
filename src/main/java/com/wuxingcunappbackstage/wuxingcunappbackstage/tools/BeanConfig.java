package com.wuxingcunappbackstage.wuxingcunappbackstage.tools;

import com.wuxingcunappbackstage.wuxingcunappbackstage.index.carouselList.Carousel;
import com.wuxingcunappbackstage.wuxingcunappbackstage.index.carouselList.CarouselList;
import com.wuxingcunappbackstage.wuxingcunappbackstage.product.info.ProductInfo;
import com.wuxingcunappbackstage.wuxingcunappbackstage.scenicarea.ScenicAreaInfo.ScenicAreaInfo;
import com.wuxingcunappbackstage.wuxingcunappbackstage.scenicarea.ScenicAreaInfo.SwiperList;
import com.wuxingcunappbackstage.wuxingcunappbackstage.scenicarea.comment.Comment;
import com.wuxingcunappbackstage.wuxingcunappbackstage.scenicarea.comment.CommentList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration //Java配置的配置类
public class BeanConfig {
    @Bean("getCarouselList")
    public CarouselList carouselList() {
        Carousel[] carousels = new Carousel[3]; //首页应该是固定三张图吧。。
        for(int i = 0; i < 3; ++i) {
            carousels[i] = carousel(); //这里考虑到可以自定义Bean的生命周期
        }
        return new CarouselList(carousels);
    }
    @Scope("prototype") //使用scope注解获得多例对象，即每次调用该方法时，都new出不同的对象 具体百度Spring bean 单例 多例模式
    @Bean("getCarousel")
    public Carousel carousel() {
        return new Carousel();
    }

  /*  @Scope("prototype")
    @Bean
    public Comment comment() {
        return new Comment();
    }

    @Bean("getProductCommentList")
    public CommentList commentList(Comment[] comments) {
        return new CommentList(comments);
    }*/

    @Scope("prototype")
    @Bean("getScenicareaComment")
    public Comment comment() {
        return new Comment();
    }

    @Scope("prototype")
    @Bean("getScenicareaCommentList")
    public CommentList commentList() {
        return new CommentList();
    }

    @Scope("prototype") //不同的链接点进去应该是不同地方的图片，所以启用多例模式
    @Bean("getScenicAreaInfo")
    public ScenicAreaInfo scenicAreaInfo() {
        return new ScenicAreaInfo();
    }

    @Scope("prototype")
    @Bean("getProductInfo")
    public ProductInfo productInfo() {
        return new ProductInfo();
    }
}
