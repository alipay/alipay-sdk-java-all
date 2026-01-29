package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车行程异常情况反馈
 *
 * @author auto create
 * @since 1.0, 2025-12-30 10:05:41
 */
public class AlipayCommerceTransportParkingFeedbackSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7283673827224221232L;

	/**
	 * 服务商对于支付宝提供的异常行程处理的结果
枚举值
未处理: UNPROCESSED
处理中: PROCESSING
已处理: PROCESSED
不处理: NOT_PROCESSABLE
	 */
	@ApiField("feedback_result")
	private String feedbackResult;

	/**
	 * 用户反馈时间
	 */
	@ApiField("feedback_time")
	private Date feedbackTime;

	/**
	 * 反馈类型
	 */
	@ApiField("feedback_type")
	private String feedbackType;

	/**
	 * 用户反馈的行程异常的原因
	 */
	@ApiField("feedback_type_msg")
	private String feedbackTypeMsg;

	/**
	 * 外部停车流水号(用于串通进场与出场信息)
	 */
	@ApiField("out_serial_no")
	private String outSerialNo;

	/**
	 * 支付宝停车平台ID，由支付宝定义的该停车场标识，同一个isv或商户范围内唯一。通过 alipay.eco.mycar.parking.parkinglotinfo.create
(录入停车场信息)接口获取。
	 */
	@ApiField("parking_id")
	private String parkingId;

	/**
	 * 车牌颜色，车牌颜色，枚举支持：
*BLUE：蓝。
*GREEN：绿。
*YELLOW：黄。
*WHITE：白。
*BLACK：黑。
*LIMEGREEN：黄绿色。
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 车牌号码
	 */
	@ApiField("plate_no")
	private String plateNo;

	public String getFeedbackResult() {
		return this.feedbackResult;
	}
	public void setFeedbackResult(String feedbackResult) {
		this.feedbackResult = feedbackResult;
	}

	public Date getFeedbackTime() {
		return this.feedbackTime;
	}
	public void setFeedbackTime(Date feedbackTime) {
		this.feedbackTime = feedbackTime;
	}

	public String getFeedbackType() {
		return this.feedbackType;
	}
	public void setFeedbackType(String feedbackType) {
		this.feedbackType = feedbackType;
	}

	public String getFeedbackTypeMsg() {
		return this.feedbackTypeMsg;
	}
	public void setFeedbackTypeMsg(String feedbackTypeMsg) {
		this.feedbackTypeMsg = feedbackTypeMsg;
	}

	public String getOutSerialNo() {
		return this.outSerialNo;
	}
	public void setOutSerialNo(String outSerialNo) {
		this.outSerialNo = outSerialNo;
	}

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

	public String getPlateColor() {
		return this.plateColor;
	}
	public void setPlateColor(String plateColor) {
		this.plateColor = plateColor;
	}

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

}
