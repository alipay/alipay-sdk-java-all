package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗导诊会话DTO
 *
 * @author auto create
 * @since 1.0, 2023-12-01 15:59:02
 */
public class MedicalGuideContentDTO extends AlipayObject {

	private static final long serialVersionUID = 4311919451172583976L;

	/**
	 * 卡片格式数据渲染
	 */
	@ApiField("card")
	private MedicalGuideCardDTO card;

	/**
	 * 描述文本
	 */
	@ApiField("text")
	private String text;

	public MedicalGuideCardDTO getCard() {
		return this.card;
	}
	public void setCard(MedicalGuideCardDTO card) {
		this.card = card;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
