package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 客服热线信息
 *
 * @author auto create
 * @since 1.0, 2024-06-28 11:08:16
 */
public class AgentHotlineInfo extends AlipayObject {

	private static final long serialVersionUID = 5216875642896383789L;

	/**
	 * 数据权限id(租户实例id)
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	/**
	 * 热线技能组id
	 */
	@ApiListField("group_ids")
	@ApiField("string")
	private List<String> groupIds;

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}
	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
	}

	public List<String> getGroupIds() {
		return this.groupIds;
	}
	public void setGroupIds(List<String> groupIds) {
		this.groupIds = groupIds;
	}

}
