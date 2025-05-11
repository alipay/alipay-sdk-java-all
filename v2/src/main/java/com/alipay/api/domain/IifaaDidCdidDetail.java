package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IIFAA身份凭证状态通知的cdid详情
 *
 * @author auto create
 * @since 1.0, 2024-06-24 14:20:48
 */
public class IifaaDidCdidDetail extends AlipayObject {

	private static final long serialVersionUID = 7183158489257597953L;

	/**
	 * 通知内容代码，保留字段
	 */
	@ApiField("alter_code")
	private String alterCode;

	/**
	 * 公安一所签发的用户唯一标识
	 */
	@ApiField("cdid")
	private String cdid;

	/**
	 * 凭证PDF文件和用户二要素hash值的签名内容
	 */
	@ApiField("cert_sign")
	private String certSign;

	/**
	 * VC唯一id
	 */
	@ApiField("vc_id")
	private String vcId;

	public String getAlterCode() {
		return this.alterCode;
	}
	public void setAlterCode(String alterCode) {
		this.alterCode = alterCode;
	}

	public String getCdid() {
		return this.cdid;
	}
	public void setCdid(String cdid) {
		this.cdid = cdid;
	}

	public String getCertSign() {
		return this.certSign;
	}
	public void setCertSign(String certSign) {
		this.certSign = certSign;
	}

	public String getVcId() {
		return this.vcId;
	}
	public void setVcId(String vcId) {
		this.vcId = vcId;
	}

}
