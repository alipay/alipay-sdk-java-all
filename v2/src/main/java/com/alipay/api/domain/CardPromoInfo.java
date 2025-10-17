package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 卡营销优惠信息
 *
 * @author auto create
 * @since 1.0, 2024-12-12 19:24:18
 */
public class CardPromoInfo extends AlipayObject {

	private static final long serialVersionUID = 3197914942473159158L;

	/**
	 * 每期优惠信息
	 */
	@ApiListField("each_promo_list")
	@ApiField("card_each_promo_info")
	private List<CardEachPromoInfo> eachPromoList;

	/**
	 * 资金模式，预付或先享
	 */
	@ApiField("funding_model")
	private String fundingModel;

	/**
	 * 总优惠价，单位分
	 */
	@ApiField("total_promo_price")
	private Long totalPromoPrice;

	public List<CardEachPromoInfo> getEachPromoList() {
		return this.eachPromoList;
	}
	public void setEachPromoList(List<CardEachPromoInfo> eachPromoList) {
		this.eachPromoList = eachPromoList;
	}

	public String getFundingModel() {
		return this.fundingModel;
	}
	public void setFundingModel(String fundingModel) {
		this.fundingModel = fundingModel;
	}

	public Long getTotalPromoPrice() {
		return this.totalPromoPrice;
	}
	public void setTotalPromoPrice(Long totalPromoPrice) {
		this.totalPromoPrice = totalPromoPrice;
	}

}
