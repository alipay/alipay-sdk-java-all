package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AppItemAttrVO;
import com.alipay.api.domain.ItemDescInfoVO;
import com.alipay.api.domain.ItemRiskInfo;
import com.alipay.api.domain.ItemSceneRiskInfo;
import com.alipay.api.domain.ItemSkuSearchVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.item.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-18 17:36:44
 */
public class AlipayOpenAppItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5652442628356241634L;

	/** 
	 * 商品属性列表，kv形式
	 */
	@ApiListField("attrs")
	@ApiField("app_item_attr_v_o")
	private List<AppItemAttrVO> attrs;

	/** 
	 * 商品条形码
	 */
	@ApiField("barcode")
	private String barcode;

	/** 
	 * 平台类目，填写的类目必须在类目表列出，多级类目只填最后一级。商品类目 ID 及信息可通过商品类目表获取。
	 */
	@ApiField("category_id")
	private String categoryId;

	/** 
	 * 商品创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * 导购描述，用于介绍商品卖点
	 */
	@ApiField("desc")
	private String desc;

	/** 
	 * 商品详情信息
	 */
	@ApiField("desc_info")
	private ItemDescInfoVO descInfo;

	/** 
	 * 商品直接购买链接
	 */
	@ApiField("direct_path")
	private String directPath;

	/** 
	 * 商品主图的文件id，图片宽高为750px*750px，宽高比1:1，800kb以内。
支持jpg、jpeg、png格式的图片。文件id通过alipay.open.file.upload 上传资源获取file_id，或通过alipay.marketing.image.enhance.upload获取image_id均可上传成功
	 */
	@ApiField("head_img")
	private String headImg;

	/** 
	 * 商品子图，作为平台详情页组件的轮播图，图片宽高为750px*750px，宽高比1:1，800kb以内，不超过 3 个图片。 支持jpg、jpeg、png格式的图片。文件id通过alipay.open.file.upload 上传资源获取file_id，或通过alipay.marketing.image.enhance.upload获取image_id均可上传成功。
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
	 * 1=官方插件版，商品详情页链接不传入 0=自定义详情页版，商品详情页链接必须传入
	 */
	@ApiField("item_details_page_model")
	private String itemDetailsPageModel;

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
	 * 商品原价，分为单位。若填写了skus[]数组，此字段不返回值
	 */
	@ApiField("original_price")
	private Long originalPrice;

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
	 * 商品价格单元
	 */
	@ApiField("price_unit")
	private String priceUnit;

	/** 
	 * 商品有冻结、驳回时，展示对应的具体问题
	 */
	@ApiListField("risk_info")
	@ApiField("item_risk_info")
	private List<ItemRiskInfo> riskInfo;

	/** 
	 * 商品售价，分为单位。若填写了skus[]数组，此字段不返回值
	 */
	@ApiField("sale_price")
	private Long salePrice;

	/** 
	 * 商品在对应场景屏蔽，展示对应的具体问题
	 */
	@ApiListField("scene_risk_info")
	@ApiField("item_scene_risk_info")
	private List<ItemSceneRiskInfo> sceneRiskInfo;

	/** 
	 * 商品sku信息
	 */
	@ApiListField("skus")
	@ApiField("item_sku_search_v_o")
	private List<ItemSkuSearchVO> skus;

	/** 
	 * 审核驳回：商品审核失败时，商品状态为审核驳回。
审核中：商品处于审核流程中时，商品状态为审核中。
已下架：商家可以通过调用接口下架商品，也可以通过商家后台下架商品。
可售卖：商家可以通过调用接口上架商品，也可以通过商家后台上架商品。
冻结：当商家出现违规操作时，支付宝侧将发起冻结，商品无法对外透出。 
当商品包含多个规格时，只要有一个规格的商品状态为“可售卖”，商品状态则为“可售卖”。
	 */
	@ApiField("spu_status")
	private String spuStatus;

	/** 
	 * 若填写了skus[]数组，此字段不用填写。
若未填写skus[]数组，此字段必填。
目前支持库存区间0~99999
	 */
	@ApiField("stock_num")
	private Long stockNum;

	/** 
	 * 商品名称，字符类型，最少不低于3，最长不超过60个字。注：1.商品标题只允许汉字、数字、英文字母、特殊字符集；2.商品标题不得仅为数字、字母、特殊字符集或上述三种的组合。
美味甜甜圈
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

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getBarcode( ) {
		return this.barcode;
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

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc( ) {
		return this.desc;
	}

	public void setDescInfo(ItemDescInfoVO descInfo) {
		this.descInfo = descInfo;
	}
	public ItemDescInfoVO getDescInfo( ) {
		return this.descInfo;
	}

	public void setDirectPath(String directPath) {
		this.directPath = directPath;
	}
	public String getDirectPath( ) {
		return this.directPath;
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

	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}
	public Long getOriginalPrice( ) {
		return this.originalPrice;
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

	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
	}
	public String getPriceUnit( ) {
		return this.priceUnit;
	}

	public void setRiskInfo(List<ItemRiskInfo> riskInfo) {
		this.riskInfo = riskInfo;
	}
	public List<ItemRiskInfo> getRiskInfo( ) {
		return this.riskInfo;
	}

	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}
	public Long getSalePrice( ) {
		return this.salePrice;
	}

	public void setSceneRiskInfo(List<ItemSceneRiskInfo> sceneRiskInfo) {
		this.sceneRiskInfo = sceneRiskInfo;
	}
	public List<ItemSceneRiskInfo> getSceneRiskInfo( ) {
		return this.sceneRiskInfo;
	}

	public void setSkus(List<ItemSkuSearchVO> skus) {
		this.skus = skus;
	}
	public List<ItemSkuSearchVO> getSkus( ) {
		return this.skus;
	}

	public void setSpuStatus(String spuStatus) {
		this.spuStatus = spuStatus;
	}
	public String getSpuStatus( ) {
		return this.spuStatus;
	}

	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}
	public Long getStockNum( ) {
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
