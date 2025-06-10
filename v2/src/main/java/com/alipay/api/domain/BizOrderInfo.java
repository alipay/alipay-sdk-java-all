package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务订单信息
 *
 * @author auto create
 * @since 1.0, 2023-09-08 10:32:51
 */
public class BizOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 1635192663176938378L;

	/**
	 * 订单金额，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 订单扩展参数
	 */
	@ApiField("ext_params")
	private BizExtInfo extParams;

	/**
	 * 商户id
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 卖家id
	 */
	@ApiField("seller_id")
	private String sellerId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public BizExtInfo getExtParams() {
		return this.extParams;
	}
	public void setExtParams(BizExtInfo extParams) {
		this.extParams = extParams;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

}
