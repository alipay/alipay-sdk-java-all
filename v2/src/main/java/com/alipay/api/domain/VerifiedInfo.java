package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 泰国电子落地签审核结果信息。
VerifyInfo of EVOA application.
 *
 * @author auto create
 * @since 1.0, 2019-10-29 15:59:50
 */
public class VerifiedInfo extends AlipayObject {

	private static final long serialVersionUID = 4753824469661138123L;

	/**
	 * 用户申请订单号回传。
Unique Application No.
	 */
	@ApiField("application_no")
	private String applicationNo;

	/**
	 * 扩展信息，用于保存其它补充信息。
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 审核记录。
Note.
	 */
	@ApiField("note")
	private String note;

	/**
	 * 审核备注。
Remark.
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 审核状态：通过/拒绝。
Status of application：Verified/Rejected.
	 */
	@ApiField("status")
	private String status;

	/**
	 * 审核负责单位。
Name of user who do verify.
	 */
	@ApiField("verified_by")
	private String verifiedBy;

	/**
	 * 审核时间。
DateTime of verified or rejected.
	 */
	@ApiField("verify_date_time")
	private Date verifyDateTime;

	public String getApplicationNo() {
		return this.applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getNote() {
		return this.note;
	}
	public void setNote(String note) {
		this.note = note;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getVerifiedBy() {
		return this.verifiedBy;
	}
	public void setVerifiedBy(String verifiedBy) {
		this.verifiedBy = verifiedBy;
	}

	public Date getVerifyDateTime() {
		return this.verifyDateTime;
	}
	public void setVerifyDateTime(Date verifyDateTime) {
		this.verifyDateTime = verifyDateTime;
	}

}
