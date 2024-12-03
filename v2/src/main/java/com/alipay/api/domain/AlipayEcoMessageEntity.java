package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 城服消息实体类型
 *
 * @author auto create
 * @since 1.0, 2024-06-17 14:00:16
 */
public class AlipayEcoMessageEntity extends AlipayObject {

	private static final long serialVersionUID = 1326232256124428468L;

	/**
	 * (certificate_type/certificate_number/用户名字) 或者 alipay_user_id  必须有一个不为空。两个都不为空则以alipay_user_id为准
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 入驻城市服务的服务编码
	 */
	@ApiField("app_code")
	private String appCode;

	/**
	 * 证件号码.(certificate_type/certificate_number/certificate_username) 或者 alipay_user_id 必须有一个不为空。两个都不为空则以alipay_user_id为准.
该字段为敏感字段，须做md5处理后传输。示例中值的明文为310101198011110010.
	 */
	@ApiField("certificate_number")
	private String certificateNumber;

	/**
	 * 证件类型, 01表示身份证.(certificate_type/certificate_number/certificate_username) 或者 alipay_user_id 必须有一个不为空。两个都不为空则以alipay_user_id为准.
	 */
	@ApiField("certificate_type")
	private String certificateType;

	/**
	 * 证件用户名字.(certificate_type/certificate_number/certificate_username) 或者 alipay_user_id 必须有一个不为空。两个都不为空则以alipay_user_id为准.
	 */
	@ApiField("certificate_username")
	private String certificateUsername;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 消息参数信息，json格式字符串. 
该字段与msg_type对应，不同类型的消息需要传不同的参数信息，详情参考接口补充说明.
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 行业类型. 具体传值可以联系BD获取
	 */
	@ApiField("industry_type")
	private Long industryType;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 光华消息模板ID，具体传值可联系BD获取
	 */
	@ApiField("msg_type")
	private Long msgType;

	/**
	 * (certificate_type/certificate_number/用户名字) 或者 open_id  必须有一个不为空。两个都不为空则以open_id为准
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 消息跳转url
	 */
	@ApiField("target_url")
	private String targetUrl;

	/**
	 * identity字段：值为不大于64位的保证唯一的字符串；该字段用于保证消息唯一性，防止消息重复推送，相当于业务流水号，由接入方自行生成
	 */
	@ApiField("uuid")
	private String uuid;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getAppCode() {
		return this.appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getCertificateNumber() {
		return this.certificateNumber;
	}
	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	public String getCertificateType() {
		return this.certificateType;
	}
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

	public String getCertificateUsername() {
		return this.certificateUsername;
	}
	public void setCertificateUsername(String certificateUsername) {
		this.certificateUsername = certificateUsername;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Long getIndustryType() {
		return this.industryType;
	}
	public void setIndustryType(Long industryType) {
		this.industryType = industryType;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Long getMsgType() {
		return this.msgType;
	}
	public void setMsgType(Long msgType) {
		this.msgType = msgType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getTargetUrl() {
		return this.targetUrl;
	}
	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}

	public String getUuid() {
		return this.uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}
