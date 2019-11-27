package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.UserInfoAndBenefitQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.benefitinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayUserBenefitinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3154818294444592747L;

	/** 
	 * 用户信息和权益配置全量信息查询结果，包括用户等级、积分余额以及当前应用和入参的benefit_ids对应的权益配置的积分和等级折扣积分列表
	 */
	@ApiField("user_info_and_benefit_query_result")
	private UserInfoAndBenefitQueryResult userInfoAndBenefitQueryResult;

	public void setUserInfoAndBenefitQueryResult(UserInfoAndBenefitQueryResult userInfoAndBenefitQueryResult) {
		this.userInfoAndBenefitQueryResult = userInfoAndBenefitQueryResult;
	}
	public UserInfoAndBenefitQueryResult getUserInfoAndBenefitQueryResult( ) {
		return this.userInfoAndBenefitQueryResult;
	}

}
