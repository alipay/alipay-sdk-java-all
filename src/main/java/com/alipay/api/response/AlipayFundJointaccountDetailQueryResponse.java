package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.JointAccountQuotaRespDTO;
import com.alipay.api.domain.AuthorizedRuleDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.jointaccount.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-18 10:45:32
 */
public class AlipayFundJointaccountDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8688546565939758569L;

	/** 
	 * 共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/** 
	 * 企业设置的共同账户的别名
	 */
	@ApiField("account_name")
	private String accountName;

	/** 
	 * 额度模型
	 */
	@ApiListField("account_quota")
	@ApiField("joint_account_quota_resp_d_t_o")
	private List<JointAccountQuotaRespDTO> accountQuota;

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

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountId( ) {
		return this.accountId;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountName( ) {
		return this.accountName;
	}

	public void setAccountQuota(List<JointAccountQuotaRespDTO> accountQuota) {
		this.accountQuota = accountQuota;
	}
	public List<JointAccountQuotaRespDTO> getAccountQuota( ) {
		return this.accountQuota;
	}

	public void setAuthorizedRule(AuthorizedRuleDTO authorizedRule) {
		this.authorizedRule = authorizedRule;
	}
	public AuthorizedRuleDTO getAuthorizedRule( ) {
		return this.authorizedRule;
	}

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

}
