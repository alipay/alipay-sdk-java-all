package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品元素
 *
 * @author auto create
 * @since 1.0, 2023-09-25 14:24:15
 */
public class GoodItem extends AlipayObject {

	private static final long serialVersionUID = 5753764924394753255L;

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
	 * 非负数。保留两位小数。币种默认CNY。单位：元
	 */
	@ApiField("deposit_amount")
	private String depositAmount;

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
	 * 折扣率
0.75（75折）
	 */
	@ApiField("discount_rate")
	private String discountRate;

	/**
	 * 商品是否包邮，如 1：包邮 2：不包邮 3：满足条件包邮
	 */
	@ApiField("free_shipping_val")
	private String freeShippingVal;

	/**
	 * 租赁商品的新日描述
	 */
	@ApiField("fresh_degree")
	private String freshDegree;

	/**
	 * 用户在小程序前端感知的类目值
	 */
	@ApiField("front_end_category")
	private String frontEndCategory;

	/**
	 * 物品的唯一id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 行业类型  
LEASE（租赁）
	 */
	@ApiField("industry_type")
	private String industryType;

	/**
	 * 租赁信息
	 */
	@ApiField("lease_industry_info")
	private LeaseIndustryBean leaseIndustryInfo;

	/**
	 * 商品归属的小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 时间戳（毫秒）
	 */
	@ApiField("operate_time")
	private String operateTime;

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
	 * 商品最小租赁天数
	 */
	@ApiField("rental_date")
	private String rentalDate;

	/**
	 * 商品是否支持租满即送
	 */
	@ApiField("rental_free")
	private String rentalFree;

	/**
	 * 物品类型
	 */
	@ApiField("row_type")
	private String rowType;

	/**
	 * 商品支持自提：1：支持 2：不支持 3：满足条件支持
	 */
	@ApiField("self_pickup")
	private String selfPickup;

	/**
	 * 商品累计分享次数
	 */
	@ApiField("share_cnt")
	private Long shareCnt;

	/**
	 * 百分比，值范国0.00%-100.00%，保留两位小数
	 */
	@ApiField("shipment_rate")
	private String shipmentRate;

	/**
	 * 商品支持的发货城市列表
	 */
	@ApiField("shipments")
	private String shipments;

	/**
	 * 商品运费，单位分
	 */
	@ApiField("shipping_price")
	private String shippingPrice;

	/**
	 * 商品所属店铺id（如有）
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 商品所在店铺对应的店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

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
	 * 非负数，保留两位小数，值范国0.00-5.00分
	 */
	@ApiField("store_rating")
	private String storeRating;

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

	public String getDepositAmount() {
		return this.depositAmount;
	}
	public void setDepositAmount(String depositAmount) {
		this.depositAmount = depositAmount;
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

	public String getDiscountRate() {
		return this.discountRate;
	}
	public void setDiscountRate(String discountRate) {
		this.discountRate = discountRate;
	}

	public String getFreeShippingVal() {
		return this.freeShippingVal;
	}
	public void setFreeShippingVal(String freeShippingVal) {
		this.freeShippingVal = freeShippingVal;
	}

	public String getFreshDegree() {
		return this.freshDegree;
	}
	public void setFreshDegree(String freshDegree) {
		this.freshDegree = freshDegree;
	}

	public String getFrontEndCategory() {
		return this.frontEndCategory;
	}
	public void setFrontEndCategory(String frontEndCategory) {
		this.frontEndCategory = frontEndCategory;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getIndustryType() {
		return this.industryType;
	}
	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}

	public LeaseIndustryBean getLeaseIndustryInfo() {
		return this.leaseIndustryInfo;
	}
	public void setLeaseIndustryInfo(LeaseIndustryBean leaseIndustryInfo) {
		this.leaseIndustryInfo = leaseIndustryInfo;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getOperateTime() {
		return this.operateTime;
	}
	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
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

	public String getRentalDate() {
		return this.rentalDate;
	}
	public void setRentalDate(String rentalDate) {
		this.rentalDate = rentalDate;
	}

	public String getRentalFree() {
		return this.rentalFree;
	}
	public void setRentalFree(String rentalFree) {
		this.rentalFree = rentalFree;
	}

	public String getRowType() {
		return this.rowType;
	}
	public void setRowType(String rowType) {
		this.rowType = rowType;
	}

	public String getSelfPickup() {
		return this.selfPickup;
	}
	public void setSelfPickup(String selfPickup) {
		this.selfPickup = selfPickup;
	}

	public Long getShareCnt() {
		return this.shareCnt;
	}
	public void setShareCnt(Long shareCnt) {
		this.shareCnt = shareCnt;
	}

	public String getShipmentRate() {
		return this.shipmentRate;
	}
	public void setShipmentRate(String shipmentRate) {
		this.shipmentRate = shipmentRate;
	}

	public String getShipments() {
		return this.shipments;
	}
	public void setShipments(String shipments) {
		this.shipments = shipments;
	}

	public String getShippingPrice() {
		return this.shippingPrice;
	}
	public void setShippingPrice(String shippingPrice) {
		this.shippingPrice = shippingPrice;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
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

	public String getStoreRating() {
		return this.storeRating;
	}
	public void setStoreRating(String storeRating) {
		this.storeRating = storeRating;
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
