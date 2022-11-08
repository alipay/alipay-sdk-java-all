package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot核身聚合平台的机构人员出库事件的查询接口
 *
 * @author auto create
 * @since 1.0, 2022-01-27 14:36:29
 */
public class AlipayOpenIotvspOrguserfaceoutQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5398538313738514941L;

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
