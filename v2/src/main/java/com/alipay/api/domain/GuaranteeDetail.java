package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保障明细
 *
 * @author auto create
 * @since 1.0, 2024-04-08 13:36:11
 */
public class GuaranteeDetail extends AlipayObject {

	private static final long serialVersionUID = 5747597728166445632L;

	/**
	 * 是否对用户全额免除赔偿，不全额免除的话传false
	 */
	@ApiField("all_free")
	private Boolean allFree;

	/**
	 * 限额，单位分。在车损保障中，就是用户自付的限额（XX元内自付）；在三者保障、乘客保障中，就是保障的限额；在折旧费、停运费保障中，就是免收的限额（XX元内免收）；
	 */
	@ApiField("limit_amount")
	private Long limitAmount;

	public Boolean getAllFree() {
		return this.allFree;
	}
	public void setAllFree(Boolean allFree) {
		this.allFree = allFree;
	}

	public Long getLimitAmount() {
		return this.limitAmount;
	}
	public void setLimitAmount(Long limitAmount) {
		this.limitAmount = limitAmount;
	}

}
