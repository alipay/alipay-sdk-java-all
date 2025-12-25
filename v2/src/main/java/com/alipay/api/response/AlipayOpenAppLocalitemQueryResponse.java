package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AppItemAttrVO;
import com.alipay.api.domain.PhoneStructVO;
import com.alipay.api.domain.GuideInfoVO;
import com.alipay.api.domain.ItemEnrollFreezeContent;
import com.alipay.api.domain.ItemRiskInfo;
import com.alipay.api.domain.ItemSceneRiskInfo;
import com.alipay.api.domain.LocalItemSkuQueryVO;
import com.alipay.api.domain.TimeRangeStructVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.localitem.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-22 17:42:41
 */
public class AlipayOpenAppLocalitemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5755111662638432349L;

	/** 
	 * 商品属性
	 */
	@ApiListField("attrs")
	@ApiField("app_item_attr_v_o")
	private List<AppItemAttrVO> attrs;

	/** 
	 * 类目ID
	 */
	@ApiField("category_id")
	private String categoryId;

	/** 
	 * 商品创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * 客服电话，包含区号+电话号码的座机号码格式，以及手机号码格式
	 */
	@ApiField("customer_service_mobile")
	private PhoneStructVO customerServiceMobile;

	/** 
	 * 导购信息
	 */
	@ApiListField("guide_info")
	@ApiField("guide_info_v_o")
	private List<GuideInfoVO> guideInfo;

	/** 
	 * 商品主图，图片宽高为750px*750px，宽高比1:1，800kb以内。支持jpg、jpeg、png格式的图片。
	 */
	@ApiField("head_img")
	private String headImg;

	/** 
	 * 商品子图，作为平台详情页组件的轮播图，图片宽高为750px*750px，宽高比1:1，800kb以内，不超过 3 个图片。支持jpg、jpeg、png格式的图片。
	 */
	@ApiListField("image_list")
	@ApiField("string")
	private List<String> imageList;

	/** 
	 * 商品是否在线版本，true在线，false最新版本
	 */
	@ApiField("is_online")
	private Boolean isOnline;

	/** 
	 * 1=官方插件版，商品详情页链接不传入
0=自定义详情页版，商品详情页链接必须传入
	 */
	@ApiField("item_details_page_model")
	private String itemDetailsPageModel;

	/** 
	 * 报名活动状态及文案
	 */
	@ApiField("item_enroll_freeze_content")
	private ItemEnrollFreezeContent itemEnrollFreezeContent;

	/** 
	 * 支付宝平台侧商品ID，是支付宝平台侧商品的唯一标识，后续与平台交互，需要使用该 ID，建议持久化。
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 商品类型
	 */
	@ApiField("item_type")
	private String itemType;

	/** 
	 * 商家名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/** 
	 * 商家侧商品ID，要求 APPID 下全局唯一。
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/** 
	 * 商品详情页链接
	 */
	@ApiField("path")
	private String path;

	/** 
	 * 商品有冻结、驳回时，展示对应的具体问题
	 */
	@ApiListField("risk_info")
	@ApiField("item_risk_info")
	private List<ItemRiskInfo> riskInfo;

	/** 
	 * 商品在对应场景屏蔽，展示对应的具体问题
	 */
	@ApiListField("scene_risk_info")
	@ApiField("item_scene_risk_info")
	private List<ItemSceneRiskInfo> sceneRiskInfo;

	/** 
	 * sku数组
	 */
	@ApiListField("skus")
	@ApiField("local_item_sku_query_v_o")
	private List<LocalItemSkuQueryVO> skus;

	/** 
	 * start_time描述售卖开始时间，end_time描述售卖结束时间，时间格式均为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("sold_time")
	private TimeRangeStructVO soldTime;

	/** 
	 * 标品ID
	 */
	@ApiField("spu_id")
	private String spuId;

	/** 
	 * 审核驳回：商品审核失败时，商品状态为审核驳回。 审核中：商品处于审核流程中时，商品状态为审核中。 已下架：商家可以通过调用接口下架商品，也可以通过商家后台下架商品。 可售卖：商家可以通过调用接口上架商品，也可以通过商家后台上架商品。 冻结：当商家出现违规操作时，支付宝侧将发起冻结，商品无法对外透出。 当商品包含多个规格时，只要有一个规格的商品状态为“可售卖”，商品状态则为“可售卖”。
	 */
	@ApiField("spu_status")
	private String spuStatus;

	/** 
	 * 库存
	 */
	@ApiField("stock_num")
	private String stockNum;

	/** 
	 * 商品名称，字符类型，最少不低于3，最长不超过60个字。注：1.商品标题只允许汉字、数字、英文字母、特殊字符集；2.商品标题不得仅为数字、字母、特殊字符集或上述三种的组合。
	 */
	@ApiField("title")
	private String title;

	/** 
	 * 商品最新更新时间
	 */
	@ApiField("update_time")
	private Date updateTime;

	public void setAttrs(List<AppItemAttrVO> attrs) {
		this.attrs = attrs;
	}
	public List<AppItemAttrVO> getAttrs( ) {
		return this.attrs;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryId( ) {
		return this.categoryId;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime( ) {
		return this.createTime;
	}

	public void setCustomerServiceMobile(PhoneStructVO customerServiceMobile) {
		this.customerServiceMobile = customerServiceMobile;
	}
	public PhoneStructVO getCustomerServiceMobile( ) {
		return this.customerServiceMobile;
	}

	public void setGuideInfo(List<GuideInfoVO> guideInfo) {
		this.guideInfo = guideInfo;
	}
	public List<GuideInfoVO> getGuideInfo( ) {
		return this.guideInfo;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}
	public String getHeadImg( ) {
		return this.headImg;
	}

	public void setImageList(List<String> imageList) {
		this.imageList = imageList;
	}
	public List<String> getImageList( ) {
		return this.imageList;
	}

	public void setIsOnline(Boolean isOnline) {
		this.isOnline = isOnline;
	}
	public Boolean getIsOnline( ) {
		return this.isOnline;
	}

	public void setItemDetailsPageModel(String itemDetailsPageModel) {
		this.itemDetailsPageModel = itemDetailsPageModel;
	}
	public String getItemDetailsPageModel( ) {
		return this.itemDetailsPageModel;
	}

	public void setItemEnrollFreezeContent(ItemEnrollFreezeContent itemEnrollFreezeContent) {
		this.itemEnrollFreezeContent = itemEnrollFreezeContent;
	}
	public ItemEnrollFreezeContent getItemEnrollFreezeContent( ) {
		return this.itemEnrollFreezeContent;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getItemType( ) {
		return this.itemType;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantName( ) {
		return this.merchantName;
	}

	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}
	public String getOutItemId( ) {
		return this.outItemId;
	}

	public void setPath(String path) {
		this.path = path;
	}
	public String getPath( ) {
		return this.path;
	}

	public void setRiskInfo(List<ItemRiskInfo> riskInfo) {
		this.riskInfo = riskInfo;
	}
	public List<ItemRiskInfo> getRiskInfo( ) {
		return this.riskInfo;
	}

	public void setSceneRiskInfo(List<ItemSceneRiskInfo> sceneRiskInfo) {
		this.sceneRiskInfo = sceneRiskInfo;
	}
	public List<ItemSceneRiskInfo> getSceneRiskInfo( ) {
		return this.sceneRiskInfo;
	}

	public void setSkus(List<LocalItemSkuQueryVO> skus) {
		this.skus = skus;
	}
	public List<LocalItemSkuQueryVO> getSkus( ) {
		return this.skus;
	}

	public void setSoldTime(TimeRangeStructVO soldTime) {
		this.soldTime = soldTime;
	}
	public TimeRangeStructVO getSoldTime( ) {
		return this.soldTime;
	}

	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}
	public String getSpuId( ) {
		return this.spuId;
	}

	public void setSpuStatus(String spuStatus) {
		this.spuStatus = spuStatus;
	}
	public String getSpuStatus( ) {
		return this.spuStatus;
	}

	public void setStockNum(String stockNum) {
		this.stockNum = stockNum;
	}
	public String getStockNum( ) {
		return this.stockNum;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle( ) {
		return this.title;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Date getUpdateTime( ) {
		return this.updateTime;
	}

}
