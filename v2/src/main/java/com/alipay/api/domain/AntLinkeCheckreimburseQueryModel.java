package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询是否可报销
 *
 * @author auto create
 * @since 1.0, 2026-05-22 13:27:45
 */
public class AntLinkeCheckreimburseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4298691627395314127L;

	/**
	 * null
	 */
	@ApiListField("subscription_month_pair_list")
	@ApiField("subscription_month_pair")
	private List<SubscriptionMonthPair> subscriptionMonthPairList;

	/**
	 * 工号
	 */
	@ApiField("work_no")
	private String workNo;

	public List<SubscriptionMonthPair> getSubscriptionMonthPairList() {
		return this.subscriptionMonthPairList;
	}
	public void setSubscriptionMonthPairList(List<SubscriptionMonthPair> subscriptionMonthPairList) {
		this.subscriptionMonthPairList = subscriptionMonthPairList;
	}

	public String getWorkNo() {
		return this.workNo;
	}
	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}

}
