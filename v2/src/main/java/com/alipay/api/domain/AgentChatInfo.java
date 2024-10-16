package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 客服在线信息
 *
 * @author auto create
 * @since 1.0, 2024-07-02 10:22:51
 */
public class AgentChatInfo extends AlipayObject {

	private static final long serialVersionUID = 6892779349839197399L;

	/**
	 * 数据权限id(租户实例id)
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	/**
	 * 在线扩展技能组id列表
	 */
	@ApiListField("extended_group_ids")
	@ApiField("string")
	private List<String> extendedGroupIds;

	/**
	 * 在线技能组id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 在线服务等级
	 */
	@ApiField("level_id")
	private String levelId;

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}
	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
	}

	public List<String> getExtendedGroupIds() {
		return this.extendedGroupIds;
	}
	public void setExtendedGroupIds(List<String> extendedGroupIds) {
		this.extendedGroupIds = extendedGroupIds;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getLevelId() {
		return this.levelId;
	}
	public void setLevelId(String levelId) {
		this.levelId = levelId;
	}

}
