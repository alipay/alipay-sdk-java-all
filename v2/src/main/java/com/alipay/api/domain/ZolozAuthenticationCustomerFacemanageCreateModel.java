package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 热脸入库
 *
 * @author auto create
 * @since 1.0, 2022-11-16 20:07:14
 */
public class ZolozAuthenticationCustomerFacemanageCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1231511218647531728L;

	/**
	 * 地域编码
	 */
	@ApiField("areacode")
	private String areacode;

	/**
	 * 人脸产品能力，预热场景，需要传college，k12，scenic，subway，traffic。具体值视具体场景
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
人脸预热，传logicGroupId
	 */
	@ApiField("devicenum")
	private String devicenum;

	/**
	 * 拓展参数
	 */
	@ApiField("extinfo")
	private String extinfo;

	/**
	 * 入库类型 IDCARD:身份证 ALIPAY_USER:支付宝用户id, ALIPAY_TEL:手机号入库 CUSTOMER:自定义 DIRECT_CLIENT_PRE：本地预写入 DIRECT_CLIENT：本地客户端库 ENCLOSED：封闭场景
	 */
	@ApiField("facetype")
	private String facetype;

	/**
	 * 入库用户信息 人脸预热，alipayUid必填
	 */
	@ApiField("faceval")
	private String faceval;

	/**
	 * 分组5
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

	public String getFacetype() {
		return this.facetype;
	}
	public void setFacetype(String facetype) {
		this.facetype = facetype;
	}

	public String getFaceval() {
		return this.faceval;
	}
	public void setFaceval(String faceval) {
		this.faceval = faceval;
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
