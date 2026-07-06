package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号列表值
 *
 * @author auto create
 * @since 1.0, 2026-02-25 16:12:43
 */
public class UserPublicQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 1493448922434171335L;

	/**
	 * 生活号授权到期时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 生活号ID
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * 生活号logo图片url
	 */
	@ApiField("public_logo")
	private String publicLogo;

	/**
	 * 生活号名称
	 */
	@ApiField("public_name")
	private String publicName;

	public Date getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	public String getPublicLogo() {
		return this.publicLogo;
	}
	public void setPublicLogo(String publicLogo) {
		this.publicLogo = publicLogo;
	}

	public String getPublicName() {
		return this.publicName;
	}
	public void setPublicName(String publicName) {
		this.publicName = publicName;
	}

}
