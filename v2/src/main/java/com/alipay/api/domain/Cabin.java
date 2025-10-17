package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 仓等信息
 *
 * @author auto create
 * @since 1.0, 2024-09-30 01:14:33
 */
public class Cabin extends AlipayObject {

	private static final long serialVersionUID = 1866883731843531936L;

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
	 * 优惠列表
	 */
	@ApiListField("discount_list")
	@ApiField("discount")
	private List<Discount> discountList;

	/**
	 * 优惠券标签
	 */
	@ApiField("discount_tag")
	private String discountTag;

	/**
	 * 燃油费用，精确到：元
	 */
	@ApiField("fuel_cost")
	private String fuelCost;

	/**
	 * 婴儿价格，精确到元，仅作展示
	 */
	@ApiField("infant_price")
	private String infantPrice;

	/**
	 * 基建费用，精确到元
	 */
	@ApiField("infrastructure_cost")
	private String infrastructureCost;

	/**
	 * 航班详情跳转链接
	 */
	@ApiField("link_url")
	private String linkUrl;

	/**
	 * 托运政策描述
	 */
	@ApiListField("luggage_policies")
	@ApiField("luggage_policy")
	private List<LuggagePolicy> luggagePolicies;

	/**
	 * 餐食描述
	 */
	@ApiField("meal")
	private String meal;

	/**
	 * 改签政策
	 */
	@ApiListField("rebook_policies")
	@ApiField("policy")
	private List<Policy> rebookPolicies;

	/**
	 * 退票政策
	 */
	@ApiListField("refund_policies")
	@ApiField("policy")
	private List<Policy> refundPolicies;

	/**
	 * 报销政策
	 */
	@ApiListField("reimbursement_policies")
	@ApiField("reimbursement_policy")
	private List<ReimbursementPolicy> reimbursementPolicies;

	/**
	 * 售卖限制的列表
	 */
	@ApiListField("sale_controls")
	@ApiField("sale_control")
	private List<SaleControl> saleControls;

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

	public List<Discount> getDiscountList() {
		return this.discountList;
	}
	public void setDiscountList(List<Discount> discountList) {
		this.discountList = discountList;
	}

	public String getDiscountTag() {
		return this.discountTag;
	}
	public void setDiscountTag(String discountTag) {
		this.discountTag = discountTag;
	}

	public String getFuelCost() {
		return this.fuelCost;
	}
	public void setFuelCost(String fuelCost) {
		this.fuelCost = fuelCost;
	}

	public String getInfantPrice() {
		return this.infantPrice;
	}
	public void setInfantPrice(String infantPrice) {
		this.infantPrice = infantPrice;
	}

	public String getInfrastructureCost() {
		return this.infrastructureCost;
	}
	public void setInfrastructureCost(String infrastructureCost) {
		this.infrastructureCost = infrastructureCost;
	}

	public String getLinkUrl() {
		return this.linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public List<LuggagePolicy> getLuggagePolicies() {
		return this.luggagePolicies;
	}
	public void setLuggagePolicies(List<LuggagePolicy> luggagePolicies) {
		this.luggagePolicies = luggagePolicies;
	}

	public String getMeal() {
		return this.meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}

	public List<Policy> getRebookPolicies() {
		return this.rebookPolicies;
	}
	public void setRebookPolicies(List<Policy> rebookPolicies) {
		this.rebookPolicies = rebookPolicies;
	}

	public List<Policy> getRefundPolicies() {
		return this.refundPolicies;
	}
	public void setRefundPolicies(List<Policy> refundPolicies) {
		this.refundPolicies = refundPolicies;
	}

	public List<ReimbursementPolicy> getReimbursementPolicies() {
		return this.reimbursementPolicies;
	}
	public void setReimbursementPolicies(List<ReimbursementPolicy> reimbursementPolicies) {
		this.reimbursementPolicies = reimbursementPolicies;
	}

	public List<SaleControl> getSaleControls() {
		return this.saleControls;
	}
	public void setSaleControls(List<SaleControl> saleControls) {
		this.saleControls = saleControls;
	}

	public String getTicketCount() {
		return this.ticketCount;
	}
	public void setTicketCount(String ticketCount) {
		this.ticketCount = ticketCount;
	}

}
