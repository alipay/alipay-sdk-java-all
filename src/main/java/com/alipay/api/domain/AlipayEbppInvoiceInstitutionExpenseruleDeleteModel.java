package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 删除使用规则
 *
 * @author auto create
 * @since 1.0, 2022-10-11 09:43:29
 */
public class AlipayEbppInvoiceInstitutionExpenseruleDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5411767674665751658L;

	/**
	 * 企业共同账户id
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 制度id
	 */
	@ApiField("institution_id")
	private String institutionId;

	/**
	 * 删除的使用规则id列表，当id不存在时，默认删除成功。删除后制度下至少保留一条使用规则。
	 */
	@ApiListField("standard_id_list")
	@ApiField("string")
	private List<String> standardIdList;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getInstitutionId() {
		return this.institutionId;
	}
	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}

	public List<String> getStandardIdList() {
		return this.standardIdList;
	}
	public void setStandardIdList(List<String> standardIdList) {
		this.standardIdList = standardIdList;
	}

}
