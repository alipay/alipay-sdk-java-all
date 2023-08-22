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
 * @since 1.0, 2023-08-22 20:21:41
 */
public class AlipayCloudCloudbaseResourceusageMonthlyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2138256211593782586L;

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
