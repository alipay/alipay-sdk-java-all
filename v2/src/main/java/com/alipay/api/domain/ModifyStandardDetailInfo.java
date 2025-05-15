package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改制度下使用规则信息
 *
 * @author auto create
 * @since 1.0, 2024-12-24 20:10:18
 */
public class ModifyStandardDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 4687765172485199979L;

	/**
	 * 新增的使用规则列表
	 */
	@ApiListField("add_standard_list")
	@ApiField("standard_info")
	private List<StandardInfo> addStandardList;

	/**
	 * 待删除的使用规则id列表
	 */
	@ApiListField("delete_standard_id_list")
	@ApiField("string")
	private List<String> deleteStandardIdList;

	/**
	 * 待修改的使用规则信息列表
	 */
	@ApiListField("modify_standard_list")
	@ApiField("modify_standard_info")
	private List<ModifyStandardInfo> modifyStandardList;

	public List<StandardInfo> getAddStandardList() {
		return this.addStandardList;
	}
	public void setAddStandardList(List<StandardInfo> addStandardList) {
		this.addStandardList = addStandardList;
	}

	public List<String> getDeleteStandardIdList() {
		return this.deleteStandardIdList;
	}
	public void setDeleteStandardIdList(List<String> deleteStandardIdList) {
		this.deleteStandardIdList = deleteStandardIdList;
	}

	public List<ModifyStandardInfo> getModifyStandardList() {
		return this.modifyStandardList;
	}
	public void setModifyStandardList(List<ModifyStandardInfo> modifyStandardList) {
		this.modifyStandardList = modifyStandardList;
	}

}
