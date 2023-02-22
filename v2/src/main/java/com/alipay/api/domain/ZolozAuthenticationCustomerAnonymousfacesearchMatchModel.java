package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸搜索
 *
 * @author auto create
 * @since 1.0, 2019-06-10 20:40:05
 */
public class ZolozAuthenticationCustomerAnonymousfacesearchMatchModel extends AlipayObject {

	private static final long serialVersionUID = 6536847341114741882L;

	/**
	 * 防攻击能力参数
	 */
	@ApiField("antiattack")
	private String antiattack;

	/**
	 * 地域编码
	 */
	@ApiField("areacode")
	private String areacode;

	/**
	 * 活体照片的二进制内容，然后做base64编码
	 */
	@ApiField("authimg")
	private String authimg;

	/**
	 * 代表业务方接入编号
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 业务量规模
	 */
	@ApiField("bizscale")
	private String bizscale;

	/**
	 * 商户品牌
	 */
	@ApiField("brandcode")
	private String brandcode;

	/**
	 * 商户机具唯一编码，关键参数
	 */
	@ApiField("devicenum")
	private String devicenum;

	/**
	 * 拓展参数
	 */
	@ApiField("extinfo")
	private String extinfo;

	/**
	 * 群组
	 */
	@ApiField("group")
	private String group;

	/**
	 * 门店编码
	 */
	@ApiField("storecode")
	private String storecode;

	/**
	 * 有效期天数，如7天、30天、365天
	 */
	@ApiField("validtimes")
	private String validtimes;

	public String getAntiattack() {
		return this.antiattack;
	}
	public void setAntiattack(String antiattack) {
		this.antiattack = antiattack;
	}

	public String getAreacode() {
		return this.areacode;
	}
	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}

	public String getAuthimg() {
		return this.authimg;
	}
	public void setAuthimg(String authimg) {
		this.authimg = authimg;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBizscale() {
		return this.bizscale;
	}
	public void setBizscale(String bizscale) {
		this.bizscale = bizscale;
	}

	public String getBrandcode() {
		return this.brandcode;
	}
	public void setBrandcode(String brandcode) {
		this.brandcode = brandcode;
	}

	public String getDevicenum() {
		return this.devicenum;
	}
	public void setDevicenum(String devicenum) {
		this.devicenum = devicenum;
	}

	public String getExtinfo() {
		return this.extinfo;
	}
	public void setExtinfo(String extinfo) {
		this.extinfo = extinfo;
	}

	public String getGroup() {
		return this.group;
	}
	public void setGroup(String group) {
		this.group = group;
	}

	public String getStorecode() {
		return this.storecode;
	}
	public void setStorecode(String storecode) {
		this.storecode = storecode;
	}

	public String getValidtimes() {
		return this.validtimes;
	}
	public void setValidtimes(String validtimes) {
		this.validtimes = validtimes;
	}

}
