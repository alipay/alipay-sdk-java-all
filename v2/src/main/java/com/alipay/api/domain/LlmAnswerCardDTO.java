package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 大模型回答接口相关的卡片返回
 *
 * @author auto create
 * @since 1.0, 2024-07-26 11:35:14
 */
public class LlmAnswerCardDTO extends AlipayObject {

	private static final long serialVersionUID = 1593365385849333635L;

	/**
	 * 用于返回卡片的固定回答文本内容
	 */
	@ApiField("card_answer")
	private String cardAnswer;

	/**
	 * 卡片数据
	 */
	@ApiListField("card_data")
	@ApiField("card_data_info_d_t_o")
	private List<CardDataInfoDTO> cardData;

	/**
	 * 卡片类型
	 */
	@ApiField("card_type")
	private String cardType;

	public String getCardAnswer() {
		return this.cardAnswer;
	}
	public void setCardAnswer(String cardAnswer) {
		this.cardAnswer = cardAnswer;
	}

	public List<CardDataInfoDTO> getCardData() {
		return this.cardData;
	}
	public void setCardData(List<CardDataInfoDTO> cardData) {
		this.cardData = cardData;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

}
