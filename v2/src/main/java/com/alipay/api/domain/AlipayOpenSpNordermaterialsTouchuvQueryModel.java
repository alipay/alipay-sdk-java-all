package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 线圈碰唤端UV查询
 *
 * @author auto create
 * @since 1.0, 2026-09-03 17:32:52
 */
public class AlipayOpenSpNordermaterialsTouchuvQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4651881561519897299L;

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
