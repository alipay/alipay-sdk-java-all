package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预约反馈
 *
 * @author auto create
 * @since 1.0, 2020-05-07 15:28:43
 */
public class AlipayEcoRenthouseReservationFeedbackSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4139828571515851173L;

	/**
	 * 备注
	 */
	@ApiField("audit_comment")
	private String auditComment;

	/**
	 * 商户确认的看房时间（如果跟租客确定的时间不一致）
	 */
	@ApiField("final_look_time")
	private String finalLookTime;

	/**
	 * 带看房人姓名
	 */
	@ApiField("looker_name")
	private String lookerName;

	/**
	 * 带看房人电话
	 */
	@ApiField("looker_phone")
	private String lookerPhone;

	/**
	 * 比如某种业务标准外部订单号,比如交易外部订单号，代表商户端自己订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 预约单流水号，唯一标识指定预约单
	 */
	@ApiField("reservation_no")
	private String reservationNo;

	/**
	 * 商户端反馈租户是否预约成功！
SUCCESS：预约成功
FAIL：预约失败
CANCEL：预约取消(必须先预约成功处理)
	 */
	@ApiField("reserve_status")
	private String reserveStatus;

	/**
	 * 商户端房源编号
	 */
	@ApiField("room_code")
	private String roomCode;

	public String getAuditComment() {
		return this.auditComment;
	}
	public void setAuditComment(String auditComment) {
		this.auditComment = auditComment;
	}

	public String getFinalLookTime() {
		return this.finalLookTime;
	}
	public void setFinalLookTime(String finalLookTime) {
		this.finalLookTime = finalLookTime;
	}

	public String getLookerName() {
		return this.lookerName;
	}
	public void setLookerName(String lookerName) {
		this.lookerName = lookerName;
	}

	public String getLookerPhone() {
		return this.lookerPhone;
	}
	public void setLookerPhone(String lookerPhone) {
		this.lookerPhone = lookerPhone;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getReservationNo() {
		return this.reservationNo;
	}
	public void setReservationNo(String reservationNo) {
		this.reservationNo = reservationNo;
	}

	public String getReserveStatus() {
		return this.reserveStatus;
	}
	public void setReserveStatus(String reserveStatus) {
		this.reserveStatus = reserveStatus;
	}

	public String getRoomCode() {
		return this.roomCode;
	}
	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}

}
