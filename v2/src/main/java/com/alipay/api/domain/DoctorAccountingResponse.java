package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医生核算结果
 *
 * @author auto create
 * @since 1.0, 2026-04-22 17:12:45
 */
public class DoctorAccountingResponse extends AlipayObject {

	private static final long serialVersionUID = 3177777253418517221L;

	/**
	 * 医生核算明细记录的主键
	 */
	@ApiField("doctor_accounting_detail_no")
	private String doctorAccountingDetailNo;

	/**
	 * null
	 */
	@ApiListField("event_flow_no")
	@ApiField("string")
	private List<String> eventFlowNo;

	public String getDoctorAccountingDetailNo() {
		return this.doctorAccountingDetailNo;
	}
	public void setDoctorAccountingDetailNo(String doctorAccountingDetailNo) {
		this.doctorAccountingDetailNo = doctorAccountingDetailNo;
	}

	public List<String> getEventFlowNo() {
		return this.eventFlowNo;
	}
	public void setEventFlowNo(List<String> eventFlowNo) {
		this.eventFlowNo = eventFlowNo;
	}

}
