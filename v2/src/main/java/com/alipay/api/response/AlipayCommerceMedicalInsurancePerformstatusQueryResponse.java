package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EquityServiceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.performstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-14 13:52:36
 */
public class AlipayCommerceMedicalInsurancePerformstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1599583885577586797L;

	/** 
	 * 权益服务明细列表
	 */
	@ApiListField("service_list")
	@ApiField("equity_service_info")
	private List<EquityServiceInfo> serviceList;

	/** 
	 * 权益使用状态
	 */
	@ApiField("status")
	private String status;

	public void setServiceList(List<EquityServiceInfo> serviceList) {
		this.serviceList = serviceList;
	}
	public List<EquityServiceInfo> getServiceList( ) {
		return this.serviceList;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
