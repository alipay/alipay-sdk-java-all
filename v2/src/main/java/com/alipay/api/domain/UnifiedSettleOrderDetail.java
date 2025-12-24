package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收结易单据明细
 *
 * @author auto create
 * @since 1.0, 2025-09-18 10:25:11
 */
public class UnifiedSettleOrderDetail extends AlipayObject {

	private static final long serialVersionUID = 6387442928139232266L;

	/**
	 * 订单同步金额，biz_type=PAY_SYNC时为支付金额，biz_type=REFUND_SYNC时为退款金额。以元为单位，人民币。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 用于标识收结易的业务模式，不传为默认模式
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 实际外部支付渠道支付或退款发生时间
	 */
	@ApiField("external_inst_biz_date")
	private Date externalInstBizDate;

	/**
	 * 实际外部支付渠道交易创建时间
	 */
	@ApiField("external_inst_create_date")
	private Date externalInstCreateDate;

	/**
	 * 收结易在支付宝侧实际创建的时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 表示机构打款单号，一个 inst_order_id 对应用户的一次打款。对应同步接口传入的 inst_order_id。
	 */
	@ApiField("inst_order_id")
	private String instOrderId;

	/**
	 * 收结易的单号，一般与外部商户订单号一一对应，可能对应多个流水请求号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单同步受理时生成的单号，一般与外部商户流水号一一对应，标识唯一一次订单同步请求
	 */
	@ApiField("order_sync_id")
	private String orderSyncId;

	/**
	 * 请求流水号。由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端单笔交易维度不重复。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户订单号。 由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 同步流水的类型，支付为PAY_SYNC，退款为REFUND_SYNC
	 */
	@ApiField("request_type")
	private String requestType;

	/**
	 * 收结易同步订单执行状态
	 */
	@ApiField("status")
	private String status;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public Date getExternalInstBizDate() {
		return this.externalInstBizDate;
	}
	public void setExternalInstBizDate(Date externalInstBizDate) {
		this.externalInstBizDate = externalInstBizDate;
	}

	public Date getExternalInstCreateDate() {
		return this.externalInstCreateDate;
	}
	public void setExternalInstCreateDate(Date externalInstCreateDate) {
		this.externalInstCreateDate = externalInstCreateDate;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getInstOrderId() {
		return this.instOrderId;
	}
	public void setInstOrderId(String instOrderId) {
		this.instOrderId = instOrderId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderSyncId() {
		return this.orderSyncId;
	}
	public void setOrderSyncId(String orderSyncId) {
		this.orderSyncId = orderSyncId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getRequestType() {
		return this.requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
