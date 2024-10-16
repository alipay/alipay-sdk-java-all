package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单详情
 *
 * @author auto create
 * @since 1.0, 2024-07-08 16:00:56
 */
public class MpcOrderResult extends AlipayObject {

	private static final long serialVersionUID = 1677351783586368327L;

	/**
	 * 创建时间
	 */
	@ApiField("create_date")
	private Date createDate;

	/**
	 * 物流状态
	 */
	@ApiField("logistics_status")
	private String logisticsStatus;

	/**
	 * 子订单数量
	 */
	@ApiField("order_amount")
	private Long orderAmount;

	/**
	 * 订单编号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 子订单详情
	 */
	@ApiListField("order_line_list")
	@ApiField("mpc_order_line_result")
	private List<MpcOrderLineResult> orderLineList;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	public Date getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getLogisticsStatus() {
		return this.logisticsStatus;
	}
	public void setLogisticsStatus(String logisticsStatus) {
		this.logisticsStatus = logisticsStatus;
	}

	public Long getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(Long orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public List<MpcOrderLineResult> getOrderLineList() {
		return this.orderLineList;
	}
	public void setOrderLineList(List<MpcOrderLineResult> orderLineList) {
		this.orderLineList = orderLineList;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

}
