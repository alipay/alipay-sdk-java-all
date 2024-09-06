package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业缴费ISV缴费信息DTO
 *
 * @author auto create
 * @since 1.0, 2024-05-21 18:58:53
 */
public class IndrISVPaymentInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3229513673545934898L;

	/**
	 * 缴费金额,对应币种的最小单位
	 */
	@ApiField("amount")
	private IndrMoneyDTO amount;

	/**
	 * 账户id，长度不超过10
	 */
	@ApiField("beneficiary_account_id")
	private String beneficiaryAccountId;

	/**
	 * 收款人id，长度不超过10
	 */
	@ApiField("beneficiary_id")
	private String beneficiaryId;

	/**
	 * 证明材料列表
	 */
	@ApiField("certificate_list")
	private IndrISVImageDTO certificateList;

	/**
	 * 附言，不能包含特殊字符
	 */
	@ApiField("post_script")
	private String postScript;

	public IndrMoneyDTO getAmount() {
		return this.amount;
	}
	public void setAmount(IndrMoneyDTO amount) {
		this.amount = amount;
	}

	public String getBeneficiaryAccountId() {
		return this.beneficiaryAccountId;
	}
	public void setBeneficiaryAccountId(String beneficiaryAccountId) {
		this.beneficiaryAccountId = beneficiaryAccountId;
	}

	public String getBeneficiaryId() {
		return this.beneficiaryId;
	}
	public void setBeneficiaryId(String beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}

	public IndrISVImageDTO getCertificateList() {
		return this.certificateList;
	}
	public void setCertificateList(IndrISVImageDTO certificateList) {
		this.certificateList = certificateList;
	}

	public String getPostScript() {
		return this.postScript;
	}
	public void setPostScript(String postScript) {
		this.postScript = postScript;
	}

}
