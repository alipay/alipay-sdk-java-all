package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 因公付查询规则
 *
 * @author auto create
 * @since 1.0, 2022-08-23 23:10:10
 */
public class AlipayFundEnterprisepayRuleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2517517195851999159L;

	/**
	 * 企业签约账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 平台和企业的三方授权协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 场景码，联系支付宝分配
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 用户ID，当操作类型=MEMBER 时必填
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 操作类型：
ACCOUNT-账户
MEMBER-成员
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 产品码，默认值
ENTERPRISE_PAY
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 查询类型：
QUOTA - 额度
TRADE - 商户限制
可都查询，也可以只查一个
	 */
	@ApiListField("rule_type")
	@ApiField("string")
	private List<String> ruleType;

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

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public List<String> getRuleType() {
		return this.ruleType;
	}
	public void setRuleType(List<String> ruleType) {
		this.ruleType = ruleType;
	}

}
