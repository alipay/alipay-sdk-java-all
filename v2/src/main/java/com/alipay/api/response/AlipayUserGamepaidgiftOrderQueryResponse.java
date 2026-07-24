package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.gamepaidgift.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-22 18:12:51
 */
public class AlipayUserGamepaidgiftOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5819613698949895311L;

	/** 
	 * 该笔订单用户的订单金额 单位：分
	 */
	@ApiField("bill_money")
	private Long billMoney;

	/** 
	 * 游戏商家在平台配置的礼包唯一id
	 */
	@ApiField("paid_gift_id")
	private String paidGiftId;

	/** 
	 * 该笔订单的支付时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/** 
	 * 游戏平台的唯一订单号
	 */
	@ApiField("platform_order_id")
	private String platformOrderId;

	/** 
	 * 该笔订单用户购买的礼包数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/** 
	 * 该笔订单的退款时间，如果订单状态是退款则返回
	 */
	@ApiField("refund_time")
	private Date refundTime;

	/** 
	 * 用户在充值页面填写的角色ID，对应游戏内角色ID
	 */
	@ApiField("role_id")
	private String roleId;

	/** 
	 * 用户充值的区服id，可选
	 */
	@ApiField("server_id")
	private String serverId;

	/** 
	 * CP开发者查询到这几种状态的处理逻辑: success: 订单成功, 正常推进道具发放流程 closed: 订单已关闭, 推进开发者本地订单状态等流程refunded: 订单已退款, 推进开发者本地订单状态等流程 processing: 中间状态, 需要开发者持续轮询, 直到获得明确状态
	 */
	@ApiField("status")
	private String status;

	public void setBillMoney(Long billMoney) {
		this.billMoney = billMoney;
	}
	public Long getBillMoney( ) {
		return this.billMoney;
	}

	public void setPaidGiftId(String paidGiftId) {
		this.paidGiftId = paidGiftId;
	}
	public String getPaidGiftId( ) {
		return this.paidGiftId;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public Date getPayTime( ) {
		return this.payTime;
	}

	public void setPlatformOrderId(String platformOrderId) {
		this.platformOrderId = platformOrderId;
	}
	public String getPlatformOrderId( ) {
		return this.platformOrderId;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Long getQuantity( ) {
		return this.quantity;
	}

	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}
	public Date getRefundTime( ) {
		return this.refundTime;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getRoleId( ) {
		return this.roleId;
	}

	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
	public String getServerId( ) {
		return this.serverId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
