package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子营销申领明细
 *
 * @author auto create
 * @since 1.0, 2024-05-30 16:06:18
 */
public class SubPromoInfoVO extends AlipayObject {

	private static final long serialVersionUID = 1767692938855769797L;

	/**
	 * 订单消耗的子代币数量
	 */
	@ApiField("cost_count")
	private String costCount;

	/**
	 * 订单消耗的子代币类型名称
	 */
	@ApiField("sub_type_name")
	private String subTypeName;

	public String getCostCount() {
		return this.costCount;
	}
	public void setCostCount(String costCount) {
		this.costCount = costCount;
	}

	public String getSubTypeName() {
		return this.subTypeName;
	}
	public void setSubTypeName(String subTypeName) {
		this.subTypeName = subTypeName;
	}

}
