package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlarmHistory;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.monitor.alarmhistory.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-06 18:17:01
 */
public class AlipayCloudCloudbaseMonitorAlarmhistoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5568738464358246312L;

	/** 
	 * 告警历史信息
	 */
	@ApiListField("alarm_histories")
	@ApiField("alarm_history")
	private List<AlarmHistory> alarmHistories;

	public void setAlarmHistories(List<AlarmHistory> alarmHistories) {
		this.alarmHistories = alarmHistories;
	}
	public List<AlarmHistory> getAlarmHistories( ) {
		return this.alarmHistories;
	}

}
