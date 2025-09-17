package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户信息获取接口
 *
 * @author auto create
 * @since 1.0, 2025-09-15 15:12:40
 */
public class AlipayCommerceTransportTourUserinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1486612611794475287L;

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
	 * 新商户建议使用open_id替代该字段。对于新商户，user_id字段未来计划逐步回收，存量商户可继续使用。如使用open_id，请确认 应用-开发配置-openid配置管理 已启用。无该配置项，可查看openid配置申请：<a href="https://opendocs.alipay.com/mini/0ai9ok?pathHash=de631c06">alipay.commerce.transport.tour.userinfo.query</a>。

	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 文旅景点id
	 */
	@ApiField("scenic_id")
	private String scenicId;

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

	public String getScenicId() {
		return this.scenicId;
	}
	public void setScenicId(String scenicId) {
		this.scenicId = scenicId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
