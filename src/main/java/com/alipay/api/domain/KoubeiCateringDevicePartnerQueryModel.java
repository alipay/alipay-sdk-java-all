package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * pos设备查询
 *
 * @author auto create
 * @since 1.0, 2018-04-11 15:14:54
 */
public class KoubeiCateringDevicePartnerQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7495532169823127678L;

	/**
	 * 商户在口碑的唯一键
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 唯一请求id，开放者请确保每次请求的唯一性
	 */
	@ApiField("request_id")
	private String requestId;

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
