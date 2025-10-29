package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单状态变更通知其他信息
 *
 * @author auto create
 * @since 1.0, 2025-03-28 00:04:16
 */
public class CarfinStatusNotifyOther extends AlipayObject {

	private static final long serialVersionUID = 8155543768433455436L;

	/**
	 * 终审未提报原因码值
	 */
	@ApiField("approve_not_submit_code")
	private String approveNotSubmitCode;

	/**
	 * 终审未提交原因描述
	 */
	@ApiField("approve_not_submit_msg")
	private String approveNotSubmitMsg;

	/**
	 * 购车方式
	 */
	@ApiField("pay_method")
	private String payMethod;

	public String getApproveNotSubmitCode() {
		return this.approveNotSubmitCode;
	}
	public void setApproveNotSubmitCode(String approveNotSubmitCode) {
		this.approveNotSubmitCode = approveNotSubmitCode;
	}

	public String getApproveNotSubmitMsg() {
		return this.approveNotSubmitMsg;
	}
	public void setApproveNotSubmitMsg(String approveNotSubmitMsg) {
		this.approveNotSubmitMsg = approveNotSubmitMsg;
	}

	public String getPayMethod() {
		return this.payMethod;
	}
	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

}
