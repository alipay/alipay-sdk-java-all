package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约文件签章描述信息
 *
 * @author auto create
 * @since 1.0, 2017-12-20 15:24:35
 */
public class FileSignature extends AlipayObject {

	private static final long serialVersionUID = 7133456438336425781L;

	/**
	 * 签约主体证件号，关联principal对象
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 图章id/图章模板id
	 */
	@ApiField("seal_id")
	private String sealId;

	/**
	 * 签章位置描述
	 */
	@ApiField("seal_position")
	private SealPosition sealPosition;

	/**
	 * 电子图章类型
1 : 图章模板自动合成
2 : 托管图章编号
	 */
	@ApiField("seal_type")
	private Long sealType;

	/**
	 * 签约原因描述，可展示在PDF签名区
	 */
	@ApiField("sign_reason")
	private String signReason;

	/**
	 * 电子签章类型 
1:仅数字证书文档签名
2:仅图章
3:数字证书文档签名，加盖图章
	 */
	@ApiField("signature_type")
	private Long signatureType;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getSealId() {
		return this.sealId;
	}
	public void setSealId(String sealId) {
		this.sealId = sealId;
	}

	public SealPosition getSealPosition() {
		return this.sealPosition;
	}
	public void setSealPosition(SealPosition sealPosition) {
		this.sealPosition = sealPosition;
	}

	public Long getSealType() {
		return this.sealType;
	}
	public void setSealType(Long sealType) {
		this.sealType = sealType;
	}

	public String getSignReason() {
		return this.signReason;
	}
	public void setSignReason(String signReason) {
		this.signReason = signReason;
	}

	public Long getSignatureType() {
		return this.signatureType;
	}
	public void setSignatureType(Long signatureType) {
		this.signatureType = signatureType;
	}

}
