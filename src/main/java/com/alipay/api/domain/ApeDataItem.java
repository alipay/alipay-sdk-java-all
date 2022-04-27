package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 数据item
 *
 * @author auto create
 * @since 1.0, 2022-03-30 15:14:22
 */
public class ApeDataItem extends AlipayObject {

	private static final long serialVersionUID = 1774166484648731611L;

	/**
	 * 商品品牌。可以传输品牌id，也可传输品牌明文。
	 */
	@ApiField("brand")
	private String brand;

	/**
	 * 商品不同级类目之间用$##$分隔，且自左向右类目层级逐渐细化。类目值推荐全部传名称，举例如“家电$##$电视$##$OLED电视”。某一段为空时直接传空字符串，如第二段为空， 则传“家电$##$$##$OLED电视”。
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
	 * 商品是否包邮，如 1：包邮 2：不包邮 3：满足条件包邮
	 */
	@ApiField("free_shipping")
	private Long freeShipping;

	/**
	 * 物品的唯一id
	 */
	@ApiField("id")
	private String id;

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
	 * 商品累计点赞次数
	 */
	@ApiField("praise_cnt")
	private Long praiseCnt;

	/**
	 * 商品上架时间戳，精确到秒，如1520327038
	 */
	@ApiField("pub_time")
	private String pubTime;

	/**
	 * 商品评分
	 */
	@ApiField("rating")
	private String rating;

	/**
	 * 商品累积销量
	 */
	@ApiField("sale_number")
	private Long saleNumber;

	/**
	 * 商品累计分享次数
	 */
	@ApiField("share_cnt")
	private Long shareCnt;

	/**
	 * 商品运费，单位分
	 */
	@ApiField("shipping_money")
	private String shippingMoney;

	/**
	 * 商品所属店铺id（如有）
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 商品来源类型，如自营/第三方(如有)
	 */
	@ApiField("source_id")
	private String sourceId;

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
	 * 商品标签，如首页展示标签“特惠”，“热卖”,或详情页“满50包邮”,“假一赔三”等。多值示例：“特惠$##$热卖"
	 */
	@ApiField("tags")
	private String tags;

	/**
	 * 商品标题
	 */
	@ApiField("title")
	private String title;

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

	public Long getFreeShipping() {
		return this.freeShipping;
	}
	public void setFreeShipping(Long freeShipping) {
		this.freeShipping = freeShipping;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
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

	public Long getPraiseCnt() {
		return this.praiseCnt;
	}
	public void setPraiseCnt(Long praiseCnt) {
		this.praiseCnt = praiseCnt;
	}

	public String getPubTime() {
		return this.pubTime;
	}
	public void setPubTime(String pubTime) {
		this.pubTime = pubTime;
	}

	public String getRating() {
		return this.rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}

	public Long getSaleNumber() {
		return this.saleNumber;
	}
	public void setSaleNumber(Long saleNumber) {
		this.saleNumber = saleNumber;
	}

	public Long getShareCnt() {
		return this.shareCnt;
	}
	public void setShareCnt(Long shareCnt) {
		this.shareCnt = shareCnt;
	}

	public String getShippingMoney() {
		return this.shippingMoney;
	}
	public void setShippingMoney(String shippingMoney) {
		this.shippingMoney = shippingMoney;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
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
