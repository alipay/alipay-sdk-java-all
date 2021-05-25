package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PosDiscountDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.pay.disburse response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiCateringOrderPayDisburseResponse extends AlipayResponse {

	private static final long serialVersionUID = 1864267687628651792L;

	/** 
	 * 优惠明细列表
	 */
	@ApiListField("discount_details")
	@ApiField("pos_discount_detail")
	private List<PosDiscountDetail> discountDetails;

	/** 
	 * 外部支付订单号,唯一标识本次支付的requestID
	 */
	@ApiField("out_pay_no")
	private String outPayNo;

	/** 
	 * 买家实付金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 口碑内部支付订单号，和外部支付订单号一一映射
	 */
	@ApiField("pay_no")
	private String payNo;

	/** 
	 * 买家交易支付成功时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/** 
	 * 商家实收金额
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/** 
	 * PROCESS-支付中，PAY-已支付。
如果是支付中状态，需要做支付结果轮询
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 订单付款金额，以元为单位，精确到分
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 买家支付宝账号
	 */
	@ApiField("user_id")
	private String userId;

	public void setDiscountDetails(List<PosDiscountDetail> discountDetails) {
		this.discountDetails = discountDetails;
	}
	public List<PosDiscountDetail> getDiscountDetails( ) {
		return this.discountDetails;
	}

	public void setOutPayNo(String outPayNo) {
		this.outPayNo = outPayNo;
	}
	public String getOutPayNo( ) {
		return this.outPayNo;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayAmount( ) {
		return this.payAmount;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	public String getPayNo( ) {
		return this.payNo;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public Date getPayTime( ) {
		return this.payTime;
	}

	public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}
	public String getReceiptAmount( ) {
		return this.receiptAmount;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
