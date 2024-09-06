package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlarmRule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.monitor.alarmrule.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-05 17:37:03
 */
public class AlipayCloudCloudbaseMonitorAlarmruleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8887957262931338773L;

	/** 
	 * 告警规则列表
	 */
	@ApiListField("alarm_rules")
	@ApiField("alarm_rule")
	private List<AlarmRule> alarmRules;

	/** 
	 * 页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	public void setAlarmRules(List<AlarmRule> alarmRules) {
		this.alarmRules = alarmRules;
	}
	public List<AlarmRule> getAlarmRules( ) {
		return this.alarmRules;
	}

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Long getPageIndex( ) {
		return this.pageIndex;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
