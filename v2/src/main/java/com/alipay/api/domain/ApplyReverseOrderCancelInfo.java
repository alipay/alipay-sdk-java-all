package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 逆向入库ARO单撤销消息体
 *
 * @author auto create
 * @since 1.0, 2025-04-21 10:29:16
 */
public class ApplyReverseOrderCancelInfo extends AlipayObject {

	private static final long serialVersionUID = 5695278765937368122L;

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
