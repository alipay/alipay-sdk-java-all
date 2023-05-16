package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * c
 *
 * @author auto create
 * @since 1.0, 2023-05-16 17:44:54
 */
public class CedsipeihuanCcomplex extends AlipayObject {

	private static final long serialVersionUID = 5286526836699385541L;

	/**
	 * 特殊可选
	 */
	@ApiField("d")
	private String d;

	/**
	 * 可选
	 */
	@ApiField("dede")
	private String dede;

	/**
	 * 必选
	 */
	@ApiField("fgrf")
	private String fgrf;

	/**
	 * 必选
	 */
	@ApiField("hdj_open_id")
	private String hdjOpenId;

	/**
	 * 必选
	 */
	@ApiField("sdcd")
	private String sdcd;

	public String getD() {
		return this.d;
	}
	public void setD(String d) {
		this.d = d;
	}

	public String getDede() {
		return this.dede;
	}
	public void setDede(String dede) {
		this.dede = dede;
	}

	public String getFgrf() {
		return this.fgrf;
	}
	public void setFgrf(String fgrf) {
		this.fgrf = fgrf;
	}

	public String getHdjOpenId() {
		return this.hdjOpenId;
	}
	public void setHdjOpenId(String hdjOpenId) {
		this.hdjOpenId = hdjOpenId;
	}

	public String getSdcd() {
		return this.sdcd;
	}
	public void setSdcd(String sdcd) {
		this.sdcd = sdcd;
	}

}
