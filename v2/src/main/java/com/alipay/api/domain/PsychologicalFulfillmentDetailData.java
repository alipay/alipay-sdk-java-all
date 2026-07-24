package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 心理权益
 *
 * @author auto create
 * @since 1.0, 2026-07-10 10:44:58
 */
public class PsychologicalFulfillmentDetailData extends AlipayObject {

	private static final long serialVersionUID = 5132819399839266478L;

	/**
	 * 预约开始时间
	 */
	@ApiField("book_time")
	private String bookTime;

	/**
	 * 取消时间
	 */
	@ApiField("cancel_time")
	private String cancelTime;

	/**
	 * 确认时间（预约成功时必填）
	 */
	@ApiField("confirm_time")
	private String confirmTime;

	/**
	 * 咨询师头像
	 */
	@ApiField("counseling_avatar")
	private String counselingAvatar;

	/**
	 * 咨询师姓名
	 */
	@ApiField("counseling_name")
	private String counselingName;

	/**
	 * 咨询师职称
	 */
	@ApiField("counseling_professional")
	private String counselingProfessional;

	/**
	 * 服务类型（比如电话咨询、图文咨询等）
	 */
	@ApiField("counseling_type")
	private String counselingType;

	/**
	 * 下单时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 履约单号
	 */
	@ApiField("fulfillment_no")
	private String fulfillmentNo;

	/**
	 * 履约状态
待预约：PENDING_RESERVE
预约成功：RESERVE_SUCCESS
已取消：CANCELLED
已完成：COMPLETED
	 */
	@ApiField("fulfillment_status")
	private String fulfillmentStatus;

	/**
	 * ISV侧订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 备注（比如异常完成的说明）
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 履约类型，心理权益
	 */
	@ApiField("type")
	private String type;

	public String getBookTime() {
		return this.bookTime;
	}
	public void setBookTime(String bookTime) {
		this.bookTime = bookTime;
	}

	public String getCancelTime() {
		return this.cancelTime;
	}
	public void setCancelTime(String cancelTime) {
		this.cancelTime = cancelTime;
	}

	public String getConfirmTime() {
		return this.confirmTime;
	}
	public void setConfirmTime(String confirmTime) {
		this.confirmTime = confirmTime;
	}

	public String getCounselingAvatar() {
		return this.counselingAvatar;
	}
	public void setCounselingAvatar(String counselingAvatar) {
		this.counselingAvatar = counselingAvatar;
	}

	public String getCounselingName() {
		return this.counselingName;
	}
	public void setCounselingName(String counselingName) {
		this.counselingName = counselingName;
	}

	public String getCounselingProfessional() {
		return this.counselingProfessional;
	}
	public void setCounselingProfessional(String counselingProfessional) {
		this.counselingProfessional = counselingProfessional;
	}

	public String getCounselingType() {
		return this.counselingType;
	}
	public void setCounselingType(String counselingType) {
		this.counselingType = counselingType;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getFulfillmentNo() {
		return this.fulfillmentNo;
	}
	public void setFulfillmentNo(String fulfillmentNo) {
		this.fulfillmentNo = fulfillmentNo;
	}

	public String getFulfillmentStatus() {
		return this.fulfillmentStatus;
	}
	public void setFulfillmentStatus(String fulfillmentStatus) {
		this.fulfillmentStatus = fulfillmentStatus;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
