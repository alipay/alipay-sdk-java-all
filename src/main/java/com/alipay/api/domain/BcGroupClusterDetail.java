package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 客户群群组详情
 *
 * @author auto create
 * @since 1.0, 2022-10-31 17:44:26
 */
public class BcGroupClusterDetail extends AlipayObject {

	private static final long serialVersionUID = 3222761258222995143L;

	/**
	 * 一个分组下会管理多个普通支付宝群，此参数表示如果分组下一个群人数已满，是否自动创建新群
	 */
	@ApiField("auto_create_group")
	private Boolean autoCreateGroup;

	/**
	 * 支付宝用户id；此分组的管理员id
	 */
	@ApiListField("cluster_admin_ids")
	@ApiField("string")
	private List<String> clusterAdminIds;

	/**
	 * 客户群分组id，此id唯一，分组下会管理一系列的客户群
	 */
	@ApiField("cluster_id")
	private String clusterId;

	/**
	 * 客群分组名称
	 */
	@ApiField("cluster_name")
	private String clusterName;

	/**
	 * 支付宝用户id；一个分组下会管理多个普通支付宝群，此id表示分组下创建普通支付宝群的管理员id
	 */
	@ApiListField("default_admin_ids")
	@ApiField("string")
	private List<String> defaultAdminIds;

	/**
	 * 一个分组下会管理多个普通支付宝群，此名称表示分组下创建普通支付宝群的名称
	 */
	@ApiField("default_group_name")
	private String defaultGroupName;

	/**
	 * 支付宝用户id；一个分组下会管理多个普通支付宝群，此id表示分组下创建普通支付宝群的群主id
	 */
	@ApiField("default_master_id")
	private String defaultMasterId;

	public Boolean getAutoCreateGroup() {
		return this.autoCreateGroup;
	}
	public void setAutoCreateGroup(Boolean autoCreateGroup) {
		this.autoCreateGroup = autoCreateGroup;
	}

	public List<String> getClusterAdminIds() {
		return this.clusterAdminIds;
	}
	public void setClusterAdminIds(List<String> clusterAdminIds) {
		this.clusterAdminIds = clusterAdminIds;
	}

	public String getClusterId() {
		return this.clusterId;
	}
	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getClusterName() {
		return this.clusterName;
	}
	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}

	public List<String> getDefaultAdminIds() {
		return this.defaultAdminIds;
	}
	public void setDefaultAdminIds(List<String> defaultAdminIds) {
		this.defaultAdminIds = defaultAdminIds;
	}

	public String getDefaultGroupName() {
		return this.defaultGroupName;
	}
	public void setDefaultGroupName(String defaultGroupName) {
		this.defaultGroupName = defaultGroupName;
	}

	public String getDefaultMasterId() {
		return this.defaultMasterId;
	}
	public void setDefaultMasterId(String defaultMasterId) {
		this.defaultMasterId = defaultMasterId;
	}

}
