package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退凭证信息模型
 *
 * @author auto create
 * @since 1.0, 2023-08-02 11:34:48
 */
public class MiniRefundCertificateDTO extends AlipayObject {

	private static final long serialVersionUID = 2613551182872766522L;

	/**
	 * 本地商品对应的凭证id
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 本地商品次卡对应的次序号
	 */
	@ApiField("serial_no")
	private String serialNo;

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

}
