package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot核身聚合平台的机构人员出库事件的查询接口
 *
 * @author auto create
 * @since 1.0, 2023-09-18 14:08:41
 */
public class AlipayOpenIotvspOrguserfaceoutQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6793571998273152778L;

	/**
	 * 出库事件id
	 */
	@ApiField("event_id")
	private String eventId;

	public String getEventId() {
		return this.eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

}
