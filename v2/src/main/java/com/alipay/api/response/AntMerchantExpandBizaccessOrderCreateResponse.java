package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IsvBizOpenOrderFailReason;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.bizaccess.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-11 11:32:29
 */
public class AntMerchantExpandBizaccessOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2464429496556548138L;

	/** 
	 * 失败原因
	 */
	@ApiListField("fail_reasons")
	@ApiField("isv_biz_open_order_fail_reason")
	private List<IsvBizOpenOrderFailReason> failReasons;

	/** 
	 * 商户PID
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/** 
	 * 业务开通主单号
	 */
	@ApiField("order_id")
	private String orderId;

	public void setFailReasons(List<IsvBizOpenOrderFailReason> failReasons) {
		this.failReasons = failReasons;
	}
	public List<IsvBizOpenOrderFailReason> getFailReasons( ) {
		return this.failReasons;
	}

	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}
	public String getMerchantPid( ) {
		return this.merchantPid;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
