package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InteOpSubOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.inteop.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-13 16:40:09
 */
public class AlipayOpenSpInteopOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5668645443676643144L;

	/** 
	 * 一体化作业主单号
	 */
	@ApiField("inteop_order_no")
	private String inteopOrderNo;

	/** 
	 * 审核中
	 */
	@ApiField("inteop_order_status")
	private String inteopOrderStatus;

	/** 
	 * 一体化作业子项信息
	 */
	@ApiListField("inteop_sub_order_infos")
	@ApiField("inte_op_sub_order_info")
	private List<InteOpSubOrderInfo> inteopSubOrderInfos;

	public void setInteopOrderNo(String inteopOrderNo) {
		this.inteopOrderNo = inteopOrderNo;
	}
	public String getInteopOrderNo( ) {
		return this.inteopOrderNo;
	}

	public void setInteopOrderStatus(String inteopOrderStatus) {
		this.inteopOrderStatus = inteopOrderStatus;
	}
	public String getInteopOrderStatus( ) {
		return this.inteopOrderStatus;
	}

	public void setInteopSubOrderInfos(List<InteOpSubOrderInfo> inteopSubOrderInfos) {
		this.inteopSubOrderInfos = inteopSubOrderInfos;
	}
	public List<InteOpSubOrderInfo> getInteopSubOrderInfos( ) {
		return this.inteopSubOrderInfos;
	}

}
