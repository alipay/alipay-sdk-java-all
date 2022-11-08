package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金信息列表用于消费资金处理
 *
 * @author auto create
 * @since 1.0, 2018-05-18 22:32:29
 */
public class CardFundInfo extends AlipayObject {

	private static final long serialVersionUID = 5211597159829524212L;

	/**
	 * 消费资金账户
	 */
	@ApiField("fundaccount")
	private String fundaccount;

	/**
	 * 消费资金类型
	 */
	@ApiField("fundtype")
	private String fundtype;

	public String getFundaccount() {
		return this.fundaccount;
	}
	public void setFundaccount(String fundaccount) {
		this.fundaccount = fundaccount;
	}

	public String getFundtype() {
		return this.fundtype;
	}
	public void setFundtype(String fundtype) {
		this.fundtype = fundtype;
	}

}
