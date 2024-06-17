package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IndrISVAmountInfoDTO;
import com.alipay.api.domain.IndrISVPaymentInfoDTO;
import com.alipay.api.domain.IndrISVResult;
import com.alipay.api.domain.IndrISVOrderStatusDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.open.indrpreorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-21 19:02:03
 */
public class AlipayOverseasOpenIndrpreorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6117988182184755555L;

	/** 
	 * 付款金额
	 */
	@ApiField("payment_amount")
	private IndrISVAmountInfoDTO paymentAmount;

	/** 
	 * 缴费信息
	 */
	@ApiField("payment_info")
	private IndrISVPaymentInfoDTO paymentInfo;

	/** 
	 * 预下单订单号
	 */
	@ApiField("pre_order_id")
	private String preOrderId;

	/** 
	 * 退款金额
	 */
	@ApiField("refund_amount")
	private IndrISVAmountInfoDTO refundAmount;

	/** 
	 * 查询结果
	 */
	@ApiField("result")
	private IndrISVResult result;

	/** 
	 * 场景类型
	 */
	@ApiField("scene_type")
	private String sceneType;

	/** 
	 * 单据状态
	 */
	@ApiField("status")
	private IndrISVOrderStatusDTO status;

	public void setPaymentAmount(IndrISVAmountInfoDTO paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public IndrISVAmountInfoDTO getPaymentAmount( ) {
		return this.paymentAmount;
	}

	public void setPaymentInfo(IndrISVPaymentInfoDTO paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
	public IndrISVPaymentInfoDTO getPaymentInfo( ) {
		return this.paymentInfo;
	}

	public void setPreOrderId(String preOrderId) {
		this.preOrderId = preOrderId;
	}
	public String getPreOrderId( ) {
		return this.preOrderId;
	}

	public void setRefundAmount(IndrISVAmountInfoDTO refundAmount) {
		this.refundAmount = refundAmount;
	}
	public IndrISVAmountInfoDTO getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setResult(IndrISVResult result) {
		this.result = result;
	}
	public IndrISVResult getResult( ) {
		return this.result;
	}

	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}
	public String getSceneType( ) {
		return this.sceneType;
	}

	public void setStatus(IndrISVOrderStatusDTO status) {
		this.status = status;
	}
	public IndrISVOrderStatusDTO getStatus( ) {
		return this.status;
	}

}
