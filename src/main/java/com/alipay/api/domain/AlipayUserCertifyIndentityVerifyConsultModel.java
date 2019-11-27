package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝商业公安网信息核验接口
 *
 * @author auto create
 * @since 1.0, 2018-03-14 14:52:07
 */
public class AlipayUserCertifyIndentityVerifyConsultModel extends AlipayObject {

	private static final long serialVersionUID = 2334695293293961339L;

	/**
	 * 访问来源，业务系统 用于结算
	 */
	@ApiField("biz_from")
	private String bizFrom;

	/**
	 * 业务主体ID 如userId
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 证件姓名
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 认证来源 : 业务BU,如网商银行
	 */
	@ApiField("certify_from")
	private String certifyFrom;

	/**
	 * Y强制查官网，N缺省，先查本地后官网
	 */
	@ApiField("force_public")
	private String forcePublic;

	public String getBizFrom() {
		return this.bizFrom;
	}
	public void setBizFrom(String bizFrom) {
		this.bizFrom = bizFrom;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

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

	public String getCertifyFrom() {
		return this.certifyFrom;
	}
	public void setCertifyFrom(String certifyFrom) {
		this.certifyFrom = certifyFrom;
	}

	public String getForcePublic() {
		return this.forcePublic;
	}
	public void setForcePublic(String forcePublic) {
		this.forcePublic = forcePublic;
	}

}
