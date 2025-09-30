package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销抽奖活动创建
 *
 * @author auto create
 * @since 1.0, 2021-06-23 15:41:38
 */
public class AlipayMarketingCampaignDrawcampCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5529717946823474652L;

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
	 * 开发者用于区分商户的唯一标识，由开发者自定义，用于区分是开发者名下哪一个商户的请求，为空则为默认标识
	 */
	@ApiField("mpid")
	private String mpid;

	/**
	 * 奖品模型，至少需要配置一个奖品
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

	public String getAccountCount() {
		return this.accountCount;
	}
	public void setAccountCount(String accountCount) {
		this.accountCount = accountCount;
	}

	public String getAppidCount() {
		return this.appidCount;
	}
	public void setAppidCount(String appidCount) {
		this.appidCount = appidCount;
	}

	public String getAwardCount() {
		return this.awardCount;
	}
	public void setAwardCount(String awardCount) {
		this.awardCount = awardCount;
	}

	public String getAwardRate() {
		return this.awardRate;
	}
	public void setAwardRate(String awardRate) {
		this.awardRate = awardRate;
	}

	public String getCampCode() {
		return this.campCode;
	}
	public void setCampCode(String campCode) {
		this.campCode = campCode;
	}

	public String getCampEndTime() {
		return this.campEndTime;
	}
	public void setCampEndTime(String campEndTime) {
		this.campEndTime = campEndTime;
	}

	public String getCampName() {
		return this.campName;
	}
	public void setCampName(String campName) {
		this.campName = campName;
	}

	public String getCampStartTime() {
		return this.campStartTime;
	}
	public void setCampStartTime(String campStartTime) {
		this.campStartTime = campStartTime;
	}

	public String getCertRuleId() {
		return this.certRuleId;
	}
	public void setCertRuleId(String certRuleId) {
		this.certRuleId = certRuleId;
	}

	public String getCertificationCount() {
		return this.certificationCount;
	}
	public void setCertificationCount(String certificationCount) {
		this.certificationCount = certificationCount;
	}

	public String getCrowdRuleId() {
		return this.crowdRuleId;
	}
	public void setCrowdRuleId(String crowdRuleId) {
		this.crowdRuleId = crowdRuleId;
	}

	public String getMobileCount() {
		return this.mobileCount;
	}
	public void setMobileCount(String mobileCount) {
		this.mobileCount = mobileCount;
	}

	public String getMpid() {
		return this.mpid;
	}
	public void setMpid(String mpid) {
		this.mpid = mpid;
	}

	public List<MpPrizeInfoModel> getPrizeList() {
		return this.prizeList;
	}
	public void setPrizeList(List<MpPrizeInfoModel> prizeList) {
		this.prizeList = prizeList;
	}

	public String getPromoRuleId() {
		return this.promoRuleId;
	}
	public void setPromoRuleId(String promoRuleId) {
		this.promoRuleId = promoRuleId;
	}

	public String getTriggerType() {
		return this.triggerType;
	}
	public void setTriggerType(String triggerType) {
		this.triggerType = triggerType;
	}

	public String getTriggerUserRuleId() {
		return this.triggerUserRuleId;
	}
	public void setTriggerUserRuleId(String triggerUserRuleId) {
		this.triggerUserRuleId = triggerUserRuleId;
	}

	public String getUserRuleId() {
		return this.userRuleId;
	}
	public void setUserRuleId(String userRuleId) {
		this.userRuleId = userRuleId;
	}

}
