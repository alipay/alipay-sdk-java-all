package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁会员合作权益创建接口
 *
 * @author auto create
 * @since 1.0, 2020-08-17 21:22:07
 */
public class AlipayUserBenefitCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1528982316156419675L;

	/**
	 * 权益专区码，在创建权益前应该先向蚂蚁会员平台申请一个合适的专区码。 专区必须存在。
	 */
	@ApiField("benefit_area_code")
	private String benefitAreaCode;

	/**
	 * 权益图标地址
	 */
	@ApiField("benefit_icon_url")
	private String benefitIconUrl;

	/**
	 * 权益的名称
	 */
	@ApiField("benefit_name")
	private String benefitName;

	/**
	 * 是否将权益的名称用作专区的副标题, 若为true,则会使用该权益的名称自动覆盖所属专区的副标题(暂未实现)
	 */
	@ApiField("benefit_name_as_area_subtitle")
	private Boolean benefitNameAsAreaSubtitle;

	/**
	 * 权益详情页面地址
	 */
	@ApiField("benefit_page_url")
	private String benefitPageUrl;

	/**
	 * 权益兑换消耗的积分数
	 */
	@ApiField("benefit_point")
	private Long benefitPoint;

	/**
	 * 权益使用场景索引ID，接入时需要咨询@田豫如何取值
	 */
	@ApiField("benefit_rec_biz_id")
	private String benefitRecBizId;

	/**
	 * 支付宝商家券 ALIPAY_MERCHANT_COUPON
口碑商家券 KOUBEI_MERCHANT_COUPON
花呗分期免息券 HUABEI_FENQI_FREE_INTEREST_COUP
淘系通用券 TAOBAO_COMMON_COUPON
淘系商家券 TAOBAO_MERCHANT_COUPON
国际线上商家券 INTER_ONLINE_MERCHANT_COUPON
国际线下商家券 INTER_OFFLINE_MERCHANT_COUPON
通用商户权益 COMMON_MERCHANT_GOODS
其它 OTHERS, 接入是需要咨询@田豫如何选值
	 */
	@ApiField("benefit_rec_type")
	private String benefitRecType;

	/**
	 * 权益的副标题，用于补充描述权益
	 */
	@ApiField("benefit_subtitle")
	private String benefitSubtitle;

	/**
	 * 支付宝的营销活动id，若不走支付宝活动，则不需要填
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * primary,golden,platinum,diamond分别对应大众、黄金、铂金、钻石会员等级。eligible_grade属性用于限制能够兑换当前权益的用户等级，用户必须不低于配置的等级才能进行兑换。如果没有等级要求，则不要填写该字段。
	 */
	@ApiField("eligible_grade")
	private String eligibleGrade;

	/**
	 * 权益展示结束时间，使用Date.getTime()。结束时间必须大于起始时间。
	 */
	@ApiField("end_time")
	private Long endTime;

	/**
	 * 兑换规则以及不满足该规则后给用户的提示文案，规则id和文案用:分隔；可配置多个，多个之间用,分隔。(分隔符皆是英文半角字符)规则id联系蚂蚁会员pd或运营提供
	 */
	@ApiField("exchange_rule_ids")
	private String exchangeRuleIds;

	/**
	 * 该权益对应每个等级会员的兑换折扣。等级和折扣用:分隔，多组折扣规则用:分隔。折扣0~1。分隔符皆为英文半角字符
	 */
	@ApiField("grade_discount")
	private String gradeDiscount;

	/**
	 * 权益展示起始时间, 使用Date.getTime()。开始时间必须大于当前时间，且结束时间需要大于开始时间
	 */
	@ApiField("start_time")
	private Long startTime;

	public String getBenefitAreaCode() {
		return this.benefitAreaCode;
	}
	public void setBenefitAreaCode(String benefitAreaCode) {
		this.benefitAreaCode = benefitAreaCode;
	}

	public String getBenefitIconUrl() {
		return this.benefitIconUrl;
	}
	public void setBenefitIconUrl(String benefitIconUrl) {
		this.benefitIconUrl = benefitIconUrl;
	}

	public String getBenefitName() {
		return this.benefitName;
	}
	public void setBenefitName(String benefitName) {
		this.benefitName = benefitName;
	}

	public Boolean getBenefitNameAsAreaSubtitle() {
		return this.benefitNameAsAreaSubtitle;
	}
	public void setBenefitNameAsAreaSubtitle(Boolean benefitNameAsAreaSubtitle) {
		this.benefitNameAsAreaSubtitle = benefitNameAsAreaSubtitle;
	}

	public String getBenefitPageUrl() {
		return this.benefitPageUrl;
	}
	public void setBenefitPageUrl(String benefitPageUrl) {
		this.benefitPageUrl = benefitPageUrl;
	}

	public Long getBenefitPoint() {
		return this.benefitPoint;
	}
	public void setBenefitPoint(Long benefitPoint) {
		this.benefitPoint = benefitPoint;
	}

	public String getBenefitRecBizId() {
		return this.benefitRecBizId;
	}
	public void setBenefitRecBizId(String benefitRecBizId) {
		this.benefitRecBizId = benefitRecBizId;
	}

	public String getBenefitRecType() {
		return this.benefitRecType;
	}
	public void setBenefitRecType(String benefitRecType) {
		this.benefitRecType = benefitRecType;
	}

	public String getBenefitSubtitle() {
		return this.benefitSubtitle;
	}
	public void setBenefitSubtitle(String benefitSubtitle) {
		this.benefitSubtitle = benefitSubtitle;
	}

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getEligibleGrade() {
		return this.eligibleGrade;
	}
	public void setEligibleGrade(String eligibleGrade) {
		this.eligibleGrade = eligibleGrade;
	}

	public Long getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public String getExchangeRuleIds() {
		return this.exchangeRuleIds;
	}
	public void setExchangeRuleIds(String exchangeRuleIds) {
		this.exchangeRuleIds = exchangeRuleIds;
	}

	public String getGradeDiscount() {
		return this.gradeDiscount;
	}
	public void setGradeDiscount(String gradeDiscount) {
		this.gradeDiscount = gradeDiscount;
	}

	public Long getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

}
