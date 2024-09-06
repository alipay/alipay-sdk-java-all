package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金管控任务信息
 *
 * @author auto create
 * @since 1.0, 2024-02-01 14:18:43
 */
public class SupvFundTask extends AlipayObject {

	private static final long serialVersionUID = 5535325373173359377L;

	/**
	 * 资金管控任务编号
	 */
	@ApiField("fund_supv_task_id")
	private String fundSupvTaskId;

	/**
	 * 任务状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 脱敏的支付宝登录号
	 */
	@ApiField("supervised_desensitized_access_no")
	private String supervisedDesensitizedAccessNo;

	/**
	 * 被管控方身份ID
	 */
	@ApiField("supervised_id_number")
	private String supervisedIdNumber;

	/**
	 * 被管控方名称
	 */
	@ApiField("supervised_name")
	private String supervisedName;

	/**
	 * 资金管控专户号
	 */
	@ApiField("supervised_special_account_no")
	private String supervisedSpecialAccountNo;

	/**
	 * 资金管控协议编号
	 */
	@ApiField("supv_agreement_no")
	private String supvAgreementNo;

	/**
	 * 结束日期
	 */
	@ApiField("supv_end")
	private Date supvEnd;

	/**
	 * 起始日期
	 */
	@ApiField("supv_start")
	private Date supvStart;

	/**
	 * 管控方企业社会信用编码
	 */
	@ApiField("supvervisor_id_number")
	private String supvervisorIdNumber;

	/**
	 * 管控方名称
	 */
	@ApiField("supvervisor_name")
	private String supvervisorName;

	public String getFundSupvTaskId() {
		return this.fundSupvTaskId;
	}
	public void setFundSupvTaskId(String fundSupvTaskId) {
		this.fundSupvTaskId = fundSupvTaskId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSupervisedDesensitizedAccessNo() {
		return this.supervisedDesensitizedAccessNo;
	}
	public void setSupervisedDesensitizedAccessNo(String supervisedDesensitizedAccessNo) {
		this.supervisedDesensitizedAccessNo = supervisedDesensitizedAccessNo;
	}

	public String getSupervisedIdNumber() {
		return this.supervisedIdNumber;
	}
	public void setSupervisedIdNumber(String supervisedIdNumber) {
		this.supervisedIdNumber = supervisedIdNumber;
	}

	public String getSupervisedName() {
		return this.supervisedName;
	}
	public void setSupervisedName(String supervisedName) {
		this.supervisedName = supervisedName;
	}

	public String getSupervisedSpecialAccountNo() {
		return this.supervisedSpecialAccountNo;
	}
	public void setSupervisedSpecialAccountNo(String supervisedSpecialAccountNo) {
		this.supervisedSpecialAccountNo = supervisedSpecialAccountNo;
	}

	public String getSupvAgreementNo() {
		return this.supvAgreementNo;
	}
	public void setSupvAgreementNo(String supvAgreementNo) {
		this.supvAgreementNo = supvAgreementNo;
	}

	public Date getSupvEnd() {
		return this.supvEnd;
	}
	public void setSupvEnd(Date supvEnd) {
		this.supvEnd = supvEnd;
	}

	public Date getSupvStart() {
		return this.supvStart;
	}
	public void setSupvStart(Date supvStart) {
		this.supvStart = supvStart;
	}

	public String getSupvervisorIdNumber() {
		return this.supvervisorIdNumber;
	}
	public void setSupvervisorIdNumber(String supvervisorIdNumber) {
		this.supvervisorIdNumber = supvervisorIdNumber;
	}

	public String getSupvervisorName() {
		return this.supvervisorName;
	}
	public void setSupvervisorName(String supvervisorName) {
		this.supvervisorName = supvervisorName;
	}

}
