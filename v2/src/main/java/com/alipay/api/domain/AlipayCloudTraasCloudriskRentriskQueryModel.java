package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云智能租赁风控查询
 *
 * @author auto create
 * @since 1.0, 2024-04-01 15:29:03
 */
public class AlipayCloudTraasCloudriskRentriskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1229191586856725999L;

	/**
	 * 身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 商家自定义需保证在商户端不重复
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 用户授权
	 */
	@ApiField("user_authorization")
	private String userAuthorization;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getUserAuthorization() {
		return this.userAuthorization;
	}
	public void setUserAuthorization(String userAuthorization) {
		this.userAuthorization = userAuthorization;
	}

}
