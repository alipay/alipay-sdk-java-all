package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联合营销消费券N选M玩法开放场景 奖品类目详情信息
 *
 * @author auto create
 * @since 1.0, 2023-07-07 10:20:42
 */
public class OpenPrizeCategoryDetail extends AlipayObject {

	private static final long serialVersionUID = 5221573157929923573L;

	/**
	 * 剩余可领取次数
	 */
	@ApiField("available_receive")
	private Long availableReceive;

	/**
	 * 类目剩余可领取次数
	 */
	@ApiField("category_available_receive")
	private Long categoryAvailableReceive;

	/**
	 * 当前群组已领取次数
	 */
	@ApiField("current_group_receive")
	private Long currentGroupReceive;

	/**
	 * 当前类目已领取次数
	 */
	@ApiField("current_receive")
	private Long currentReceive;

	/**
	 * 券满减门槛-满金额，单位：元
	 */
	@ApiField("from_amount")
	private String fromAmount;

	/**
	 * 群组剩余可领取次数
	 */
	@ApiField("group_available_receive")
	private Long groupAvailableReceive;

	/**
	 * 当前群组领取次数上限
	 */
	@ApiField("group_limit")
	private Long groupLimit;

	/**
	 * 群组剩余实际可领取次数（排除掉没有预算的奖品个数）
	 */
	@ApiField("group_real_available_receive")
	private Long groupRealAvailableReceive;

	/**
	 * 不同分组间展示排序顺序,值小的展示在前
	 */
	@ApiField("group_view_order")
	private Long groupViewOrder;

	/**
	 * 同一分组内部展示排序顺序,值小的展示在前
	 */
	@ApiField("inner_view_order")
	private Long innerViewOrder;

	/**
	 * 奖品ID
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 是否已达类目领取上限
	 */
	@ApiField("reach_category_limit")
	private Boolean reachCategoryLimit;

	/**
	 * 是否已达到群组领取上限
	 */
	@ApiField("reach_group_limit")
	private Boolean reachGroupLimit;

	/**
	 * 是否已到领取上限（类目 || 群组）
	 */
	@ApiField("reach_upper_limit")
	private Boolean reachUpperLimit;

	/**
	 * 类目领取次数上限
	 */
	@ApiField("receive_limit")
	private Long receiveLimit;

	/**
	 * 是否剩余预算
	 */
	@ApiField("remain_budget")
	private Boolean remainBudget;

	/**
	 * 券状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 券模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 券满减门槛-减金额（仅适用于满减券），单位：元
	 */
	@ApiField("to_amount")
	private String toAmount;

	/**
	 * 券所属行业/类目
	 */
	@ApiField("voucher_biz_code")
	private String voucherBizCode;

	public Long getAvailableReceive() {
		return this.availableReceive;
	}
	public void setAvailableReceive(Long availableReceive) {
		this.availableReceive = availableReceive;
	}

	public Long getCategoryAvailableReceive() {
		return this.categoryAvailableReceive;
	}
	public void setCategoryAvailableReceive(Long categoryAvailableReceive) {
		this.categoryAvailableReceive = categoryAvailableReceive;
	}

	public Long getCurrentGroupReceive() {
		return this.currentGroupReceive;
	}
	public void setCurrentGroupReceive(Long currentGroupReceive) {
		this.currentGroupReceive = currentGroupReceive;
	}

	public Long getCurrentReceive() {
		return this.currentReceive;
	}
	public void setCurrentReceive(Long currentReceive) {
		this.currentReceive = currentReceive;
	}

	public String getFromAmount() {
		return this.fromAmount;
	}
	public void setFromAmount(String fromAmount) {
		this.fromAmount = fromAmount;
	}

	public Long getGroupAvailableReceive() {
		return this.groupAvailableReceive;
	}
	public void setGroupAvailableReceive(Long groupAvailableReceive) {
		this.groupAvailableReceive = groupAvailableReceive;
	}

	public Long getGroupLimit() {
		return this.groupLimit;
	}
	public void setGroupLimit(Long groupLimit) {
		this.groupLimit = groupLimit;
	}

	public Long getGroupRealAvailableReceive() {
		return this.groupRealAvailableReceive;
	}
	public void setGroupRealAvailableReceive(Long groupRealAvailableReceive) {
		this.groupRealAvailableReceive = groupRealAvailableReceive;
	}

	public Long getGroupViewOrder() {
		return this.groupViewOrder;
	}
	public void setGroupViewOrder(Long groupViewOrder) {
		this.groupViewOrder = groupViewOrder;
	}

	public Long getInnerViewOrder() {
		return this.innerViewOrder;
	}
	public void setInnerViewOrder(Long innerViewOrder) {
		this.innerViewOrder = innerViewOrder;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public Boolean getReachCategoryLimit() {
		return this.reachCategoryLimit;
	}
	public void setReachCategoryLimit(Boolean reachCategoryLimit) {
		this.reachCategoryLimit = reachCategoryLimit;
	}

	public Boolean getReachGroupLimit() {
		return this.reachGroupLimit;
	}
	public void setReachGroupLimit(Boolean reachGroupLimit) {
		this.reachGroupLimit = reachGroupLimit;
	}

	public Boolean getReachUpperLimit() {
		return this.reachUpperLimit;
	}
	public void setReachUpperLimit(Boolean reachUpperLimit) {
		this.reachUpperLimit = reachUpperLimit;
	}

	public Long getReceiveLimit() {
		return this.receiveLimit;
	}
	public void setReceiveLimit(Long receiveLimit) {
		this.receiveLimit = receiveLimit;
	}

	public Boolean getRemainBudget() {
		return this.remainBudget;
	}
	public void setRemainBudget(Boolean remainBudget) {
		this.remainBudget = remainBudget;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getToAmount() {
		return this.toAmount;
	}
	public void setToAmount(String toAmount) {
		this.toAmount = toAmount;
	}

	public String getVoucherBizCode() {
		return this.voucherBizCode;
	}
	public void setVoucherBizCode(String voucherBizCode) {
		this.voucherBizCode = voucherBizCode;
	}

}
