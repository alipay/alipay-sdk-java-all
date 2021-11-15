package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * wifi配网结果轮询
 *
 * @author auto create
 * @since 1.0, 2019-06-20 21:52:47
 */
public class AlipayCommerceIotWifiResultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7187169751939675561L;

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
