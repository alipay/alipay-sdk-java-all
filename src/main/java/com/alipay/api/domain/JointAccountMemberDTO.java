package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 共同账户成员模型（无登录号信息）
 *
 * @author auto create
 * @since 1.0, 2022-02-16 11:40:27
 */
public class JointAccountMemberDTO extends AlipayObject {

	private static final long serialVersionUID = 6269949574159635784L;

	/**
	 * 额度模型
	 */
	@ApiField("account_quota")
	private JointAccountQuotaDTO accountQuota;

	/**
	 * 成员扩展信息
	 */
	@ApiField("member_ext_info")
	private MemberExtInfo memberExtInfo;

	/**
	 * 姓名，脱敏输出
	 */
	@ApiField("name")
	private String name;

	/**
	 * 成员状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用户会员号
	 */
	@ApiField("user_id")
	private String userId;

	public JointAccountQuotaDTO getAccountQuota() {
		return this.accountQuota;
	}
	public void setAccountQuota(JointAccountQuotaDTO accountQuota) {
		this.accountQuota = accountQuota;
	}

	public MemberExtInfo getMemberExtInfo() {
		return this.memberExtInfo;
	}
	public void setMemberExtInfo(MemberExtInfo memberExtInfo) {
		this.memberExtInfo = memberExtInfo;
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
