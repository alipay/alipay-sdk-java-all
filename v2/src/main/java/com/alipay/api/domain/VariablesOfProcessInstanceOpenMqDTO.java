package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * bpms流程变量
 *
 * @author auto create
 * @since 1.0, 2024-06-25 14:22:28
 */
public class VariablesOfProcessInstanceOpenMqDTO extends AlipayObject {

	private static final long serialVersionUID = 2255859419341353771L;

	/**
	 * appKey
	 */
	@ApiField("app_key")
	private String appKey;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 分组id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 变量名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 流程实例id
	 */
	@ApiField("process_instance_id")
	private String processInstanceId;

	/**
	 * 更新时间
	 */
	@ApiField("update_time")
	private String updateTime;

	/**
	 * 变量值
	 */
	@ApiField("value")
	private String value;

	/**
	 * 变量id
	 */
	@ApiField("variable_id")
	private String variableId;

	public String getAppKey() {
		return this.appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getProcessInstanceId() {
		return this.processInstanceId;
	}
	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	public String getVariableId() {
		return this.variableId;
	}
	public void setVariableId(String variableId) {
		this.variableId = variableId;
	}

}
