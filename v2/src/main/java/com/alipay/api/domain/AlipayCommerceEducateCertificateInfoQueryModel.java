package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学生证书信息查询
 *
 * @author auto create
 * @since 1.0, 2021-04-20 16:26:36
 */
public class AlipayCommerceEducateCertificateInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8178885558681793674L;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 扩展信息，json字符串格式
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 外部赛事id
	 */
	@ApiField("source_id")
	private String sourceId;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

}
