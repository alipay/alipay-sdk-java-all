package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多方安全风控风险咨询结果，包含风险标签和风险等级
 *
 * @author auto create
 * @since 1.0, 2022-06-17 14:18:45
 */
public class GravityRiskResult extends AlipayObject {

	private static final long serialVersionUID = 8883641425995914979L;

	/**
	 * 参数名：risk_rank+是否唯一：无需唯一+应用场景：多方安全风控风险咨询风险类型的风险等级标签+枚举：无枚举+如何获取：多方安全风控通过对应数据产品介绍文档获取+特殊说明：无
	 */
	@ApiField("risk_rank")
	private String riskRank;

	/**
	 * 参数名：risk_tag+是否唯一：无需唯一+应用场景：多方安全风控风险咨询结果中用于表示返回的风险标签名称+枚举：无枚举+如何获取：多方安全风控通过对应数据产品介绍文档获取+特殊说明：无
	 */
	@ApiField("risk_tag")
	private String riskTag;

	public String getRiskRank() {
		return this.riskRank;
	}
	public void setRiskRank(String riskRank) {
		this.riskRank = riskRank;
	}

	public String getRiskTag() {
		return this.riskTag;
	}
	public void setRiskTag(String riskTag) {
		this.riskTag = riskTag;
	}

}
