package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品销售规则(数据)
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class AlipayDataItemSalesRule extends AlipayObject {

	private static final long serialVersionUID = 2269853679565337324L;

	/**
	 * 购买人群限制集合，开放平台暂时不支持此字段，如果需要使用，需要评估
	 */
	@ApiField("buyer_crowd_limit")
	private String buyerCrowdLimit;

	/**
	 * 商品单日销售上限
	 */
	@ApiField("daily_sales_limit")
	private Long dailySalesLimit;

	/**
	 * 用户购买策略如不填，则默认值为一个用户一天可以领取三次。
可限制DAY、WEEK、MONTH中n天领取m次，格式为DAY|n|m；
同时也可限制券的1次生命周期中可被领取x次，如ALL|1|x，两个规则可组合使用
	 */
	@ApiListField("user_sales_limit")
	@ApiField("string")
	private List<String> userSalesLimit;

	public String getBuyerCrowdLimit() {
		return this.buyerCrowdLimit;
	}
	public void setBuyerCrowdLimit(String buyerCrowdLimit) {
		this.buyerCrowdLimit = buyerCrowdLimit;
	}

	public Long getDailySalesLimit() {
		return this.dailySalesLimit;
	}
	public void setDailySalesLimit(Long dailySalesLimit) {
		this.dailySalesLimit = dailySalesLimit;
	}

	public List<String> getUserSalesLimit() {
		return this.userSalesLimit;
	}
	public void setUserSalesLimit(List<String> userSalesLimit) {
		this.userSalesLimit = userSalesLimit;
	}

}
