package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁协议信息
 *
 * @author auto create
 * @since 1.0, 2023-05-23 18:06:48
 */
public class RentAgreementInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8754459521888736625L;

	/**
	 * 租赁协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 资金委托授权协议，特殊场景涉及，默认为空。
	 */
	@ApiField("deduct_agreement_no")
	private String deductAgreementNo;

	/**
	 * 租赁用户id
	 */
	@ApiField("rent_user_id")
	private String rentUserId;

	/**
	 * 租赁用户id
	 */
	@ApiField("rent_user_open_id")
	private String rentUserOpenId;

	/**
	 * 协议状态
	 */
	@ApiField("status")
	private String status;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getDeductAgreementNo() {
		return this.deductAgreementNo;
	}
	public void setDeductAgreementNo(String deductAgreementNo) {
		this.deductAgreementNo = deductAgreementNo;
	}

	public String getRentUserId() {
		return this.rentUserId;
	}
	public void setRentUserId(String rentUserId) {
		this.rentUserId = rentUserId;
	}

	public String getRentUserOpenId() {
		return this.rentUserOpenId;
	}
	public void setRentUserOpenId(String rentUserOpenId) {
		this.rentUserOpenId = rentUserOpenId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
