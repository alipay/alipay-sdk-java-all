package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取公积金城市列表页链接
 *
 * @author auto create
 * @since 1.0, 2017-10-17 14:44:08
 */
public class SsdataFindataFundunionLinkQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4351383493629342799L;

	/**
	 * C端用户身份证号码
	 */
	@ApiField("id_card_no")
	private String idCardNo;

	/**
	 * 商户业务流水号，有商户的系统生成的商户业务唯一标识，如果不传，则有上数系统生成一个32位的商户业务流水号并返回
	 */
	@ApiField("org_biz_no")
	private String orgBizNo;

	/**
	 * C端用户手机号码
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 用户在操作上数页面后，如果需要跳转到商户的自定义H5，则传递需要跳转的链接地址
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	/**
	 * C端用户姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getIdCardNo() {
		return this.idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getOrgBizNo() {
		return this.orgBizNo;
	}
	public void setOrgBizNo(String orgBizNo) {
		this.orgBizNo = orgBizNo;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
