package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 智能营销活动下属子活动
 *
 * @author auto create
 * @since 1.0, 2018-01-22 16:17:56
 */
public class IntelligentPromoDetail extends AlipayObject {

	private static final long serialVersionUID = 8242574533647366745L;

	/**
	 * 活动预算
	 */
	@ApiField("budget")
	private BudgetInfo budget;

	/**
	 * 营销活动的id，也就是消费送的活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 活动限制信息
	 */
	@ApiField("constraint")
	private ConstraintInfo constraint;

	/**
	 * 圈人限制条件
	 */
	@ApiField("crowd_constraint")
	private CrowdConstraintInfo crowdConstraint;

	/**
	 * 智能营销活动的子活动
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 活动扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 营销活动预测效果
	 */
	@ApiField("forecast_effect")
	private IntelligentPromoEffect forecastEffect;

	/**
	 * 自运营活动类型。DIRECT_SEND：直发奖；CONSUME_SEND：消费送
	 */
	@ApiField("merchant_promo_type")
	private String merchantPromoType;

	/**
	 * 子营销活动名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 营销工具集合。主要是活动涉及到的奖品信息
	 */
	@ApiListField("promo_tools")
	@ApiField("promo_tool")
	private List<PromoTool> promoTools;

	/**
	 * 投放渠道信息
	 */
	@ApiListField("publish_channels")
	@ApiField("publish_channel")
	private List<PublishChannel> publishChannels;

	/**
	 * 子营销活动对应的模板id
	 */
	@ApiField("template_id")
	private String templateId;

	public BudgetInfo getBudget() {
		return this.budget;
	}
	public void setBudget(BudgetInfo budget) {
		this.budget = budget;
	}

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public ConstraintInfo getConstraint() {
		return this.constraint;
	}
	public void setConstraint(ConstraintInfo constraint) {
		this.constraint = constraint;
	}

	public CrowdConstraintInfo getCrowdConstraint() {
		return this.crowdConstraint;
	}
	public void setCrowdConstraint(CrowdConstraintInfo crowdConstraint) {
		this.crowdConstraint = crowdConstraint;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public IntelligentPromoEffect getForecastEffect() {
		return this.forecastEffect;
	}
	public void setForecastEffect(IntelligentPromoEffect forecastEffect) {
		this.forecastEffect = forecastEffect;
	}

	public String getMerchantPromoType() {
		return this.merchantPromoType;
	}
	public void setMerchantPromoType(String merchantPromoType) {
		this.merchantPromoType = merchantPromoType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<PromoTool> getPromoTools() {
		return this.promoTools;
	}
	public void setPromoTools(List<PromoTool> promoTools) {
		this.promoTools = promoTools;
	}

	public List<PublishChannel> getPublishChannels() {
		return this.publishChannels;
	}
	public void setPublishChannels(List<PublishChannel> publishChannels) {
		this.publishChannels = publishChannels;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
