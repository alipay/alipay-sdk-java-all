package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.Member;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.creditpay.trade.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:07
 */
public class MybankCreditSupplychainCreditpayTradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7869614824283375157L;

	/** 
	 * 买方信息
	 */
	@ApiField("buyer")
	private Member buyer;

	/** 
	 * 1688买家ID
	 */
	@ApiField("buyer_scene_id")
	private String buyerSceneId;

	/** 
	 * 确认收货金额
	 */
	@ApiField("confirm_amt")
	private String confirmAmt;

	/** 
	 * 创建日期
	 */
	@ApiField("create_date")
	private String createDate;

	/** 
	 * 生效日期
	 */
	@ApiField("effect_date")
	private String effectDate;

	/** 
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 退款金额，单位：分
	 */
	@ApiField("refund_amt")
	private String refundAmt;

	/** 
	 * 卖方信息
	 */
	@ApiField("seller")
	private Member seller;

	/** 
	 * 1688卖家ID
	 */
	@ApiField("seller_scene_id")
	private String sellerSceneId;

	/** 
	 * 源订单ID，1688订单ID
	 */
	@ApiField("source_order_no")
	private String sourceOrderNo;

	/** 
	 * 订单状态：VALID/INVALID/INIT/CANCEL
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 网商日志追踪ID
	 */
	@ApiField("trace_id")
	private String traceId;

	/** 
	 * 订单金额，单位：分
	 */
	@ApiField("trade_amt")
	private String tradeAmt;

	/** 
	 * 内部订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setBuyer(Member buyer) {
		this.buyer = buyer;
	}
	public Member getBuyer( ) {
		return this.buyer;
	}

	public void setBuyerSceneId(String buyerSceneId) {
		this.buyerSceneId = buyerSceneId;
	}
	public String getBuyerSceneId( ) {
		return this.buyerSceneId;
	}

	public void setConfirmAmt(String confirmAmt) {
		this.confirmAmt = confirmAmt;
	}
	public String getConfirmAmt( ) {
		return this.confirmAmt;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getCreateDate( ) {
		return this.createDate;
	}

	public void setEffectDate(String effectDate) {
		this.effectDate = effectDate;
	}
	public String getEffectDate( ) {
		return this.effectDate;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setRefundAmt(String refundAmt) {
		this.refundAmt = refundAmt;
	}
	public String getRefundAmt( ) {
		return this.refundAmt;
	}

	public void setSeller(Member seller) {
		this.seller = seller;
	}
	public Member getSeller( ) {
		return this.seller;
	}

	public void setSellerSceneId(String sellerSceneId) {
		this.sellerSceneId = sellerSceneId;
	}
	public String getSellerSceneId( ) {
		return this.sellerSceneId;
	}

	public void setSourceOrderNo(String sourceOrderNo) {
		this.sourceOrderNo = sourceOrderNo;
	}
	public String getSourceOrderNo( ) {
		return this.sourceOrderNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

	public void setTradeAmt(String tradeAmt) {
		this.tradeAmt = tradeAmt;
	}
	public String getTradeAmt( ) {
		return this.tradeAmt;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
