package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于查询前置审批项列表
 *
 * @author auto create
 * @since 1.0, 2024-01-19 17:03:00
 */
public class IcpNrlxTypeList extends AlipayObject {

	private static final long serialVersionUID = 4716267848912998934L;

	/**
	 * 前置审批项类型说明
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 前置审批项中文名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 前置审批项类型编码
	 */
	@ApiField("type")
	private String type;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
