package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸搜索
 *
 * @author auto create
 * @since 1.0, 2018-03-07 11:49:37
 */
public class ZolozAuthenticationCustomerAnonymousfacesearchMatchModel extends AlipayObject {

	private static final long serialVersionUID = 4275763684427352571L;

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
