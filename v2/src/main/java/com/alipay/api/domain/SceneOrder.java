package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商圈场景订单模型
 *
 * @author auto create
 * @since 1.0, 2019-01-23 09:29:35
 */
public class SceneOrder extends AlipayObject {

	private static final long serialVersionUID = 7556722374444729562L;

	/**
	 * 买家支付宝用户ID
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/**
	 * 优惠说明，以json格式字符串返回。
	 */
	@ApiListField("discount_detail")
	@ApiField("mall_discount_detail")
	private List<MallDiscountDetail> discountDetail;

	/**
	 * 商圈场景订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单类型：OFFLINE_PURCHASE：线下购买
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 商户订单号,64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 订单实付金额
	 */
	@ApiField("real_amount")
	private String realAmount;

	/**
	 * 业务场景码，分类：SCAN_PURCHASE（扫码购场景）
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 卖家支付宝用户ID
	 */
	@ApiField("seller_user_id")
	private String sellerUserId;

	/**
	 * 订单状态：INIT：初始化，WAIT_PAY：待支付，PAID：已经支付，CLOSE：关闭
	 */
	@ApiField("status")
	private String status;

	/**
	 * 订单描述
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 订单总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易成功时间
	 */
	@ApiField("trade_success_time")
	private Date tradeSuccessTime;

	/**
	 * 交易下单时间
	 */
	@ApiField("trade_time")
	private Date tradeTime;

	public String getBuyerUserId() {
		return this.buyerUserId;
	}
	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}

	public List<MallDiscountDetail> getDiscountDetail() {
		return this.discountDetail;
	}
	public void setDiscountDetail(List<MallDiscountDetail> discountDetail) {
		this.discountDetail = discountDetail;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getRealAmount() {
		return this.realAmount;
	}
	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSellerUserId() {
		return this.sellerUserId;
	}
	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public Date getTradeSuccessTime() {
		return this.tradeSuccessTime;
	}
	public void setTradeSuccessTime(Date tradeSuccessTime) {
		this.tradeSuccessTime = tradeSuccessTime;
	}

	public Date getTradeTime() {
		return this.tradeTime;
	}
	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}

}
