package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据编号查询线圈信息返回值
 *
 * @author auto create
 * @since 1.0, 2025-05-06 10:45:07
 */
public class NOrderTagQueryByCoilNoResp extends AlipayObject {

	private static final long serialVersionUID = 3571144424214332535L;

	/**
	 * 线圈绑定状态
	 */
	@ApiField("bind_status")
	private String bindStatus;

	/**
	 * 点位id
	 */
	@ApiField("position_id")
	private String positionId;

	/**
	 * 碰一下跳转的页面链接
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	public String getBindStatus() {
		return this.bindStatus;
	}
	public void setBindStatus(String bindStatus) {
		this.bindStatus = bindStatus;
	}

	public String getPositionId() {
		return this.positionId;
	}
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}

	public String getQrCodeUrl() {
		return this.qrCodeUrl;
	}
	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}

}
