package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 额度变更结果
 *
 * @author auto create
 * @since 1.0, 2022-04-21 11:06:16
 */
public class QuotaModifyDetail extends AlipayObject {

	private static final long serialVersionUID = 8342956336977835582L;

	/**
	 * 授权协议号，和入参的协议号对应
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 明细处理错误码，当success为false时有值
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误描述，当success为false时有值
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 当前协议下的明细处理结果
	 */
	@ApiField("success")
	private Boolean success;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
