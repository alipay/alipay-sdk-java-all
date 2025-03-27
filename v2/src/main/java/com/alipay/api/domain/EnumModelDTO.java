package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-03-19 14:12:26
 */
public class EnumModelDTO extends AlipayObject {

	private static final long serialVersionUID = 2196278247584532999L;

	/**
	 * 单个值，非固定枚举值
	 */
	@ApiField("enum_code")
	private String enumCode;

	/**
	 * 一类枚举的值，非小范围枚举类型，无法用枚举全列举出来
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 枚举描述
	 */
	@ApiField("item_desc")
	private String itemDesc;

	/**
	 * 枚举名称
	 */
	@ApiField("item_name")
	private String itemName;

	public String getEnumCode() {
		return this.enumCode;
	}
	public void setEnumCode(String enumCode) {
		this.enumCode = enumCode;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemDesc() {
		return this.itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
