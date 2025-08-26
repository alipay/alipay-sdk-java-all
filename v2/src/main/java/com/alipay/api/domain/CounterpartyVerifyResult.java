package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 交易对手核验结果对象集
 *
 * @author auto create
 * @since 1.0, 2025-06-16 10:09:16
 */
public class CounterpartyVerifyResult extends AlipayObject {

	private static final long serialVersionUID = 7573173658684831825L;

	/**
	 * 存在转账关系的企业列表
	 */
	@ApiListField("ent_list")
	@ApiField("counterparty_info")
	private List<CounterpartyInfo> entList;

	/**
	 * 近6个月是否与风险池存在转账关系
	 */
	@ApiField("is_match_risk_list")
	private String isMatchRiskList;

	public List<CounterpartyInfo> getEntList() {
		return this.entList;
	}
	public void setEntList(List<CounterpartyInfo> entList) {
		this.entList = entList;
	}

	public String getIsMatchRiskList() {
		return this.isMatchRiskList;
	}
	public void setIsMatchRiskList(String isMatchRiskList) {
		this.isMatchRiskList = isMatchRiskList;
	}

}
