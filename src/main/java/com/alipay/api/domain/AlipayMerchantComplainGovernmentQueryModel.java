package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询单条线下交易投诉详情
 *
 * @author auto create
 * @since 1.0, 2021-06-10 12:53:29
 */
public class AlipayMerchantComplainGovernmentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1837135649381986495L;

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
