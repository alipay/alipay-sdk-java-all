package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MonthlyUsage;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourceusage.monthly.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:40:36
 */
public class AlipayCloudCloudbaseResourceusageMonthlyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2335663518193131551L;

	/** 
	 * 各计费项用量列表
	 */
	@ApiListField("monthly_usages")
	@ApiField("monthly_usage")
	private List<MonthlyUsage> monthlyUsages;

	public void setMonthlyUsages(List<MonthlyUsage> monthlyUsages) {
		this.monthlyUsages = monthlyUsages;
	}
	public List<MonthlyUsage> getMonthlyUsages( ) {
		return this.monthlyUsages;
	}

}
