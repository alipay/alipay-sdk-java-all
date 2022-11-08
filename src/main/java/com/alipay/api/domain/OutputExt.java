package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 输出
 *
 * @author auto create
 * @since 1.0, 2022-11-02 15:42:29
 */
public class OutputExt extends AlipayObject {

	private static final long serialVersionUID = 3461648337882631595L;

	/**
	 * 是否可用
	 */
	@ApiField("accessable")
	private Boolean accessable;

	/**
	 * 描述信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 字段
	 */
	@ApiField("field")
	private String field;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	public Boolean getAccessable() {
		return this.accessable;
	}
	public void setAccessable(Boolean accessable) {
		this.accessable = accessable;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getField() {
		return this.field;
	}
	public void setField(String field) {
		this.field = field;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
