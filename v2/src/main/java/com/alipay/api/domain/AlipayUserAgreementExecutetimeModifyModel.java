package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝周期扣执行时间修改接口
 *
 * @author auto create
 * @since 1.0, 2025-03-03 10:55:23
 */
public class AlipayUserAgreementExecutetimeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5195489677976725323L;

	/**
	 * 代扣协议号。custasset库ca_usage_agreement表的usage_agreementid
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 扣款许可号。mdeduct_ob库mdeduct_permission的主键。
	 */
	@ApiField("deduct_permission")
	private String deductPermission;

	/**
	 * 修改扣款时间为入参时间
	 */
	@ApiField("execute_time")
	private String executeTime;

	/**
	 * 修改类型为扣款许可、扣款执行计划
	 */
	@ApiField("modify_type")
	private String modifyType;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getDeductPermission() {
		return this.deductPermission;
	}
	public void setDeductPermission(String deductPermission) {
		this.deductPermission = deductPermission;
	}

	public String getExecuteTime() {
		return this.executeTime;
	}
	public void setExecuteTime(String executeTime) {
		this.executeTime = executeTime;
	}

	public String getModifyType() {
		return this.modifyType;
	}
	public void setModifyType(String modifyType) {
		this.modifyType = modifyType;
	}

}
