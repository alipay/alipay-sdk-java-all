package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告系统分佣规则
 *
 * @author auto create
 * @since 1.0, 2017-01-17 10:33:12
 */
public class KbAdvertCommissionClauseResponse extends AlipayObject {

	private static final long serialVersionUID = 2689859883824143133L;

	/**
	 * 比例分佣规则
只有type=PERCENTAGE_CLAUSE才会有值
	 */
	@ApiField("percentage_clause")
	private KbAdvertCommissionClausePercentageResponse percentageClause;

	/**
	 * 定额分佣规则
只有type=QUOTA_CLAUSE才会有值
	 */
	@ApiField("quota_clause")
	private KbAdvertCommissionClauseQuotaResponse quotaClause;

	/**
	 * 分佣规则类型
PERCENTAGE_CLAUSE-比例
QUOTA_CLAUSE-定额
	 */
	@ApiField("type")
	private String type;

	public KbAdvertCommissionClausePercentageResponse getPercentageClause() {
		return this.percentageClause;
	}
	public void setPercentageClause(KbAdvertCommissionClausePercentageResponse percentageClause) {
		this.percentageClause = percentageClause;
	}

	public KbAdvertCommissionClauseQuotaResponse getQuotaClause() {
		return this.quotaClause;
	}
	public void setQuotaClause(KbAdvertCommissionClauseQuotaResponse quotaClause) {
		this.quotaClause = quotaClause;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
