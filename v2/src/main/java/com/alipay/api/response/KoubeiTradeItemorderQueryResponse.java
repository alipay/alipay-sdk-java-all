package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemOrderVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.itemorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:36
 */
public class KoubeiTradeItemorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2524615631242977821L;

	/** 
	 * 业务产品
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/** 
	 * 买家支付宝账户
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/** 
	 * 卖家实收金额，单笔订单中给打款给卖家的金额
	 */
	@ApiField("deliver_seller_real_amount")
	private String deliverSellerRealAmount;

	/** 
	 * 优惠金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/** 
	 * 订单创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 订单修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/** 
	 * 支付成功时间
	 */
	@ApiField("gmt_payment")
	private Date gmtPayment;

	/** 
	 * 商品信息
	 */
	@ApiListField("item_order_vo")
	@ApiField("item_order_v_o")
	private List<ItemOrderVO> itemOrderVo;

	/** 
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 商户签约支付宝账号
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 用户实付金额
	 */
	@ApiField("real_pay_amount")
	private String realPayAmount;

	/** 
	 * 卖家id
	 */
	@ApiField("seller_id")
	private String sellerId;

	/** 
	 * 订单状态, INIT（初始状态）,WAIT_PAY (待支付)，PAID（已支付），SUCCESS（订单成功-已打款给商户），FINISH（订单完成-全额退款）
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 订单金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}
	public String getBizProduct( ) {
		return this.bizProduct;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getBuyerId( ) {
		return this.buyerId;
	}

	public void setDeliverSellerRealAmount(String deliverSellerRealAmount) {
		this.deliverSellerRealAmount = deliverSellerRealAmount;
	}
	public String getDeliverSellerRealAmount( ) {
		return this.deliverSellerRealAmount;
	}

	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
	public String getDiscountAmount( ) {
		return this.discountAmount;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	public Date getGmtModified( ) {
		return this.gmtModified;
	}

	public void setGmtPayment(Date gmtPayment) {
		this.gmtPayment = gmtPayment;
	}
	public Date getGmtPayment( ) {
		return this.gmtPayment;
	}

	public void setItemOrderVo(List<ItemOrderVO> itemOrderVo) {
		this.itemOrderVo = itemOrderVo;
	}
	public List<ItemOrderVO> getItemOrderVo( ) {
		return this.itemOrderVo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId( ) {
		return this.partnerId;
	}

	public void setRealPayAmount(String realPayAmount) {
		this.realPayAmount = realPayAmount;
	}
	public String getRealPayAmount( ) {
		return this.realPayAmount;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerId( ) {
		return this.sellerId;
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

}
