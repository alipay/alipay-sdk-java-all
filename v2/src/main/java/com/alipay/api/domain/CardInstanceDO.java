package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小目标卡片实例模型
 *
 * @author auto create
 * @since 1.0, 2020-02-24 11:36:25
 */
public class CardInstanceDO extends AlipayObject {

	private static final long serialVersionUID = 3438532652976661447L;

	/**
	 * 小目标卡片Id
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 用户获得卡片的当前星级
	 */
	@ApiField("level")
	private Long level;

	/**
	 * 卡片最大星级
	 */
	@ApiField("max_level")
	private Long maxLevel;

	/**
	 * 小目标卡片名称
	 */
	@ApiField("name")
	private String name;

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public Long getLevel() {
		return this.level;
	}
	public void setLevel(Long level) {
		this.level = level;
	}

	public Long getMaxLevel() {
		return this.maxLevel;
	}
	public void setMaxLevel(Long maxLevel) {
		this.maxLevel = maxLevel;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
