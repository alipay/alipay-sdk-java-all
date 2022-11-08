package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 刷脸用户信息开通申请
 *
 * @author auto create
 * @since 1.0, 2021-12-24 18:02:44
 */
public class AlipayCommerceEducateSceneUserSignModel extends AlipayObject {

	private static final long serialVersionUID = 4344244281183697318L;

	/**
	 * 支付宝学校内标
	 */
	@ApiField("alipay_school_id")
	private String alipaySchoolId;

	/**
	 * 开通人绑定的支付宝UID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型。{1:居民身份证；A:护照；X:学工号}
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 刷脸用户姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 平台来源标识（使用开放平台pid）
	 */
	@ApiField("platform_channel")
	private String platformChannel;

	/**
	 * 二级渠道来源标识（使用渠道商的开放平台pid）
	 */
	@ApiField("sub_channel")
	private String subChannel;

	/**
	 * iot采脸流水id
	 */
	@ApiField("zim_id")
	private String zimId;

	public String getAlipaySchoolId() {
		return this.alipaySchoolId;
	}
	public void setAlipaySchoolId(String alipaySchoolId) {
		this.alipaySchoolId = alipaySchoolId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPlatformChannel() {
		return this.platformChannel;
	}
	public void setPlatformChannel(String platformChannel) {
		this.platformChannel = platformChannel;
	}

	public String getSubChannel() {
		return this.subChannel;
	}
	public void setSubChannel(String subChannel) {
		this.subChannel = subChannel;
	}

	public String getZimId() {
		return this.zimId;
	}
	public void setZimId(String zimId) {
		this.zimId = zimId;
	}

}
