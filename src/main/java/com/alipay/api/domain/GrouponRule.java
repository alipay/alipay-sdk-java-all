package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 拼团规则
 *
 * @author auto create
 * @since 1.0, 2020-09-28 15:34:56
 */
public class GrouponRule extends AlipayObject {

	private static final long serialVersionUID = 2142464659318462645L;

	/**
	 * 拼团成团人数
	 */
	@ApiField("group_size")
	private String groupSize;

	/**
	 * 拼团价格，单位元
	 */
	@ApiField("groupon_price")
	private String grouponPrice;

	public String getGroupSize() {
		return this.groupSize;
	}
	public void setGroupSize(String groupSize) {
		this.groupSize = groupSize;
	}

	public String getGrouponPrice() {
		return this.grouponPrice;
	}
	public void setGrouponPrice(String grouponPrice) {
		this.grouponPrice = grouponPrice;
	}

}
