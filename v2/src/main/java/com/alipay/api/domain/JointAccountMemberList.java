package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 员工列表
 *
 * @author auto create
 * @since 1.0, 2022-11-30 17:10:07
 */
public class JointAccountMemberList extends AlipayObject {

	private static final long serialVersionUID = 8184545566858261715L;

	/**
	 * 额度模型
	 */
	@ApiListField("account_quota")
	@ApiField("joint_account_quota_d_t_o")
	private List<JointAccountQuotaDTO> accountQuota;

	/**
	 * 成员openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 成员ID
	 */
	@ApiField("user_id")
	private String userId;

	public List<JointAccountQuotaDTO> getAccountQuota() {
		return this.accountQuota;
	}
	public void setAccountQuota(List<JointAccountQuotaDTO> accountQuota) {
		this.accountQuota = accountQuota;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
