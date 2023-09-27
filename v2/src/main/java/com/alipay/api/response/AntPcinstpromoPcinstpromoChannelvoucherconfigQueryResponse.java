package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BenefitSendTimeInfo;
import com.alipay.api.domain.CouponEffectTimeInfo;
import com.alipay.api.domain.CouponTemplateConsume;
import com.alipay.api.domain.DiscountInfoConfigInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.pcinstpromo.pcinstpromo.channelvoucherconfig.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-07 16:06:43
 */
public class AntPcinstpromoPcinstpromoChannelvoucherconfigQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5743576274914637167L;

	/** 
	 * P站配置的活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 渠道红包活动名称描述
	 */
	@ApiField("activity_name")
	private String activityName;

	/** 
	 * 活动状态 CREATED="已创建", PUBLISHING="发布中", PUBLISHED_FAILED="发布失败", GREY="已发布(白名单验证中)", GOING="已发布", PAUSED="已暂停", ENDED="已结束"
	 */
	@ApiField("activity_status")
	private String activityStatus;

	/** 
	 * CREDIT:信用卡 DEBIT:借记卡 DEBIT_CREDIT:借记卡或信用卡
	 */
	@ApiField("bank_card_type")
	private String bankCardType;

	/** 
	 * 红包发放时间配置模型
	 */
	@ApiField("benefit_send_time")
	private BenefitSendTimeInfo benefitSendTime;

	/** 
	 * 银行卡卡bin配置，列表类型,以逗号分隔的字符串数组
	 */
	@ApiListField("card_bin_list")
	@ApiField("string")
	private List<String> cardBinList;

	/** 
	 * 红包发放之后的生效时间配置
	 */
	@ApiField("coupon_effect_time")
	private CouponEffectTimeInfo couponEffectTime;

	/** 
	 * 活动发放和消耗信息 请注意：该结果可能存在2个小时之内的时间延迟，特殊情况下可能延迟会更久
	 */
	@ApiField("coupon_template_consume_info")
	private CouponTemplateConsume couponTemplateConsumeInfo;

	/** 
	 * 优惠立减信息配置
	 */
	@ApiField("discount_info_config")
	private DiscountInfoConfigInfo discountInfoConfig;

	/** 
	 * 最少发放红包份数，比如：88代表此活动最少能发88次红包。
	 */
	@ApiField("min_send_count")
	private Long minSendCount;

	/** 
	 * 活动总预算值，以分为单位。如果值为999，则说明是9.99元预算
	 */
	@ApiField("total_budget")
	private Long totalBudget;

	/** 
	 * 红包使用说明文案
	 */
	@ApiListField("user_instruction_list")
	@ApiField("string")
	private List<String> userInstructionList;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getActivityName( ) {
		return this.activityName;
	}

	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}
	public String getActivityStatus( ) {
		return this.activityStatus;
	}

	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}
	public String getBankCardType( ) {
		return this.bankCardType;
	}

	public void setBenefitSendTime(BenefitSendTimeInfo benefitSendTime) {
		this.benefitSendTime = benefitSendTime;
	}
	public BenefitSendTimeInfo getBenefitSendTime( ) {
		return this.benefitSendTime;
	}

	public void setCardBinList(List<String> cardBinList) {
		this.cardBinList = cardBinList;
	}
	public List<String> getCardBinList( ) {
		return this.cardBinList;
	}

	public void setCouponEffectTime(CouponEffectTimeInfo couponEffectTime) {
		this.couponEffectTime = couponEffectTime;
	}
	public CouponEffectTimeInfo getCouponEffectTime( ) {
		return this.couponEffectTime;
	}

	public void setCouponTemplateConsumeInfo(CouponTemplateConsume couponTemplateConsumeInfo) {
		this.couponTemplateConsumeInfo = couponTemplateConsumeInfo;
	}
	public CouponTemplateConsume getCouponTemplateConsumeInfo( ) {
		return this.couponTemplateConsumeInfo;
	}

	public void setDiscountInfoConfig(DiscountInfoConfigInfo discountInfoConfig) {
		this.discountInfoConfig = discountInfoConfig;
	}
	public DiscountInfoConfigInfo getDiscountInfoConfig( ) {
		return this.discountInfoConfig;
	}

	public void setMinSendCount(Long minSendCount) {
		this.minSendCount = minSendCount;
	}
	public Long getMinSendCount( ) {
		return this.minSendCount;
	}

	public void setTotalBudget(Long totalBudget) {
		this.totalBudget = totalBudget;
	}
	public Long getTotalBudget( ) {
		return this.totalBudget;
	}

	public void setUserInstructionList(List<String> userInstructionList) {
		this.userInstructionList = userInstructionList;
	}
	public List<String> getUserInstructionList( ) {
		return this.userInstructionList;
	}

}
