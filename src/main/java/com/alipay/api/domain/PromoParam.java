package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 描述优惠明细信息
 *
 * @author auto create
 * @since 1.0, 2018-09-29 11:24:21
 */
public class PromoParam extends AlipayObject {

	private static final long serialVersionUID = 5688274339729224835L;

	/**
	 * 存在延迟扣款这一类的场景，用这个时间表明用户发生交易的时间，比如说，在公交地铁场景，用户刷码出站的时间，和商户上送交易的时间是不一样的。
	 */
	@ApiField("actual_order_time")
	private String actualOrderTime;

	public String getActualOrderTime() {
		return this.actualOrderTime;
	}
	public void setActualOrderTime(String actualOrderTime) {
		this.actualOrderTime = actualOrderTime;
	}

}
