package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家营销投放领域--代理的商户信息
 *
 * @author auto create
 * @since 1.0, 2021-12-20 16:29:00
 */
public class DeliveryAgencyMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 6424843845996242165L;

	/**
	 * 合作业务类型 枚举值: 
ISV 服务商平台模式
 ISV_FOR_MERCHANT 服务商代运营模式

其中针对ISV_FOR_MERCHANT模式，merchant_id与merchant_id_type是必须填写的
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 商户信息
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户id类型。 限制: 服务商代运营模式必传 枚举值：

SMID :间连SMID
PID :直连PID 

特别说明： 如果merchant_id_type选择SMID。则表明当前商家券活动的归属者是该SMID所绑定的支付宝PID。 因此要求该SMID必须绑定相应的支付宝PID。
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
