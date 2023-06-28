package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.retail.dm.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 23:56:33
 */
public class KoubeiMarketingCampaignRetailDmQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7818726489893369863L;

	/** 
	 * 第三方详情页链接：该商品/活动的详细介绍，注意：该字段需要过风控校验，不得传入敏感链接
	 */
	@ApiField("action_url")
	private String actionUrl;

	/** 
	 * 促销结束时间，用于产品详情展示，格式为：2017-02-07 11:11:11。
	 */
	@ApiField("activity_end_time")
	private String activityEndTime;

	/** 
	 * 促销开始时间，在产品详情中展示，格式为：2017-02-01 11:11:11。
	 */
	@ApiField("activity_start_time")
	private String activityStartTime;

	/** 
	 * 简要的促销说明，用于对促销的内容进行直接明了的说明（如会员价：10元）。
	 */
	@ApiField("brief")
	private String brief;

	/** 
	 * 活动的结束时间(下架时间)
	 */
	@ApiField("campaign_end_time")
	private Date campaignEndTime;

	/** 
	 * 活动类型：该活动是属于单品优惠，还是全场活动，单品优惠 SINGLE,全场优惠UNIVERSAL
	 */
	@ApiField("campaign_type")
	private String campaignType;

	/** 
	 * 优惠类型，全场优惠传入枚举值
比如：DISCOUNT(折扣),OFF(立减),CARD(集点),VOUCHER(代金),REDEMPTION(换购),EXCHANGE(兑换),GIFT(买赠),OTHERS(其他)
	 */
	@ApiField("coupon_type")
	private String couponType;

	/** 
	 * 活动文案，主要涉及（活动时间、参与方式、活动力度），最多不得超过1024个字
	 */
	@ApiField("description")
	private String description;

	/** 
	 * 扩展备用信息，一些其他信息存入该字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 图片url，该图片id只有一个，由Isv传入，（通过alipay.offline.material.image.upload 接口上传视频/图片获取的资源id
	 */
	@ApiField("image_id")
	private String imageId;

	/** 
	 * 品牌：该商品属于哪个牌子/该活动属于哪个商家（比如 海飞丝，统一，徐福记，立白......）
	 */
	@ApiField("item_brand")
	private String itemBrand;

	/** 
	 * 该商品/活动所属类别（吃的:食品      面膜:个人洗护    拖把:家庭清洁）
	 */
	@ApiField("item_category")
	private String itemCategory;

	/** 
	 * 商品编码，SKU或店内码
	 */
	@ApiField("item_code")
	private String itemCode;

	/** 
	 * 商品名称，单品优惠时传入商品名称；全场活动时传入活动名称，注意：该字段需要过风控校验，不得传入敏感词
	 */
	@ApiField("item_name")
	private String itemName;

	/** 
	 * 该商品/活动，是否是会员专享的，TRUE表示会员专享，会显示会员标识，FALSE表示非会员专享
	 */
	@ApiField("member_only")
	private String memberOnly;

	/** 
	 * 适用外部门店id，传入该优惠适用口碑门店id，可以传入多个值，列表类型
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/** 
	 * 店铺DM活动的状态信息（INIT:初始状态，ONLINE：上架状态，OFFLINE：下架状态）
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 4:3缩略图url，用于产品在店铺页简单规范的展示。
	 */
	@ApiField("thumbnail_image_id")
	private String thumbnailImageId;

	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}
	public String getActionUrl( ) {
		return this.actionUrl;
	}

	public void setActivityEndTime(String activityEndTime) {
		this.activityEndTime = activityEndTime;
	}
	public String getActivityEndTime( ) {
		return this.activityEndTime;
	}

	public void setActivityStartTime(String activityStartTime) {
		this.activityStartTime = activityStartTime;
	}
	public String getActivityStartTime( ) {
		return this.activityStartTime;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getBrief( ) {
		return this.brief;
	}

	public void setCampaignEndTime(Date campaignEndTime) {
		this.campaignEndTime = campaignEndTime;
	}
	public Date getCampaignEndTime( ) {
		return this.campaignEndTime;
	}

	public void setCampaignType(String campaignType) {
		this.campaignType = campaignType;
	}
	public String getCampaignType( ) {
		return this.campaignType;
	}

	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}
	public String getCouponType( ) {
		return this.couponType;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription( ) {
		return this.description;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public String getImageId( ) {
		return this.imageId;
	}

	public void setItemBrand(String itemBrand) {
		this.itemBrand = itemBrand;
	}
	public String getItemBrand( ) {
		return this.itemBrand;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}
	public String getItemCategory( ) {
		return this.itemCategory;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemCode( ) {
		return this.itemCode;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemName( ) {
		return this.itemName;
	}

	public void setMemberOnly(String memberOnly) {
		this.memberOnly = memberOnly;
	}
	public String getMemberOnly( ) {
		return this.memberOnly;
	}

	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}
	public List<String> getShopIds( ) {
		return this.shopIds;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setThumbnailImageId(String thumbnailImageId) {
		this.thumbnailImageId = thumbnailImageId;
	}
	public String getThumbnailImageId( ) {
		return this.thumbnailImageId;
	}

}
