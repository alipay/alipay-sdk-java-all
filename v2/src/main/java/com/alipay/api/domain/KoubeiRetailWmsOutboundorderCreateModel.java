package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建出库通知单
 *
 * @author auto create
 * @since 1.0, 2018-06-01 17:19:09
 */
public class KoubeiRetailWmsOutboundorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4548561735766837399L;

	/**
	 * 操作人信息
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 出库通知单货品明细列表
	 */
	@ApiListField("order_lines")
	@ApiField("outbound_order_line")
	private List<OutboundOrderLine> orderLines;

	/**
	 * 出库通知单主体
	 */
	@ApiField("outbound_order")
	private OutboundOrder outboundOrder;

	public OperateContext getOperateContext() {
		return this.operateContext;
	}
	public void setOperateContext(OperateContext operateContext) {
		this.operateContext = operateContext;
	}

	public List<OutboundOrderLine> getOrderLines() {
		return this.orderLines;
	}
	public void setOrderLines(List<OutboundOrderLine> orderLines) {
		this.orderLines = orderLines;
	}

	public OutboundOrder getOutboundOrder() {
		return this.outboundOrder;
	}
	public void setOutboundOrder(OutboundOrder outboundOrder) {
		this.outboundOrder = outboundOrder;
	}

}
