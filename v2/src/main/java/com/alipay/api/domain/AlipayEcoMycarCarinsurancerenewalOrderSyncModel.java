package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车险续保订单同步
 *
 * @author auto create
 * @since 1.0, 2026-04-23 20:19:43
 */
public class AlipayEcoMycarCarinsurancerenewalOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7415783399243728737L;

	/**
	 * 业务状态
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 续保订单信息
	 */
	@ApiField("car_insurance_renewal_order_info")
	private CarInsuranceRenewalOrderInfo carInsuranceRenewalOrderInfo;

	/**
	 * 业务发生时间
	 */
	@ApiField("occur_time")
	private Date occurTime;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 车生活订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商家业务流水号，即商家订单多次业务变更的流水号，用于接口请求幂等
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 商家订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 备注信息
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 来源渠道
	 */
	@ApiField("source_channel")
	private String sourceChannel;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizStatus() {
		return this.bizStatus;
	}
	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

	public CarInsuranceRenewalOrderInfo getCarInsuranceRenewalOrderInfo() {
		return this.carInsuranceRenewalOrderInfo;
	}
	public void setCarInsuranceRenewalOrderInfo(CarInsuranceRenewalOrderInfo carInsuranceRenewalOrderInfo) {
		this.carInsuranceRenewalOrderInfo = carInsuranceRenewalOrderInfo;
	}

	public Date getOccurTime() {
		return this.occurTime;
	}
	public void setOccurTime(Date occurTime) {
		this.occurTime = occurTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
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

	public String getSourceChannel() {
		return this.sourceChannel;
	}
	public void setSourceChannel(String sourceChannel) {
		this.sourceChannel = sourceChannel;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
