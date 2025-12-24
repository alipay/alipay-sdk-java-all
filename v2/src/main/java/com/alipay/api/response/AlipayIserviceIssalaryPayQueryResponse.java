package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserPayDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.issalary.pay.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-23 15:17:40
 */
public class AlipayIserviceIssalaryPayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4268473572135231115L;

	/** 
	 * 小二发薪结果列表
	 */
	@ApiListField("user_pay_details")
	@ApiField("user_pay_detail")
	private List<UserPayDetail> userPayDetails;

	public void setUserPayDetails(List<UserPayDetail> userPayDetails) {
		this.userPayDetails = userPayDetails;
	}
	public List<UserPayDetail> getUserPayDetails( ) {
		return this.userPayDetails;
	}

}
