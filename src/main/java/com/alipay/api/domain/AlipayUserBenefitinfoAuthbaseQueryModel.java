package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 会员信息和权益配置全量查询接口
 *
 * @author auto create
 * @since 1.0, 2016-08-12 10:50:33
 */
public class AlipayUserBenefitinfoAuthbaseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4362457722248552835L;

	/**
	 * JSON数组的格式表示当前商户需要查询的权益配置的ID列表
	 */
	@ApiListField("benefit_ids")
	@ApiField("string")
	private List<String> benefitIds;

	/**
	 * 用户的支付宝账户ID
	 */
	@ApiField("user_id")
	private String userId;

	public List<String> getBenefitIds() {
		return this.benefitIds;
	}
	public void setBenefitIds(List<String> benefitIds) {
		this.benefitIds = benefitIds;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
