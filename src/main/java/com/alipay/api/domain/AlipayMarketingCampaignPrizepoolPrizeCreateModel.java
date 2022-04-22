package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建奖品池奖品
 *
 * @author auto create
 * @since 1.0, 2019-08-19 15:58:49
 */
public class AlipayMarketingCampaignPrizepoolPrizeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1561672342573255316L;

	/**
	 * 当预算类型是数量时，该值表示个数
当预算类型是金额时，该值表示金额，(分)为单位
	 */
	@ApiField("budget_amount")
	private String budgetAmount;

	/**
	 * COUNT 数量预算
MONEY 金额预算
	 */
	@ApiField("budget_type")
	private String budgetType;

	/**
	 * 计次配置，具体字段参考CountControlConfig
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
	 * 奖品发放开始时间
	 */
	@ApiField("gmt_begin")
	private Date gmtBegin;

	/**
	 * 奖品发放结束时间
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 单次发放系数，默认值1
	 */
	@ApiField("modulus")
	private Long modulus;

	/**
	 * 外部业务流水号，用来标识唯一的业务动作，用于，幂等
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 奖品owner，填写支付宝2088账号
	 */
	@ApiField("owner")
	private String owner;

	/**
	 * 奖品池id，使用前请联系业务对接同学提供
	 */
	@ApiField("pool_id")
	private String poolId;

	/**
	 * 奖品名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 奖品定价策略,具体见PrizePriceStategy字段
	 */
	@ApiField("prize_price_strategy")
	private PrizePriceStrategy prizePriceStrategy;

	/**
	 * 子奖品类型，在同一种奖品类型下具体系分不同子类型，具体值联系营销技术获取
	 */
	@ApiField("prize_sub_type")
	private String prizeSubType;

	/**
	 * 奖品类型，具体值联系营销技术提供，枚举类com.alipay.promokernel.common.service.facade.enums.PrizeTypeEnum
	 */
	@ApiField("prize_type")
	private String prizeType;

	/**
	 * 表示业务来源，由营销技术提供具体值
	 */
	@ApiField("source")
	private String source;

	/**
	 * 奖品模板参数，外部奖品的券模板之类的配置信息，用于创建奖品
	 */
	@ApiField("template_id")
	private String templateId;

	public String getBudgetAmount() {
		return this.budgetAmount;
	}
	public void setBudgetAmount(String budgetAmount) {
		this.budgetAmount = budgetAmount;
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

	public Long getModulus() {
		return this.modulus;
	}
	public void setModulus(Long modulus) {
		this.modulus = modulus;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPoolId() {
		return this.poolId;
	}
	public void setPoolId(String poolId) {
		this.poolId = poolId;
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

	public String getPrizeSubType() {
		return this.prizeSubType;
	}
	public void setPrizeSubType(String prizeSubType) {
		this.prizeSubType = prizeSubType;
	}

	public String getPrizeType() {
		return this.prizeType;
	}
	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
