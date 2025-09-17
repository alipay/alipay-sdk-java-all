package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VehiclePromoResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.charger.vehiclepromo.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-24 12:57:34
 */
public class AlipayCommerceTransportChargerVehiclepromoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8519415976465439773L;

	/** 
	 * 获取签名后的业务数据
	 */
	@ApiField("orderStr")
	private String orderStr;

	/** 
	 * null
	 */
	@ApiListField("promos")
	@ApiField("vehicle_promo_result")
	private List<VehiclePromoResult> promos;

	public void setOrderStr(String orderStr) {
		this.orderStr = orderStr;
	}
	public String getOrderStr( ) {
		return this.orderStr;
	}

	public void setPromos(List<VehiclePromoResult> promos) {
		this.promos = promos;
	}
	public List<VehiclePromoResult> getPromos( ) {
		return this.promos;
	}

}
