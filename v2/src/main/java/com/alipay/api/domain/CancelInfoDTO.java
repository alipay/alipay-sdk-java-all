package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒旅项目-订单确认接口-取消信息
 *
 * @author auto create
 * @since 1.0, 2025-03-26 10:34:21
 */
public class CancelInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7429746138219813618L;

	/**
	 * 取消类型,PAY_FAILED-未支付（超时关闭）
RESERVATION_INFO_ERROR-订单信息有误
OTHER_BOOKING_CHANNEL-通过其它途径预订
TRIP_CHANGED-行程变更
REPEAT-重单
OTHER-其它
	 */
	@ApiField("cancel_code")
	private String cancelCode;

	/**
	 * 取消原因
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 订单取消时间,格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("cancel_time")
	private String cancelTime;

	/**
	 * 取消罚金值,根据查询时间计算
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

	public String getCancelTime() {
		return this.cancelTime;
	}
	public void setCancelTime(String cancelTime) {
		this.cancelTime = cancelTime;
	}

	public EtravelHotelSupplyPriceDTO getPenaltyAmount() {
		return this.penaltyAmount;
	}
	public void setPenaltyAmount(EtravelHotelSupplyPriceDTO penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}

}
