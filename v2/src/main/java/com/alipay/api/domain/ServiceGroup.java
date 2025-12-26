package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-11-24 14:57:40
 */
public class ServiceGroup extends AlipayObject {

	private static final long serialVersionUID = 7714849291556144522L;

	/**
	 * 服务分组的id.目前只有首页底部服务
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 服务分组名称。目前只有首页底部
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 服务展位code.适用获取光华服务配置
	 */
	@ApiField("position_code")
	private String positionCode;

	/**
	 * null
	 */
	@ApiListField("service_list")
	@ApiField("agent_service_info")
	private List<AgentServiceInfo> serviceList;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getPositionCode() {
		return this.positionCode;
	}
	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public List<AgentServiceInfo> getServiceList() {
		return this.serviceList;
	}
	public void setServiceList(List<AgentServiceInfo> serviceList) {
		this.serviceList = serviceList;
	}

}
