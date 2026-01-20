package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询单条线下交易投诉详情
 *
 * @author auto create
 * @since 1.0, 2025-10-24 10:35:52
 */
public class AlipayMerchantComplainGovernmentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6577116538284855114L;

	/**
	 * 支付宝侧投诉工单号
	 */
	@ApiField("complain_event_id")
	private String complainEventId;

	public String getComplainEventId() {
		return this.complainEventId;
	}
	public void setComplainEventId(String complainEventId) {
		this.complainEventId = complainEventId;
	}

}
