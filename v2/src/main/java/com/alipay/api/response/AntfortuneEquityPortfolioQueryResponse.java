package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PortfolioDetailProductInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.equity.portfolio.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 01:38:03
 */
public class AntfortuneEquityPortfolioQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8614821156867525112L;

	/** 
	 * 是否可买入
	 */
	@ApiField("can_purchase")
	private Boolean canPurchase;

	/** 
	 * 是否可卖出
	 */
	@ApiField("can_sell")
	private Boolean canSell;

	/** 
	 * 组合成立日期
	 */
	@ApiField("established_date")
	private Date establishedDate;

	/** 
	 * 日涨跌幅，四舍五入后保留小数点后4位
	 */
	@ApiField("last_day_profit_rate")
	private String lastDayProfitRate;

	/** 
	 * 近一年涨跌幅，四舍五入后保留小数点后4位
	 */
	@ApiField("latest_one_year_profit_rate")
	private String latestOneYearProfitRate;

	/** 
	 * 起购金额
	 */
	@ApiField("min_purchase_amount")
	private String minPurchaseAmount;

	/** 
	 * 组合产品代码
	 */
	@ApiField("portfolio_code")
	private String portfolioCode;

	/** 
	 * 组合明细
	 */
	@ApiListField("portfolio_detail_products")
	@ApiField("portfolio_detail_product_info")
	private List<PortfolioDetailProductInfo> portfolioDetailProducts;

	/** 
	 * 组合名称，新建组合时候的命名
	 */
	@ApiField("portfolio_name")
	private String portfolioName;

	/** 
	 * 策略标签，英文逗号分隔
	 */
	@ApiListField("portfolio_tag_list")
	@ApiField("string")
	private List<String> portfolioTagList;

	/** 
	 * 组合类型
("STEADY_PORTFOLIO", "稳健组合"),
("MONETARY_BONDS_PORTFOLIO","货债组合"),
("ASSET_CONFIG", "资产配置"),
("GLOBAL_CONFIG", "全球配置 "),
("GOAL_RISK", "目标风险"),
("SELECTED_PRODUCT_PORTFOLIO", "精选产品组合"),
("SELECTED_TIME_STRATEGY", "择时策略"),
("ROTATION_STRATEGY", "轮动策略")
	 */
	@ApiField("portfolio_type")
	private String portfolioType;

	/** 
	 * 组合ID
	 */
	@ApiField("product_id")
	private String productId;

	/** 
	 * 收益率类型，("last_week", "近1周"),"last_month", "近1月"),("last_quarter", "近3月"),("last_half_year", "近半年"),("this_year", "今年"),("last_year", "近1年"),("yield_2_year", "近2年"),("yield_3_year", "近3年"),("yield_5_year", "近5年"),("NETVALUE", "产品净值"),("SINCE_ESTABLISHMENT", "成立以来")
	 */
	@ApiField("profit_period_key")
	private String profitPeriodKey;

	/** 
	 * 收益率，对应区间段类型，返回结果四舍五入后保留小数点后4位
	 */
	@ApiField("profit_rate")
	private String profitRate;

	/** 
	 * 组合产品风险等级,L(低风险),ML(中低风险),M(中风险),MH(中高风险),H(高风险)
	 */
	@ApiField("risk_evaluation")
	private String riskEvaluation;

	/** 
	 * 主理人Code，对于机构类型的主理人来说即为instId
	 */
	@ApiField("sp_code")
	private String spCode;

	/** 
	 * 主理人ID
	 */
	@ApiField("sp_id")
	private String spId;

	/** 
	 * 主理人介绍
	 */
	@ApiField("sp_intro")
	private String spIntro;

	/** 
	 * 主理人logo
	 */
	@ApiField("sp_logo")
	private String spLogo;

	/** 
	 * 主理人名称
	 */
	@ApiField("sp_name")
	private String spName;

	/** 
	 * 主理人类型，包括 ANT_PLATFORM（蚂蚁平台）、VERIFIED_INST（机构）、VERIFIED_PERSON（个人）
	 */
	@ApiField("sp_type")
	private String spType;

	/** 
	 * 策略目标
	 */
	@ApiField("strategy_goal")
	private String strategyGoal;

	/** 
	 * 组合简介
	 */
	@ApiField("strategy_intro")
	private String strategyIntro;

	/** 
	 * 策略描述地址
	 */
	@ApiField("strategy_url")
	private String strategyUrl;

	/** 
	 * 建议持有时间，有效值包括ABOVE_SEVEN_DAY(七天以上),ONE_THREE_MONTH(一到三个月),THREE_SIX_MONTH(三到六个月),SIX_TWELVE_MONTH(六到十二个月),ONE_TWO_YEAR(一到两年),TWO_FIVE_YEAR(两到五年),FIVE_ABOVE_YEAR(五年以上)
	 */
	@ApiField("suggested_keep_period")
	private String suggestedKeepPeriod;

	public void setCanPurchase(Boolean canPurchase) {
		this.canPurchase = canPurchase;
	}
	public Boolean getCanPurchase( ) {
		return this.canPurchase;
	}

	public void setCanSell(Boolean canSell) {
		this.canSell = canSell;
	}
	public Boolean getCanSell( ) {
		return this.canSell;
	}

	public void setEstablishedDate(Date establishedDate) {
		this.establishedDate = establishedDate;
	}
	public Date getEstablishedDate( ) {
		return this.establishedDate;
	}

	public void setLastDayProfitRate(String lastDayProfitRate) {
		this.lastDayProfitRate = lastDayProfitRate;
	}
	public String getLastDayProfitRate( ) {
		return this.lastDayProfitRate;
	}

	public void setLatestOneYearProfitRate(String latestOneYearProfitRate) {
		this.latestOneYearProfitRate = latestOneYearProfitRate;
	}
	public String getLatestOneYearProfitRate( ) {
		return this.latestOneYearProfitRate;
	}

	public void setMinPurchaseAmount(String minPurchaseAmount) {
		this.minPurchaseAmount = minPurchaseAmount;
	}
	public String getMinPurchaseAmount( ) {
		return this.minPurchaseAmount;
	}

	public void setPortfolioCode(String portfolioCode) {
		this.portfolioCode = portfolioCode;
	}
	public String getPortfolioCode( ) {
		return this.portfolioCode;
	}

	public void setPortfolioDetailProducts(List<PortfolioDetailProductInfo> portfolioDetailProducts) {
		this.portfolioDetailProducts = portfolioDetailProducts;
	}
	public List<PortfolioDetailProductInfo> getPortfolioDetailProducts( ) {
		return this.portfolioDetailProducts;
	}

	public void setPortfolioName(String portfolioName) {
		this.portfolioName = portfolioName;
	}
	public String getPortfolioName( ) {
		return this.portfolioName;
	}

	public void setPortfolioTagList(List<String> portfolioTagList) {
		this.portfolioTagList = portfolioTagList;
	}
	public List<String> getPortfolioTagList( ) {
		return this.portfolioTagList;
	}

	public void setPortfolioType(String portfolioType) {
		this.portfolioType = portfolioType;
	}
	public String getPortfolioType( ) {
		return this.portfolioType;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductId( ) {
		return this.productId;
	}

	public void setProfitPeriodKey(String profitPeriodKey) {
		this.profitPeriodKey = profitPeriodKey;
	}
	public String getProfitPeriodKey( ) {
		return this.profitPeriodKey;
	}

	public void setProfitRate(String profitRate) {
		this.profitRate = profitRate;
	}
	public String getProfitRate( ) {
		return this.profitRate;
	}

	public void setRiskEvaluation(String riskEvaluation) {
		this.riskEvaluation = riskEvaluation;
	}
	public String getRiskEvaluation( ) {
		return this.riskEvaluation;
	}

	public void setSpCode(String spCode) {
		this.spCode = spCode;
	}
	public String getSpCode( ) {
		return this.spCode;
	}

	public void setSpId(String spId) {
		this.spId = spId;
	}
	public String getSpId( ) {
		return this.spId;
	}

	public void setSpIntro(String spIntro) {
		this.spIntro = spIntro;
	}
	public String getSpIntro( ) {
		return this.spIntro;
	}

	public void setSpLogo(String spLogo) {
		this.spLogo = spLogo;
	}
	public String getSpLogo( ) {
		return this.spLogo;
	}

	public void setSpName(String spName) {
		this.spName = spName;
	}
	public String getSpName( ) {
		return this.spName;
	}

	public void setSpType(String spType) {
		this.spType = spType;
	}
	public String getSpType( ) {
		return this.spType;
	}

	public void setStrategyGoal(String strategyGoal) {
		this.strategyGoal = strategyGoal;
	}
	public String getStrategyGoal( ) {
		return this.strategyGoal;
	}

	public void setStrategyIntro(String strategyIntro) {
		this.strategyIntro = strategyIntro;
	}
	public String getStrategyIntro( ) {
		return this.strategyIntro;
	}

	public void setStrategyUrl(String strategyUrl) {
		this.strategyUrl = strategyUrl;
	}
	public String getStrategyUrl( ) {
		return this.strategyUrl;
	}

	public void setSuggestedKeepPeriod(String suggestedKeepPeriod) {
		this.suggestedKeepPeriod = suggestedKeepPeriod;
	}
	public String getSuggestedKeepPeriod( ) {
		return this.suggestedKeepPeriod;
	}

}
