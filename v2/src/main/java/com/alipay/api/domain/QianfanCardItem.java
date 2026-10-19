package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-10 16:12:58
 */
public class QianfanCardItem extends AlipayObject {

	private static final long serialVersionUID = 4642319875773558818L;

	/**
	 * 卡片名称
	 */
	@ApiField("card_name")
	private String cardName;

	/**
	 * 卡片类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 卡片版本
	 */
	@ApiField("card_version")
	private String cardVersion;

	/**
	 * null
	 */
	@ApiListField("components")
	@ApiField("qianfan_card_component")
	private List<QianfanCardComponent> components;

	/**
	 * 卡片意图
	 */
	@ApiField("intent")
	private String intent;

	public String getCardName() {
		return this.cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardVersion() {
		return this.cardVersion;
	}
	public void setCardVersion(String cardVersion) {
		this.cardVersion = cardVersion;
	}

	public List<QianfanCardComponent> getComponents() {
		return this.components;
	}
	public void setComponents(List<QianfanCardComponent> components) {
		this.components = components;
	}

	public String getIntent() {
		return this.intent;
	}
	public void setIntent(String intent) {
		this.intent = intent;
	}

}
