package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医保电子凭证线上支付授权信息
 *
 * @author auto create
 * @since 1.0, 2023-08-04 16:04:23
 */
public class MedicalOnlinePayAuthInfo extends AlipayObject {

	private static final long serialVersionUID = 5764215263776821682L;

	/**
	 * 授权码值
	 */
	@ApiField("auth_no")
	private String authNo;

	/**
	 * 用户授权状态
	 */
	@ApiField("auth_stas")
	private String authStas;

	/**
	 * 授权时间
	 */
	@ApiField("auth_time")
	private Date authTime;

	/**
	 * 跳转支付宝授权页面地址
	 */
	@ApiField("auth_url")
	private String authUrl;

	/**
	 * 渠道信息签名串
	 */
	@ApiField("chnl_sign_data")
	private String chnlSignData;

	/**
	 * 业务核验令牌
	 */
	@ApiField("oc_token")
	private String ocToken;

	/**
	 * 机构信息签名串
	 */
	@ApiField("org_sign_data")
	private String orgSignData;

	/**
	 * ISV请求业务唯一流水号
	 */
	@ApiField("req_biz_no")
	private String reqBizNo;

	public String getAuthNo() {
		return this.authNo;
	}
	public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}

	public String getAuthStas() {
		return this.authStas;
	}
	public void setAuthStas(String authStas) {
		this.authStas = authStas;
	}

	public Date getAuthTime() {
		return this.authTime;
	}
	public void setAuthTime(Date authTime) {
		this.authTime = authTime;
	}

	public String getAuthUrl() {
		return this.authUrl;
	}
	public void setAuthUrl(String authUrl) {
		this.authUrl = authUrl;
	}

	public String getChnlSignData() {
		return this.chnlSignData;
	}
	public void setChnlSignData(String chnlSignData) {
		this.chnlSignData = chnlSignData;
	}

	public String getOcToken() {
		return this.ocToken;
	}
	public void setOcToken(String ocToken) {
		this.ocToken = ocToken;
	}

	public String getOrgSignData() {
		return this.orgSignData;
	}
	public void setOrgSignData(String orgSignData) {
		this.orgSignData = orgSignData;
	}

	public String getReqBizNo() {
		return this.reqBizNo;
	}
	public void setReqBizNo(String reqBizNo) {
		this.reqBizNo = reqBizNo;
	}

}
