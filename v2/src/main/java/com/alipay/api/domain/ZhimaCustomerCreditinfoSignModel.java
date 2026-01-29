package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权申请
 *
 * @author auto create
 * @since 1.0, 2025-08-27 17:34:19
 */
public class ZhimaCustomerCreditinfoSignModel extends AlipayObject {

	private static final long serialVersionUID = 3498537418686654523L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户进行申请授权时，商户传入的与该用户绑定的授权申请单号
	 */
	@ApiField("out_agreement_no")
	private String outAgreementNo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutAgreementNo() {
		return this.outAgreementNo;
	}
	public void setOutAgreementNo(String outAgreementNo) {
		this.outAgreementNo = outAgreementNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
