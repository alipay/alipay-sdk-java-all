package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健身项目
 *
 * @author auto create
 * @since 1.0, 2019-01-03 10:32:47
 */
public class ExerciseItem extends AlipayObject {

	private static final long serialVersionUID = 7775653766196333799L;

	/**
	 * 项目描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 外部项目ID
	 */
	@ApiField("external_item_id")
	private String externalItemId;

	/**
	 * 项目类型码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 健身项目名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 父项目类型码
	 */
	@ApiField("parent_item_code")
	private String parentItemCode;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getExternalItemId() {
		return this.externalItemId;
	}
	public void setExternalItemId(String externalItemId) {
		this.externalItemId = externalItemId;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getParentItemCode() {
		return this.parentItemCode;
	}
	public void setParentItemCode(String parentItemCode) {
		this.parentItemCode = parentItemCode;
	}

}
