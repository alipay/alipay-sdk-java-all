package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.skuinfo.skuid.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-17 17:42:26
 */
public class AnttechNftSkuinfoSkuidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1358175883177685897L;

	/** 
	 * sku铸造数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/** 
	 * 铸造数量类型
	 */
	@ApiField("quantity_type")
	private String quantityType;

	/** 
	 * 藏品描述信息
	 */
	@ApiField("sku_desc")
	private String skuDesc;

	/** 
	 * sku维度是否支持转增
	 */
	@ApiField("sku_enable_send")
	private Boolean skuEnableSend;

	/** 
	 * 数字藏品类标识ID
	 */
	@ApiField("sku_id")
	private Long skuId;

	/** 
	 * sku维度缩略图
	 */
	@ApiField("sku_mini_fileurl")
	private String skuMiniFileurl;

	/** 
	 * 勋章图鉴缩略图
	 */
	@ApiField("sku_name")
	private String skuName;

	/** 
	 * Sku状态
	 */
	@ApiField("sku_status")
	private String skuStatus;

	/** 
	 * sku类型
	 */
	@ApiField("sku_type")
	private String skuType;

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Long getQuantity( ) {
		return this.quantity;
	}

	public void setQuantityType(String quantityType) {
		this.quantityType = quantityType;
	}
	public String getQuantityType( ) {
		return this.quantityType;
	}

	public void setSkuDesc(String skuDesc) {
		this.skuDesc = skuDesc;
	}
	public String getSkuDesc( ) {
		return this.skuDesc;
	}

	public void setSkuEnableSend(Boolean skuEnableSend) {
		this.skuEnableSend = skuEnableSend;
	}
	public Boolean getSkuEnableSend( ) {
		return this.skuEnableSend;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}
	public Long getSkuId( ) {
		return this.skuId;
	}

	public void setSkuMiniFileurl(String skuMiniFileurl) {
		this.skuMiniFileurl = skuMiniFileurl;
	}
	public String getSkuMiniFileurl( ) {
		return this.skuMiniFileurl;
	}

	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}
	public String getSkuName( ) {
		return this.skuName;
	}

	public void setSkuStatus(String skuStatus) {
		this.skuStatus = skuStatus;
	}
	public String getSkuStatus( ) {
		return this.skuStatus;
	}

	public void setSkuType(String skuType) {
		this.skuType = skuType;
	}
	public String getSkuType( ) {
		return this.skuType;
	}

}
