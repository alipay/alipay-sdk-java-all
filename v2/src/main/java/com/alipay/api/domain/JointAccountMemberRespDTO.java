package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 共同账户成员信息
 *
 * @author auto create
 * @since 1.0, 2021-08-31 14:41:27
 */
public class JointAccountMemberRespDTO extends AlipayObject {

	private static final long serialVersionUID = 5567347347853421961L;

	/**
	 * 额度模型
	 */
	@ApiListField("account_quota")
	@ApiField("joint_account_quota_d_t_o")
	private List<JointAccountQuotaDTO> accountQuota;

	/**
	 * 成员支付宝登录号
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 员工当前状态：

邀请中（PROCESSING）、正常（NORMAL）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用户支付宝会员号
	 */
	@ApiField("user_id")
	private String userId;

	public List<JointAccountQuotaDTO> getAccountQuota() {
		return this.accountQuota;
	}
	public void setAccountQuota(List<JointAccountQuotaDTO> accountQuota) {
		this.accountQuota = accountQuota;
	}

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
