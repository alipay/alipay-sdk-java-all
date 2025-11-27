package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序商品状态变更
 *
 * @author auto create
 * @since 1.0, 2025-11-13 15:58:46
 */
public class AlipayDataDataserviceProductAppCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 2131768578415484717L;

	/**
	 * 商品属性列表
	 */
	@ApiListField("attrs")
	@ApiField("item_attr_dto")
	private List<ItemAttrDto> attrs;

	/**
	 * 条形码
	 */
	@ApiField("barcode")
	private String barcode;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 商品平台类目信息
	 */
	@ApiField("category")
	private ItemCategoryDto category;

	/**
	 * 商品详情描述文案
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 商品描述详情
	 */
	@ApiField("desc_info")
	private ItemDescInfoDto descInfo;

	/**
	 * 商品直接购买链接地址
	 */
	@ApiField("direct_path")
	private String directPath;

	/**
	 * 商品类型，由灯火系统分配给商户
	 */
	@ApiField("entity_type")
	private String entityType;

	/**
	 * 商品主图
	 */
	@ApiField("head_img")
	private String headImg;

	/**
	 * 商品子图
	 */
	@ApiListField("image_list")
	@ApiField("string")
	private List<String> imageList;

	/**
	 * 商品类型
	 */
	@ApiField("item_sub_type")
	private String itemSubType;

	/**
	 * 落地页信息
	 */
	@ApiListField("landing")
	@ApiField("landing_type_dto")
	private List<LandingTypeDto> landing;

	/**
	 * 商品原价，单位为分（人民币）
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 商品外部id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商品来源，由灯火系统分配给商户
	 */
	@ApiField("out_source")
	private String outSource;

	/**
	 * 商品归属的商户oid, 传入oid时优先使用oid，否则使用pid
	 */
	@ApiField("owner_oid")
	private String ownerOid;

	/**
	 * 商品归属的商户pid
	 */
	@ApiField("owner_pid")
	private String ownerPid;

	/**
	 * 商品详情页url
	 */
	@ApiField("path")
	private String path;

	/**
	 * 价格单位
	 */
	@ApiField("price_unit")
	private String priceUnit;

	/**
	 * 商家在支付宝数字推广平台唯一标识
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 小程序id
	 */
	@ApiField("prod_app_id")
	private String prodAppId;

	/**
	 * 商品售价，单位为分
	 */
	@ApiField("sale_price")
	private Long salePrice;

	/**
	 * 商品售卖状态
	 */
	@ApiField("sale_status")
	private String saleStatus;

	/**
	 * 商品销量信息，realSells为商品真实销量，customerSells为商品用户自填销量，displaySells为商品展示销量，virtualSellsRange为虚拟销量范围。
	 */
	@ApiField("sells_info")
	private SellsInfo sellsInfo;

	/**
	 * 商品sku信息
	 */
	@ApiListField("skus")
	@ApiField("item_sku_dto")
	private List<ItemSkuDto> skus;

	/**
	 * 商品库存，目前支持库存区间为0-99999999。
	 */
	@ApiField("stock_num")
	private Long stockNum;

	/**
	 * 商品名称
	 */
	@ApiField("title")
	private String title;

	public List<ItemAttrDto> getAttrs() {
		return this.attrs;
	}
	public void setAttrs(List<ItemAttrDto> attrs) {
		this.attrs = attrs;
	}

	public String getBarcode() {
		return this.barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public ItemCategoryDto getCategory() {
		return this.category;
	}
	public void setCategory(ItemCategoryDto category) {
		this.category = category;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public ItemDescInfoDto getDescInfo() {
		return this.descInfo;
	}
	public void setDescInfo(ItemDescInfoDto descInfo) {
		this.descInfo = descInfo;
	}

	public String getDirectPath() {
		return this.directPath;
	}
	public void setDirectPath(String directPath) {
		this.directPath = directPath;
	}

	public String getEntityType() {
		return this.entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getHeadImg() {
		return this.headImg;
	}
	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public List<String> getImageList() {
		return this.imageList;
	}
	public void setImageList(List<String> imageList) {
		this.imageList = imageList;
	}

	public String getItemSubType() {
		return this.itemSubType;
	}
	public void setItemSubType(String itemSubType) {
		this.itemSubType = itemSubType;
	}

	public List<LandingTypeDto> getLanding() {
		return this.landing;
	}
	public void setLanding(List<LandingTypeDto> landing) {
		this.landing = landing;
	}

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutSource() {
		return this.outSource;
	}
	public void setOutSource(String outSource) {
		this.outSource = outSource;
	}

	public String getOwnerOid() {
		return this.ownerOid;
	}
	public void setOwnerOid(String ownerOid) {
		this.ownerOid = ownerOid;
	}

	public String getOwnerPid() {
		return this.ownerPid;
	}
	public void setOwnerPid(String ownerPid) {
		this.ownerPid = ownerPid;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	public String getPriceUnit() {
		return this.priceUnit;
	}
	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

	public String getProdAppId() {
		return this.prodAppId;
	}
	public void setProdAppId(String prodAppId) {
		this.prodAppId = prodAppId;
	}

	public Long getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}

	public String getSaleStatus() {
		return this.saleStatus;
	}
	public void setSaleStatus(String saleStatus) {
		this.saleStatus = saleStatus;
	}

	public SellsInfo getSellsInfo() {
		return this.sellsInfo;
	}
	public void setSellsInfo(SellsInfo sellsInfo) {
		this.sellsInfo = sellsInfo;
	}

	public List<ItemSkuDto> getSkus() {
		return this.skus;
	}
	public void setSkus(List<ItemSkuDto> skus) {
		this.skus = skus;
	}

	public Long getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
