package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医疗服务maga投放templat
 *
 * @author auto create
 * @since 1.0, 2024-09-30 10:13:03
 */
public class MedicalServiceMagaTemplateDTO extends AlipayObject {

	private static final long serialVersionUID = 5587358889487313852L;

	/**
	 * 服务数量
	 */
	@ApiField("card_count")
	private Long cardCount;

	/**
	 * 服务卡片列表
	 */
	@ApiListField("card_list")
	@ApiField("medical_service_maga_card_d_t_o")
	private List<MedicalServiceMagaCardDTO> cardList;

	/**
	 * 模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 模板名称
	 */
	@ApiField("template_name")
	private String templateName;

	public Long getCardCount() {
		return this.cardCount;
	}
	public void setCardCount(Long cardCount) {
		this.cardCount = cardCount;
	}

	public List<MedicalServiceMagaCardDTO> getCardList() {
		return this.cardList;
	}
	public void setCardList(List<MedicalServiceMagaCardDTO> cardList) {
		this.cardList = cardList;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

}
