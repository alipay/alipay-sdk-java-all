package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RefundQueryResult;
import com.alipay.api.domain.SignQueryResult;
import com.alipay.api.domain.TransferQueryResult;
import com.alipay.api.domain.UnbindQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.creditphone.routehub.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-21 17:02:51
 */
public class AlipayCommerceAcommunicationCreditphoneRoutehubQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7352488397479385723L;

	/** 
	 * 支付宝订单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/** 
	 * 运营商侧订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 查询类型
	 */
	@ApiField("query_type")
	private String queryType;

	/** 
	 * 退款查询明细
	 */
	@ApiField("refund_query_result")
	private RefundQueryResult refundQueryResult;

	/** 
	 * 签约绑定查询明细
	 */
	@ApiField("sign_query_result")
	private SignQueryResult signQueryResult;

	/** 
	 * 代扣查询明细
	 */
	@ApiField("transfer_query_result")
	private TransferQueryResult transferQueryResult;

	/** 
	 * 解约查询明细
	 */
	@ApiField("unbind_query_result")
	private UnbindQueryResult unbindQueryResult;

	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}
	public String getAlipayOrderNo( ) {
		return this.alipayOrderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}
	public String getQueryType( ) {
		return this.queryType;
	}

	public void setRefundQueryResult(RefundQueryResult refundQueryResult) {
		this.refundQueryResult = refundQueryResult;
	}
	public RefundQueryResult getRefundQueryResult( ) {
		return this.refundQueryResult;
	}

	public void setSignQueryResult(SignQueryResult signQueryResult) {
		this.signQueryResult = signQueryResult;
	}
	public SignQueryResult getSignQueryResult( ) {
		return this.signQueryResult;
	}

	public void setTransferQueryResult(TransferQueryResult transferQueryResult) {
		this.transferQueryResult = transferQueryResult;
	}
	public TransferQueryResult getTransferQueryResult( ) {
		return this.transferQueryResult;
	}

	public void setUnbindQueryResult(UnbindQueryResult unbindQueryResult) {
		this.unbindQueryResult = unbindQueryResult;
	}
	public UnbindQueryResult getUnbindQueryResult( ) {
		return this.unbindQueryResult;
	}

}
