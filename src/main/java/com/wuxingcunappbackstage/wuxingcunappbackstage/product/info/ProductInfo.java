package com.wuxingcunappbackstage.wuxingcunappbackstage.product.info;

import com.wuxingcunappbackstage.wuxingcunappbackstage.product.info.commentList.CommentList;
import com.wuxingcunappbackstage.wuxingcunappbackstage.product.info.pricebox.PriceBox;
import com.wuxingcunappbackstage.wuxingcunappbackstage.product.info.sales.SalesInfo;
import com.wuxingcunappbackstage.wuxingcunappbackstage.product.info.type.BuyType;

public class ProductInfo {
    private String[] imgSrc;
    private String title;
    private CommentList commentList;
    private PriceBox priceBox;
    private SalesInfo salesInfo;
    private BuyType buyType;

    public ProductInfo() {
        imgSrc = new String[3];
        imgSrc[0] = "sada";
        imgSrc[1] = "asdasdsj";
        title = "biaoti";
        commentList = new CommentList();
        priceBox = new PriceBox();
        salesInfo = new SalesInfo();
        buyType = new BuyType();
    }

    public void setImgSrc(String[] imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getImgSrc() {
        return imgSrc;
    }

    public void setBuyType(BuyType buyType) {
        this.buyType = buyType;
    }

    public BuyType getBuyType() {
        return buyType;
    }

    public void setCommentList(CommentList commentList) {
        this.commentList = commentList;
    }

    public void setPriceBox(PriceBox priceBox) {
        this.priceBox = priceBox;
    }

    public void setSalesInfo(SalesInfo salesInfo) {
        this.salesInfo = salesInfo;
    }

    public CommentList getCommentList() {
        return commentList;
    }

    public PriceBox getPriceBox() {
        return priceBox;
    }

    public SalesInfo getSalesInfo() {
        return salesInfo;
    }
}
