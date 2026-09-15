package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 家医CBD结束问诊
 *
 * @author auto create
 * @since 1.0, 2026-08-28 17:22:04
 */
public class AlipayInsCbddoctorDiagnosisFinishModel extends AlipayObject {

	private static final long serialVersionUID = 6217982241199862791L;

	/**
	 * 蚂蚁服务单编号
	 */
	@ApiField("service_order_id")
	private String serviceOrderId;

	public String getServiceOrderId() {
		return this.serviceOrderId;
	}
	public void setServiceOrderId(String serviceOrderId) {
		this.serviceOrderId = serviceOrderId;
	}

}
