package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * crm发送工作通知
 *
 * @author auto create
 * @since 1.0, 2023-10-18 19:10:06
 */
public class AnttechOceanbaseObglobalCrmmsgSendModel extends AlipayObject {

	private static final long serialVersionUID = 1439267151144844562L;

	/**
	 * 入参
	 */
	@ApiField("crm_notify_request")
	private String crmNotifyRequest;

	public String getCrmNotifyRequest() {
		return this.crmNotifyRequest;
	}
	public void setCrmNotifyRequest(String crmNotifyRequest) {
		this.crmNotifyRequest = crmNotifyRequest;
	}

}
