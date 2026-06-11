package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单信息
 *
 * @author auto create
 * @since 1.0, 2026-04-24 11:36:46
 */
public class ServiceItemOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 3863225282934112824L;

	/**
	 * 服务包结束时间（格式：yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("bill_end_time")
	private String billEndTime;

	/**
	 * 服务包开始时间（格式：yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("bill_start_time")
	private String billStartTime;

	/**
	 * 患者名称
	 */
	@ApiField("patient_name")
	private String patientName;

	public String getBillEndTime() {
		return this.billEndTime;
	}
	public void setBillEndTime(String billEndTime) {
		this.billEndTime = billEndTime;
	}

	public String getBillStartTime() {
		return this.billStartTime;
	}
	public void setBillStartTime(String billStartTime) {
		this.billStartTime = billStartTime;
	}

	public String getPatientName() {
		return this.patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

}
