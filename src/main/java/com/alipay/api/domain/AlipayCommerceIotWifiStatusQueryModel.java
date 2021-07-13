package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * wifi状态查询
 *
 * @author auto create
 * @since 1.0, 2019-06-20 21:52:30
 */
public class AlipayCommerceIotWifiStatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2279215895617226653L;

	/**
	 * 设备唯一id
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
