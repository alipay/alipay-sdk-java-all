package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MpcLogisticsOrderResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.mall.logistics.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-04 20:17:03
 */
public class AlipayCloudCloudpromoMallLogisticsBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6381558339137614718L;

	/** 
	 * 物流信息列表
	 */
	@ApiListField("mpc_logistics")
	@ApiField("mpc_logistics_order_result")
	private List<MpcLogisticsOrderResult> mpcLogistics;

	public void setMpcLogistics(List<MpcLogisticsOrderResult> mpcLogistics) {
		this.mpcLogistics = mpcLogistics;
	}
	public List<MpcLogisticsOrderResult> getMpcLogistics( ) {
		return this.mpcLogistics;
	}

}
