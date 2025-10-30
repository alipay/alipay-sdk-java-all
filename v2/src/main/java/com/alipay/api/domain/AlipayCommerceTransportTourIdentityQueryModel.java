package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户身份查询接口
 *
 * @author auto create
 * @since 1.0, 2025-10-27 15:22:40
 */
public class AlipayCommerceTransportTourIdentityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2743482652377451582L;

	/**
	 * 会话信息	
	 */
	@ApiField("code_token")
	private String codeToken;

	/**
	 * null
	 */
	@ApiListField("identity_type_list")
	@ApiField("string")
	private List<String> identityTypeList;

	/**
	 * 支付宝用户的userId。

	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。

	 */
	@ApiField("user_id")
	private String userId;

	public String getCodeToken() {
		return this.codeToken;
	}
	public void setCodeToken(String codeToken) {
		this.codeToken = codeToken;
	}

	public List<String> getIdentityTypeList() {
		return this.identityTypeList;
	}
	public void setIdentityTypeList(List<String> identityTypeList) {
		this.identityTypeList = identityTypeList;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
