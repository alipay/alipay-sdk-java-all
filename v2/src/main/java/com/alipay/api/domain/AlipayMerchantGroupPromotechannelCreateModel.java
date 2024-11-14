package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家群群组推广渠道创建
 *
 * @author auto create
 * @since 1.0, 2024-09-30 16:32:57
 */
public class AlipayMerchantGroupPromotechannelCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8541991711417216386L;

	/**
	 * 渠道描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 群组id，表里唯一键，创建群组自动生成，编辑群组必填
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 渠道参数（英文名称），仅支持数字字母和下划线
	 */
	@ApiField("key")
	private String key;

	/**
	 * 渠道名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 渠道父节点id，若是一级渠道不需要传值
	 */
	@ApiField("parent_id")
	private Long parentId;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getParentId() {
		return this.parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

}
