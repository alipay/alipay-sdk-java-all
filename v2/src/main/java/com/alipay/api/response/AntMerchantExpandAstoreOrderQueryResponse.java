package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.astore.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-27 18:07:41
 */
public class AntMerchantExpandAstoreOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2317788272926386943L;

	/** 
	 * 店铺id
	 */
	@ApiField("a_store_id")
	private String aStoreId;

	/** 
	 * 驳回原因
	 */
	@ApiField("memo")
	private String memo;

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
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setaStoreId(String aStoreId) {
		this.aStoreId = aStoreId;
	}
	public String getaStoreId( ) {
		return this.aStoreId;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
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

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
