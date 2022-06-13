package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展参数，用于传入设备参数
 *
 * @author auto create
 * @since 1.0, 2020-11-23 20:39:35
 */
public class VerifyExtraParams extends AlipayObject {

	private static final long serialVersionUID = 2727726338113373616L;

	/**
	 * IdentifierForVendor，在iOS系统中常被用来唯一标识设备
	 */
	@ApiField("idfa")
	private String idfa;

	/**
	 * 国际移动设备识别码
	 */
	@ApiField("imei")
	private String imei;

	/**
	 * 国际移动用户识别码
	 */
	@ApiField("imsi")
	private String imsi;

	/**
	 * 匿名设备标识符
	 */
	@ApiField("oaid")
	private String oaid;

	/**
	 * 设备唯一标识
	 */
	@ApiField("umid")
	private String umid;

	/**
	 * UTDID，APP 级别的设备标识 ID
	 */
	@ApiField("utdid")
	private String utdid;

	public String getIdfa() {
		return this.idfa;
	}
	public void setIdfa(String idfa) {
		this.idfa = idfa;
	}

	public String getImei() {
		return this.imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getImsi() {
		return this.imsi;
	}
	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getOaid() {
		return this.oaid;
	}
	public void setOaid(String oaid) {
		this.oaid = oaid;
	}

	public String getUmid() {
		return this.umid;
	}
	public void setUmid(String umid) {
		this.umid = umid;
	}

	public String getUtdid() {
		return this.utdid;
	}
	public void setUtdid(String utdid) {
		this.utdid = utdid;
	}

}
