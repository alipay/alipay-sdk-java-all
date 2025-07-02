package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回传铺设的物料信息
 *
 * @author auto create
 * @since 1.0, 2024-09-11 09:52:58
 */
public class CallBackMaterialsInfo extends AlipayObject {

	private static final long serialVersionUID = 2365282182216323919L;

	/**
	 * 门店桌号
	 */
	@ApiField("desk_no")
	private String deskNo;

	/**
	 * 点餐二维码链接
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	public String getDeskNo() {
		return this.deskNo;
	}
	public void setDeskNo(String deskNo) {
		this.deskNo = deskNo;
	}

	public String getQrCodeUrl() {
		return this.qrCodeUrl;
	}
	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}

}
