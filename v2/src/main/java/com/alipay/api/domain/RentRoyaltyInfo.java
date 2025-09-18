package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分账和分期详情信息
 *
 * @author auto create
 * @since 1.0, 2025-05-09 11:02:21
 */
public class RentRoyaltyInfo extends AlipayObject {

	private static final long serialVersionUID = 6519839589468835455L;

	/**
	 * 2088开头的16位纯数字，小程序场景下获取用户ID请参考：用户授权; 其它场景下获取用户ID请参考：网页授权获取用户信息; 其中buyer_id与buyer_open_id不能同时为空
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付宝用户唯一标识
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 提前结清标志
	 */
	@ApiField("early_settle")
	private Boolean earlySettle;

	/**
	 * 提前结清金额,单位：元
	 */
	@ApiField("early_settle_price")
	private String earlySettlePrice;

	/**
	 * 资方appid
	 */
	@ApiField("invest_app_id")
	private String investAppId;

	/**
	 * 订单分配给的资方的id
	 */
	@ApiField("invest_pid")
	private String investPid;

	/**
	 * 交易组件的业务订单Id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商户订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 租赁分期计划，每一期分期计划详情
	 */
	@ApiListField("plan_list")
	@ApiField("rent_plan")
	private List<RentPlan> planList;

	/**
	 * 分账信息列表，每一期的分账详情
	 */
	@ApiListField("royalty_list")
	@ApiField("rent_royalty")
	private List<RentRoyalty> royaltyList;

	/**
	 * 该笔订单关联资方的状态
	 */
	@ApiField("status")
	private String status;

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

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
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

	public List<RentRoyalty> getRoyaltyList() {
		return this.royaltyList;
	}
	public void setRoyaltyList(List<RentRoyalty> royaltyList) {
		this.royaltyList = royaltyList;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
