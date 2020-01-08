package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风险评分infocode
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class RiskRankInfoCode extends AlipayObject {

	private static final long serialVersionUID = 4867937581729519815L;

	/**
	 * infocode
	 */
	@ApiField("code")
	private String code;

	/**
	 * 此infocode在总的得分中的贡献度
	 */
	@ApiField("contribution_degree")
	private Long contributionDegree;

	/**
	 * 风险描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 模型名称
	 */
	@ApiField("model_name")
	private String modelName;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public Long getContributionDegree() {
		return this.contributionDegree;
	}
	public void setContributionDegree(Long contributionDegree) {
		this.contributionDegree = contributionDegree;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getModelName() {
		return this.modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

}
