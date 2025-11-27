package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业工商重大税收违法信息
 *
 * @author auto create
 * @since 1.0, 2025-01-20 11:20:18
 */
public class ZmepTaxViolationInfo extends AlipayObject {

	private static final long serialVersionUID = 8851415973816939552L;

	/**
	 * 案件性质
	 */
	@ApiField("ajxz")
	private String ajxz;

	/**
	 * 事件时间
	 */
	@ApiField("event_time")
	private String eventTime;

	/**
	 * 纳税人识别码
	 */
	@ApiField("nsr_cert_no")
	private String nsrCertNo;

	/**
	 * 纳税人名称
	 */
	@ApiField("nsr_name")
	private String nsrName;

	/**
	 * 发布时间
	 */
	@ApiField("pub_time")
	private String pubTime;

	/**
	 * 注册地址
	 */
	@ApiField("registered_address")
	private String registeredAddress;

	/**
	 * 相关法律依据及税务处理处罚情况
	 */
	@ApiField("xgflyjjswclcfqk")
	private String xgflyjjswclcfqk;

	/**
	 * 主要违法事实
	 */
	@ApiField("zywfss")
	private String zywfss;

	/**
	 * 组织机构代码
	 */
	@ApiField("zzjg_code")
	private String zzjgCode;

	public String getAjxz() {
		return this.ajxz;
	}
	public void setAjxz(String ajxz) {
		this.ajxz = ajxz;
	}

	public String getEventTime() {
		return this.eventTime;
	}
	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	public String getNsrCertNo() {
		return this.nsrCertNo;
	}
	public void setNsrCertNo(String nsrCertNo) {
		this.nsrCertNo = nsrCertNo;
	}

	public String getNsrName() {
		return this.nsrName;
	}
	public void setNsrName(String nsrName) {
		this.nsrName = nsrName;
	}

	public String getPubTime() {
		return this.pubTime;
	}
	public void setPubTime(String pubTime) {
		this.pubTime = pubTime;
	}

	public String getRegisteredAddress() {
		return this.registeredAddress;
	}
	public void setRegisteredAddress(String registeredAddress) {
		this.registeredAddress = registeredAddress;
	}

	public String getXgflyjjswclcfqk() {
		return this.xgflyjjswclcfqk;
	}
	public void setXgflyjjswclcfqk(String xgflyjjswclcfqk) {
		this.xgflyjjswclcfqk = xgflyjjswclcfqk;
	}

	public String getZywfss() {
		return this.zywfss;
	}
	public void setZywfss(String zywfss) {
		this.zywfss = zywfss;
	}

	public String getZzjgCode() {
		return this.zzjgCode;
	}
	public void setZzjgCode(String zzjgCode) {
		this.zzjgCode = zzjgCode;
	}

}
