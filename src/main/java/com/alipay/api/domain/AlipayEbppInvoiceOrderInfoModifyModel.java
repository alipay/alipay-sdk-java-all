package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV订单信息变更通知
 *
 * @author auto create
 * @since 1.0, 2020-07-13 14:52:40
 */
public class AlipayEbppInvoiceOrderInfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8736535731332651632L;

	/**
	 * 实际结算金额
	 */
	@ApiField("actual_amount")
	private String actualAmount;

	/**
	 * 入住时间格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_check_in")
	private Date gmtCheckIn;

	/**
	 * 离店时间(入住日期非空时，离店时间非空)
格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_check_out")
	private Date gmtCheckOut;

	/**
	 * 订单开票状态（0, "未开票"

4, "开票中"

8, "开票成功"

16 取消开票

32, "预约开票"

64, "开票失败"

）
	 */
	@ApiField("inv_status")
	private Long invStatus;

	/**
	 * 订单号（platform_code+order_id唯一）
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单状态（1-入住中，2-离店已结算）
	 */
	@ApiField("order_status")
	private Long orderStatus;

	/**
	 * 业务平台code, 由发票中台分配
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 业务平台商户ID/用户ID
	 */
	@ApiField("platform_user_id")
	private String platformUserId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getActualAmount() {
		return this.actualAmount;
	}
	public void setActualAmount(String actualAmount) {
		this.actualAmount = actualAmount;
	}

	public Date getGmtCheckIn() {
		return this.gmtCheckIn;
	}
	public void setGmtCheckIn(Date gmtCheckIn) {
		this.gmtCheckIn = gmtCheckIn;
	}

	public Date getGmtCheckOut() {
		return this.gmtCheckOut;
	}
	public void setGmtCheckOut(Date gmtCheckOut) {
		this.gmtCheckOut = gmtCheckOut;
	}

	public Long getInvStatus() {
		return this.invStatus;
	}
	public void setInvStatus(Long invStatus) {
		this.invStatus = invStatus;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Long getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(Long orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getPlatformUserId() {
		return this.platformUserId;
	}
	public void setPlatformUserId(String platformUserId) {
		this.platformUserId = platformUserId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
