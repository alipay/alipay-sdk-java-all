package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二级商户信息	
 *
 * @author auto create
 * @since 1.0, 2025-10-10 17:32:39
 */
public class RentSubMerchant extends AlipayObject {

	private static final long serialVersionUID = 8294574715952918824L;

	/**
	 * 支付宝二级商户编号。 间连受理商户的支付宝商户编号，通过间连商户入驻接口后由支付宝生成。 直付通场景下必传
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 二级商户编号类型。 目前仅支持alipay，默认可以不传
	 */
	@ApiField("merchant_type")
	private String merchantType;

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantType() {
		return this.merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

}
