package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更新SKU状态
 *
 * @author auto create
 * @since 1.0, 2026-08-07 11:21:42
 */
public class AlipayInsSceneInshealthserviceprodMallskustatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2538459455491685698L;

	/**
	 * 商家SKU编码
	 */
	@ApiField("merchant_sku_code")
	private String merchantSkuCode;

	/**
	 * 服务产品ID
	 */
	@ApiField("ser_prod_no")
	private String serProdNo;

	/**
	 * 商家商品Id
	 */
	@ApiField("source_product_id")
	private String sourceProductId;

	/**
	 * 供应状态
	 */
	@ApiField("status")
	private String status;

	public String getMerchantSkuCode() {
		return this.merchantSkuCode;
	}
	public void setMerchantSkuCode(String merchantSkuCode) {
		this.merchantSkuCode = merchantSkuCode;
	}

	public String getSerProdNo() {
		return this.serProdNo;
	}
	public void setSerProdNo(String serProdNo) {
		this.serProdNo = serProdNo;
	}

	public String getSourceProductId() {
		return this.sourceProductId;
	}
	public void setSourceProductId(String sourceProductId) {
		this.sourceProductId = sourceProductId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
