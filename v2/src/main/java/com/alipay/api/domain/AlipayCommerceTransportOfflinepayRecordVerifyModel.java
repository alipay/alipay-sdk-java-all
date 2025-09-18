package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝脱机操作信息验证
 *
 * @author auto create
 * @since 1.0, 2024-12-09 16:06:22
 */
public class AlipayCommerceTransportOfflinepayRecordVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 1411949134312623285L;

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
