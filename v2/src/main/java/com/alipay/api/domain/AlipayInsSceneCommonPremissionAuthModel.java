package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 获取授权
 *
 * @author auto create
 * @since 1.0, 2024-01-08 17:20:04
 */
public class AlipayInsSceneCommonPremissionAuthModel extends AlipayObject {

	private static final long serialVersionUID = 2618594573249544849L;

	/**
	 * 订购组件token
	 */
	@ApiField("auth_type")
	private String authType;

	/**
	 * 投保人信息
	 */
	@ApiField("holder")
	private InsOpenUserDTO holder;

	/**
	 * 被保人信息
	 */
	@ApiListField("insureds")
	@ApiField("ins_open_user_d_t_o")
	private List<InsOpenUserDTO> insureds;

	/**
	 * 外部登录用户id
	 */
	@ApiField("login_user_id")
	private String loginUserId;

	/**
	 * 外部sessionid
	 */
	@ApiField("out_session_id")
	private String outSessionId;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	public String getAuthType() {
		return this.authType;
	}
	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public InsOpenUserDTO getHolder() {
		return this.holder;
	}
	public void setHolder(InsOpenUserDTO holder) {
		this.holder = holder;
	}

	public List<InsOpenUserDTO> getInsureds() {
		return this.insureds;
	}
	public void setInsureds(List<InsOpenUserDTO> insureds) {
		this.insureds = insureds;
	}

	public String getLoginUserId() {
		return this.loginUserId;
	}
	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getOutSessionId() {
		return this.outSessionId;
	}
	public void setOutSessionId(String outSessionId) {
		this.outSessionId = outSessionId;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

}
