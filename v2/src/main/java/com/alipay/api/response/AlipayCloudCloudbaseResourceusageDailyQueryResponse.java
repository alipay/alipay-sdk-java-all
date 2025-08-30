package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DailyUsage;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourceusage.daily.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:40:37
 */
public class AlipayCloudCloudbaseResourceusageDailyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6419891586164611368L;

	/** 
	 * 各计费项用量列表
	 */
	@ApiListField("daily_usages")
	@ApiField("daily_usage")
	private List<DailyUsage> dailyUsages;

	public void setDailyUsages(List<DailyUsage> dailyUsages) {
		this.dailyUsages = dailyUsages;
	}
	public List<DailyUsage> getDailyUsages( ) {
		return this.dailyUsages;
	}

}
