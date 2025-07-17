package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 超级导购业绩排名数据
 *
 * @author auto create
 * @since 1.0, 2024-04-24 10:06:53
 */
public class YunTaskRankStatistic extends AlipayObject {

	private static final long serialVersionUID = 7715273568562813953L;

	/**
	 * 排名（数字越小，排名越前）
	 */
	@ApiField("biz_rank")
	private Long bizRank;

	/**
	 * 业务值
	 */
	@ApiField("biz_value")
	private Long bizValue;

	/**
	 * 主体Id
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 排名主体类型
	 */
	@ApiField("principal_type")
	private String principalType;

	public Long getBizRank() {
		return this.bizRank;
	}
	public void setBizRank(Long bizRank) {
		this.bizRank = bizRank;
	}

	public Long getBizValue() {
		return this.bizValue;
	}
	public void setBizValue(Long bizValue) {
		this.bizValue = bizValue;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getPrincipalType() {
		return this.principalType;
	}
	public void setPrincipalType(String principalType) {
		this.principalType = principalType;
	}

}
