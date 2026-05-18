package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 考试token信息校验
 *
 * @author auto create
 * @since 1.0, 2026-04-20 16:47:14
 */
public class AnttechOceanbaseTokenValidateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8275746689735331976L;

	/**
	 * 身份证号
	 */
	@ApiField("id_card_no")
	private String idCardNo;

	/**
	 * 用户token
	 */
	@ApiField("user_token")
	private String userToken;

	public String getIdCardNo() {
		return this.idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getUserToken() {
		return this.userToken;
	}
	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

}
