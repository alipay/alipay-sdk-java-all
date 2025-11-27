package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取用户跳转履约中间页面链接
 *
 * @author auto create
 * @since 1.0, 2025-10-28 11:02:41
 */
public class AlipayCommerceMedicalHmUserskipQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4384781494331794158L;

	/**
	 * 请求来源, H5, APP, WX_MINI_PROGRAM 微信小程序
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 权益编码, 下发权益时获取
	 */
	@ApiField("equity_code")
	private String equityCode;

	/**
	 * 权益包编码, 下发权益时获取
	 */
	@ApiField("equity_package_code")
	private String equityPackageCode;

	/**
	 * 健管人员id, 权益下发时发放给保司
	 */
	@ApiField("hmuid")
	private String hmuid;

	/**
	 * 业务唯一流水号, 需要确保当前保司下唯一
	 */
	@ApiField("out_biz_serial_no")
	private String outBizSerialNo;

	/**
	 * 权益所属项目标识, 下发权益时获取
	 */
	@ApiField("project_tag")
	private String projectTag;

	/**
	 * 用户手机号
	 */
	@ApiField("tel_no")
	private String telNo;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getEquityCode() {
		return this.equityCode;
	}
	public void setEquityCode(String equityCode) {
		this.equityCode = equityCode;
	}

	public String getEquityPackageCode() {
		return this.equityPackageCode;
	}
	public void setEquityPackageCode(String equityPackageCode) {
		this.equityPackageCode = equityPackageCode;
	}

	public String getHmuid() {
		return this.hmuid;
	}
	public void setHmuid(String hmuid) {
		this.hmuid = hmuid;
	}

	public String getOutBizSerialNo() {
		return this.outBizSerialNo;
	}
	public void setOutBizSerialNo(String outBizSerialNo) {
		this.outBizSerialNo = outBizSerialNo;
	}

	public String getProjectTag() {
		return this.projectTag;
	}
	public void setProjectTag(String projectTag) {
		this.projectTag = projectTag;
	}

	public String getTelNo() {
		return this.telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

}
