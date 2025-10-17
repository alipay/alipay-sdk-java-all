package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 驳回原因
 *
 * @author auto create
 * @since 1.0, 2024-05-10 16:53:52
 */
public class CardRejectReasonInfo extends AlipayObject {

	private static final long serialVersionUID = 5134775568538772197L;

	/**
	 * 驳回项
	 */
	@ApiField("reject_item")
	private String rejectItem;

	/**
	 * 驳回原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	public String getRejectItem() {
		return this.rejectItem;
	}
	public void setRejectItem(String rejectItem) {
		this.rejectItem = rejectItem;
	}

	public String getRejectReason() {
		return this.rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

}
