package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 逆向入库ARO单撤销消息体
 *
 * @author auto create
 * @since 1.0, 2025-04-30 17:55:53
 */
public class ApplyReverseOrderCancelInfo extends AlipayObject {

	private static final long serialVersionUID = 1458332176337671224L;

	/**
	 * 指令id列表
	 */
	@ApiListField("assign_item_id")
	@ApiField("string")
	private List<String> assignItemId;

	/**
	 * 逆向配送指令集合
	 */
	@ApiListField("assign_item_ids")
	@ApiField("string")
	private List<String> assignItemIds;

	/**
	 * 逆向入库单ARO单号
	 */
	@ApiField("reverse_apply_order_id")
	private String reverseApplyOrderId;

	public List<String> getAssignItemId() {
		return this.assignItemId;
	}
	public void setAssignItemId(List<String> assignItemId) {
		this.assignItemId = assignItemId;
	}

	public List<String> getAssignItemIds() {
		return this.assignItemIds;
	}
	public void setAssignItemIds(List<String> assignItemIds) {
		this.assignItemIds = assignItemIds;
	}

	public String getReverseApplyOrderId() {
		return this.reverseApplyOrderId;
	}
	public void setReverseApplyOrderId(String reverseApplyOrderId) {
		this.reverseApplyOrderId = reverseApplyOrderId;
	}

}
