package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * APE通用物品模型
 *
 * @author auto create
 * @since 1.0, 2022-10-12 19:11:14
 */
public class ApeGenericItem extends AlipayObject {

	private static final long serialVersionUID = 5229347141246744565L;

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
	 * 物品类型
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
