package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 淘客任务模板激励规则
 *
 * @author auto create
 * @since 1.0, 2023-06-16 14:38:51
 */
public class RealAmountRatioIncentiveRule extends AlipayObject {

	private static final long serialVersionUID = 8782863278842966161L;

	/**
	 * 允许发放激励的交易最小金额限制，单位元
	 */
	@ApiField("amount_min")
	private String amountMin;

	/**
	 * 淘客任务默认的分佣比率
	 */
	@ApiField("default_ratio")
	private String defaultRatio;

	/**
	 * 淘客任务最大激励金额，单位元
	 */
	@ApiField("max_amount")
	private String maxAmount;

	/**
	 * 淘客任务最大的激励笔数
	 */
	@ApiField("max_count")
	private Long maxCount;

	/**
	 * 淘客任务明星用户集合
	 */
	@ApiListField("star_uid_list")
	@ApiField("star_uid_amount_ratio_d_t_o")
	private List<StarUidAmountRatioDTO> starUidList;

	public String getAmountMin() {
		return this.amountMin;
	}
	public void setAmountMin(String amountMin) {
		this.amountMin = amountMin;
	}

	public String getDefaultRatio() {
		return this.defaultRatio;
	}
	public void setDefaultRatio(String defaultRatio) {
		this.defaultRatio = defaultRatio;
	}

	public String getMaxAmount() {
		return this.maxAmount;
	}
	public void setMaxAmount(String maxAmount) {
		this.maxAmount = maxAmount;
	}

	public Long getMaxCount() {
		return this.maxCount;
	}
	public void setMaxCount(Long maxCount) {
		this.maxCount = maxCount;
	}

	public List<StarUidAmountRatioDTO> getStarUidList() {
		return this.starUidList;
	}
	public void setStarUidList(List<StarUidAmountRatioDTO> starUidList) {
		this.starUidList = starUidList;
	}

}
