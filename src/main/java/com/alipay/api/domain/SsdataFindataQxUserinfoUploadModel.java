package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 上传用户信息
 *
 * @author auto create
 * @since 1.0, 2017-11-02 20:44:13
 */
public class SsdataFindataQxUserinfoUploadModel extends AlipayObject {

	private static final long serialVersionUID = 2783751928929846981L;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_params")
	private String extParams;

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
	 * C端用户姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getExtParams() {
		return this.extParams;
	}
	public void setExtParams(String extParams) {
		this.extParams = extParams;
	}

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

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
