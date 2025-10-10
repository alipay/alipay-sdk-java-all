package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RentExtInfo;
import com.alipay.api.domain.RentInfo;
import com.alipay.api.domain.RentRiskInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.order.invest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-16 20:27:40
 */
public class AlipayCommerceRentOrderInvestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1271461174377389876L;

	/** 
	 * 租赁扩展信息
	 */
	@ApiField("rent_ext_info")
	private RentExtInfo rentExtInfo;

	/** 
	 * 租赁订单详情，包括业务订单详情、分期计划、分账计划、租赁订单信息
	 */
	@ApiField("rent_info")
	private RentInfo rentInfo;

	/** 
	 * 租赁风控信息
	 */
	@ApiListField("rent_risk_info")
	@ApiField("rent_risk_info")
	private List<RentRiskInfo> rentRiskInfo;

	public void setRentExtInfo(RentExtInfo rentExtInfo) {
		this.rentExtInfo = rentExtInfo;
	}
	public RentExtInfo getRentExtInfo( ) {
		return this.rentExtInfo;
	}

	public void setRentInfo(RentInfo rentInfo) {
		this.rentInfo = rentInfo;
	}
	public RentInfo getRentInfo( ) {
		return this.rentInfo;
	}

	public void setRentRiskInfo(List<RentRiskInfo> rentRiskInfo) {
		this.rentRiskInfo = rentRiskInfo;
	}
	public List<RentRiskInfo> getRentRiskInfo( ) {
		return this.rentRiskInfo;
	}

}
