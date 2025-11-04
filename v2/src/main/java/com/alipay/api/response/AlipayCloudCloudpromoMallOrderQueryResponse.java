package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MpcOrderLineResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.mall.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-26 10:49:44
 */
public class AlipayCloudCloudpromoMallOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6898245636281811522L;

	/** 
	 * 创建时间
	 */
	@ApiField("create_date")
	private String createDate;

	/** 
	 * 物流状态
	 */
	@ApiField("logistics_status")
	private String logisticsStatus;

	/** 
	 * 订单金额（分）
	 */
	@ApiField("order_amount")
	private Long orderAmount;

	/** 
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 子订单集合
	 */
	@ApiListField("order_line_list")
	@ApiField("mpc_order_line_result")
	private List<MpcOrderLineResult> orderLineList;

	/** 
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getCreateDate( ) {
		return this.createDate;
	}

	public void setLogisticsStatus(String logisticsStatus) {
		this.logisticsStatus = logisticsStatus;
	}
	public String getLogisticsStatus( ) {
		return this.logisticsStatus;
	}

	public void setOrderAmount(Long orderAmount) {
		this.orderAmount = orderAmount;
	}
	public Long getOrderAmount( ) {
		return this.orderAmount;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOrderLineList(List<MpcOrderLineResult> orderLineList) {
		this.orderLineList = orderLineList;
	}
	public List<MpcOrderLineResult> getOrderLineList( ) {
		return this.orderLineList;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

}
