package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ServiceFeeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.charge.bill.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-24 22:07:03
 */
public class AlipayCommerceEcChargeBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2414212784894476522L;

	/** 
	 * 服务费信息列表
	 */
	@ApiListField("service_fee_list")
	@ApiField("service_fee_info")
	private List<ServiceFeeInfo> serviceFeeList;

	public void setServiceFeeList(List<ServiceFeeInfo> serviceFeeList) {
		this.serviceFeeList = serviceFeeList;
	}
	public List<ServiceFeeInfo> getServiceFeeList( ) {
		return this.serviceFeeList;
	}

}
