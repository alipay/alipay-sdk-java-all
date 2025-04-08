package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户证件信息查询结果。
包含证件类型、证件编号、证件名称、支付宝uid。
 *
 * @author auto create
 * @since 1.0, 2019-05-23 15:31:32
 */
public class CertInfoResponse extends AlipayObject {

	private static final long serialVersionUID = 7667785224847658863L;

	/**
	 * 用户证件名称MD5值。 示例中的md5值对应明文为：张三
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 用户证件号码md5值。
示例中的md5值对应明文为：330120198409141587
	 */
	@ApiField("cert_number")
	private String certNumber;

	/**
	 * 表示证件类型，目前仅支持以下类型：
01 - 身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 支付宝uid列表。一条证件信息可能对应多个支付宝uid。
	 */
	@ApiListField("uid")
	@ApiField("string")
	private List<String> uid;

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertNumber() {
		return this.certNumber;
	}
	public void setCertNumber(String certNumber) {
		this.certNumber = certNumber;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public List<String> getUid() {
		return this.uid;
	}
	public void setUid(List<String> uid) {
		this.uid = uid;
	}

}
