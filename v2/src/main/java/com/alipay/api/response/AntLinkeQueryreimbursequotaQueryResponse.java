package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.linke.queryreimbursequota.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-22 13:27:45
 */
public class AntLinkeQueryreimbursequotaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7719445429188771424L;

	/** 
	 * 额度
	 */
	@ApiField("quota_usd")
	private String quotaUsd;

	/** 
	 * null
	 */
	@ApiListField("subscription_list")
	@ApiField("string")
	private List<String> subscriptionList;

	/** 
	 * 年月
	 */
	@ApiField("year_month")
	private String yearMonth;

	public void setQuotaUsd(String quotaUsd) {
		this.quotaUsd = quotaUsd;
	}
	public String getQuotaUsd( ) {
		return this.quotaUsd;
	}

	public void setSubscriptionList(List<String> subscriptionList) {
		this.subscriptionList = subscriptionList;
	}
	public List<String> getSubscriptionList( ) {
		return this.subscriptionList;
	}

	public void setYearMonth(String yearMonth) {
		this.yearMonth = yearMonth;
	}
	public String getYearMonth( ) {
		return this.yearMonth;
	}

}
