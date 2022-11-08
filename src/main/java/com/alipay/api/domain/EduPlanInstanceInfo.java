package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 教育资金打款任务信息
 *
 * @author auto create
 * @since 1.0, 2022-09-27 15:42:45
 */
public class EduPlanInstanceInfo extends AlipayObject {

	private static final long serialVersionUID = 1212449348492212899L;

	/**
	 * 任务编号
	 */
	@ApiField("plan_instance_no")
	private String planInstanceNo;

	/**
	 * 任务状态：0-初始化；1-待打款；2-打款成功；4-待退款；5-退款成功
	 */
	@ApiField("plan_status")
	private String planStatus;

	/**
	 * 任务序号
	 */
	@ApiField("serial")
	private Long serial;

	public String getPlanInstanceNo() {
		return this.planInstanceNo;
	}
	public void setPlanInstanceNo(String planInstanceNo) {
		this.planInstanceNo = planInstanceNo;
	}

	public String getPlanStatus() {
		return this.planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public Long getSerial() {
		return this.serial;
	}
	public void setSerial(Long serial) {
		this.serial = serial;
	}

}
