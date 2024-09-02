package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料领券信息绑定接口
 *
 * @author auto create
 * @since 1.0, 2024-04-29 10:22:52
 */
public class AlipayCommerceOperationMaterialVoucherBindModel extends AlipayObject {

	private static final long serialVersionUID = 7824594751783721694L;

	/**
	 * 外部业务号，用于幂等使用
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 扫描物料的码值
	 */
	@ApiField("qr_code")
	private String qrCode;

	/**
	 * 券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getQrCode() {
		return this.qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
