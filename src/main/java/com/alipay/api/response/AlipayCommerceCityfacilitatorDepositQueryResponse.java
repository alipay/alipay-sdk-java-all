package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RechargeBill;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.deposit.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCommerceCityfacilitatorDepositQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2826872659533528236L;

	/** 
	 * 待圈存明细
	 */
	@ApiListField("recharge_bills")
	@ApiField("recharge_bill")
	private List<RechargeBill> rechargeBills;

	public void setRechargeBills(List<RechargeBill> rechargeBills) {
		this.rechargeBills = rechargeBills;
	}
	public List<RechargeBill> getRechargeBills( ) {
		return this.rechargeBills;
	}

}
