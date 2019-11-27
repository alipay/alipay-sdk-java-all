package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 证照信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class KhomeSpLicense extends AlipayObject {

	private static final long serialVersionUID = 4228517627687686734L;

	/**
	 * 证照认证机构
	 */
	@ApiField("agency")
	private String agency;

	/**
	 * 证照过期时间
	 */
	@ApiField("gmt_expire")
	private String gmtExpire;

	/**
	 * 证照有效期开始时间
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/**
	 * 证照图片的URL
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 认证结果，比如：高级
	 */
	@ApiField("result")
	private String result;

	/**
	 * 证照编号
	 */
	@ApiField("sequence")
	private String sequence;

	/**
	 * 证照类型
HEALTH：健康证
BEAUTY：美容相关证件
MASSAGE：按摩师职业证书
TRANSPORT：道路运输证
DRIVING：驾驶证
TRANSPORT_PERMIT：道路运输经营许可
	 */
	@ApiField("type")
	private String type;

	public String getAgency() {
		return this.agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}

	public String getGmtExpire() {
		return this.gmtExpire;
	}
	public void setGmtExpire(String gmtExpire) {
		this.gmtExpire = gmtExpire;
	}

	public String getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public String getSequence() {
		return this.sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
