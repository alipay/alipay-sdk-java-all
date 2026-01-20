package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基金开户
 *
 * @author auto create
 * @since 1.0, 2025-12-04 17:42:32
 */
public class AlipayCommerceFundBindCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3675981629238416634L;

	/**
	 * 绑卡用户的证件号，需要和cert_type联合使用
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 待绑卡用户的证件类型：0（身份证） 。目前只支持身份证。
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 绑卡过期时间，过期后用户无法进行绑卡，该字段选填，为空情况下默认长期有效（1年）
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 绑卡流水号，用来标识一次绑卡行为，商户维度下需确保唯一
	 */
	@ApiField("out_bind_no")
	private String outBindNo;

	/**
	 * 绑卡用户的真实姓名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 用户绑卡成功后，需要回调的页面地址。
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

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

	public Date getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public String getOutBindNo() {
		return this.outBindNo;
	}
	public void setOutBindNo(String outBindNo) {
		this.outBindNo = outBindNo;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

}
