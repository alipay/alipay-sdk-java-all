package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OrderServicePackageVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.servicepackage.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-11 10:02:54
 */
public class AlipayCommerceMedicalServicepackageOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8442349595414841845L;

	/** 
	 * null
	 */
	@ApiListField("order_service_package_vo_list")
	@ApiField("order_service_package_v_o")
	private List<OrderServicePackageVO> orderServicePackageVoList;

	public void setOrderServicePackageVoList(List<OrderServicePackageVO> orderServicePackageVoList) {
		this.orderServicePackageVoList = orderServicePackageVoList;
	}
	public List<OrderServicePackageVO> getOrderServicePackageVoList( ) {
		return this.orderServicePackageVoList;
	}

}
