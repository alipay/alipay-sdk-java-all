package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 仓等信息
 *
 * @author auto create
 * @since 1.0, 2023-09-08 13:36:20
 */
public class Cabin extends AlipayObject {

	private static final long serialVersionUID = 4497367626293118421L;

	/**
	 * 减免后成人价，精确到元
若是中转航班，给出打包价格
	 */
	@ApiField("adult_discount_price")
	private String adultDiscountPrice;

	/**
	 * 成人价格，精确到元
若是中转航班，给出打包价格
	 */
	@ApiField("adult_price")
	private String adultPrice;

	/**
	 * 仓等标识
Y-经济舱，C-公务舱，F-头等舱
各个航司为了细分自己的仓等，比如经济舱下面，靠窗的价格高些，中间的价格低些，又可能区分I、J、等
	 */
	@ApiField("cabin_code")
	private String cabinCode;

	/**
	 * 当前仓等相对于基础仓等的折扣，如果是经济舱，相对标准仓等价格为3.1折，则会展示经济舱3.1折
	 */
	@ApiField("cabin_discount")
	private String cabinDiscount;

	/**
	 * 仓等名称描述
	 */
	@ApiField("cabin_name")
	private String cabinName;

	/**
	 * 儿童价格，精确到元，仅作展示
	 */
	@ApiField("child_price")
	private String childPrice;

	/**
	 * 优惠券标签
	 */
	@ApiField("discount_tag")
	private String discountTag;

	/**
	 * 婴儿价格，精确到元，仅作展示
	 */
	@ApiField("infant_price")
	private String infantPrice;

	/**
	 * 餐食描述
	 */
	@ApiField("meal")
	private String meal;

	/**
	 * 余票数量，不明确可为空
	 */
	@ApiField("ticket_count")
	private String ticketCount;

	public String getAdultDiscountPrice() {
		return this.adultDiscountPrice;
	}
	public void setAdultDiscountPrice(String adultDiscountPrice) {
		this.adultDiscountPrice = adultDiscountPrice;
	}

	public String getAdultPrice() {
		return this.adultPrice;
	}
	public void setAdultPrice(String adultPrice) {
		this.adultPrice = adultPrice;
	}

	public String getCabinCode() {
		return this.cabinCode;
	}
	public void setCabinCode(String cabinCode) {
		this.cabinCode = cabinCode;
	}

	public String getCabinDiscount() {
		return this.cabinDiscount;
	}
	public void setCabinDiscount(String cabinDiscount) {
		this.cabinDiscount = cabinDiscount;
	}

	public String getCabinName() {
		return this.cabinName;
	}
	public void setCabinName(String cabinName) {
		this.cabinName = cabinName;
	}

	public String getChildPrice() {
		return this.childPrice;
	}
	public void setChildPrice(String childPrice) {
		this.childPrice = childPrice;
	}

	public String getDiscountTag() {
		return this.discountTag;
	}
	public void setDiscountTag(String discountTag) {
		this.discountTag = discountTag;
	}

	public String getInfantPrice() {
		return this.infantPrice;
	}
	public void setInfantPrice(String infantPrice) {
		this.infantPrice = infantPrice;
	}

	public String getMeal() {
		return this.meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}

	public String getTicketCount() {
		return this.ticketCount;
	}
	public void setTicketCount(String ticketCount) {
		this.ticketCount = ticketCount;
	}

}
