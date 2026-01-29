package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * TPA渠道业务事件同步
 *
 * @author auto create
 * @since 1.0, 2026-01-04 18:12:43
 */
public class AlipayCommerceMedicalInsuranceTpaeventSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1672527972445613574L;

	/**
	 * 码值
	 */
	@ApiField("code_value")
	private String codeValue;

	/**
	 * 事件动作
	 */
	@ApiField("event_action")
	private String eventAction;

	/**
	 * 医院编码
	 */
	@ApiField("hospital_code")
	private String hospitalCode;

	/**
	 * 医院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * TPA编号
	 */
	@ApiField("tpa_id")
	private String tpaId;

	/**
	 * 就诊日期 
	 */
	@ApiField("visit_date")
	private String visitDate;

	public String getCodeValue() {
		return this.codeValue;
	}
	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}

	public String getEventAction() {
		return this.eventAction;
	}
	public void setEventAction(String eventAction) {
		this.eventAction = eventAction;
	}

	public String getHospitalCode() {
		return this.hospitalCode;
	}
	public void setHospitalCode(String hospitalCode) {
		this.hospitalCode = hospitalCode;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getTpaId() {
		return this.tpaId;
	}
	public void setTpaId(String tpaId) {
		this.tpaId = tpaId;
	}

	public String getVisitDate() {
		return this.visitDate;
	}
	public void setVisitDate(String visitDate) {
		this.visitDate = visitDate;
	}

}
