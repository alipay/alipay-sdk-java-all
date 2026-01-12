package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.mall.order.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-26 10:49:44
 */
public class AlipayCloudCloudpromoMallOrderConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4879921629127223318L;

	/** 
	 * 订单号列表
	 */
	@ApiListField("order_id_list")
	@ApiField("string")
	private List<String> orderIdList;

	/** 
	 * 采购单状态
	 */
	@ApiField("status")
	private String status;

	public void setOrderIdList(List<String> orderIdList) {
		this.orderIdList = orderIdList;
	}
	public List<String> getOrderIdList( ) {
		return this.orderIdList;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
