package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MerchantSceneRoleFailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.scene.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-17 20:27:29
 */
public class AntMerchantExpandSceneOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4633696541212567985L;

	/** 
	 * 错误原因
	 */
	@ApiField("fail_reasons")
	private MerchantSceneRoleFailInfo failReasons;

	/** 
	 * 申请单id
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 申请单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 商户号
	 */
	@ApiField("partner_id")
	private String partnerId;

	public void setFailReasons(MerchantSceneRoleFailInfo failReasons) {
		this.failReasons = failReasons;
	}
	public MerchantSceneRoleFailInfo getFailReasons( ) {
		return this.failReasons;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId( ) {
		return this.partnerId;
	}

}
