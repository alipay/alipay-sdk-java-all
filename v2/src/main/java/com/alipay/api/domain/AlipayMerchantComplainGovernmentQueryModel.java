package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询单条线下交易投诉详情
 *
 * @author auto create
 * @since 1.0, 2023-12-19 10:07:18
 */
public class AlipayMerchantComplainGovernmentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7419237763164359124L;

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
