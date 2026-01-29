package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nordermaterialsapply.materials.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-18 15:31:29
 */
public class AlipayOpenSpNordermaterialsapplyMaterialsCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3854113122352173611L;

	/** 
	 * 成立成功的二维码链接，与入参对应
	 */
	@ApiListField("qr_code_url_list")
	@ApiField("string")
	private List<String> qrCodeUrlList;

	public void setQrCodeUrlList(List<String> qrCodeUrlList) {
		this.qrCodeUrlList = qrCodeUrlList;
	}
	public List<String> getQrCodeUrlList( ) {
		return this.qrCodeUrlList;
	}

}
