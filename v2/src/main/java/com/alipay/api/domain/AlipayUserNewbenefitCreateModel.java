package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚂蚁会员V3权益创建接口
 *
 * @author auto create
 * @since 1.0, 2020-08-17 21:20:13
 */
public class AlipayUserNewbenefitCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7288577677779862834L;

	/**
	 * 关联的专区码，需要联系蚂蚁会员平台的业务负责人进行专区码分配
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 权益的名称，由调用方自行定义
	 */
	@ApiField("benefit_name")
	private String benefitName;

	/**
	 * 权益的副标题，用于补充描述权益
	 */
	@ApiField("benefit_sub_title")
	private String benefitSubTitle;

	/**
	 * 权益详情描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * Y表示差异化，N表示非差异化；差异化的权益需要为四个等级分别配置等级配置，包括积分、折扣、跳转页面等信息；非差异化的权益只需要配置一个通用的等级配置
	 */
	@ApiField("differentiation")
	private String differentiation;

	/**
	 * 当权益为非差异化时，该字段生效，用于控制允许兑换权益的等级
	 */
	@ApiField("eligible_grade_desc")
	private String eligibleGradeDesc;

	/**
	 * 权益展示结束时间，使用Date.getTime()。结束时间必须大于起始时间。
	 */
	@ApiField("end_dt")
	private Long endDt;

	/**
	 * 兑换规则以及不满足该规则后给用户的提示文案，规则id和文案用:分隔；可配置多个，多个之间用,分隔。(分隔符皆是英文半角字符)规则id联系蚂蚁会员pd或运营提供
	 */
	@ApiField("exchange_rule_ids")
	private String exchangeRuleIds;

	/**
	 * 权益等级配置
	 */
	@ApiListField("grade_config")
	@ApiField("benefit_grade_config")
	private List<BenefitGradeConfig> gradeConfig;

	/**
	 * 权益展示时的图标地址，由商户上传图片到合适的存储平台，然后将图片的地址传入
	 */
	@ApiField("icon_url")
	private String iconUrl;

	/**
	 * 权益展示的起始时间戳，使用Date.getTime()获得
	 */
	@ApiField("start_dt")
	private Long startDt;

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getBenefitName() {
		return this.benefitName;
	}
	public void setBenefitName(String benefitName) {
		this.benefitName = benefitName;
	}

	public String getBenefitSubTitle() {
		return this.benefitSubTitle;
	}
	public void setBenefitSubTitle(String benefitSubTitle) {
		this.benefitSubTitle = benefitSubTitle;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDifferentiation() {
		return this.differentiation;
	}
	public void setDifferentiation(String differentiation) {
		this.differentiation = differentiation;
	}

	public String getEligibleGradeDesc() {
		return this.eligibleGradeDesc;
	}
	public void setEligibleGradeDesc(String eligibleGradeDesc) {
		this.eligibleGradeDesc = eligibleGradeDesc;
	}

	public Long getEndDt() {
		return this.endDt;
	}
	public void setEndDt(Long endDt) {
		this.endDt = endDt;
	}

	public String getExchangeRuleIds() {
		return this.exchangeRuleIds;
	}
	public void setExchangeRuleIds(String exchangeRuleIds) {
		this.exchangeRuleIds = exchangeRuleIds;
	}

	public List<BenefitGradeConfig> getGradeConfig() {
		return this.gradeConfig;
	}
	public void setGradeConfig(List<BenefitGradeConfig> gradeConfig) {
		this.gradeConfig = gradeConfig;
	}

	public String getIconUrl() {
		return this.iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public Long getStartDt() {
		return this.startDt;
	}
	public void setStartDt(Long startDt) {
		this.startDt = startDt;
	}

}
