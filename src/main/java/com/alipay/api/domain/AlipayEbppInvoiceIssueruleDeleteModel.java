package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 删除发放规则
 *
 * @author auto create
 * @since 1.0, 2022-08-18 09:47:58
 */
public class AlipayEbppInvoiceIssueruleDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2127324446442474835L;

	/**
	 * 共同账户id - 适用于在企业码小程序创建的共同账户，和agreement_no搭配使用
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 企业ID - 适用于在企业码PC端创建的企业账号
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
	 * 发放规则关联的目标值 target_type为制度时：制度id
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 发放规则关联的目标类型，枚举值：INSTITUTION(制度)
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
