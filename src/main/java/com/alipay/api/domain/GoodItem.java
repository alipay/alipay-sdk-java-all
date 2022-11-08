package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品元素
 *
 * @author auto create
 * @since 1.0, 2022-10-31 14:18:13
 */
public class GoodItem extends AlipayObject {

	private static final long serialVersionUID = 7697987836426233661L;

	/**
	 * 商品可用的城市列表
	 */
	@ApiListField("available_city_list")
	@ApiField("string")
	private List<String> availableCityList;

	/**
	 * 商品品牌
	 */
	@ApiField("brand")
	private String brand;

	/**
	 * 商品不同级类目之间用$##$分隔，且自左向右类目层级逐渐细化。类目值搜索全部传名称，举例如“家电$##$电视$##$OLED电视”。某一段为空时直接传空字符串，如第二段为空， 则传“家电$##$$##$OLED电视”。如果有多个类目，多个类目之间用,分割。
	 */
	@ApiField("cate")
	private String cate;

	/**
	 * 商品类目层级数。cate_cnt必须等于len(cate.split('$##$'))，用于校验cate数据。所有商品的分类体系应该一致，即对于所有商品来说，cate_cnt应该相同
	 */
	@ApiField("cate_cnt")
	private Long cateCnt;

	/**
	 * 商品累计评论次数
	 */
	@ApiField("comment_cnt")
	private Long commentCnt;

	/**
	 * 商品描述
	 */
	@ApiField("content")
	private String content;

	/**
	 * 商品现价
	 */
	@ApiField("current_price")
	private String currentPrice;

	/**
	 * 商品图片数量
	 */
	@ApiField("detail_pic_num")
	private Long detailPicNum;

	/**
	 * 支付宝小程序的商品详情页面
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 物品的唯一id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 商品归属的小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 商品原价/划线价
	 */
	@ApiField("origin_price")
	private String originPrice;

	/**
	 * 商品详情的图片列表
	 */
	@ApiListField("pic_url_list")
	@ApiField("string")
	private List<String> picUrlList;

	/**
	 * 商品的logo图片列表，可用于用户展示的图片，建议600*600
	 */
	@ApiListField("promo_pic_url_list")
	@ApiField("string")
	private List<String> promoPicUrlList;

	/**
	 * 商品上架时间戳，精确到秒，如1520327038
	 */
	@ApiField("pub_time")
	private Long pubTime;

	/**
	 * 商品评分
	 */
	@ApiField("rating")
	private String rating;

	/**
	 * 物品类型
	 */
	@ApiField("row_type")
	private String rowType;

	/**
	 * 商品所属店铺id（如有）
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * spu维度的id
	 */
	@ApiField("spu_id")
	private String spuId;

	/**
	 * 状态，1为有效、0为无效
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 库存数量，库存数量为0的商品不会出现在搜索结果里面
	 */
	@ApiField("stock_num")
	private Long stockNum;

	/**
	 * 商品标签，如首页展示标签“特惠”，“热卖”,或详情页“满50包邮”,“假一赔三”等。多值示例：“特惠,热卖"
	 */
	@ApiField("tags")
	private String tags;

	/**
	 * 商品标题
	 */
	@ApiField("title")
	private String title;

	public List<String> getAvailableCityList() {
		return this.availableCityList;
	}
	public void setAvailableCityList(List<String> availableCityList) {
		this.availableCityList = availableCityList;
	}

	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCate() {
		return this.cate;
	}
	public void setCate(String cate) {
		this.cate = cate;
	}

	public Long getCateCnt() {
		return this.cateCnt;
	}
	public void setCateCnt(Long cateCnt) {
		this.cateCnt = cateCnt;
	}

	public Long getCommentCnt() {
		return this.commentCnt;
	}
	public void setCommentCnt(Long commentCnt) {
		this.commentCnt = commentCnt;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getCurrentPrice() {
		return this.currentPrice;
	}
	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}

	public Long getDetailPicNum() {
		return this.detailPicNum;
	}
	public void setDetailPicNum(Long detailPicNum) {
		this.detailPicNum = detailPicNum;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getOriginPrice() {
		return this.originPrice;
	}
	public void setOriginPrice(String originPrice) {
		this.originPrice = originPrice;
	}

	public List<String> getPicUrlList() {
		return this.picUrlList;
	}
	public void setPicUrlList(List<String> picUrlList) {
		this.picUrlList = picUrlList;
	}

	public List<String> getPromoPicUrlList() {
		return this.promoPicUrlList;
	}
	public void setPromoPicUrlList(List<String> promoPicUrlList) {
		this.promoPicUrlList = promoPicUrlList;
	}

	public Long getPubTime() {
		return this.pubTime;
	}
	public void setPubTime(Long pubTime) {
		this.pubTime = pubTime;
	}

	public String getRating() {
		return this.rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getRowType() {
		return this.rowType;
	}
	public void setRowType(String rowType) {
		this.rowType = rowType;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSpuId() {
		return this.spuId;
	}
	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

	public String getTags() {
		return this.tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
