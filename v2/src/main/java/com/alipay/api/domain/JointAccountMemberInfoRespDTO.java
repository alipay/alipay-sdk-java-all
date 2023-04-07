package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * openId改造
 *
 * @author auto create
 * @since 1.0, 2022-11-17 22:45:22
 */
public class JointAccountMemberInfoRespDTO extends AlipayObject {

	private static final long serialVersionUID = 5586952584789391992L;

	/**
	 * （群成员）支付宝侧用户唯一标识
	 */
	@ApiField("open_id")
	private String openId;

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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

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
