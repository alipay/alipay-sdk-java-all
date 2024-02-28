package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 淘客任务模板激励规则
 *
 * @author auto create
 * @since 1.0, 2023-12-12 16:12:07
 */
public class RealAmountRatioIncentiveRule extends AlipayObject {

	private static final long serialVersionUID = 4586367172534958617L;

	/**
	 * 允许发放激励的交易最小金额限制，单位元
	 */
	@ApiField("amount_min")
	private String amountMin;

	/**
	 * 淘客任务默认的分佣比率，格式:xx%
	 */
	@ApiField("default_ratio")
	private String defaultRatio;

	/**
	 * 用来表明服务商可获得的交易激励比例，格式:xx%
	 */
	@ApiField("isv_ratio")
	private String isvRatio;

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
	 * 用来指定激励的方式，预充值/货款分账，不传默认为PRERECHARGE预充值模式
	 */
	@ApiField("reward_channel")
	private String rewardChannel;

	/**
	 * 淘客任务明星用户集合
	 */
	@ApiListField("star_uid_list")
	@ApiField("star_uid_amount_ratio_d_t_o")
	private List<StarUidAmountRatioDTO> starUidList;

	/**
	 * 用来指定有效交易的appId，若此值不填 ，则使用跳转链接applet_id 中的appId作为交易有效appId
	 */
	@ApiField("trade_app_id")
	private String tradeAppId;

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

	public String getIsvRatio() {
		return this.isvRatio;
	}
	public void setIsvRatio(String isvRatio) {
		this.isvRatio = isvRatio;
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

	public String getRewardChannel() {
		return this.rewardChannel;
	}
	public void setRewardChannel(String rewardChannel) {
		this.rewardChannel = rewardChannel;
	}

	public List<StarUidAmountRatioDTO> getStarUidList() {
		return this.starUidList;
	}
	public void setStarUidList(List<StarUidAmountRatioDTO> starUidList) {
		this.starUidList = starUidList;
	}

	public String getTradeAppId() {
		return this.tradeAppId;
	}
	public void setTradeAppId(String tradeAppId) {
		this.tradeAppId = tradeAppId;
	}

}
