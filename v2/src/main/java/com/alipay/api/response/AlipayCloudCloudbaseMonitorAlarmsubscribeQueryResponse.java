package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlarmSubscribe;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.monitor.alarmsubscribe.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-08 10:16:20
 */
public class AlipayCloudCloudbaseMonitorAlarmsubscribeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8496337411419242447L;

	/** 
	 * 报警规则订阅集合
	 */
	@ApiListField("alarm_subscribes")
	@ApiField("alarm_subscribe")
	private List<AlarmSubscribe> alarmSubscribes;

	public void setAlarmSubscribes(List<AlarmSubscribe> alarmSubscribes) {
		this.alarmSubscribes = alarmSubscribes;
	}
	public List<AlarmSubscribe> getAlarmSubscribes( ) {
		return this.alarmSubscribes;
	}

}
