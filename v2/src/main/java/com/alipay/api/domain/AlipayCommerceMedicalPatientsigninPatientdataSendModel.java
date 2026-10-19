package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阿福就诊数据推送接口
 *
 * @author auto create
 * @since 1.0, 2026-10-14 14:27:58
 */
public class AlipayCommerceMedicalPatientsigninPatientdataSendModel extends AlipayObject {

	private static final long serialVersionUID = 6894587374894358753L;

	/**
	 * 2088用户
	 */
	@ApiField("alipay_user")
	private String alipayUser;

	/**
	 * 2089用户
	 */
	@ApiField("aq_user")
	private String aqUser;

	/**
	 * hdf用户id
	 */
	@ApiField("hdf_user")
	private String hdfUser;

	/**
	 * 场景编码
	 */
	@ApiField("scene")
	private String scene;

	public String getAlipayUser() {
		return this.alipayUser;
	}
	public void setAlipayUser(String alipayUser) {
		this.alipayUser = alipayUser;
	}

	public String getAqUser() {
		return this.aqUser;
	}
	public void setAqUser(String aqUser) {
		this.aqUser = aqUser;
	}

	public String getHdfUser() {
		return this.hdfUser;
	}
	public void setHdfUser(String hdfUser) {
		this.hdfUser = hdfUser;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
