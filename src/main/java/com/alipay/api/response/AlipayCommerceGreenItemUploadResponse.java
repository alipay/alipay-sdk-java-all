package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QrCodeOperationLog;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.green.item.upload response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-10 16:27:45
 */
public class AlipayCommerceGreenItemUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5699849476345875229L;

	/** 
	 * 失败的能量码操作日志
	 */
	@ApiListField("failed_qr_code_log_list")
	@ApiField("qr_code_operation_log")
	private List<QrCodeOperationLog> failedQrCodeLogList;

	public void setFailedQrCodeLogList(List<QrCodeOperationLog> failedQrCodeLogList) {
		this.failedQrCodeLogList = failedQrCodeLogList;
	}
	public List<QrCodeOperationLog> getFailedQrCodeLogList( ) {
		return this.failedQrCodeLogList;
	}

}
