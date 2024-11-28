package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MpPrizeInfoModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.drawcamp.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-11 13:34:22
 */
public class AlipayMarketingCampaignDrawcampQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6158621656794844452L;

	/** 
	 * 单用户以支付宝账号维度可参与当前营销活动的总次数，由开发者自定义此数值
	 */
	@ApiField("account_count")
	private String accountCount;

	/** 
	 * 以移动设备维度可参与当前营销活动的总次数，由开发者自定义此数值
	 */
	@ApiField("appid_count")
	private String appidCount;

	/** 
	 * 单个用户当前活动允许中奖的最大次数，最大值999999
	 */
	@ApiField("award_count")
	private String awardCount;

	/** 
	 * 活动奖品总中奖几率，开发者需传入整数值，如：传入99支付宝默认为99%
	 */
	@ApiField("award_rate")
	private String awardRate;

	/** 
	 * 活动唯一标识,不能包含除中文、英文、数字以外的字符，创建后不能修改，需要保证在商户端不重复。
	 */
	@ApiField("camp_code")
	private String campCode;

	/** 
	 * 活动结束时间，yyyy-MM-dd HH:00:00格式(到小时)，需要大于活动开始时间
	 */
	@ApiField("camp_end_time")
	private String campEndTime;

	/** 
	 * 抽奖活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/** 
	 * 活动名称，开发者自定义
	 */
	@ApiField("camp_name")
	private String campName;

	/** 
	 * 活动开始时间，yyyy-MM-dd HH:00:00格式（到小时），时间不能早于当前日期的0点
	 */
	@ApiField("camp_start_time")
	private String campStartTime;

	/** 
	 * 活动状态，CAMP_CREATED(已创建状态)，CAMP_PAUSED(暂停状态)，CAMP_ENDED(结束状态)，CAMP_GOING(启动状态)，可由alipay.marketing.campaign.drawcamp.status.update 接口将已创建状态改为启动状态，将启动状态改为暂停/结束状态，将暂停状态置为结束状态
	 */
	@ApiField("camp_status")
	private String campStatus;

	/** 
	 * 凭证验证规则id，通过alipay.marketing.campaign.cert.create 接口创建的凭证id
	 */
	@ApiField("cert_rule_id")
	private String certRuleId;

	/** 
	 * 单用户以账户证件号（如身份证号、护照、军官证等）维度可参与当前营销活动的总次数，由开发者自定义此数值
	 */
	@ApiField("certification_count")
	private String certificationCount;

	/** 
	 * 签约商户的pid，系统默认获取当前接口调用者的签约pid
	 */
	@ApiField("creator")
	private String creator;

	/** 
	 * 圈人规则id，通过alipay.marketing.campaign.rule.crowd.create 接口创建的规则id
	 */
	@ApiField("crowd_rule_id")
	private String crowdRuleId;

	/** 
	 * 以认证手机号（与支付宝账号绑定的手机号）维度的可参与当前营销活动的总次数，由开发者自定义此数值
	 */
	@ApiField("mobile_count")
	private String mobileCount;

	/** 
	 * 奖品模型，至少有一个奖品模型
	 */
	@ApiListField("prize_list")
	@ApiField("mp_prize_info_model")
	private List<MpPrizeInfoModel> prizeList;

	/** 
	 * 营销验证规则id，由支付宝配置
	 */
	@ApiField("promo_rule_id")
	private String promoRuleId;

	/** 
	 * 活动触发类型，目前支持
CAMP_USER_TRIGGER：用户触发（开发者调用alipay.marketing.campaign.drawcamp.trigger 接口触发）；
CAMP_SYS_TRIGGER：系统触发，必须配置实时人群验证规则（如：配置了监听用户支付事件，支付宝会根据活动规则自动发奖，无需用户手动触发）。
	 */
	@ApiField("trigger_type")
	private String triggerType;

	/** 
	 * 实时人群验证规则id，由支付宝配置
	 */
	@ApiField("trigger_user_rule_id")
	private String triggerUserRuleId;

	/** 
	 * 人群验证规则id，由支付宝配置
	 */
	@ApiField("user_rule_id")
	private String userRuleId;

	public void setAccountCount(String accountCount) {
		this.accountCount = accountCount;
	}
	public String getAccountCount( ) {
		return this.accountCount;
	}

	public void setAppidCount(String appidCount) {
		this.appidCount = appidCount;
	}
	public String getAppidCount( ) {
		return this.appidCount;
	}

	public void setAwardCount(String awardCount) {
		this.awardCount = awardCount;
	}
	public String getAwardCount( ) {
		return this.awardCount;
	}

	public void setAwardRate(String awardRate) {
		this.awardRate = awardRate;
	}
	public String getAwardRate( ) {
		return this.awardRate;
	}

	public void setCampCode(String campCode) {
		this.campCode = campCode;
	}
	public String getCampCode( ) {
		return this.campCode;
	}

	public void setCampEndTime(String campEndTime) {
		this.campEndTime = campEndTime;
	}
	public String getCampEndTime( ) {
		return this.campEndTime;
	}

	public void setCampId(String campId) {
		this.campId = campId;
	}
	public String getCampId( ) {
		return this.campId;
	}

	public void setCampName(String campName) {
		this.campName = campName;
	}
	public String getCampName( ) {
		return this.campName;
	}

	public void setCampStartTime(String campStartTime) {
		this.campStartTime = campStartTime;
	}
	public String getCampStartTime( ) {
		return this.campStartTime;
	}

	public void setCampStatus(String campStatus) {
		this.campStatus = campStatus;
	}
	public String getCampStatus( ) {
		return this.campStatus;
	}

	public void setCertRuleId(String certRuleId) {
		this.certRuleId = certRuleId;
	}
	public String getCertRuleId( ) {
		return this.certRuleId;
	}

	public void setCertificationCount(String certificationCount) {
		this.certificationCount = certificationCount;
	}
	public String getCertificationCount( ) {
		return this.certificationCount;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getCreator( ) {
		return this.creator;
	}

	public void setCrowdRuleId(String crowdRuleId) {
		this.crowdRuleId = crowdRuleId;
	}
	public String getCrowdRuleId( ) {
		return this.crowdRuleId;
	}

	public void setMobileCount(String mobileCount) {
		this.mobileCount = mobileCount;
	}
	public String getMobileCount( ) {
		return this.mobileCount;
	}

	public void setPrizeList(List<MpPrizeInfoModel> prizeList) {
		this.prizeList = prizeList;
	}
	public List<MpPrizeInfoModel> getPrizeList( ) {
		return this.prizeList;
	}

	public void setPromoRuleId(String promoRuleId) {
		this.promoRuleId = promoRuleId;
	}
	public String getPromoRuleId( ) {
		return this.promoRuleId;
	}

	public void setTriggerType(String triggerType) {
		this.triggerType = triggerType;
	}
	public String getTriggerType( ) {
		return this.triggerType;
	}

	public void setTriggerUserRuleId(String triggerUserRuleId) {
		this.triggerUserRuleId = triggerUserRuleId;
	}
	public String getTriggerUserRuleId( ) {
		return this.triggerUserRuleId;
	}

	public void setUserRuleId(String userRuleId) {
		this.userRuleId = userRuleId;
	}
	public String getUserRuleId( ) {
		return this.userRuleId;
	}

}
