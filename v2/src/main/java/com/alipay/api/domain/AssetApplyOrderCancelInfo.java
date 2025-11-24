package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 该数据结构用于记录维保工单出库单以及出库指令之间的关联关系
 *
 * @author auto create
 * @since 1.0, 2025-10-11 14:40:49
 */
public class AssetApplyOrderCancelInfo extends AlipayObject {

	private static final long serialVersionUID = 4653882499269957492L;

	/**
	 * AO单号
	 */
	@ApiField("apply_order_id")
	private String applyOrderId;

	/**
	 * 配送指令列表
	 */
	@ApiListField("assign_item_ids")
	@ApiField("string")
	private List<String> assignItemIds;

	public String getApplyOrderId() {
		return this.applyOrderId;
	}
	public void setApplyOrderId(String applyOrderId) {
		this.applyOrderId = applyOrderId;
	}

	public List<String> getAssignItemIds() {
		return this.assignItemIds;
	}
	public void setAssignItemIds(List<String> assignItemIds) {
		this.assignItemIds = assignItemIds;
	}

}
