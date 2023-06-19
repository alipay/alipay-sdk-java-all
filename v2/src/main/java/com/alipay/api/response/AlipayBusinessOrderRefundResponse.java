package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PaytoolRefundResultDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.order.refund response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 23:04:39
 */
public class AlipayBusinessOrderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 6519596895995293781L;

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

	/** 
	 * 订单累计退款金额。单位为元，精确到小数点后两位
	 */
	@ApiField("order_refund_amount")
	private String orderRefundAmount;

	/** 
	 * 本次退款支付工具明细列表
	 */
	@ApiListField("refund_paytool_list")
	@ApiField("paytool_refund_result_detail")
	private List<PaytoolRefundResultDetail> refundPaytoolList;

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

	public void setOrderRefundAmount(String orderRefundAmount) {
		this.orderRefundAmount = orderRefundAmount;
	}
	public String getOrderRefundAmount( ) {
		return this.orderRefundAmount;
	}

	public void setRefundPaytoolList(List<PaytoolRefundResultDetail> refundPaytoolList) {
		this.refundPaytoolList = refundPaytoolList;
	}
	public List<PaytoolRefundResultDetail> getRefundPaytoolList( ) {
		return this.refundPaytoolList;
	}

}
