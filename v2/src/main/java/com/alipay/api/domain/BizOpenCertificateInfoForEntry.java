package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 证件信息
 *
 * @author auto create
 * @since 1.0, 2026-01-04 14:12:37
 */
public class BizOpenCertificateInfoForEntry extends AlipayObject {

	private static final long serialVersionUID = 8383953273991935672L;

	/**
	 * 证件名称
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件图片类型
	 */
	@ApiField("cert_pic_type")
	private String certPicType;

	/**
	 * 证件图片,通过调用 <a href="https://isp-fe-tern.alipay.com/legacy/my/openApiDetailAndApply?apiId=24075&operateType=detail">ant.merchant.expand.indirect.image.upload</a>(图片上传)接口返回的image_id作为参数
	 */
	@ApiListField("cert_pics")
	@ApiField("string")
	private List<String> certPics;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 失效时间
	 */
	@ApiField("gmt_invalid")
	private String gmtInvalid;

	/**
	 * 生效时间
	 */
	@ApiField("gmt_valid")
	private String gmtValid;

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertPicType() {
		return this.certPicType;
	}
	public void setCertPicType(String certPicType) {
		this.certPicType = certPicType;
	}

	public List<String> getCertPics() {
		return this.certPics;
	}
	public void setCertPics(List<String> certPics) {
		this.certPics = certPics;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getGmtInvalid() {
		return this.gmtInvalid;
	}
	public void setGmtInvalid(String gmtInvalid) {
		this.gmtInvalid = gmtInvalid;
	}

	public String getGmtValid() {
		return this.gmtValid;
	}
	public void setGmtValid(String gmtValid) {
		this.gmtValid = gmtValid;
	}

}
