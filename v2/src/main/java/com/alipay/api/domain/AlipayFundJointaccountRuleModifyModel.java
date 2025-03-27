package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业账户规则设置
 *
 * @author auto create
 * @since 1.0, 2022-11-28 15:40:25
 */
public class AlipayFundJointaccountRuleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5736189964947944596L;

	/**
	 * 账本ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 账本名称
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 账户额度
	 */
	@ApiListField("account_quota")
	@ApiField("joint_account_quota_d_t_o")
	private List<JointAccountQuotaDTO> accountQuota;

	/**
	 * 授权协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 交易授权信息
指定收单商户
	 */
	@ApiField("authorized_rule")
	private AuthorizedRuleDTO authorizedRule;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public List<JointAccountQuotaDTO> getAccountQuota() {
		return this.accountQuota;
	}
	public void setAccountQuota(List<JointAccountQuotaDTO> accountQuota) {
		this.accountQuota = accountQuota;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public AuthorizedRuleDTO getAuthorizedRule() {
		return this.authorizedRule;
	}
	public void setAuthorizedRule(AuthorizedRuleDTO authorizedRule) {
		this.authorizedRule = authorizedRule;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
