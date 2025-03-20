package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IotCareWorkOrder;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.terminal.edgecloud.workorder.changemachine.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-24 10:05:37
 */
public class AlipayTerminalEdgecloudWorkorderChangemachineQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4851546651773291812L;

	/** 
	 * 维保换机工单列表，包含维保换机工单信息
	 */
	@ApiListField("work_order_list")
	@ApiField("iot_care_work_order")
	private List<IotCareWorkOrder> workOrderList;

	public void setWorkOrderList(List<IotCareWorkOrder> workOrderList) {
		this.workOrderList = workOrderList;
	}
	public List<IotCareWorkOrder> getWorkOrderList( ) {
		return this.workOrderList;
	}

}
