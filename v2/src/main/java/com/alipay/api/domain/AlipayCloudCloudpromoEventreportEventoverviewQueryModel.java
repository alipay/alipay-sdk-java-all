package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自助分析自定义事件报表事件概览
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:49:48
 */
public class AlipayCloudCloudpromoEventreportEventoverviewQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4823954448163712534L;

	/**
	 * 自定义事件报表的查询请求参数
	 */
	@ApiField("event_request")
	private OpenApiEventReportCommRequest eventRequest;

	public OpenApiEventReportCommRequest getEventRequest() {
		return this.eventRequest;
	}
	public void setEventRequest(OpenApiEventReportCommRequest eventRequest) {
		this.eventRequest = eventRequest;
	}

}
