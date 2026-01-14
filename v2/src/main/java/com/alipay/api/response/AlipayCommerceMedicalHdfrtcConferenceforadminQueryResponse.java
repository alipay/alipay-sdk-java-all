package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EventLogInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdfrtc.conferenceforadmin.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-19 15:33:18
 */
public class AlipayCommerceMedicalHdfrtcConferenceforadminQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3274391181946552964L;

	/** 
	 * null
	 */
	@ApiListField("event_log_info_list")
	@ApiField("event_log_info")
	private List<EventLogInfo> eventLogInfoList;

	public void setEventLogInfoList(List<EventLogInfo> eventLogInfoList) {
		this.eventLogInfoList = eventLogInfoList;
	}
	public List<EventLogInfo> getEventLogInfoList( ) {
		return this.eventLogInfoList;
	}

}
