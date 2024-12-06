package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * wifi配网结果轮询
 *
 * @author auto create
 * @since 1.0, 2023-07-05 14:50:22
 */
public class AlipayCommerceIotWifiResultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8272354573567182118L;

	/**
	 * 设备唯一标识，设备id
	 */
	@ApiField("biz_tid")
	private String bizTid;

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

}
