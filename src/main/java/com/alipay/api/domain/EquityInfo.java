package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益详情
 *
 * @author auto create
 * @since 1.0, 2017-12-26 14:06:28
 */
public class EquityInfo extends AlipayObject {

	private static final long serialVersionUID = 5242299728344623439L;

	/**
	 * ‘杰克琼斯’
	 */
	@ApiField("description")
	private String description;

	/**
	 * ext_info
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * logo
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 天猫优惠券
	 */
	@ApiField("name")
	private String name;

	/**
	 * APPLIED：已申领；UNAPPLIED：未申领；DELETED：已过期
	 */
	@ApiField("status")
	private String status;

	/**
	 * url
	 */
	@ApiField("url")
	private String url;

	/**
	 * 优惠价值
	 */
	@ApiField("value")
	private String value;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
