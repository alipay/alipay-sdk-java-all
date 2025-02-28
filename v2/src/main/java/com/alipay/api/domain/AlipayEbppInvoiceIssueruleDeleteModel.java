package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 删除发放规则
 *
 * @author auto create
 * @since 1.0, 2024-06-24 14:13:53
 */
public class AlipayEbppInvoiceIssueruleDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3422289297467438449L;

	/**
	 * 共同账户id（该字段将废弃，不建议使用，可用enterprise_id字段替换） 当前字段已废弃(该字段将废弃，不建议使用，可用enterprise_id字段替换)
	 */
	@ApiField("account_id")
	@Deprecated
	private String accountId;

	/**
	 * 授权签约协议号（该字段将废弃，不建议使用，可用enterprise_id字段替换） 当前字段已废弃(该字段将废弃，不建议使用，可用enterprise_id字段替换)
	 */
	@ApiField("agreement_no")
	@Deprecated
	private String agreementNo;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 需要删除的发放规则id列表
	 */
	@ApiListField("issue_rule_id_list")
	@ApiField("string")
	private List<String> issueRuleIdList;

	/**
	 * 目标值id
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 发放规则关联的目标类型
	 */
	@ApiField("target_type")
	private String targetType;

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

	public List<String> getIssueRuleIdList() {
		return this.issueRuleIdList;
	}
	public void setIssueRuleIdList(List<String> issueRuleIdList) {
		this.issueRuleIdList = issueRuleIdList;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

}
