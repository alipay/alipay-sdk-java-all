package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单个协议的额度响应
 *
 * @author auto create
 * @since 1.0, 2022-04-21 11:06:28
 */
public class QuotaQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 8569775559286872289L;

	/**
	 * 协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 单个协议查询结果错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 单个协议响应错误描述
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 额度明细列表
	 */
	@ApiField("quota_details")
	private AccountQuotaDetail quotaDetails;

	/**
	 * 单个协议查询结果是否成功
	 */
	@ApiField("success")
	private String success;

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

	public AccountQuotaDetail getQuotaDetails() {
		return this.quotaDetails;
	}
	public void setQuotaDetails(AccountQuotaDetail quotaDetails) {
		this.quotaDetails = quotaDetails;
	}

	public String getSuccess() {
		return this.success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}

}
