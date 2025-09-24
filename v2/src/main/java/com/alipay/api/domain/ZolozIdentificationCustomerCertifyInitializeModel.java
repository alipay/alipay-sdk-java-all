package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实人认证初始化
 *
 * @author auto create
 * @since 1.0, 2021-12-16 14:08:21
 */
public class ZolozIdentificationCustomerCertifyInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 1127413765411598156L;

	/**
	 * 商户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 实人信息：姓名
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 实人信息：证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 实人信息：证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 用人脸引导页是否显示
	 */
	@ApiField("has_welcome_page")
	private Boolean hasWelcomePage;

	/**
	 * metainfo环境参数
	 */
	@ApiField("metainfo")
	private String metainfo;

	/**
	 * 通过terminal_pos确定端内或端外模式
	 */
	@ApiField("terminal_pos")
	private String terminalPos;

	/**
	 * 商户的用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
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

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public Boolean getHasWelcomePage() {
		return this.hasWelcomePage;
	}
	public void setHasWelcomePage(Boolean hasWelcomePage) {
		this.hasWelcomePage = hasWelcomePage;
	}

	public String getMetainfo() {
		return this.metainfo;
	}
	public void setMetainfo(String metainfo) {
		this.metainfo = metainfo;
	}

	public String getTerminalPos() {
		return this.terminalPos;
	}
	public void setTerminalPos(String terminalPos) {
		this.terminalPos = terminalPos;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
