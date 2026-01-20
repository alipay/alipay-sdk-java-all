package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 制度适用范围信息
 *
 * @author auto create
 * @since 1.0, 2025-11-11 14:02:54
 */
public class InstitutionScopeInfo extends AlipayObject {

	private static final long serialVersionUID = 5558465559475441227L;

	/**
	 * 制度适用范围，支持配置全员、指定员工和指定部门
	 */
	@ApiField("adapter_type")
	private String adapterType;

	/**
	 * 适用范围归属id列表
	 */
	@ApiListField("owner_id_list")
	@ApiField("string")
	private List<String> ownerIdList;

	/**
	 * 员工id类型
	 */
	@ApiField("owner_type")
	private String ownerType;

	public String getAdapterType() {
		return this.adapterType;
	}
	public void setAdapterType(String adapterType) {
		this.adapterType = adapterType;
	}

	public List<String> getOwnerIdList() {
		return this.ownerIdList;
	}
	public void setOwnerIdList(List<String> ownerIdList) {
		this.ownerIdList = ownerIdList;
	}

	public String getOwnerType() {
		return this.ownerType;
	}
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

}
