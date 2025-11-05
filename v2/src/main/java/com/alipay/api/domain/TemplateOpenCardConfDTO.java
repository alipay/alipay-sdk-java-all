package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 模板开卡配置
 *
 * @author auto create
 * @since 1.0, 2024-07-04 16:05:52
 */
public class TemplateOpenCardConfDTO extends AlipayObject {

	private static final long serialVersionUID = 8219821338588669264L;

	/**
	 * 领卡权益信息
	 */
	@ApiListField("card_rights")
	@ApiField("template_rights_content_d_t_o")
	private List<TemplateRightsContentDTO> cardRights;

	/**
	 * 配置，预留字段，暂时不用
	 */
	@ApiField("conf")
	private String conf;

	/**
	 * 开卡渠道类型
外部系统：ISV （代理运营）
商户直连对接：MER （商家自运营）
	 */
	@ApiField("open_card_source_type")
	private String openCardSourceType;

	/**
	 * 开卡链接，必须http、https开头
	 */
	@ApiField("open_card_url")
	private String openCardUrl;

	/**
	 * 渠道APPID，提供领卡页面的服务提供方
	 */
	@ApiField("source_app_id")
	private String sourceAppId;

	public List<TemplateRightsContentDTO> getCardRights() {
		return this.cardRights;
	}
	public void setCardRights(List<TemplateRightsContentDTO> cardRights) {
		this.cardRights = cardRights;
	}

	public String getConf() {
		return this.conf;
	}
	public void setConf(String conf) {
		this.conf = conf;
	}

	public String getOpenCardSourceType() {
		return this.openCardSourceType;
	}
	public void setOpenCardSourceType(String openCardSourceType) {
		this.openCardSourceType = openCardSourceType;
	}

	public String getOpenCardUrl() {
		return this.openCardUrl;
	}
	public void setOpenCardUrl(String openCardUrl) {
		this.openCardUrl = openCardUrl;
	}

	public String getSourceAppId() {
		return this.sourceAppId;
	}
	public void setSourceAppId(String sourceAppId) {
		this.sourceAppId = sourceAppId;
	}

}
