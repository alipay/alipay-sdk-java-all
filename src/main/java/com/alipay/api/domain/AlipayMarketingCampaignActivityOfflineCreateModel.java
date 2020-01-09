package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 能够创商户建领券活动,后续支持
 *
 * @author auto create
 * @since 1.0, 2016-05-09 17:09:27
 */
public class AlipayMarketingCampaignActivityOfflineCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8696118253996291579L;

	/**
	 * 预算信息
	 */
	@ApiField("budget")
	private OpenPromoBudget budget;

	/**
	 * 活动信息
	 */
	@ApiField("camp")
	private OpenPromoCamp camp;

	/**
	 * 活动创建单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 奖品信息
	 */
	@ApiField("prize")
	private OpenPromoPrize prize;

	public OpenPromoBudget getBudget() {
		return this.budget;
	}
	public void setBudget(OpenPromoBudget budget) {
		this.budget = budget;
	}

	public OpenPromoCamp getCamp() {
		return this.camp;
	}
	public void setCamp(OpenPromoCamp camp) {
		this.camp = camp;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public OpenPromoPrize getPrize() {
		return this.prize;
	}
	public void setPrize(OpenPromoPrize prize) {
		this.prize = prize;
	}

}
