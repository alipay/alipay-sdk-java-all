package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 贷记信息
 *
 * @author auto create
 * @since 1.0, 2018-05-18 22:32:29
 */
public class CardCreditInfo extends AlipayObject {

	private static final long serialVersionUID = 2278234987591295821L;

	/**
	 * 是否允许超扣
	 */
	@ApiField("allowoverpay")
	private String allowoverpay;

	/**
	 * 超扣额度
	 */
	@ApiField("creditquota")
	private String creditquota;

	public String getAllowoverpay() {
		return this.allowoverpay;
	}
	public void setAllowoverpay(String allowoverpay) {
		this.allowoverpay = allowoverpay;
	}

	public String getCreditquota() {
		return this.creditquota;
	}
	public void setCreditquota(String creditquota) {
		this.creditquota = creditquota;
	}

}
