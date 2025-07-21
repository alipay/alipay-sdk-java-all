package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒旅项目-服务商履约状态同步接口-取消原因
 *
 * @author auto create
 * @since 1.0, 2025-03-26 10:34:24
 */
public class OrderStatusSyncCancelInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1487256511786172519L;

	/**
	 * PAY_FAILED-未支付（超时关闭）
RESERVATION_INFO_ERROR-订单信息有误
OTHER_BOOKING_CHANNEL-通过其它途径预订
TRIP_CHANGED-行程变更
REPEAT-重单
USER_AGREE-用户协商一致取消
PRICE_CHANGE-变价
NOSHOW-用户未入住
FULLY_BOOKED：满房
OTHER-其它
	 */
	@ApiField("cancel_code")
	private String cancelCode;

	/**
	 * 文字描述
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 取消罚金
	 */
	@ApiField("penalty_amount")
	private EtravelHotelSupplyPriceDTO penaltyAmount;

	public String getCancelCode() {
		return this.cancelCode;
	}
	public void setCancelCode(String cancelCode) {
		this.cancelCode = cancelCode;
	}

	public String getCancelReason() {
		return this.cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public EtravelHotelSupplyPriceDTO getPenaltyAmount() {
		return this.penaltyAmount;
	}
	public void setPenaltyAmount(EtravelHotelSupplyPriceDTO penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}

}
