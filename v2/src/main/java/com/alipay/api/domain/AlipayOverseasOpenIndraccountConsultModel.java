package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账号预校验
 *
 * @author auto create
 * @since 1.0, 2023-11-09 17:22:34
 */
public class AlipayOverseasOpenIndraccountConsultModel extends AlipayObject {

	private static final long serialVersionUID = 8186731353517337476L;

	/**
	 * 账户名称
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 行业缴费账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 银行代码包括：
美国银行abafw号
（aba/fw）
英国收款银行清算号(sort_code)
澳大利亚收款银行清算号(bsb_code)
加拿大收款银行清算号(cc_code)
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 收款方id
	 */
	@ApiField("beneficiary_id")
	private String beneficiaryId;

	/**
	 * 国家，ISO3166标准2位国家码
	 */
	@ApiField("country")
	private String country;

	/**
	 * 收款类型
	 */
	@ApiField("receipt_method")
	private String receiptMethod;

	/**
	 * 场景类型:
TUITION 留学缴费
HOUSE_RENTAL 留学租房
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * Swift Code
	 */
	@ApiField("swift_code")
	private String swiftCode;

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBeneficiaryId() {
		return this.beneficiaryId;
	}
	public void setBeneficiaryId(String beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getReceiptMethod() {
		return this.receiptMethod;
	}
	public void setReceiptMethod(String receiptMethod) {
		this.receiptMethod = receiptMethod;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getSwiftCode() {
		return this.swiftCode;
	}
	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}

}
