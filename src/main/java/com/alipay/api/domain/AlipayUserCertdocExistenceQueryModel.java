package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询电子证件是否存在
 *
 * @author auto create
 * @since 1.0, 2019-01-07 15:29:15
 */
public class AlipayUserCertdocExistenceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4327697761765231619L;

	/**
	 * 证件夹中的电子证件类型。比如：CYBER_TRUSTED_ID 网证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
