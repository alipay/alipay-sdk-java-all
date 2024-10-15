package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * wifi状态查询
 *
 * @author auto create
 * @since 1.0, 2023-07-05 14:49:54
 */
public class AlipayCommerceIotWifiStatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5889494694778763952L;

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
