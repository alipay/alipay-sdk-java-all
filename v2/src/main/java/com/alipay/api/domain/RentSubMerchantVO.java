package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二级商户信息
 *
 * @author auto create
 * @since 1.0, 2025-07-02 15:11:59
 */
public class RentSubMerchantVO extends AlipayObject {

	private static final long serialVersionUID = 8411927382685938235L;

	/**
	 * 支付宝二级商户编号。 间连受理商户的支付宝商户编号，通过间连商户入驻接口后由支付宝生成。 直付通和机构间连业务场景下有值
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 二级商户编号类型
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
