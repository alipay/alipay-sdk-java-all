package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 健康卡聚合信息对象
 *
 * @author auto create
 * @since 1.0, 2020-09-15 14:26:00
 */
public class HealthCardInfo extends AlipayObject {

	private static final long serialVersionUID = 5725518712613843541L;

	/**
	 * 用户真实健康卡数据信息
	 */
	@ApiListField("cards")
	@ApiField("health_card")
	private List<HealthCard> cards;

	/**
	 * 支付宝内用户健康卡领取跳转地址链接，仅在用户没有健康卡数据是返回
	 */
	@ApiField("receive_url")
	private String receiveUrl;

	public List<HealthCard> getCards() {
		return this.cards;
	}
	public void setCards(List<HealthCard> cards) {
		this.cards = cards;
	}

	public String getReceiveUrl() {
		return this.receiveUrl;
	}
	public void setReceiveUrl(String receiveUrl) {
		this.receiveUrl = receiveUrl;
	}

}
