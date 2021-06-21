package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户身份标识
 *
 * @author auto create
 * @since 1.0, 2019-11-26 18:03:34
 */
public class MerchantIDInfo extends AlipayObject {

	private static final long serialVersionUID = 3734298896141124881L;

	/**
	 * 商户的partnerId;
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 淘系商户的支付宝收款账号id
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 间连商户的进件Id
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

}
