package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自助分析自定义事件报表事件详情
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:49:52
 */
public class AlipayCloudCloudpromoEventreportEventdetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4589928546145561977L;

	/**
	 * 生意参谋(增长分析)-自助分析的自定义报表模块请求参数
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
