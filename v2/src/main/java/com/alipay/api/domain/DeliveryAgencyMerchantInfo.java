package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家营销投放领域--代理的商户信息
 *
 * @author auto create
 * @since 1.0, 2023-06-29 12:25:05
 */
public class DeliveryAgencyMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 4731979591428817365L;

	/**
	 * 合作业务类型。
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 商户信息
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户id类型。 限制: 服务商代运营模式必传
	 */
	@ApiField("merchant_id_type")
	private String merchantIdType;

	public String getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantIdType() {
		return this.merchantIdType;
	}
	public void setMerchantIdType(String merchantIdType) {
		this.merchantIdType = merchantIdType;
	}

}
