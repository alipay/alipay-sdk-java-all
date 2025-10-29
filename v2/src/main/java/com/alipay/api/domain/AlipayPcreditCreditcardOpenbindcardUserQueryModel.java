package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝信用卡外部绑卡活动咨询
 *
 * @author auto create
 * @since 1.0, 2023-10-17 15:52:39
 */
public class AlipayPcreditCreditcardOpenbindcardUserQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2458179849872699874L;

	/**
	 * 外部绑卡活动业务编码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * MD5加密身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * MD5加密手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

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

}
