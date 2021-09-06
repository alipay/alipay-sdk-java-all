package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 已加入合花群的成员信息
 *
 * @author auto create
 * @since 1.0, 2021-09-01 15:19:02
 */
public class JointAccountMemberInfoRespDTO extends AlipayObject {

	private static final long serialVersionUID = 2792528267774993214L;

	/**
	 * 成员角色：<br>
-MASTER：创建人<br>
-ADMIN：管理员<br>
-MEMBER：群成员<br>
	 */
	@ApiField("operate_role")
	private String operateRole;

	/**
	 * （群成员）支付宝侧用户唯一标识
	 */
	@ApiField("user_id")
	private String userId;

	public String getOperateRole() {
		return this.operateRole;
	}
	public void setOperateRole(String operateRole) {
		this.operateRole = operateRole;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
