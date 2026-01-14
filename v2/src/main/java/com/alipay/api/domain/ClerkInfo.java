package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票员信息
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:38:18
 */
public class ClerkInfo extends AlipayObject {

	private static final long serialVersionUID = 7369597442525728329L;

	/**
	 * 开票人姓名
	 */
	@ApiField("clerk_name")
	private String clerkName;

	/**
	 * 开票人身份标识
	 */
	@ApiField("clerk_no")
	private String clerkNo;

	/**
	 * 开票员确认状态
	 */
	@ApiField("confirm_status")
	private String confirmStatus;

	public String getClerkName() {
		return this.clerkName;
	}
	public void setClerkName(String clerkName) {
		this.clerkName = clerkName;
	}

	public String getClerkNo() {
		return this.clerkNo;
	}
	public void setClerkNo(String clerkNo) {
		this.clerkNo = clerkNo;
	}

	public String getConfirmStatus() {
		return this.confirmStatus;
	}
	public void setConfirmStatus(String confirmStatus) {
		this.confirmStatus = confirmStatus;
	}

}
