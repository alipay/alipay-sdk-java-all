package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询单条交易投诉详情
 *
 * @author auto create
 * @since 1.0, 2024-06-17 14:04:16
 */
public class AlipayMerchantTradecomplainQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4826366739785813498L;

	/**
	 * 支付宝侧投诉单号
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
