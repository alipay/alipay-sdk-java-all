package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 归属商户信息
 *
 * @author auto create
 * @since 1.0, 2021-12-23 11:40:22
 */
public class BelongMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 6629139378427993248L;

	/**
	 * 合作业务类型,默认为ISV_FOR_MERCHANT

枚举值:
ISV 服务商平台模式
ISV_FOR_MERCHANT 服务商代运营模式
限制:
1、ISV(平台模式)只有兑换券即voucher_type值为EXCHANGE_VOUCHER时才能使用
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 商户id

限制:
1、服务商代运营模式必传
2、服务商代运营模式下服务商必须与商户建立代运营授权关系。代运营授权流程https://opendocs.alipay.com/mini/01hm6i#%E4%BB%A3%E8%BF%90%E8%90%A5%E6%8E%88%E6%9D%83
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户id类型。

枚举值：
SMID 间连SMID
PID    直连PID


特别说明：
如果merchant_id_type选择SMID。则表明当前商家券活动的归属者是该SMID所绑定的支付宝PID。
因此要求该SMID必须绑定相应的支付宝PID。

限制:
服务商代运营模式必传
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
