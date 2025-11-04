package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 天气预警同步
 *
 * @author auto create
 * @since 1.0, 2024-10-15 09:43:50
 */
public class AlipayEbppIndustryGovWeatheralarmSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6513164923587678115L;

	/**
	 * 天气预警详情信息
	 */
	@ApiListField("alarm_list")
	@ApiField("alarm_info")
	private List<AlarmInfo> alarmList;

	/**
	 * 来源平台编号，由支付宝政务分配
	 */
	@ApiField("source")
	private String source;

	public List<AlarmInfo> getAlarmList() {
		return this.alarmList;
	}
	public void setAlarmList(List<AlarmInfo> alarmList) {
		this.alarmList = alarmList;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
