package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询单条交易投诉详情
 *
 * @author auto create
 * @since 1.0, 2022-01-18 16:56:44
 */
public class AlipayMerchantTradecomplainQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4712742622571134474L;

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
