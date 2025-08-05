package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MarketTargetConfiguration;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adcampaign.plan.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-15 15:17:34
 */
public class AlipayDataDataserviceAdcampaignPlanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6795273484496697354L;

	/** 
	 * 计划日预算。单位：元【人民币】不限日预算时此值为空
	 */
	@ApiField("budget")
	private String budget;

	/** 
	 * 计划计费方式。CPC
	 */
	@ApiField("charge_type")
	private String chargeType;

	/** 
	 * 计划投放结束日期
	 */
	@ApiField("end_date")
	private String endDate;

	/** 
	 * 计划修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/** 
	 * 二级营销目标code
	 */
	@ApiField("market_target_code")
	private String marketTargetCode;

	/** 
	 * 营销目标配置
	 */
	@ApiField("market_target_config")
	private MarketTargetConfiguration marketTargetConfig;

	/** 
	 * 二级营销目标名称
	 */
	@ApiField("market_target_name")
	private String marketTargetName;

	/** 
	 * 计划id
	 */
	@ApiField("plan_id")
	private Long planId;

	/** 
	 * 计划名称
	 */
	@ApiField("plan_name")
	private String planName;

	/** 
	 * 计划状态
	 */
	@ApiField("plan_status")
	private String planStatus;

	/** 
	 * 不限日预算开关：ON/OFF
	 */
	@ApiField("plan_unlimited_budget_switch")
	private String planUnlimitedBudgetSwitch;

	/** 
	 * 商家id
	 */
	@ApiField("principal_id")
	private Long principalId;

	/** 
	 * 应用推广 小游戏/ 小程序 appid
	 */
	@ApiField("promote_target_app_id")
	private String promoteTargetAppId;

	/** 
	 * 应用推广 小游戏/ 小程序
	 */
	@ApiField("promote_target_app_name")
	private String promoteTargetAppName;

	/** 
	 * 推广类型
        "tinygame",
        "tinyapp",
	 */
	@ApiField("promote_target_app_type")
	private String promoteTargetAppType;

	/** 
	 * 冻结单id
	 */
	@ApiField("rtb_freeze_order_id")
	private String rtbFreezeOrderId;

	/** 
	 * 场景编码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/** 
	 * 计划交易模式
	 */
	@ApiField("sell_mode")
	private String sellMode;

	/** 
	 * 计划关联商品名称
	 */
	@ApiField("service_entity_name")
	private String serviceEntityName;

	/** 
	 * 计划关联商品id
	 */
	@ApiField("service_entity_outid")
	private String serviceEntityOutid;

	/** 
	 * 冻结单名称
	 */
	@ApiField("special_name")
	private String specialName;

	/** 
	 * 计划投放开始日期
	 */
	@ApiField("start_date")
	private String startDate;

	/** 
	 * 投放时段
全时段投放-不返回该字段
分时段投放：格式为24*7位字符串，且都为 0 和 1，以单小时为最小粒度。按日,一,二,......,六排列。单日内按23,22,21,......3,2,1,0排列。0为不投放，1 为投放，全传 1 视为全时段投放，不允许全部传 0。日维度采用“,”分隔
	 */
	@ApiField("time_schema")
	private String timeSchema;

	/** 
	 * 小程序id
	 */
	@ApiField("tiny_app_id")
	private String tinyAppId;

	/** 
	 * 小程序推广名称
	 */
	@ApiField("tiny_app_name")
	private String tinyAppName;

	public void setBudget(String budget) {
		this.budget = budget;
	}
	public String getBudget( ) {
		return this.budget;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}
	public String getChargeType( ) {
		return this.chargeType;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getEndDate( ) {
		return this.endDate;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	public Date getGmtModified( ) {
		return this.gmtModified;
	}

	public void setMarketTargetCode(String marketTargetCode) {
		this.marketTargetCode = marketTargetCode;
	}
	public String getMarketTargetCode( ) {
		return this.marketTargetCode;
	}

	public void setMarketTargetConfig(MarketTargetConfiguration marketTargetConfig) {
		this.marketTargetConfig = marketTargetConfig;
	}
	public MarketTargetConfiguration getMarketTargetConfig( ) {
		return this.marketTargetConfig;
	}

	public void setMarketTargetName(String marketTargetName) {
		this.marketTargetName = marketTargetName;
	}
	public String getMarketTargetName( ) {
		return this.marketTargetName;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;
	}
	public Long getPlanId( ) {
		return this.planId;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanName( ) {
		return this.planName;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public String getPlanStatus( ) {
		return this.planStatus;
	}

	public void setPlanUnlimitedBudgetSwitch(String planUnlimitedBudgetSwitch) {
		this.planUnlimitedBudgetSwitch = planUnlimitedBudgetSwitch;
	}
	public String getPlanUnlimitedBudgetSwitch( ) {
		return this.planUnlimitedBudgetSwitch;
	}

	public void setPrincipalId(Long principalId) {
		this.principalId = principalId;
	}
	public Long getPrincipalId( ) {
		return this.principalId;
	}

	public void setPromoteTargetAppId(String promoteTargetAppId) {
		this.promoteTargetAppId = promoteTargetAppId;
	}
	public String getPromoteTargetAppId( ) {
		return this.promoteTargetAppId;
	}

	public void setPromoteTargetAppName(String promoteTargetAppName) {
		this.promoteTargetAppName = promoteTargetAppName;
	}
	public String getPromoteTargetAppName( ) {
		return this.promoteTargetAppName;
	}

	public void setPromoteTargetAppType(String promoteTargetAppType) {
		this.promoteTargetAppType = promoteTargetAppType;
	}
	public String getPromoteTargetAppType( ) {
		return this.promoteTargetAppType;
	}

	public void setRtbFreezeOrderId(String rtbFreezeOrderId) {
		this.rtbFreezeOrderId = rtbFreezeOrderId;
	}
	public String getRtbFreezeOrderId( ) {
		return this.rtbFreezeOrderId;
	}

	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}
	public String getSceneCode( ) {
		return this.sceneCode;
	}

	public void setSellMode(String sellMode) {
		this.sellMode = sellMode;
	}
	public String getSellMode( ) {
		return this.sellMode;
	}

	public void setServiceEntityName(String serviceEntityName) {
		this.serviceEntityName = serviceEntityName;
	}
	public String getServiceEntityName( ) {
		return this.serviceEntityName;
	}

	public void setServiceEntityOutid(String serviceEntityOutid) {
		this.serviceEntityOutid = serviceEntityOutid;
	}
	public String getServiceEntityOutid( ) {
		return this.serviceEntityOutid;
	}

	public void setSpecialName(String specialName) {
		this.specialName = specialName;
	}
	public String getSpecialName( ) {
		return this.specialName;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStartDate( ) {
		return this.startDate;
	}

	public void setTimeSchema(String timeSchema) {
		this.timeSchema = timeSchema;
	}
	public String getTimeSchema( ) {
		return this.timeSchema;
	}

	public void setTinyAppId(String tinyAppId) {
		this.tinyAppId = tinyAppId;
	}
	public String getTinyAppId( ) {
		return this.tinyAppId;
	}

	public void setTinyAppName(String tinyAppName) {
		this.tinyAppName = tinyAppName;
	}
	public String getTinyAppName( ) {
		return this.tinyAppName;
	}

}
