package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碰一下线圈查询碰一下页面跳转链接
 *
 * @author auto create
 * @since 1.0, 2025-06-10 19:29:06
 */
public class AlipayOpenSpNordertagQrcodeurlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6886634591299272212L;

	/**
	 * 物料编号
	 */
	@ApiField("coil_no")
	private String coilNo;

	/**
	 * 碰一下链接，若和物料编号同时传入，以物料编号为准
	 */
	@ApiField("nfc_url")
	private String nfcUrl;

	public String getCoilNo() {
		return this.coilNo;
	}
	public void setCoilNo(String coilNo) {
		this.coilNo = coilNo;
	}

	public String getNfcUrl() {
		return this.nfcUrl;
	}
	public void setNfcUrl(String nfcUrl) {
		this.nfcUrl = nfcUrl;
	}

}
