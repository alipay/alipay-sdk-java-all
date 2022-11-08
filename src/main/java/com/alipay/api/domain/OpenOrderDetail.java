package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单详情
 *
 * @author auto create
 * @since 1.0, 2022-01-10 20:25:44
 */
public class OpenOrderDetail extends AlipayObject {

	private static final long serialVersionUID = 6466539397869857731L;

	/**
	 * 计费方式：
CPM-按展示次数收费
	 */
	@ApiField("charge_type")
	private String chargeType;

	/**
	 * 订单结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 广告投放平台生成的订单ID
	 */
	@ApiField("order_id")
	private Long orderId;

	/**
	 * 订单名称
	 */
	@ApiField("order_name")
	private String orderName;

	/**
	 * 外部平台导入广告库后，广告投放订单对应的外部资源ID
	 */
	@ApiField("order_outer_id")
	private String orderOuterId;

	/**
	 * 订单状态:
INIT-初始化；
STOCK_FAIL-锁库存失败；
STOCK_SUCCESS-锁库存成功；
CANCEL-已取消；
FINISHED-已完成；
TO_BE_START-待开始；
ENABLE-已生效
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 广告投放平台生成委托人ID
	 */
	@ApiField("principal_id")
	private Long principalId;

	/**
	 * 套餐ID
	 */
	@ApiField("profile_id")
	private Long profileId;

	/**
	 * 总保量值
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 售卖方式：
GD-合约交易
	 */
	@ApiField("sell_mode")
	private String sellMode;

	/**
	 * 订单开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 总价格，单位：分
	 */
	@ApiField("total_budget")
	private Long totalBudget;

	/**
	 * 广告投放平台生成广告主/代理商ID
	 */
	@ApiField("user_id")
	private Long userId;

	public String getChargeType() {
		return this.chargeType;
	}
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Long getOrderId() {
		return this.orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return this.orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderOuterId() {
		return this.orderOuterId;
	}
	public void setOrderOuterId(String orderOuterId) {
		this.orderOuterId = orderOuterId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Long getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(Long principalId) {
		this.principalId = principalId;
	}

	public Long getProfileId() {
		return this.profileId;
	}
	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getSellMode() {
		return this.sellMode;
	}
	public void setSellMode(String sellMode) {
		this.sellMode = sellMode;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Long getTotalBudget() {
		return this.totalBudget;
	}
	public void setTotalBudget(Long totalBudget) {
		this.totalBudget = totalBudget;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
