package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.operation.qrcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-10-21 10:22:28
 */
public class AlipayOpenSpOperationQrcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4382143156865386562L;

	/** 
	 * 支付宝操作批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * 二维码图片地址。urlEncode处理过
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo( ) {
		return this.batchNo;
	}

	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}
	public String getQrCodeUrl( ) {
		return this.qrCodeUrl;
	}

}
