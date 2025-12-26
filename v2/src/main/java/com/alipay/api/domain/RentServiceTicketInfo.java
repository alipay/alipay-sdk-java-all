package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务单信息
 *
 * @author auto create
 * @since 1.0, 2025-12-25 10:47:36
 */
public class RentServiceTicketInfo extends AlipayObject {

	private static final long serialVersionUID = 2858931554533352636L;

	/**
	 * 收货地址
	 */
	@ApiField("address_info")
	private RentServiceTicketReceiverAddressInfoDTO addressInfo;

	/**
	 * 服务单的业务主状态
	 */
	@ApiField("biz_main_status")
	private String bizMainStatus;

	/**
	 * 业务子状态
	 */
	@ApiField("biz_sub_status")
	private String bizSubStatus;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 服务单号
	 */
	@ApiField("service_ticket_id")
	private String serviceTicketId;

	/**
	 * 服务工单类型
	 */
	@ApiField("type")
	private String type;

	public RentServiceTicketReceiverAddressInfoDTO getAddressInfo() {
		return this.addressInfo;
	}
	public void setAddressInfo(RentServiceTicketReceiverAddressInfoDTO addressInfo) {
		this.addressInfo = addressInfo;
	}

	public String getBizMainStatus() {
		return this.bizMainStatus;
	}
	public void setBizMainStatus(String bizMainStatus) {
		this.bizMainStatus = bizMainStatus;
	}

	public String getBizSubStatus() {
		return this.bizSubStatus;
	}
	public void setBizSubStatus(String bizSubStatus) {
		this.bizSubStatus = bizSubStatus;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getServiceTicketId() {
		return this.serviceTicketId;
	}
	public void setServiceTicketId(String serviceTicketId) {
		this.serviceTicketId = serviceTicketId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
