package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 应用内容商品创建
 *
 * @author auto create
 * @since 1.0, 2025-01-03 11:02:58
 */
public class AlipayOpenAppAppcontentItemCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5566385261383843522L;

	/**
	 * 商品条码
	 */
	@ApiField("barcode")
	private String barcode;

	/**
	 * 商品条码类型
	 */
	@ApiField("barcode_type")
	private String barcodeType;

	/**
	 * 商品扩展信息；请参见产品文档
	 */
	@ApiListField("biz_extends")
	@ApiField("item_ext")
	private List<ItemExt> bizExtends;

	/**
	 * 业务唯一ID
	 */
	@ApiField("biz_unique_id")
	private String bizUniqueId;

	/**
	 * 后台叶子类目ID；平台分配
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 商品自定义属性
	 */
	@ApiListField("custom_properties")
	@ApiField("item_property")
	private List<ItemProperty> customProperties;

	/**
	 * 商品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 商品详情图地址；最多3张
	 */
	@ApiListField("detail_pic_paths")
	@ApiField("string")
	private List<String> detailPicPaths;

	/**
	 * 商品详情地址；目前只支持传一个支付宝小程序地址
	 */
	@ApiListField("detail_urls")
	@ApiField("item_url")
	private List<ItemUrl> detailUrls;

	/**
	 * 商品主图地址
	 */
	@ApiField("major_pic_path")
	private String majorPicPath;

	/**
	 * 商品原价；单位:分
	 */
	@ApiField("origin_price")
	private Long originPrice;

	/**
	 * 商品售价；单位:分
	 */
	@ApiField("sale_price")
	private Long salePrice;

	/**
	 * 商品状态；可选值：VALID（上架）、INVALID（下架）；传空默认VALID
	 */
	@ApiField("status")
	private String status;

	/**
	 * 库存状态；可选值：SOLD_OUT（售罄）、AVAILABLE（可售）；非空情况status为INVALID时必须为AVAILABLE；传空情况默认为AVAILABLE
	 */
	@ApiField("stock_status")
	private String stockStatus;

	/**
	 * 商品名称
	 */
	@ApiField("title")
	private String title;

	public String getBarcode() {
		return this.barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getBarcodeType() {
		return this.barcodeType;
	}
	public void setBarcodeType(String barcodeType) {
		this.barcodeType = barcodeType;
	}

	public List<ItemExt> getBizExtends() {
		return this.bizExtends;
	}
	public void setBizExtends(List<ItemExt> bizExtends) {
		this.bizExtends = bizExtends;
	}

	public String getBizUniqueId() {
		return this.bizUniqueId;
	}
	public void setBizUniqueId(String bizUniqueId) {
		this.bizUniqueId = bizUniqueId;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public List<ItemProperty> getCustomProperties() {
		return this.customProperties;
	}
	public void setCustomProperties(List<ItemProperty> customProperties) {
		this.customProperties = customProperties;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getDetailPicPaths() {
		return this.detailPicPaths;
	}
	public void setDetailPicPaths(List<String> detailPicPaths) {
		this.detailPicPaths = detailPicPaths;
	}

	public List<ItemUrl> getDetailUrls() {
		return this.detailUrls;
	}
	public void setDetailUrls(List<ItemUrl> detailUrls) {
		this.detailUrls = detailUrls;
	}

	public String getMajorPicPath() {
		return this.majorPicPath;
	}
	public void setMajorPicPath(String majorPicPath) {
		this.majorPicPath = majorPicPath;
	}

	public Long getOriginPrice() {
		return this.originPrice;
	}
	public void setOriginPrice(Long originPrice) {
		this.originPrice = originPrice;
	}

	public Long getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStockStatus() {
		return this.stockStatus;
	}
	public void setStockStatus(String stockStatus) {
		this.stockStatus = stockStatus;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
