package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建一体化业务开通单
 *
 * @author auto create
 * @since 1.0, 2026-01-04 14:12:37
 */
public class AlipayOpenSpInteopOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1342249235168168699L;

	/**
	 * 商户支付宝账号。如果作业子项中包含代商户入驻，则不传递此参数
	 */
	@ApiField("account")
	private String account;

	/**
	 * 服务市场订单号
	 */
	@ApiField("service_market_order_no")
	private String serviceMarketOrderNo;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getServiceMarketOrderNo() {
		return this.serviceMarketOrderNo;
	}
	public void setServiceMarketOrderNo(String serviceMarketOrderNo) {
		this.serviceMarketOrderNo = serviceMarketOrderNo;
	}

}
