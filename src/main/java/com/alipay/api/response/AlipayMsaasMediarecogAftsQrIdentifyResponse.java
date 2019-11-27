package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.afts.qr.identify response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayMsaasMediarecogAftsQrIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7814331947865579298L;

	/** 
	 * 是否识别出二维码
	 */
	@ApiField("has_qr")
	private Boolean hasQr;

	/** 
	 * 识别出来的二维码URL地址
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
