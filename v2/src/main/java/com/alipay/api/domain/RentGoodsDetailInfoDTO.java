package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品详细信息
 *
 * @author auto create
 * @since 1.0, 2025-11-06 20:09:00
 */
public class RentGoodsDetailInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3666925994272741745L;

	/**
	 * 商品描述信息
	 */
	@ApiField("body")
	private String body;

	/**
	 * 商品图，线下租赁场景使用
	 */
	@ApiListField("goods_picture_ids")
	@ApiField("string")
	private List<String> goodsPictureIds;

	/**
	 * 商品图片，用于小程序订单中心展示，可通过 alipay.merchant.item.file.upload 接口上传素材获取素材id。默认使用已上报的商品库素材信息。
	 */
	@ApiField("image_material_id")
	private String imageMaterialId;

	/**
	 * imei
	 */
	@ApiField("imei")
	private String imei;

	/**
	 * 品牌编号；参考租赁行业空间品牌编号文档
	 */
	@ApiField("item_brand")
	private String itemBrand;

	/**
	 * 商品类目
	 */
	@ApiField("item_category")
	private String itemCategory;

	/**
	 * 商品数量
	 */
	@ApiField("item_cnt")
	private String itemCnt;

	/**
	 * 商品描述
	 */
	@ApiField("item_description")
	private String itemDescription;

	/**
	 * 商品成色
	 */
	@ApiField("item_fineness")
	private String itemFineness;

	/**
	 * 成色等级，成色为二手时需传入此字段
	 */
	@ApiField("item_fineness_grade")
	private String itemFinenessGrade;

	/**
	 * 商品名称，用于支付宝小程序订单中心、芝麻租赁频道中对用户展示
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 租赁的商品类型
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 商品总价值，单位：元，精确到小数点后两位。
	 */
	@ApiField("item_value")
	private String itemValue;

	/**
	 * 商户侧商品id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商户侧商品sku_id
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 租赁模式
	 */
	@ApiField("rent_model")
	private String rentModel;

	/**
	 * 商品平均日租金，单位：元，精确到小数点后两位，注：租赁商品请传入日租金，如10元/天
	 */
	@ApiField("sale_price")
	private String salePrice;

	/**
	 * 是否监管机，仅3C手机适用
	 */
	@ApiField("supervised")
	private Boolean supervised;

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public List<String> getGoodsPictureIds() {
		return this.goodsPictureIds;
	}
	public void setGoodsPictureIds(List<String> goodsPictureIds) {
		this.goodsPictureIds = goodsPictureIds;
	}

	public String getImageMaterialId() {
		return this.imageMaterialId;
	}
	public void setImageMaterialId(String imageMaterialId) {
		this.imageMaterialId = imageMaterialId;
	}

	public String getImei() {
		return this.imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getItemBrand() {
		return this.itemBrand;
	}
	public void setItemBrand(String itemBrand) {
		this.itemBrand = itemBrand;
	}

	public String getItemCategory() {
		return this.itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public String getItemCnt() {
		return this.itemCnt;
	}
	public void setItemCnt(String itemCnt) {
		this.itemCnt = itemCnt;
	}

	public String getItemDescription() {
		return this.itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getItemFineness() {
		return this.itemFineness;
	}
	public void setItemFineness(String itemFineness) {
		this.itemFineness = itemFineness;
	}

	public String getItemFinenessGrade() {
		return this.itemFinenessGrade;
	}
	public void setItemFinenessGrade(String itemFinenessGrade) {
		this.itemFinenessGrade = itemFinenessGrade;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getItemValue() {
		return this.itemValue;
	}
	public void setItemValue(String itemValue) {
		this.itemValue = itemValue;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public String getRentModel() {
		return this.rentModel;
	}
	public void setRentModel(String rentModel) {
		this.rentModel = rentModel;
	}

	public String getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public Boolean getSupervised() {
		return this.supervised;
	}
	public void setSupervised(Boolean supervised) {
		this.supervised = supervised;
	}

}
