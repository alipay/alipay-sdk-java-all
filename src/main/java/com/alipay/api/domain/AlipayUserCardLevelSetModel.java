package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡等级配置
 *
 * @author auto create
 * @since 1.0, 2022-11-04 10:32:11
 */
public class AlipayUserCardLevelSetModel extends AlipayObject {

	private static final long serialVersionUID = 7619722956768361396L;

	/**
	 * 卡等级配置
	 */
	@ApiField("card_level_config")
	private CardLevelConfigDTO cardLevelConfig;

	/**
	 * operate_type:卡等级配置操作类型
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * template_id：卡模版id，为alipay.user.card.template.create接口返回的模版id
	 */
	@ApiField("template_id")
	private String templateId;

	public CardLevelConfigDTO getCardLevelConfig() {
		return this.cardLevelConfig;
	}
	public void setCardLevelConfig(CardLevelConfigDTO cardLevelConfig) {
		this.cardLevelConfig = cardLevelConfig;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
