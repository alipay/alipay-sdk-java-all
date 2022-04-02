package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付券归属商户信息
 *
 * @author auto create
 * @since 1.0, 2022-02-23 14:18:56
 */
public class PaymentVoucherBelongMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 5699313828831453624L;

	/**
	 * 商户支付宝id，默认品牌名和品牌logo将从该商户信息中获取
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户id类型。 
若传入的类型为直连商户则必须签约当面付且当前接口调用者与商户存在代运营关系
当类型为SMID时表示为某个间连商户配券，但是券的归属者属于当前接口调用人。
枚举值
SMID 间连商户
PID 直连商户
	 */
	@ApiField("merchant_id_type")
	private String merchantIdType;

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
