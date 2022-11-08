package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.api.qrdetect.identify response.
 * 
 * @author auto create
 * @since 1.0, 2022-02-22 20:21:37
 */
public class AlipayMsaasMediarecogApiQrdetectIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8763536918238165459L;

	/** 
	 * 是否有二维码
	 */
	@ApiField("has_qr")
	private Boolean hasQr;

	/** 
	 * 二维码内容识别
	 */
	@ApiListField("list_url")
	@ApiField("string")
	private List<String> listUrl;

	public void setHasQr(Boolean hasQr) {
		this.hasQr = hasQr;
	}
	public Boolean getHasQr( ) {
		return this.hasQr;
	}

	public void setListUrl(List<String> listUrl) {
		this.listUrl = listUrl;
	}
	public List<String> getListUrl( ) {
		return this.listUrl;
	}

}
