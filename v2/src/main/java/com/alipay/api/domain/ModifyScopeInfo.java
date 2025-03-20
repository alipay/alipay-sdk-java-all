package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改制度适用范围信息
 *
 * @author auto create
 * @since 1.0, 2024-12-24 20:10:18
 */
public class ModifyScopeInfo extends AlipayObject {

	private static final long serialVersionUID = 3452695828968762996L;

	/**
	 * 制度的适用范围类型
	 */
	@ApiField("adapter_type")
	private String adapterType;

	/**
	 * 增加的归属id列表
	 */
	@ApiListField("add_owner_id_list")
	@ApiField("string")
	private List<String> addOwnerIdList;

	/**
	 * 删除归属id列表
	 */
	@ApiListField("delete_owner_id_list")
	@ApiField("string")
	private List<String> deleteOwnerIdList;

	/**
	 * 归属id类型
	 */
	@ApiField("owner_type")
	private String ownerType;

	public String getAdapterType() {
		return this.adapterType;
	}
	public void setAdapterType(String adapterType) {
		this.adapterType = adapterType;
	}

	public List<String> getAddOwnerIdList() {
		return this.addOwnerIdList;
	}
	public void setAddOwnerIdList(List<String> addOwnerIdList) {
		this.addOwnerIdList = addOwnerIdList;
	}

	public List<String> getDeleteOwnerIdList() {
		return this.deleteOwnerIdList;
	}
	public void setDeleteOwnerIdList(List<String> deleteOwnerIdList) {
		this.deleteOwnerIdList = deleteOwnerIdList;
	}

	public String getOwnerType() {
		return this.ownerType;
	}
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

}
