package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请权限
 *
 * @author auto create
 * @since 1.0, 2022-04-06 11:02:05
 */
public class AlipayMerchantAuthCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5853545317336499254L;

	/**
	 * 渠道
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 当前操作人ID
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 角色
	 */
	@ApiField("role")
	private String role;

	/**
	 * 场景code
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 用户信息
	 */
	@ApiField("user_list")
	private AoiUser userList;

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public AoiUser getUserList() {
		return this.userList;
	}
	public void setUserList(AoiUser userList) {
		this.userList = userList;
	}

}
