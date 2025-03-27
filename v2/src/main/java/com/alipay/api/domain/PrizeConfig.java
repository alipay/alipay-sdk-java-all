package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 奖品配置
 *
 * @author auto create
 * @since 1.0, 2020-06-29 12:07:01
 */
public class PrizeConfig extends AlipayObject {

	private static final long serialVersionUID = 1755596784474359414L;

	/**
	 * 总预算,目前仅支持个数预算
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * COUNT 数量预算
AMOUNT 金额预算
	 */
	@ApiField("budget_type")
	private String budgetType;

	/**
	 * 计次配置
	 */
	@ApiListField("count_control_config")
	@ApiField("count_control_config")
	private List<CountControlConfig> countControlConfig;

	/**
	 * 扩展参数
	 */
	@ApiField("ext_properties")
	private String extProperties;

	/**
	 * 奖品开始时间
	 */
	@ApiField("gmt_begin")
	private Date gmtBegin;

	/**
	 * 奖品结束时间
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 域账号或者商家pid
	 */
	@ApiField("owner")
	private String owner;

	/**
	 * PLATFORM标识平台，MERCHANT标识商户
	 */
	@ApiField("platform_type")
	private String platformType;

	/**
	 * 奖品id
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 奖品名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 奖品定价配置，目前只支持定额奖品
	 */
	@ApiField("prize_price_strategy")
	private PrizePriceStrategy prizePriceStrategy;

	/**
	 * 奖品类型,每一种值对应一种奖品类型
	 */
	@ApiField("prize_type")
	private String prizeType;

	/**
	 * 剩余预算,目前仅支持个数预算
	 */
	@ApiField("remain_amount")
	private String remainAmount;

	/**
	 * PRIZE_CREATED("PRIZE_CREATED", "已创建状态") PRIZE_OPENED("PRIZE_OPENED", "开启状态") PRIZE_PAUSED("PRIZE_PAUSED", "暂停状态") PRIZE_CLOSED("PRIZE_CLOSED", "关闭状态")
	 */
	@ApiField("status")
	private String status;

	/**
	 * 使用有效期
	 */
	@ApiField("valid_period")
	private PrizeValidPeriod validPeriod;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBudgetType() {
		return this.budgetType;
	}
	public void setBudgetType(String budgetType) {
		this.budgetType = budgetType;
	}

	public List<CountControlConfig> getCountControlConfig() {
		return this.countControlConfig;
	}
	public void setCountControlConfig(List<CountControlConfig> countControlConfig) {
		this.countControlConfig = countControlConfig;
	}

	public String getExtProperties() {
		return this.extProperties;
	}
	public void setExtProperties(String extProperties) {
		this.extProperties = extProperties;
	}

	public Date getGmtBegin() {
		return this.gmtBegin;
	}
	public void setGmtBegin(Date gmtBegin) {
		this.gmtBegin = gmtBegin;
	}

	public Date getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPlatformType() {
		return this.platformType;
	}
	public void setPlatformType(String platformType) {
		this.platformType = platformType;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getPrizeName() {
		return this.prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public PrizePriceStrategy getPrizePriceStrategy() {
		return this.prizePriceStrategy;
	}
	public void setPrizePriceStrategy(PrizePriceStrategy prizePriceStrategy) {
		this.prizePriceStrategy = prizePriceStrategy;
	}

	public String getPrizeType() {
		return this.prizeType;
	}
	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

	public String getRemainAmount() {
		return this.remainAmount;
	}
	public void setRemainAmount(String remainAmount) {
		this.remainAmount = remainAmount;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public PrizeValidPeriod getValidPeriod() {
		return this.validPeriod;
	}
	public void setValidPeriod(PrizeValidPeriod validPeriod) {
		this.validPeriod = validPeriod;
	}

}
