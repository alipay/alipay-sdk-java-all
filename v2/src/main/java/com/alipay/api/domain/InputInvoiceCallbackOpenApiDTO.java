package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票回调
 *
 * @author auto create
 * @since 1.0, 2023-08-30 14:27:04
 */
public class InputInvoiceCallbackOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 1129743795422172214L;

	/**
	 * 回调消息类型
	 */
	@ApiField("callback_type")
	private String callbackType;

	/**
	 * 业务接收通知消息后针对失败拒绝的详情信息
	 */
	@ApiField("error_info_dto")
	private ErrorInfoDTO errorInfoDto;

	/**
	 * 发票id
	 */
	@ApiField("invoice_id")
	private Long invoiceId;

	/**
	 * 确认的topic的mqKey，用于消息幂等
	 */
	@ApiField("mq_key")
	private String mqKey;

	/**
	 * 业务接收通知消息后是否成功消费
	 */
	@ApiField("notify_succeeded")
	private Boolean notifySucceeded;

	/**
	 * 平台code
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 请求幂等号
	 */
	@ApiField("request_no")
	private String requestNo;

	public String getCallbackType() {
		return this.callbackType;
	}
	public void setCallbackType(String callbackType) {
		this.callbackType = callbackType;
	}

	public ErrorInfoDTO getErrorInfoDto() {
		return this.errorInfoDto;
	}
	public void setErrorInfoDto(ErrorInfoDTO errorInfoDto) {
		this.errorInfoDto = errorInfoDto;
	}

	public Long getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getMqKey() {
		return this.mqKey;
	}
	public void setMqKey(String mqKey) {
		this.mqKey = mqKey;
	}

	public Boolean getNotifySucceeded() {
		return this.notifySucceeded;
	}
	public void setNotifySucceeded(Boolean notifySucceeded) {
		this.notifySucceeded = notifySucceeded;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

}
