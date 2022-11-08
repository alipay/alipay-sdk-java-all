package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 协议额度设置信息
 *
 * @author auto create
 * @since 1.0, 2022-04-21 11:06:16
 */
public class AgreementQuotaModifyList extends AlipayObject {

	private static final long serialVersionUID = 2894424252724142899L;

	/**
	 * 授权协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 设置额度明细
	 */
	@ApiListField("quota_details")
	@ApiField("modify_quota_details")
	private List<ModifyQuotaDetails> quotaDetails;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public List<ModifyQuotaDetails> getQuotaDetails() {
		return this.quotaDetails;
	}
	public void setQuotaDetails(List<ModifyQuotaDetails> quotaDetails) {
		this.quotaDetails = quotaDetails;
	}

}
