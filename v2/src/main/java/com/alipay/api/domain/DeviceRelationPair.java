package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * n设备绑定关系
 *
 * @author auto create
 * @since 1.0, 2025-09-08 10:22:26
 */
public class DeviceRelationPair extends AlipayObject {

	private static final long serialVersionUID = 7776438956474567944L;

	/**
	 * 设备绑定的SMID或PID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 绑定的商户类型,标识merchant_id给的pid还是smid
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/**
	 * 设备的sn号
	 */
	@ApiField("sn")
	private String sn;

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

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

}
