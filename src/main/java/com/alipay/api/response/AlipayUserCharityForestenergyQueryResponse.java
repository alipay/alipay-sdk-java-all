package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserEnergyBillResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.charity.forestenergy.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayUserCharityForestenergyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5574917148987472933L;

	/** 
	 * 用户能量账单集合
	 */
	@ApiListField("user_energy_bill_result_list")
	@ApiField("user_energy_bill_result")
	private List<UserEnergyBillResult> userEnergyBillResultList;

	public void setUserEnergyBillResultList(List<UserEnergyBillResult> userEnergyBillResultList) {
		this.userEnergyBillResultList = userEnergyBillResultList;
	}
	public List<UserEnergyBillResult> getUserEnergyBillResultList( ) {
		return this.userEnergyBillResultList;
	}

}
