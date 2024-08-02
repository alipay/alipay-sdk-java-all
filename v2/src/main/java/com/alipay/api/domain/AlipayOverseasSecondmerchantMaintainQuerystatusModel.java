package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 海外商户报备结果查询接口
 *
 * @author auto create
 * @since 1.0, 2023-06-19 14:00:58
 */
public class AlipayOverseasSecondmerchantMaintainQuerystatusModel extends AlipayObject {

	private static final long serialVersionUID = 2857637536517545372L;

	/**
	 * 二级商户报备类型，分为ONLINE_PAYMENT和INSTORE_PAYMENT两种
	 */
	@ApiField("payment_method")
	private String paymentMethod;

	/**
	 * 二级商户ID
	 */
	@ApiField("secondary_merchant_id")
	private String secondaryMerchantId;

	/**
	 * 店铺ID
	 */
	@ApiField("store_id")
	private String storeId;

	public String getPaymentMethod() {
		return this.paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getSecondaryMerchantId() {
		return this.secondaryMerchantId;
	}
	public void setSecondaryMerchantId(String secondaryMerchantId) {
		this.secondaryMerchantId = secondaryMerchantId;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
