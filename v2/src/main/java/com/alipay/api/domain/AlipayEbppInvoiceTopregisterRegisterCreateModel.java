package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户工单入驻接口
 *
 * @author auto create
 * @since 1.0, 2024-05-31 09:49:30
 */
public class AlipayEbppInvoiceTopregisterRegisterCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2356356478784756648L;

	/**
	 * 创建工单请求
	 */
	@ApiField("create_request")
	private InvoiceRegisterCreateDTO createRequest;

	public InvoiceRegisterCreateDTO getCreateRequest() {
		return this.createRequest;
	}
	public void setCreateRequest(InvoiceRegisterCreateDTO createRequest) {
		this.createRequest = createRequest;
	}

}
