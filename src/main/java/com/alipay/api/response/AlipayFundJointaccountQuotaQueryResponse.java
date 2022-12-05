package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.JointAccountQuotaRespDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.jointaccount.quota.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-30 14:49:16
 */
public class AlipayFundJointaccountQuotaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7591131564251292862L;

	/** 
	 * 共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/** 
	 * 共同账户额度模型
	 */
	@ApiListField("account_quota")
	@ApiField("joint_account_quota_resp_d_t_o")
	private List<JointAccountQuotaRespDTO> accountQuota;

	/** 
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 成员ID（如果查询员工才返回）
	 */
	@ApiField("member_id")
	private String memberId;

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

	public void setAccountQuota(List<JointAccountQuotaRespDTO> accountQuota) {
		this.accountQuota = accountQuota;
	}
	public List<JointAccountQuotaRespDTO> getAccountQuota( ) {
		return this.accountQuota;
	}

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberId( ) {
		return this.memberId;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

}
