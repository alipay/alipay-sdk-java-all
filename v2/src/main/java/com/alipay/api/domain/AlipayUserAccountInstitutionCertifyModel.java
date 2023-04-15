package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户检测(机构名 + 支付宝外标）是否存在，如果存在返回对应的uid
 *
 * @author auto create
 * @since 1.0, 2020-05-08 09:55:11
 */
public class AlipayUserAccountInstitutionCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 3533316673124448373L;

	/**
	 * 描述机构的名称
	 */
	@ApiField("institution_name")
	private String institutionName;

	/**
	 * 登录号，可以是手机号码或者邮箱号码
	 */
	@ApiField("logon_id")
	private String logonId;

	public String getInstitutionName() {
		return this.institutionName;
	}
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

}
