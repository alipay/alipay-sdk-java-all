package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单商品信息补充
 *
 * @author auto create
 * @since 1.0, 2025-01-16 14:28:37
 */
public class AlipayCommerceMedicalOrderItemModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3345824518443478211L;

	/**
	 * 订单编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 商品追溯码信息
	 */
	@ApiListField("trace_code_infos")
	@ApiField("trace_code_info")
	private List<TraceCodeInfo> traceCodeInfos;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public List<TraceCodeInfo> getTraceCodeInfos() {
		return this.traceCodeInfos;
	}
	public void setTraceCodeInfos(List<TraceCodeInfo> traceCodeInfos) {
		this.traceCodeInfos = traceCodeInfos;
	}

}
