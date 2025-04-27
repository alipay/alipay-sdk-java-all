package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 退改签政策
 *
 * @author auto create
 * @since 1.0, 2024-09-30 01:14:32
 */
public class Policy extends AlipayObject {

	private static final long serialVersionUID = 4493213467979745885L;

	/**
	 * 如果是多航段打包规则，传入一个：-1
	 */
	@ApiField("airline_no")
	private String airlineNo;

	/**
	 * 退订/改签政策列表
	 */
	@ApiListField("policies")
	@ApiField("policy_detail")
	private List<PolicyDetail> policies;

	/**
	 * 三个大类：
● 1：不可退票（无论何时都是100%手续费）
● 2：免费退票（无论何时都是0%手续费）
● 3：有条件退票（根据时间划分不同的收费阶梯）
	 */
	@ApiField("type")
	private String type;

	public String getAirlineNo() {
		return this.airlineNo;
	}
	public void setAirlineNo(String airlineNo) {
		this.airlineNo = airlineNo;
	}

	public List<PolicyDetail> getPolicies() {
		return this.policies;
	}
	public void setPolicies(List<PolicyDetail> policies) {
		this.policies = policies;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
