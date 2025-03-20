package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗导诊卡片格式数据渲染DTO
 *
 * @author auto create
 * @since 1.0, 2023-12-01 15:59:02
 */
public class MedicalGuideCardDTO extends AlipayObject {

	private static final long serialVersionUID = 8198758748717222394L;

	/**
	 * 医疗导诊结果卡片数据
	 */
	@ApiField("card_data")
	private MedicalGuideCardData cardData;

	/**
	 * 医疗导诊结果卡片类型
	 */
	@ApiField("template_code")
	private String templateCode;

	public MedicalGuideCardData getCardData() {
		return this.cardData;
	}
	public void setCardData(MedicalGuideCardData cardData) {
		this.cardData = cardData;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

}
