package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收代扣协议签约信息
 *
 * @author auto create
 * @since 1.0, 2025-06-25 14:57:05
 */
public class RecycleDeductSignVO extends AlipayObject {

	private static final long serialVersionUID = 2337429518196593174L;

	/**
	 * 2088脱敏展示
	 */
	@ApiField("deduct_sign_pid")
	private String deductSignPid;

	/**
	 * SIGN已签约UNSIGN未签约
	 */
	@ApiField("deduct_sign_status")
	private String deductSignStatus;

	/**
	 * 回收个人版代扣签约INDIVIDUAL
回收企业版代扣签约ENTERPRISE
	 */
	@ApiField("deduct_sign_type")
	private String deductSignType;

	public String getDeductSignPid() {
		return this.deductSignPid;
	}
	public void setDeductSignPid(String deductSignPid) {
		this.deductSignPid = deductSignPid;
	}

	public String getDeductSignStatus() {
		return this.deductSignStatus;
	}
	public void setDeductSignStatus(String deductSignStatus) {
		this.deductSignStatus = deductSignStatus;
	}

	public String getDeductSignType() {
		return this.deductSignType;
	}
	public void setDeductSignType(String deductSignType) {
		this.deductSignType = deductSignType;
	}

}
