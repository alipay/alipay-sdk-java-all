package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * mpcpromo商品数据
 *
 * @author auto create
 * @since 1.0, 2024-02-28 14:02:06
 */
public class MpcpromoGoodsList extends AlipayObject {

	private static final long serialVersionUID = 2358288657753347858L;

	/**
	 * 商品可用的城市列表
	 */
	@ApiListField("available_city_list")
	@ApiField("string")
	private List<String> availableCityList;

	/**
	 * 商品品牌名称
	 */
	@ApiField("brand")
	private String brand;

	/**
	 * 必填，若使用个性化小程序插件，则需要提供商品详情链接地址（跳转使用）
	 */
	@ApiField("buy_url")
	private String buyUrl;

	/**
	 * 商品不同级类目之间用$##$分隔，且自左向右类目层级逐渐细化。类目值推荐全部传名称，举例如“家电$##$电视$##$OLED电视”。某一段为空时直接传空字符串，如第二段为空， 则传“家电$##$$##$OLED电视”。
	 */
	@ApiField("cate")
	private String cate;

	/**
	 * 商品类目层级数。cate_cnt必须等于len(cate.split('$##$'))，用于校验cate数据。所有商品的分类体系应该一致，即对于所有商品来说，cate_cnt应该相同
	 */
	@ApiField("cate_cnt")
	private String cateCnt;

	/**
	 * 商品累计评论次数 ；正整数
	 */
	@ApiField("comment_cnt")
	private String commentCnt;

	/**
	 * 商品描述
	 */
	@ApiField("content")
	private String content;

	/**
	 * 商品现价；必填；非负数且保留两位小数，免费商品填写0.00
	 */
	@ApiField("current_price")
	private String currentPrice;

	/**
	 * 币种默认CNY。非负数。保留两位小数。
	 */
	@ApiField("deposit_amount")
	private String depositAmount;

	/**
	 * 商品详情图片数量；正整数
	 */
	@ApiField("detail_pic_num")
	private String detailPicNum;

	/**
	 * 包邮/不包邮/满足条件包邮，三选一
	 */
	@ApiField("free_shipping")
	private String freeShipping;

	/**
	 * 租赁商品的新旧描述
	 */
	@ApiField("fresh_degree")
	private String freshDegree;

	/**
	 * 商品归属的宿主小程序appid
	 */
	@ApiField("host_app_id")
	private String hostAppId;

	/**
	 * 物品的唯一id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 商品的素材图片列表
	 */
	@ApiListField("material_list")
	@ApiField("string")
	private List<String> materialList;

	/**
	 * 商品下单页链接
	 */
	@ApiField("order_url")
	private String orderUrl;

	/**
	 * 商品原价；非负数且保留两位小数
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
	 * 价格单位
	 */
	@ApiField("price_unit")
	private String priceUnit;

	/**
	 * 商品的logo图片列表，可用于公域推广对用户展示的图片，建议600*600；若使用个性化推荐，则必填
	 */
	@ApiListField("promo_pic_url_list")
	@ApiField("string")
	private List<String> promoPicUrlList;

	/**
	 * 商品上架时间，精确到秒
	 */
	@ApiField("pub_time")
	private Date pubTime;

	/**
	 * 商品评分；满分5分
	 */
	@ApiField("rating")
	private String rating;

	/**
	 * 商品最小租赁天数
	 */
	@ApiField("rental_date")
	private String rentalDate;

	/**
	 * 商品是否支持租满即送：是/否
	 */
	@ApiField("rental_free")
	private String rentalFree;

	/**
	 * 商品积累销量
	 */
	@ApiField("sale_number")
	private String saleNumber;

	/**
	 * 商品是否支持自提 。1：支持 2：不支持 3：满足条件支持
	 */
	@ApiField("self_pickup")
	private String selfPickup;

	/**
	 * 商品累计分享次数 ；非负整数
	 */
	@ApiField("share_cnt")
	private String shareCnt;

	/**
	 * 发货率，值范围0.00-1.00，最多保留2位小数；
	 */
	@ApiField("shipment_rate")
	private String shipmentRate;

	/**
	 * 商品支持的发货城市列表
	 */
	@ApiListField("shipments")
	@ApiField("string")
	private List<String> shipments;

	/**
	 * 运费
	 */
	@ApiField("shipping_money")
	private String shippingMoney;

	/**
	 * 商品所在店铺对应的店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 商品来源类型，如自营/第三方(如有)
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 商品spu维度的id
	 */
	@ApiField("spu_id")
	private String spuId;

	/**
	 * 推荐状态 : 可推荐: 1，不可推荐: 0
	 */
	@ApiField("status")
	private String status;

	/**
	 * 库存数量为0的商品不会出现在搜索结果里面
	 */
	@ApiField("stock_num")
	private String stockNum;

	/**
	 * 店铺评分；非负数，保留两位小数，值范围0.00-5.00分
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

	public String getBuyUrl() {
		return this.buyUrl;
	}
	public void setBuyUrl(String buyUrl) {
		this.buyUrl = buyUrl;
	}

	public String getCate() {
		return this.cate;
	}
	public void setCate(String cate) {
		this.cate = cate;
	}

	public String getCateCnt() {
		return this.cateCnt;
	}
	public void setCateCnt(String cateCnt) {
		this.cateCnt = cateCnt;
	}

	public String getCommentCnt() {
		return this.commentCnt;
	}
	public void setCommentCnt(String commentCnt) {
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

	public String getDetailPicNum() {
		return this.detailPicNum;
	}
	public void setDetailPicNum(String detailPicNum) {
		this.detailPicNum = detailPicNum;
	}

	public String getFreeShipping() {
		return this.freeShipping;
	}
	public void setFreeShipping(String freeShipping) {
		this.freeShipping = freeShipping;
	}

	public String getFreshDegree() {
		return this.freshDegree;
	}
	public void setFreshDegree(String freshDegree) {
		this.freshDegree = freshDegree;
	}

	public String getHostAppId() {
		return this.hostAppId;
	}
	public void setHostAppId(String hostAppId) {
		this.hostAppId = hostAppId;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public List<String> getMaterialList() {
		return this.materialList;
	}
	public void setMaterialList(List<String> materialList) {
		this.materialList = materialList;
	}

	public String getOrderUrl() {
		return this.orderUrl;
	}
	public void setOrderUrl(String orderUrl) {
		this.orderUrl = orderUrl;
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

	public String getPriceUnit() {
		return this.priceUnit;
	}
	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
	}

	public List<String> getPromoPicUrlList() {
		return this.promoPicUrlList;
	}
	public void setPromoPicUrlList(List<String> promoPicUrlList) {
		this.promoPicUrlList = promoPicUrlList;
	}

	public Date getPubTime() {
		return this.pubTime;
	}
	public void setPubTime(Date pubTime) {
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

	public String getSaleNumber() {
		return this.saleNumber;
	}
	public void setSaleNumber(String saleNumber) {
		this.saleNumber = saleNumber;
	}

	public String getSelfPickup() {
		return this.selfPickup;
	}
	public void setSelfPickup(String selfPickup) {
		this.selfPickup = selfPickup;
	}

	public String getShareCnt() {
		return this.shareCnt;
	}
	public void setShareCnt(String shareCnt) {
		this.shareCnt = shareCnt;
	}

	public String getShipmentRate() {
		return this.shipmentRate;
	}
	public void setShipmentRate(String shipmentRate) {
		this.shipmentRate = shipmentRate;
	}

	public List<String> getShipments() {
		return this.shipments;
	}
	public void setShipments(List<String> shipments) {
		this.shipments = shipments;
	}

	public String getShippingMoney() {
		return this.shippingMoney;
	}
	public void setShippingMoney(String shippingMoney) {
		this.shippingMoney = shippingMoney;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(String stockNum) {
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
