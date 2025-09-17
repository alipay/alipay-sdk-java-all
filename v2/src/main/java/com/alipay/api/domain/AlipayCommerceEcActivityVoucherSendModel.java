package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券发放
 *
 * @author auto create
 * @since 1.0, 2025-05-20 10:44:09
 */
public class AlipayCommerceEcActivityVoucherSendModel extends AlipayObject {

	private static final long serialVersionUID = 4168523753246885392L;

	/**
	 * 券活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 员工id
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 企业码企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 业务自定义外部幂等号，同一个企业下使用相同的外部幂等号调用发券，不会重复发放，用于接口超时情况下的幂等重试
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
