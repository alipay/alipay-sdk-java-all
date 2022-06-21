package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MarketingInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:10:12
 */
public class AlipayBusinessOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8223549325978846131L;

	/** 
	 * 订单创建确认营销信息。订单有营销信息时返回该参数。注：promotion_list包含商户券信息与平台营销信息如阿里红包等；use_mode与入参selected_marketing中的use_mode值相同
	 */
	@ApiField("confirmed_marketing")
	private MarketingInfo confirmedMarketing;

	/** 
	 * 商户外部订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/** 
	 * 支付宝订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setConfirmedMarketing(MarketingInfo confirmedMarketing) {
		this.confirmedMarketing = confirmedMarketing;
	}
	public MarketingInfo getConfirmedMarketing( ) {
		return this.confirmedMarketing;
	}

	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}
	public String getMerchantOrderNo( ) {
		return this.merchantOrderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
