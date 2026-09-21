package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-15 10:55:39
 */
public class MerchantCardTemplateRoomPrice extends AlipayObject {

	private static final long serialVersionUID = 6593757287772649743L;

	/**
	 * null
	 */
	@ApiListField("date_price_list")
	@ApiField("merchant_card_template_price_date")
	private List<MerchantCardTemplatePriceDate> datePriceList;

	/**
	 * 场地基础原价，单位为分；如传入，不得小于售价。
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 当前商品下已绑定的场地id
	 */
	@ApiField("room_id")
	private String roomId;

	/**
	 * 场地基础售价，单位为分。
	 */
	@ApiField("sale_price")
	private Long salePrice;

	/**
	 * null
	 */
	@ApiListField("week_price_list")
	@ApiField("merchant_card_template_price_week")
	private List<MerchantCardTemplatePriceWeek> weekPriceList;

	public List<MerchantCardTemplatePriceDate> getDatePriceList() {
		return this.datePriceList;
	}
	public void setDatePriceList(List<MerchantCardTemplatePriceDate> datePriceList) {
		this.datePriceList = datePriceList;
	}

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getRoomId() {
		return this.roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public Long getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}

	public List<MerchantCardTemplatePriceWeek> getWeekPriceList() {
		return this.weekPriceList;
	}
	public void setWeekPriceList(List<MerchantCardTemplatePriceWeek> weekPriceList) {
		this.weekPriceList = weekPriceList;
	}

}
