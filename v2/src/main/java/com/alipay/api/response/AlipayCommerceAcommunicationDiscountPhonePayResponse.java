package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ToBDiscountCustomerServiceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.discount.phone.pay response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-01 16:37:39
 */
public class AlipayCommerceAcommunicationDiscountPhonePayResponse extends AlipayResponse {

	private static final long serialVersionUID = 4763216526987856424L;

	/** 
	 * 支付宝业务订单号
	 */
	@ApiField("alipay_biz_no")
	private String alipayBizNo;

	/** 
	 * 支付宝交易单号
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/** 
	 * 客服信息
	 */
	@ApiField("customer_service_info")
	private ToBDiscountCustomerServiceInfo customerServiceInfo;

	public void setAlipayBizNo(String alipayBizNo) {
		this.alipayBizNo = alipayBizNo;
	}
	public String getAlipayBizNo( ) {
		return this.alipayBizNo;
	}

	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}
	public String getAlipayTradeNo( ) {
		return this.alipayTradeNo;
	}

	public void setCustomerServiceInfo(ToBDiscountCustomerServiceInfo customerServiceInfo) {
		this.customerServiceInfo = customerServiceInfo;
	}
	public ToBDiscountCustomerServiceInfo getCustomerServiceInfo( ) {
		return this.customerServiceInfo;
	}

}
