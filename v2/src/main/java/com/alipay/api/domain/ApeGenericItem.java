package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * APE通用物品模型
 *
 * @author auto create
 * @since 1.0, 2023-06-26 20:10:54
 */
public class ApeGenericItem extends AlipayObject {

	private static final long serialVersionUID = 4269895517356448755L;

	/**
	 * 物品的属性值，根据物品类型在APE接入文档中获取对应的物品属性定义。
	 */
	@ApiField("attribute")
	private String attribute;

	/**
	 * 物品的唯一id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 数据类型，请从枚举值中选一个最适合自己数据类型传，如果不传，则会默认GOODS
	 */
	@ApiField("row_type")
	private String rowType;

	/**
	 * 状态，1为有效、0为无效
	 */
	@ApiField("status")
	private Long status;

	public String getAttribute() {
		return this.attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getRowType() {
		return this.rowType;
	}
	public void setRowType(String rowType) {
		this.rowType = rowType;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

}
