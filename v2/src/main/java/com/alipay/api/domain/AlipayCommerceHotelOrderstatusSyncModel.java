package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商履约状态同步接口
 *
 * @author auto create
 * @since 1.0, 2025-03-26 10:34:24
 */
public class AlipayCommerceHotelOrderstatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6823795359451955368L;

	/**
	 * 出行酒店订单id
	 */
	@ApiField("alipay_hotel_order_id")
	private String alipayHotelOrderId;

	/**
	 * 业务发生事件
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * 取消原因
	 */
	@ApiField("cancel_info")
	private OrderStatusSyncCancelInfoDTO cancelInfo;

	/**
	 * 推送订单确认状态时填充
	 */
	@ApiField("confirmation_info")
	private OrderStatusSyncConfirmationInfoDTO confirmationInfo;

	/**
	 * 买家open_id；
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户订单号，创建订单请求由商户传入；
	 */
	@ApiField("outer_order_id")
	private String outerOrderId;

	/**
	 * 枚举值：
已确认:CONFIRMED
确认失败：CONFIRMED_FAIL
待入住:TO_BE_CHECK_IN
已入住:CHECK_IN
已续住:HAVE_STAY
订单取消：CANCELED(和酒店协商一致取消)
已退房:CHECK_OUT
未入住：NO_SHOW
已完成:FINISHED
	 */
	@ApiField("status")
	private String status;

	public String getAlipayHotelOrderId() {
		return this.alipayHotelOrderId;
	}
	public void setAlipayHotelOrderId(String alipayHotelOrderId) {
		this.alipayHotelOrderId = alipayHotelOrderId;
	}

	public String getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}

	public OrderStatusSyncCancelInfoDTO getCancelInfo() {
		return this.cancelInfo;
	}
	public void setCancelInfo(OrderStatusSyncCancelInfoDTO cancelInfo) {
		this.cancelInfo = cancelInfo;
	}

	public OrderStatusSyncConfirmationInfoDTO getConfirmationInfo() {
		return this.confirmationInfo;
	}
	public void setConfirmationInfo(OrderStatusSyncConfirmationInfoDTO confirmationInfo) {
		this.confirmationInfo = confirmationInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOuterOrderId() {
		return this.outerOrderId;
	}
	public void setOuterOrderId(String outerOrderId) {
		this.outerOrderId = outerOrderId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
