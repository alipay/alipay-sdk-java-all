package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 密钥证书的配置信息
 *
 * @author auto create
 * @since 1.0, 2022-11-02 15:42:15
 */
public class SecurityCertProfileExt extends AlipayObject {

	private static final long serialVersionUID = 6669193219755584112L;

	/**
	 * 账号类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 证书编号
	 */
	@ApiField("cert_id")
	private String certId;

	/**
	 * cert_storage_key
	 */
	@ApiField("cert_storage_key")
	private String certStorageKey;

	/**
	 * 证书唯一ID
	 */
	@ApiField("cert_unique_id")
	private String certUniqueId;

	/**
	 * 状态
	 */
	@ApiField("gmt_enable")
	private Date gmtEnable;

	/**
	 * 存储键值对
	 */
	@ApiListField("openbizmock_map_ext")
	@ApiField("openbizmock_map_ext")
	private List<OpenbizmockMapExt> openbizmockMapExt;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * sec_id
	 */
	@ApiField("sec_id")
	private String secId;

	/**
	 * 失效时间
	 */
	@ApiField("valid_end_time")
	private Date validEndTime;

	/**
	 * 生效时间
	 */
	@ApiField("valid_start_time")
	private Date validStartTime;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCertId() {
		return this.certId;
	}
	public void setCertId(String certId) {
		this.certId = certId;
	}

	public String getCertStorageKey() {
		return this.certStorageKey;
	}
	public void setCertStorageKey(String certStorageKey) {
		this.certStorageKey = certStorageKey;
	}

	public String getCertUniqueId() {
		return this.certUniqueId;
	}
	public void setCertUniqueId(String certUniqueId) {
		this.certUniqueId = certUniqueId;
	}

	public Date getGmtEnable() {
		return this.gmtEnable;
	}
	public void setGmtEnable(Date gmtEnable) {
		this.gmtEnable = gmtEnable;
	}

	public List<OpenbizmockMapExt> getOpenbizmockMapExt() {
		return this.openbizmockMapExt;
	}
	public void setOpenbizmockMapExt(List<OpenbizmockMapExt> openbizmockMapExt) {
		this.openbizmockMapExt = openbizmockMapExt;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getSecId() {
		return this.secId;
	}
	public void setSecId(String secId) {
		this.secId = secId;
	}

	public Date getValidEndTime() {
		return this.validEndTime;
	}
	public void setValidEndTime(Date validEndTime) {
		this.validEndTime = validEndTime;
	}

	public Date getValidStartTime() {
		return this.validStartTime;
	}
	public void setValidStartTime(Date validStartTime) {
		this.validStartTime = validStartTime;
	}

}
