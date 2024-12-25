package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业被执行人明细
 *
 * @author auto create
 * @since 1.0, 2024-12-24 14:42:19
 */
public class EpExecuteDefendantInfo extends AlipayObject {

	private static final long serialVersionUID = 1273977794523734179L;

	/**
	 * 案号
	 */
	@ApiField("case_no")
	private String caseNo;

	/**
	 * 立案时间
	 */
	@ApiField("case_register_date")
	private String caseRegisterDate;

	/**
	 * 案件状态
	 */
	@ApiField("case_state")
	private String caseState;

	/**
	 * 执行法院
	 */
	@ApiField("execution_court")
	private String executionCourt;

	/**
	 * 被执行人姓名/名称
	 */
	@ApiField("performed_name")
	private String performedName;

	/**
	 * 执行标的
	 */
	@ApiField("zxbd")
	private String zxbd;

	/**
	 * 组织机构代码
	 */
	@ApiField("zzjgdm")
	private String zzjgdm;

	public String getCaseNo() {
		return this.caseNo;
	}
	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public String getCaseRegisterDate() {
		return this.caseRegisterDate;
	}
	public void setCaseRegisterDate(String caseRegisterDate) {
		this.caseRegisterDate = caseRegisterDate;
	}

	public String getCaseState() {
		return this.caseState;
	}
	public void setCaseState(String caseState) {
		this.caseState = caseState;
	}

	public String getExecutionCourt() {
		return this.executionCourt;
	}
	public void setExecutionCourt(String executionCourt) {
		this.executionCourt = executionCourt;
	}

	public String getPerformedName() {
		return this.performedName;
	}
	public void setPerformedName(String performedName) {
		this.performedName = performedName;
	}

	public String getZxbd() {
		return this.zxbd;
	}
	public void setZxbd(String zxbd) {
		this.zxbd = zxbd;
	}

	public String getZzjgdm() {
		return this.zzjgdm;
	}
	public void setZzjgdm(String zzjgdm) {
		this.zzjgdm = zzjgdm;
	}

}
