package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 端外绑卡资格咨询接口
 *
 * @author auto create
 * @since 1.0, 2026-07-06 19:36:26
 */
public class AlipayCommerceTransportEtccardBindConsultModel extends AlipayObject {

	private static final long serialVersionUID = 4249566657198829692L;

	/**
	 * 停车服务商id
	 */
	@ApiField("isv_id")
	private String isvId;

	/**
	 * 绑卡资格验证电话号码
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 绑卡资格校验车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	public String getIsvId() {
		return this.isvId;
	}
	public void setIsvId(String isvId) {
		this.isvId = isvId;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

}
