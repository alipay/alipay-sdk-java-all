package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻生活记录签约授权
 *
 * @author auto create
 * @since 1.0, 2024-04-29 11:37:49
 */
public class ZhimaCustomerLiferecordSignModel extends AlipayObject {

	private static final long serialVersionUID = 6452572466415945662L;

	/**
	 * 是否授权
	 */
	@ApiField("auth")
	private Boolean auth;

	/**
	 * 业务时间，标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("biz_date")
	private Date bizDate;

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
	 * 芝麻内部配置的商户白名单,只有配置过的白名单才允许接入
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public Boolean getAuth() {
		return this.auth;
	}
	public void setAuth(Boolean auth) {
		this.auth = auth;
	}

	public Date getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
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

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
