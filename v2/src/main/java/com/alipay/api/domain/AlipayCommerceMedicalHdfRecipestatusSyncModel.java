package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫处方状态同步
 *
 * @author auto create
 * @since 1.0, 2026-07-03 14:52:55
 */
public class AlipayCommerceMedicalHdfRecipestatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4874655954829467648L;

	/**
	 * 账号
	 */
	@ApiField("account")
	private String account;

	/**
	 * 支付宝跳转链接
	 */
	@ApiField("alipay_url")
	private String alipayUrl;

	/**
	 * 阿福跳转链接
	 */
	@ApiField("aq_url")
	private String aqUrl;

	/**
	 * 状态变更时间
	 */
	@ApiField("event_time")
	private String eventTime;

	/**
	 * 信息
	 */
	@ApiField("message")
	private String message;

	/**
	 * 订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 处方ID
	 */
	@ApiField("prescription_id")
	private String prescriptionId;

	/**
	 * 云配药记录ID
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * 报到单ID
	 */
	@ApiField("signin_form_id")
	private String signinFormId;

	/**
	 * 变更后的状态值
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 状态描述
	 */
	@ApiField("status_desc")
	private String statusDesc;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getAlipayUrl() {
		return this.alipayUrl;
	}
	public void setAlipayUrl(String alipayUrl) {
		this.alipayUrl = alipayUrl;
	}

	public String getAqUrl() {
		return this.aqUrl;
	}
	public void setAqUrl(String aqUrl) {
		this.aqUrl = aqUrl;
	}

	public String getEventTime() {
		return this.eventTime;
	}
	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPrescriptionId() {
		return this.prescriptionId;
	}
	public void setPrescriptionId(String prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getSigninFormId() {
		return this.signinFormId;
	}
	public void setSigninFormId(String signinFormId) {
		this.signinFormId = signinFormId;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getStatusDesc() {
		return this.statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

}
