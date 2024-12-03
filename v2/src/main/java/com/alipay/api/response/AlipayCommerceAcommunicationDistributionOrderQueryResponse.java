package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BizOrderMessage;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.distribution.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-13 16:17:19
 */
public class AlipayCommerceAcommunicationDistributionOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6734751118784642648L;

	/** 
	 * 支付宝订单号
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/** 
	 * 该订单已产生的业务消息
	 */
	@ApiListField("biz_order_message_list")
	@ApiField("biz_order_message")
	private List<BizOrderMessage> bizOrderMessageList;

	/** 
	 * 机构订单号
	 */
	@ApiField("inst_order_id")
	private String instOrderId;

	/** 
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 订单成功
	 */
	@ApiField("order_status_code")
	private String orderStatusCode;

	/** 
	 * 订单状态详情描述
	 */
	@ApiField("order_status_desc")
	private String orderStatusDesc;

	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}
	public String getAlipayOrderId( ) {
		return this.alipayOrderId;
	}

	public void setBizOrderMessageList(List<BizOrderMessage> bizOrderMessageList) {
		this.bizOrderMessageList = bizOrderMessageList;
	}
	public List<BizOrderMessage> getBizOrderMessageList( ) {
		return this.bizOrderMessageList;
	}

	public void setInstOrderId(String instOrderId) {
		this.instOrderId = instOrderId;
	}
	public String getInstOrderId( ) {
		return this.instOrderId;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOrderStatusCode(String orderStatusCode) {
		this.orderStatusCode = orderStatusCode;
	}
	public String getOrderStatusCode( ) {
		return this.orderStatusCode;
	}

	public void setOrderStatusDesc(String orderStatusDesc) {
		this.orderStatusDesc = orderStatusDesc;
	}
	public String getOrderStatusDesc( ) {
		return this.orderStatusDesc;
	}

}
