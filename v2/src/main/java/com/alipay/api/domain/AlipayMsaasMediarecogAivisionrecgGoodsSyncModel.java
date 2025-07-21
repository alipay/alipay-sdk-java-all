package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步商品档案
 *
 * @author auto create
 * @since 1.0, 2024-09-04 11:09:59
 */
public class AlipayMsaasMediarecogAivisionrecgGoodsSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8878812468574657966L;

	/**
	 * 商品文件
	 */
	@ApiField("goods_data_file_url")
	private String goodsDataFileUrl;

	/**
	 * 服务商ID
	 */
	@ApiField("isv_id")
	private String isvId;

	/**
	 * 服务商名称
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * 商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	public String getGoodsDataFileUrl() {
		return this.goodsDataFileUrl;
	}
	public void setGoodsDataFileUrl(String goodsDataFileUrl) {
		this.goodsDataFileUrl = goodsDataFileUrl;
	}

	public String getIsvId() {
		return this.isvId;
	}
	public void setIsvId(String isvId) {
		this.isvId = isvId;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

}
