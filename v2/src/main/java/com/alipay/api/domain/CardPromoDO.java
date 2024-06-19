package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小目标卡片绑定的权益信息
 *
 * @author auto create
 * @since 1.0, 2020-02-24 11:36:25
 */
public class CardPromoDO extends AlipayObject {

	private static final long serialVersionUID = 7694689529685832718L;

	/**
	 * 卡片Id
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 卡片星级
	 */
	@ApiField("card_level")
	private Long cardLevel;

	/**
	 * 是否限时权益
	 */
	@ApiField("limit")
	private Boolean limit;

	/**
	 * 权益图标
	 */
	@ApiField("promo_icon")
	private String promoIcon;

	/**
	 * 权益名称
	 */
	@ApiField("promo_title")
	private String promoTitle;

	/**
	 * 用户是否领取了该权益
	 */
	@ApiField("received")
	private Boolean received;

	/**
	 * 目标打卡次数，打卡target_mark_count天可以获取该权益
	 */
	@ApiField("target_mark_count")
	private Long targetMarkCount;

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public Long getCardLevel() {
		return this.cardLevel;
	}
	public void setCardLevel(Long cardLevel) {
		this.cardLevel = cardLevel;
	}

	public Boolean getLimit() {
		return this.limit;
	}
	public void setLimit(Boolean limit) {
		this.limit = limit;
	}

	public String getPromoIcon() {
		return this.promoIcon;
	}
	public void setPromoIcon(String promoIcon) {
		this.promoIcon = promoIcon;
	}

	public String getPromoTitle() {
		return this.promoTitle;
	}
	public void setPromoTitle(String promoTitle) {
		this.promoTitle = promoTitle;
	}

	public Boolean getReceived() {
		return this.received;
	}
	public void setReceived(Boolean received) {
		this.received = received;
	}

	public Long getTargetMarkCount() {
		return this.targetMarkCount;
	}
	public void setTargetMarkCount(Long targetMarkCount) {
		this.targetMarkCount = targetMarkCount;
	}

}
