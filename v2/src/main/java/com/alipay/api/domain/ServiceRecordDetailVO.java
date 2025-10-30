package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务记录详情
 *
 * @author auto create
 * @since 1.0, 2023-04-26 17:09:19
 */
public class ServiceRecordDetailVO extends AlipayObject {

	private static final long serialVersionUID = 3159955631828323731L;

	/**
	 * 用户身份证号
	 */
	@ApiField("customer_cert_no")
	private String customerCertNo;

	/**
	 * 用户ID
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 用户呼入手机号
	 */
	@ApiField("customer_phone")
	private String customerPhone;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 小计信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 外部单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 服务唯一ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 主键ID
	 */
	@ApiField("service_record_id")
	private String serviceRecordId;

	/**
	 * 服务来源
	 */
	@ApiField("service_source")
	private String serviceSource;

	/**
	 * 服务开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getCustomerCertNo() {
		return this.customerCertNo;
	}
	public void setCustomerCertNo(String customerCertNo) {
		this.customerCertNo = customerCertNo;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerPhone() {
		return this.customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getServiceRecordId() {
		return this.serviceRecordId;
	}
	public void setServiceRecordId(String serviceRecordId) {
		this.serviceRecordId = serviceRecordId;
	}

	public String getServiceSource() {
		return this.serviceSource;
	}
	public void setServiceSource(String serviceSource) {
		this.serviceSource = serviceSource;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
