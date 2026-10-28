package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-20 11:48:00
 */
public class NowpayProduct extends AlipayObject {

	private static final long serialVersionUID = 1376265865749735283L;

	/**
	 * 创建时间，yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 修改时间，yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 外部商品 ID
	 */
	@ApiField("out_product_id")
	private String outProductId;

	/**
	 * null
	 */
	@ApiListField("pricing_mode_list")
	@ApiField("pricing_mode_for_list")
	private List<PricingModeForList> pricingModeList;

	/**
	 * 商品描述
	 */
	@ApiField("product_description")
	private String productDescription;

	/**
	 * 商品图标地址
	 */
	@ApiField("product_icon_url")
	private String productIconUrl;

	/**
	 * 内部商品 ID；申请未完成时可空
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 商品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 商品详情地址
	 */
	@ApiField("product_url")
	private String productUrl;

	/**
	 * 申请单状态，INIT初始化/SUCCESS已上架
	 */
	@ApiField("record_status")
	private String recordStatus;

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getOutProductId() {
		return this.outProductId;
	}
	public void setOutProductId(String outProductId) {
		this.outProductId = outProductId;
	}

	public List<PricingModeForList> getPricingModeList() {
		return this.pricingModeList;
	}
	public void setPricingModeList(List<PricingModeForList> pricingModeList) {
		this.pricingModeList = pricingModeList;
	}

	public String getProductDescription() {
		return this.productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductIconUrl() {
		return this.productIconUrl;
	}
	public void setProductIconUrl(String productIconUrl) {
		this.productIconUrl = productIconUrl;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductUrl() {
		return this.productUrl;
	}
	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}

	public String getRecordStatus() {
		return this.recordStatus;
	}
	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

}
