package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品列表信息模型
 *
 * @author auto create
 * @since 1.0, 2023-09-27 12:14:51
 */
public class MiniGoodsDetailInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2684318379155233761L;

	/**
	 * 商品描述信息
	 */
	@ApiField("body")
	private String body;

	/**
	 * 商品类目树
	 */
	@ApiField("categories_tree")
	private String categoriesTree;

	/**
	 * 商品类目
	 */
	@ApiField("goods_category")
	private String goodsCategory;

	/**
	 * 商户侧商品的编号，应传入商品最小粒度的商品ID（例如商品有sku粒度，则传商户sku粒度的ID）。如果需要关联使用支付券，需要和支付券上绑定商品goods_id相同
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商品未上报商品库时，需传入  上传商品文件接口alipay.merchant.item.file.upload
 获取的 material_id。如果该商品已经上报商品库，可不传
	 */
	@ApiField("image_material_id")
	private String imageMaterialId;

	/**
	 * 商品数量
	 */
	@ApiField("item_cnt")
	private String itemCnt;

	/**
	 * 商户商品ID
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商户商品sku_id，提报商品库的商品，该字段必传
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 平台商品版本号，用于查询商品快照
	 */
	@ApiField("platform_item_version_id")
	private String platformItemVersionId;

	/**
	 * 租金信息，租赁商品特有
	 */
	@ApiField("rent_info")
	private RentInfoDTO rentInfo;

	/**
	 * 商品单价，单位：元,精确到小数点后两位
	 */
	@ApiField("sale_price")
	private String salePrice;

	/**
	 * 商品真实单价，单位：元,精确到小数点后两位
	 */
	@ApiField("sale_real_price")
	private String saleRealPrice;

	/**
	 * 商品的展示地址
	 */
	@ApiField("show_url")
	private String showUrl;

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public String getCategoriesTree() {
		return this.categoriesTree;
	}
	public void setCategoriesTree(String categoriesTree) {
		this.categoriesTree = categoriesTree;
	}

	public String getGoodsCategory() {
		return this.goodsCategory;
	}
	public void setGoodsCategory(String goodsCategory) {
		this.goodsCategory = goodsCategory;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getImageMaterialId() {
		return this.imageMaterialId;
	}
	public void setImageMaterialId(String imageMaterialId) {
		this.imageMaterialId = imageMaterialId;
	}

	public String getItemCnt() {
		return this.itemCnt;
	}
	public void setItemCnt(String itemCnt) {
		this.itemCnt = itemCnt;
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

	public String getPlatformItemVersionId() {
		return this.platformItemVersionId;
	}
	public void setPlatformItemVersionId(String platformItemVersionId) {
		this.platformItemVersionId = platformItemVersionId;
	}

	public RentInfoDTO getRentInfo() {
		return this.rentInfo;
	}
	public void setRentInfo(RentInfoDTO rentInfo) {
		this.rentInfo = rentInfo;
	}

	public String getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getSaleRealPrice() {
		return this.saleRealPrice;
	}
	public void setSaleRealPrice(String saleRealPrice) {
		this.saleRealPrice = saleRealPrice;
	}

	public String getShowUrl() {
		return this.showUrl;
	}
	public void setShowUrl(String showUrl) {
		this.showUrl = showUrl;
	}

}
