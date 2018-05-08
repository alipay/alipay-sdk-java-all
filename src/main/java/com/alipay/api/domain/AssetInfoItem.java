package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料信息
 *
 * @author auto create
 * @since 1.0, 2018-03-06 11:22:51
 */
public class AssetInfoItem extends AlipayObject {

	private static final long serialVersionUID = 4791713571571991378L;

	/**
	 * 配送或者生产指令id.
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * 机具序列号
	 */
	@ApiField("sub_type")
	private String subType;

	/**
	 * 生产资料, 配送资料
	 */
	@ApiField("type")
	private String type;

	/**
	 * 格式按照type约定的类型传入, 约定参见物料平台openAPI文档.
	 */
	@ApiField("value")
	private String value;

	public String getAssignItemId() {
		return this.assignItemId;
	}
	public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
	}

	public String getSubType() {
		return this.subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
