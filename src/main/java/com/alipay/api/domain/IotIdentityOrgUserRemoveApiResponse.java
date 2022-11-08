package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构人员出库响应
 *
 * @author auto create
 * @since 1.0, 2022-01-22 14:15:32
 */
public class IotIdentityOrgUserRemoveApiResponse extends AlipayObject {

	private static final long serialVersionUID = 2786695144274949655L;

	/**
	 * 入库事件id，后续isv通过该id来查询处理进度
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
