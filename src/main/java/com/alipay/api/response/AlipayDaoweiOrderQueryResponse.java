package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OrderLogisticsInfo;
import com.alipay.api.domain.ServiceOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.daowei.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayDaoweiOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3455651219554492962L;

	/** 
	 * 到位业务定义的订单买家id，全局唯一，商户可以根据该ID唯一确定买家的信息
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/** 
	 * 订单创建时间，用户点击预约下单操作的时间，格式为yyyy-MM-dd HH:mm:ss（到秒）下单时间因早于服务预约时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/** 
	 * 订单修改时间，格式为yyyy-MM-dd HH:mm:ss(到秒，创建订单时，修改时间与创建时间相同)
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/** 
	 * 订单最后支付时间，格式：yyyy-MM-dd HH:mm:ss（到秒）
	 */
	@ApiField("gmt_payment")
	private String gmtPayment;

	/** 
	 * 订单最后退款时间，格式：yyyy-MM-dd HH:mm:ss，订单产生退款时的最后操作时间
	 */
	@ApiField("gmt_refund")
	private String gmtRefund;

	/** 
	 * 物流信息，用户下订单填写的物流信息，包括服务地址的经纬度、联系人和手机号码以及扩展信息
	 */
	@ApiField("logistics_info")
	private OrderLogisticsInfo logisticsInfo;

	/** 
	 * 备注信息，消费者下单时填写的订单备注信息，长度不超过2000字符
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 到位业务订单号。用户在到位下单时，由到位系统生成的32位全局唯一数字 id。
通过应用中的应用网关post发送给商户（应用网关配置参考链接：https%3A%2F%2Fdoc.open.alipay.com%2Fdocs%2Fdoc.htm%3Fspm%3Da219a.7629140.0.0.TcIuKL%26treeId%3D193%26articleId%3D105310%26docType%3D1）。
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 到位订单状态枚举值，用于描述订单的业务状态，到位系统定义的枚举值（枚举：WAIT_CONFIRM：待接单；WAIT_ASSIGN_SP：待确认服务者；WAIT_SERVICE：待服务；SERVICE_START：服务者开始服务；CONFIRMED_SERVICE：服务者确认服务完成；SERVICE_COMPLETE：消费者确认服务完成；ORDER_FINISHED：订单正常结束；ORDER_CLOSE：订单中途关闭；
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 用户下订单后已付款金额，不小于0的数，单位为元，单个订单金额小于10w。
	 */
	@ApiField("payment_amount")
	private String paymentAmount;

	/** 
	 * 用户下单产生的订单实际金额，不小于0的数，单位为元，单个订单金额小于10w。
	 */
	@ApiField("real_amount")
	private String realAmount;

	/** 
	 * 订单已退款的金额，单位为元，若订单存在退款，则金额大于0，且小于等于实际支付的金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 服务订单列表：包含订单所对应的服务，服务可能包含不止一个，每个服务对应自身的单价、总价、退款价格等
	 */
	@ApiListField("service_order_list")
	@ApiField("service_order_info")
	private List<ServiceOrderInfo> serviceOrderList;

	/** 
	 * 用户下单产生的订单总金额，不小于0的数，单位为元，单个订单金额小于10w
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	public String getBuyerUserId( ) {
		return this.buyerUserId;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}
	public String getGmtModified( ) {
		return this.gmtModified;
	}

	public void setGmtPayment(String gmtPayment) {
		this.gmtPayment = gmtPayment;
	}
	public String getGmtPayment( ) {
		return this.gmtPayment;
	}

	public void setGmtRefund(String gmtRefund) {
		this.gmtRefund = gmtRefund;
	}
	public String getGmtRefund( ) {
		return this.gmtRefund;
	}

	public void setLogisticsInfo(OrderLogisticsInfo logisticsInfo) {
		this.logisticsInfo = logisticsInfo;
	}
	public OrderLogisticsInfo getLogisticsInfo( ) {
		return this.logisticsInfo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getPaymentAmount( ) {
		return this.paymentAmount;
	}

	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}
	public String getRealAmount( ) {
		return this.realAmount;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setServiceOrderList(List<ServiceOrderInfo> serviceOrderList) {
		this.serviceOrderList = serviceOrderList;
	}
	public List<ServiceOrderInfo> getServiceOrderList( ) {
		return this.serviceOrderList;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

}
