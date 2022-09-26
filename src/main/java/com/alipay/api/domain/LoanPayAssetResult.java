package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 资产
 *
 * @author auto create
 * @since 1.0, 2018-10-25 15:25:04
 */
public class LoanPayAssetResult extends AlipayObject {

	private static final long serialVersionUID = 8197117652799295811L;

	/**
	 * 资金账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 可用额度
	 */
	@ApiField("available_amount")
	private MultiCurrencyMoneyVO availableAmount;

	/**
	 * true为可用，false为不可用
	 */
	@ApiField("enable")
	private Boolean enable;

	/**
	 * 提示文案，JSON大字段
	 */
	@ApiField("hint_texts")
	private String hintTexts;

	/**
	 * 分期方案列表
	 */
	@ApiListField("installments")
	@ApiField("loan_pay_installment")
	private List<LoanPayInstallment> installments;

	/**
	 * 不可用信息
	 */
	@ApiField("refuse_msg")
	private Refuse refuseMsg;

	/**
	 * 方案id
	 */
	@ApiField("scheme_id")
	private String schemeId;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public MultiCurrencyMoneyVO getAvailableAmount() {
		return this.availableAmount;
	}
	public void setAvailableAmount(MultiCurrencyMoneyVO availableAmount) {
		this.availableAmount = availableAmount;
	}

	public Boolean getEnable() {
		return this.enable;
	}
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public String getHintTexts() {
		return this.hintTexts;
	}
	public void setHintTexts(String hintTexts) {
		this.hintTexts = hintTexts;
	}

	public List<LoanPayInstallment> getInstallments() {
		return this.installments;
	}
	public void setInstallments(List<LoanPayInstallment> installments) {
		this.installments = installments;
	}

	public Refuse getRefuseMsg() {
		return this.refuseMsg;
	}
	public void setRefuseMsg(Refuse refuseMsg) {
		this.refuseMsg = refuseMsg;
	}

	public String getSchemeId() {
		return this.schemeId;
	}
	public void setSchemeId(String schemeId) {
		this.schemeId = schemeId;
	}

}
