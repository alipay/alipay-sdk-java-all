package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户自运营活动模型
 *
 * @author auto create
 * @since 1.0, 2018-01-22 17:39:15
 */
public class InteligentGeneralMerchantPromo extends AlipayObject {

	private static final long serialVersionUID = 8861391458335436123L;

	/**
	 * 营销活动的id，如merchant_promo_type：CONSUME_SEND即消费送的活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 圈人限制条件
	 */
	@ApiField("crowd_constraint")
	private CrowdConstraintInfo crowdConstraint;

	/**
	 * 活动描述信息，该信息有可能会在店铺详情页漏出，请自己填写
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
	 * 活动预算
	 */
	@ApiField("inteligent_budget")
	private InteligentBudgetInfo inteligentBudget;

	/**
	 * 活动限制信息
	 */
	@ApiField("inteligent_constraint")
	private InteligentConstraintInfo inteligentConstraint;

	/**
	 * 营销工具集合。主要是活动涉及到的奖品信息
	 */
	@ApiListField("inteligent_promo_tools")
	@ApiField("inteligent_promo_tool")
	private List<InteligentPromoTool> inteligentPromoTools;

	/**
	 * 投放渠道信息
	 */
	@ApiListField("inteligent_publish_channels")
	@ApiField("inteligent_publish_channel")
	private List<InteligentPublishChannel> inteligentPublishChannels;

	/**
	 * 营销活动类型；枚举（DIRECT_SEND：直发奖；CONSUME_SEND：消费送）
	 */
	@ApiField("merchant_promo_type")
	private String merchantPromoType;

	/**
	 * 营销活动名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 子营销活动对应的模板id
	 */
	@ApiField("template_id")
	private String templateId;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
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

	public InteligentBudgetInfo getInteligentBudget() {
		return this.inteligentBudget;
	}
	public void setInteligentBudget(InteligentBudgetInfo inteligentBudget) {
		this.inteligentBudget = inteligentBudget;
	}

	public InteligentConstraintInfo getInteligentConstraint() {
		return this.inteligentConstraint;
	}
	public void setInteligentConstraint(InteligentConstraintInfo inteligentConstraint) {
		this.inteligentConstraint = inteligentConstraint;
	}

	public List<InteligentPromoTool> getInteligentPromoTools() {
		return this.inteligentPromoTools;
	}
	public void setInteligentPromoTools(List<InteligentPromoTool> inteligentPromoTools) {
		this.inteligentPromoTools = inteligentPromoTools;
	}

	public List<InteligentPublishChannel> getInteligentPublishChannels() {
		return this.inteligentPublishChannels;
	}
	public void setInteligentPublishChannels(List<InteligentPublishChannel> inteligentPublishChannels) {
		this.inteligentPublishChannels = inteligentPublishChannels;
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

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
