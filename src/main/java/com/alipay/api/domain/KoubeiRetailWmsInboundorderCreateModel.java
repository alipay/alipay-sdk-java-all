package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建入库通知单
 *
 * @author auto create
 * @since 1.0, 2018-06-01 17:19:34
 */
public class KoubeiRetailWmsInboundorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5562944977112172241L;

	/**
	 * 入库通知单主体
	 */
	@ApiField("inbound_order")
	private InboundOrder inboundOrder;

	/**
	 * 操作人信息
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 入库通知单货品明细列表
	 */
	@ApiListField("order_lines")
	@ApiField("inbound_order_line")
	private List<InboundOrderLine> orderLines;

	public InboundOrder getInboundOrder() {
		return this.inboundOrder;
	}
	public void setInboundOrder(InboundOrder inboundOrder) {
		this.inboundOrder = inboundOrder;
	}

	public OperateContext getOperateContext() {
		return this.operateContext;
	}
	public void setOperateContext(OperateContext operateContext) {
		this.operateContext = operateContext;
	}

	public List<InboundOrderLine> getOrderLines() {
		return this.orderLines;
	}
	public void setOrderLines(List<InboundOrderLine> orderLines) {
		this.orderLines = orderLines;
	}

}
