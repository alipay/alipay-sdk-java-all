package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-09-08 17:12:39
 */
public class RentRiskInfoVO extends AlipayObject {

	private static final long serialVersionUID = 8289124841154132828L;

	/**
	 * null
	 */
	@ApiListField("risk_item_list")
	@ApiField("risk_item_v_o")
	private List<RiskItemVO> riskItemList;

	/**
	 * 风险类型
	 */
	@ApiField("risk_type")
	private String riskType;

	public List<RiskItemVO> getRiskItemList() {
		return this.riskItemList;
	}
	public void setRiskItemList(List<RiskItemVO> riskItemList) {
		this.riskItemList = riskItemList;
	}

	public String getRiskType() {
		return this.riskType;
	}
	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}

}
