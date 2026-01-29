package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁订单详情，包含租赁时间、金额、订单信息、分期计划、分账计划、租赁单风控信息等详情
 *
 * @author auto create
 * @since 1.0, 2025-10-28 17:57:46
 */
public class RentInfo extends AlipayObject {

	private static final long serialVersionUID = 2362742323286344618L;

	/**
	 * 交易组件的订单Id
	 */
	@ApiField("biz_order_id")
	private String bizOrderId;

	/**
	 * 买家Id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付宝用户唯一标识
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 订单到期买断金，单位：元，精确到小数点后两位
	 */
	@ApiField("buyout_price")
	private String buyoutPrice;

	/**
	 * 提前结清,true表示提前结清
	 */
	@ApiField("early_settle")
	private Boolean earlySettle;

	/**
	 * 提前结清金额，单位：元
	 */
	@ApiField("early_settle_price")
	private String earlySettlePrice;

	/**
	 * 提前结清时间，具体到天
	 */
	@ApiField("early_settle_time")
	private String earlySettleTime;

	/**
	 * 租赁订单的结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 资方appid
	 */
	@ApiField("invest_app_id")
	private String investAppId;

	/**
	 * 资方pid
	 */
	@ApiField("invest_pid")
	private String investPid;

	/**
	 * 商家下单APPID
	 */
	@ApiField("merchant_app_id")
	private String merchantAppId;

	/**
	 * 商家统一社会信用代码
	 */
	@ApiField("merchant_uscc")
	private String merchantUscc;

	/**
	 * 订单信息，包含订单信息、商品信息、收货人信息以及价格信息
	 */
	@ApiField("order_info")
	private SimpleOrderInfo orderInfo;

	/**
	 * 商户订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 租赁分期计划
	 */
	@ApiListField("plan_list")
	@ApiField("rent_plan")
	private List<RentPlan> planList;

	/**
	 * 租赁订单价格，单位：元，精确到小数点后两位
	 */
	@ApiField("price_info")
	private String priceInfo;

	/**
	 * 履约明细信息
	 */
	@ApiListField("rent_detail_list")
	@ApiField("rent_detail")
	private List<RentDetail> rentDetailList;

	/**
	 * 租赁订单id
	 */
	@ApiField("rent_id")
	private String rentId;

	/**
	 * 租赁单状态
	 */
	@ApiField("rent_status")
	private String rentStatus;

	/**
	 * 分账计划详情
	 */
	@ApiListField("royalty_list")
	@ApiField("rent_royalty")
	private List<RentRoyalty> royaltyList;

	/**
	 * 租赁商用户Id
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 二级商户id
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 租赁订单的开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	public String getBizOrderId() {
		return this.bizOrderId;
	}
	public void setBizOrderId(String bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public String getBuyoutPrice() {
		return this.buyoutPrice;
	}
	public void setBuyoutPrice(String buyoutPrice) {
		this.buyoutPrice = buyoutPrice;
	}

	public Boolean getEarlySettle() {
		return this.earlySettle;
	}
	public void setEarlySettle(Boolean earlySettle) {
		this.earlySettle = earlySettle;
	}

	public String getEarlySettlePrice() {
		return this.earlySettlePrice;
	}
	public void setEarlySettlePrice(String earlySettlePrice) {
		this.earlySettlePrice = earlySettlePrice;
	}

	public String getEarlySettleTime() {
		return this.earlySettleTime;
	}
	public void setEarlySettleTime(String earlySettleTime) {
		this.earlySettleTime = earlySettleTime;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getInvestAppId() {
		return this.investAppId;
	}
	public void setInvestAppId(String investAppId) {
		this.investAppId = investAppId;
	}

	public String getInvestPid() {
		return this.investPid;
	}
	public void setInvestPid(String investPid) {
		this.investPid = investPid;
	}

	public String getMerchantAppId() {
		return this.merchantAppId;
	}
	public void setMerchantAppId(String merchantAppId) {
		this.merchantAppId = merchantAppId;
	}

	public String getMerchantUscc() {
		return this.merchantUscc;
	}
	public void setMerchantUscc(String merchantUscc) {
		this.merchantUscc = merchantUscc;
	}

	public SimpleOrderInfo getOrderInfo() {
		return this.orderInfo;
	}
	public void setOrderInfo(SimpleOrderInfo orderInfo) {
		this.orderInfo = orderInfo;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public List<RentPlan> getPlanList() {
		return this.planList;
	}
	public void setPlanList(List<RentPlan> planList) {
		this.planList = planList;
	}

	public String getPriceInfo() {
		return this.priceInfo;
	}
	public void setPriceInfo(String priceInfo) {
		this.priceInfo = priceInfo;
	}

	public List<RentDetail> getRentDetailList() {
		return this.rentDetailList;
	}
	public void setRentDetailList(List<RentDetail> rentDetailList) {
		this.rentDetailList = rentDetailList;
	}

	public String getRentId() {
		return this.rentId;
	}
	public void setRentId(String rentId) {
		this.rentId = rentId;
	}

	public String getRentStatus() {
		return this.rentStatus;
	}
	public void setRentStatus(String rentStatus) {
		this.rentStatus = rentStatus;
	}

	public List<RentRoyalty> getRoyaltyList() {
		return this.royaltyList;
	}
	public void setRoyaltyList(List<RentRoyalty> royaltyList) {
		this.royaltyList = royaltyList;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
