package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 补充资质材料接口
 *
 * @author auto create
 * @since 1.0, 2025-04-28 19:11:50
 */
public class AlipayContentLifeaccountCertificateSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 1561869424568297353L;

	/**
	 * 资质证明
	 */
	@ApiField("certificate")
	private CertificateRequest certificate;

	/**
	 * 加密后的好大夫id，与public id一起指定一个操作用户
	 */
	@ApiField("hdf_id_encrypted")
	private String hdfIdEncrypted;

	/**
	 * 用于指定补充资质信息的内容号
	 */
	@ApiField("public_id")
	private String publicId;

	public CertificateRequest getCertificate() {
		return this.certificate;
	}
	public void setCertificate(CertificateRequest certificate) {
		this.certificate = certificate;
	}

	public String getHdfIdEncrypted() {
		return this.hdfIdEncrypted;
	}
	public void setHdfIdEncrypted(String hdfIdEncrypted) {
		this.hdfIdEncrypted = hdfIdEncrypted;
	}

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

}
