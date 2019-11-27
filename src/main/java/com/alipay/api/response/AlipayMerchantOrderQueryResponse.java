package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PaymentOrderOpenData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-29 18:29:46
 */
public class AlipayMerchantOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1779232698999425435L;

	/** 
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 买家ID
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/** 
	 * 订单扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 支付宝订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 外部业务类型；TO_SHOP(到店)、GAS(加油)
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/** 
	 * 合作伙伴ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 支付单列表
	 */
	@ApiListField("payment_orders")
	@ApiField("payment_order_open_data")
	private List<PaymentOrderOpenData> paymentOrders;

	/** 
	 * 卖家ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	/** 
	 * 订单状态；INIT(初始化)、WAIT_PAY(待支付)、PAID(已支付)、TIMEOUT_CLOSED(超时关闭)、SUCCESS_FINISHED(订单成功完结)、REFUNDED(已退款)
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 业务类型
	 */
	@ApiField("type")
	private String type;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getBuyerId( ) {
		return this.buyerId;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}
	public String getOutBizType( ) {
		return this.outBizType;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId( ) {
		return this.partnerId;
	}

	public void setPaymentOrders(List<PaymentOrderOpenData> paymentOrders) {
		this.paymentOrders = paymentOrders;
	}
	public List<PaymentOrderOpenData> getPaymentOrders( ) {
		return this.paymentOrders;
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

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

}
