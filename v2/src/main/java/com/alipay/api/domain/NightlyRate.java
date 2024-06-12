package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 每日价格
 *
 * @author auto create
 * @since 1.0, 2024-05-21 19:36:20
 */
public class NightlyRate extends AlipayObject {

	private static final long serialVersionUID = 8741115755683836319L;

	/**
	 * 加床价
（BigDecimal）（元）
-1表示不能加床
	 */
	@ApiField("add_bed")
	private String addBed;

	/**
	 * 划线价
（BigDecimal）（元）
	 */
	@ApiField("basis")
	private String basis;

	/**
	 * 早餐份数
	 */
	@ApiField("breakfast")
	private Long breakfast;

	/**
	 * 结算价
（BigDecimal）（元）
仅用于结算价模式下的预付产品可用，非结算价模式下返回-1
	 */
	@ApiField("cost")
	private String cost;

	/**
	 * 当天日期
	 */
	@ApiField("date")
	private String date;

	/**
	 * 会员价（BigDecimal）（元）
已经通过DRR的计算可以直接显示给客人。价格为-1表示不能销售
	 */
	@ApiField("member")
	private String member;

	/**
	 * 优惠金额
（BigDecimal）（元）
	 */
	@ApiField("price_discount_value")
	private String priceDiscountValue;

	/**
	 * 酒店价格优惠详细列表
	 */
	@ApiListField("promotion_list")
	@ApiField("hotel_promotion_detail")
	private List<HotelPromotionDetail> promotionList;

	/**
	 * 促销活动名
	 */
	@ApiField("promotion_tag")
	private String promotionTag;

	/**
	 * 促销类型
0:未定义,
1:天天特价,
2:门店新客
	 */
	@ApiField("promotion_type")
	private Long promotionType;

	/**
	 * 库存状态
表示当天库存是否可用
	 */
	@ApiField("status")
	private Boolean status;

	public String getAddBed() {
		return this.addBed;
	}
	public void setAddBed(String addBed) {
		this.addBed = addBed;
	}

	public String getBasis() {
		return this.basis;
	}
	public void setBasis(String basis) {
		this.basis = basis;
	}

	public Long getBreakfast() {
		return this.breakfast;
	}
	public void setBreakfast(Long breakfast) {
		this.breakfast = breakfast;
	}

	public String getCost() {
		return this.cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getMember() {
		return this.member;
	}
	public void setMember(String member) {
		this.member = member;
	}

	public String getPriceDiscountValue() {
		return this.priceDiscountValue;
	}
	public void setPriceDiscountValue(String priceDiscountValue) {
		this.priceDiscountValue = priceDiscountValue;
	}

	public List<HotelPromotionDetail> getPromotionList() {
		return this.promotionList;
	}
	public void setPromotionList(List<HotelPromotionDetail> promotionList) {
		this.promotionList = promotionList;
	}

	public String getPromotionTag() {
		return this.promotionTag;
	}
	public void setPromotionTag(String promotionTag) {
		this.promotionTag = promotionTag;
	}

	public Long getPromotionType() {
		return this.promotionType;
	}
	public void setPromotionType(Long promotionType) {
		this.promotionType = promotionType;
	}

	public Boolean getStatus() {
		return this.status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}

}
