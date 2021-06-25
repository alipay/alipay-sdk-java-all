package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推荐卡相关信息
 *
 * @author auto create
 * @since 1.0, 2020-03-10 10:32:56
 */
public class RecommendCard extends AlipayObject {

	private static final long serialVersionUID = 1736511698448763976L;

	/**
	 * 卡名称
	 */
	@ApiField("card_name")
	private String cardName;

	/**
	 * 卡的推荐理由，非必须项
	 */
	@ApiField("card_recommend_reason")
	private String cardRecommendReason;

	/**
	 * 卡类型，非必须项
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 卡类目1，非必须项
	 */
	@ApiField("cate_1")
	private String cate1;

	/**
	 * 卡类目2，非必须项
	 */
	@ApiField("cate_2")
	private String cate2;

	/**
	 * 卡类目3，非必须项
	 */
	@ApiField("cate_3")
	private String cate3;

	public String getCardName() {
		return this.cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardRecommendReason() {
		return this.cardRecommendReason;
	}
	public void setCardRecommendReason(String cardRecommendReason) {
		this.cardRecommendReason = cardRecommendReason;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCate1() {
		return this.cate1;
	}
	public void setCate1(String cate1) {
		this.cate1 = cate1;
	}

	public String getCate2() {
		return this.cate2;
	}
	public void setCate2(String cate2) {
		this.cate2 = cate2;
	}

	public String getCate3() {
		return this.cate3;
	}
	public void setCate3(String cate3) {
		this.cate3 = cate3;
	}

}
