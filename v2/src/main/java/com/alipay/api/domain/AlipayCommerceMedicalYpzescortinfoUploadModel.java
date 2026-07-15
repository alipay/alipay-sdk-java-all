package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗云陪诊线下陪诊数据回流
 *
 * @author auto create
 * @since 1.0, 2026-05-22 16:52:49
 */
public class AlipayCommerceMedicalYpzescortinfoUploadModel extends AlipayObject {

	private static final long serialVersionUID = 5257957957972743776L;

	/**
	 * 支付宝开放id
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 业务流水号
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 更新时间，以此确认前后顺序
	 */
	@ApiField("biz_timestamp")
	private Date bizTimestamp;

	/**
	 * 陪诊师头像链接
	 */
	@ApiField("escort_avatar_url")
	private String escortAvatarUrl;

	/**
	 * 陪诊师证件号
	 */
	@ApiField("escort_cert_no")
	private String escortCertNo;

	/**
	 * 陪诊师证类型
	 */
	@ApiField("escort_cert_type")
	private String escortCertType;

	/**
	 * 陪诊单id
	 */
	@ApiField("escort_id")
	private String escortId;

	/**
	 * 陪诊师姓名
	 */
	@ApiField("escort_name")
	private String escortName;

	/**
	 * 陪诊师电话
	 */
	@ApiField("escort_phone")
	private String escortPhone;

	/**
	 * 陪诊服务时间，一般指开始的时间或者时间段
	 */
	@ApiField("escort_service_time")
	private String escortServiceTime;

	/**
	 * 陪诊师标签列表
	 */
	@ApiField("escort_tag_list")
	private String escortTagList;

	/**
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单来源
	 */
	@ApiField("order_source")
	private String orderSource;

	/**
	 * 机构id
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 服务商
	 */
	@ApiField("service_provider")
	private String serviceProvider;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 业务类型（1:预约记录，2:挂号记录）
	 */
	@ApiField("table_type")
	private String tableType;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("uscc")
	private String uscc;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public Date getBizTimestamp() {
		return this.bizTimestamp;
	}
	public void setBizTimestamp(Date bizTimestamp) {
		this.bizTimestamp = bizTimestamp;
	}

	public String getEscortAvatarUrl() {
		return this.escortAvatarUrl;
	}
	public void setEscortAvatarUrl(String escortAvatarUrl) {
		this.escortAvatarUrl = escortAvatarUrl;
	}

	public String getEscortCertNo() {
		return this.escortCertNo;
	}
	public void setEscortCertNo(String escortCertNo) {
		this.escortCertNo = escortCertNo;
	}

	public String getEscortCertType() {
		return this.escortCertType;
	}
	public void setEscortCertType(String escortCertType) {
		this.escortCertType = escortCertType;
	}

	public String getEscortId() {
		return this.escortId;
	}
	public void setEscortId(String escortId) {
		this.escortId = escortId;
	}

	public String getEscortName() {
		return this.escortName;
	}
	public void setEscortName(String escortName) {
		this.escortName = escortName;
	}

	public String getEscortPhone() {
		return this.escortPhone;
	}
	public void setEscortPhone(String escortPhone) {
		this.escortPhone = escortPhone;
	}

	public String getEscortServiceTime() {
		return this.escortServiceTime;
	}
	public void setEscortServiceTime(String escortServiceTime) {
		this.escortServiceTime = escortServiceTime;
	}

	public String getEscortTagList() {
		return this.escortTagList;
	}
	public void setEscortTagList(String escortTagList) {
		this.escortTagList = escortTagList;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderSource() {
		return this.orderSource;
	}
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getServiceProvider() {
		return this.serviceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTableType() {
		return this.tableType;
	}
	public void setTableType(String tableType) {
		this.tableType = tableType;
	}

	public String getUscc() {
		return this.uscc;
	}
	public void setUscc(String uscc) {
		this.uscc = uscc;
	}

}
