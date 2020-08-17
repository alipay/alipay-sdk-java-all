package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建分组
 *
 * @author auto create
 * @since 1.0, 2019-11-29 10:51:42
 */
public class AlipayCommerceIotGroupCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3519654512175812195L;

	/**
	 * 业务类型-代表不同的业务场景
distribution表示服务分发
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 分组描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 分组名称
	 */
	@ApiField("group_name")
	private String groupName;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
