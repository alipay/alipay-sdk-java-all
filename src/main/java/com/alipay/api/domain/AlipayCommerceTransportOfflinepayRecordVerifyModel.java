package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝脱机操作信息验证
 *
 * @author auto create
 * @since 1.0, 2016-07-01 22:05:47
 */
public class AlipayCommerceTransportOfflinepayRecordVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 8124958659543895672L;

	/**
	 * 原始脱机记录信息
	 */
	@ApiField("record")
	private String record;

	public String getRecord() {
		return this.record;
	}
	public void setRecord(String record) {
		this.record = record;
	}

}
