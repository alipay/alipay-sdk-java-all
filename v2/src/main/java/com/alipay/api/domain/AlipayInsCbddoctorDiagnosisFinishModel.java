package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 家医CBD结束问诊
 *
 * @author auto create
 * @since 1.0, 2025-05-12 11:37:57
 */
public class AlipayInsCbddoctorDiagnosisFinishModel extends AlipayObject {

	private static final long serialVersionUID = 4549563397929519529L;

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
