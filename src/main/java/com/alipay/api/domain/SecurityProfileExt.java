package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户密钥的一些配置信息
 *
 * @author auto create
 * @since 1.0, 2022-11-02 15:42:59
 */
public class SecurityProfileExt extends AlipayObject {

	private static final long serialVersionUID = 8381818944845619399L;

	/**
	 * 密钥类型
	 */
	@ApiField("enc_style")
	private String encStyle;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * disable时间
	 */
	@ApiField("gmt_disable")
	private Date gmtDisable;

	/**
	 * enable时间
	 */
	@ApiField("gmt_enable")
	private Date gmtEnable;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * dec_algo
	 */
	@ApiField("req_dec_algo")
	private String reqDecAlgo;

	/**
	 * dec_key
	 */
	@ApiField("req_dec_key")
	private String reqDecKey;

	/**
	 * verify
	 */
	@ApiField("req_verify_algo")
	private String reqVerifyAlgo;

	/**
	 * verify_key
	 */
	@ApiField("req_verify_key")
	private String reqVerifyKey;

	/**
	 * dec_key
	 */
	@ApiField("res_dec_key")
	private String resDecKey;

	/**
	 * enc_algo
	 */
	@ApiField("res_enc_algo")
	private String resEncAlgo;

	/**
	 * enc_key
	 */
	@ApiField("res_enc_key")
	private String resEncKey;

	/**
	 * sign_algo
	 */
	@ApiField("res_sign_algo")
	private String resSignAlgo;

	/**
	 * 支付宝私钥别名
	 */
	@ApiField("res_sign_alias")
	private String resSignAlias;

	/**
	 * sign_key
	 */
	@ApiField("res_sign_key")
	private String resSignKey;

	/**
	 * 支付宝公钥别名
	 */
	@ApiField("res_verify_alias")
	private String resVerifyAlias;

	/**
	 * verify_key
	 */
	@ApiField("res_verify_key")
	private String resVerifyKey;

	/**
	 * 密钥描述
	 */
	@ApiField("sec_des")
	private String secDes;

	/**
	 * 密钥ID
	 */
	@ApiField("sec_id")
	private String secId;

	/**
	 * 密钥证书的配置信息
	 */
	@ApiField("security_cert_profile_ext")
	private SecurityCertProfileExt securityCertProfileExt;

	/**
	 * 签名类型
	 */
	@ApiField("sign_style")
	private String signStyle;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * ID
	 */
	@ApiField("sub_sec_id")
	private String subSecId;

	public String getEncStyle() {
		return this.encStyle;
	}
	public void setEncStyle(String encStyle) {
		this.encStyle = encStyle;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtDisable() {
		return this.gmtDisable;
	}
	public void setGmtDisable(Date gmtDisable) {
		this.gmtDisable = gmtDisable;
	}

	public Date getGmtEnable() {
		return this.gmtEnable;
	}
	public void setGmtEnable(Date gmtEnable) {
		this.gmtEnable = gmtEnable;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getReqDecAlgo() {
		return this.reqDecAlgo;
	}
	public void setReqDecAlgo(String reqDecAlgo) {
		this.reqDecAlgo = reqDecAlgo;
	}

	public String getReqDecKey() {
		return this.reqDecKey;
	}
	public void setReqDecKey(String reqDecKey) {
		this.reqDecKey = reqDecKey;
	}

	public String getReqVerifyAlgo() {
		return this.reqVerifyAlgo;
	}
	public void setReqVerifyAlgo(String reqVerifyAlgo) {
		this.reqVerifyAlgo = reqVerifyAlgo;
	}

	public String getReqVerifyKey() {
		return this.reqVerifyKey;
	}
	public void setReqVerifyKey(String reqVerifyKey) {
		this.reqVerifyKey = reqVerifyKey;
	}

	public String getResDecKey() {
		return this.resDecKey;
	}
	public void setResDecKey(String resDecKey) {
		this.resDecKey = resDecKey;
	}

	public String getResEncAlgo() {
		return this.resEncAlgo;
	}
	public void setResEncAlgo(String resEncAlgo) {
		this.resEncAlgo = resEncAlgo;
	}

	public String getResEncKey() {
		return this.resEncKey;
	}
	public void setResEncKey(String resEncKey) {
		this.resEncKey = resEncKey;
	}

	public String getResSignAlgo() {
		return this.resSignAlgo;
	}
	public void setResSignAlgo(String resSignAlgo) {
		this.resSignAlgo = resSignAlgo;
	}

	public String getResSignAlias() {
		return this.resSignAlias;
	}
	public void setResSignAlias(String resSignAlias) {
		this.resSignAlias = resSignAlias;
	}

	public String getResSignKey() {
		return this.resSignKey;
	}
	public void setResSignKey(String resSignKey) {
		this.resSignKey = resSignKey;
	}

	public String getResVerifyAlias() {
		return this.resVerifyAlias;
	}
	public void setResVerifyAlias(String resVerifyAlias) {
		this.resVerifyAlias = resVerifyAlias;
	}

	public String getResVerifyKey() {
		return this.resVerifyKey;
	}
	public void setResVerifyKey(String resVerifyKey) {
		this.resVerifyKey = resVerifyKey;
	}

	public String getSecDes() {
		return this.secDes;
	}
	public void setSecDes(String secDes) {
		this.secDes = secDes;
	}

	public String getSecId() {
		return this.secId;
	}
	public void setSecId(String secId) {
		this.secId = secId;
	}

	public SecurityCertProfileExt getSecurityCertProfileExt() {
		return this.securityCertProfileExt;
	}
	public void setSecurityCertProfileExt(SecurityCertProfileExt securityCertProfileExt) {
		this.securityCertProfileExt = securityCertProfileExt;
	}

	public String getSignStyle() {
		return this.signStyle;
	}
	public void setSignStyle(String signStyle) {
		this.signStyle = signStyle;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubSecId() {
		return this.subSecId;
	}
	public void setSubSecId(String subSecId) {
		this.subSecId = subSecId;
	}

}
