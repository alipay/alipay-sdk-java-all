package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * URL线圈绑定查询
 *
 * @author auto create
 * @since 1.0, 2026-07-15 15:52:54
 */
public class AlipayOpenSpNordermaterialsapplyMaterialsurlbindingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1886585445648341379L;

	/**
	 * null
	 */
	@ApiListField("qr_code_url_list")
	@ApiField("string")
	private List<String> qrCodeUrlList;

	public List<String> getQrCodeUrlList() {
		return this.qrCodeUrlList;
	}
	public void setQrCodeUrlList(List<String> qrCodeUrlList) {
		this.qrCodeUrlList = qrCodeUrlList;
	}

}
