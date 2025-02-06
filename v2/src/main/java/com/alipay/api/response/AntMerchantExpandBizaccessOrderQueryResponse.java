package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IsvBizOpenOrderFailReason;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.bizaccess.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-18 17:02:21
 */
public class AntMerchantExpandBizaccessOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4278653611131746625L;

	/** 
	 * 失败原因
	 */
	@ApiListField("fail_reasons")
	@ApiField("isv_biz_open_order_fail_reason")
	private List<IsvBizOpenOrderFailReason> failReasons;

	/** 
	 * 业务开通主单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 用于表示申请单的状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 待办url
	 */
	@ApiField("wait_process_task_url")
	private String waitProcessTaskUrl;

	public void setFailReasons(List<IsvBizOpenOrderFailReason> failReasons) {
		this.failReasons = failReasons;
	}
	public List<IsvBizOpenOrderFailReason> getFailReasons( ) {
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

	public void setWaitProcessTaskUrl(String waitProcessTaskUrl) {
		this.waitProcessTaskUrl = waitProcessTaskUrl;
	}
	public String getWaitProcessTaskUrl( ) {
		return this.waitProcessTaskUrl;
	}

}
