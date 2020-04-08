package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.info.inner.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-03-10 20:26:22
 */
public class AlipayUserInfoInnerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8571642947522985584L;

	/** 
	 * 绑定手机号码
	 */
	@ApiField("binded_mobile")
	private String bindedMobile;

	/** 
	 * 优先返回登录邮箱，若邮箱不存在，返回其他登录号（登录手机号）
	 */
	@ApiField("email")
	private String email;

	/** 
	 * 阿里集团统一ID
	 */
	@ApiField("havana_id")
	private String havanaId;

	/** 
	 * 金融机构或特殊单位
I:金融机构
C:特殊单位
N:非金融机构或特殊单位
	 */
	@ApiField("inst_type")
	private String instType;

	/** 
	 * 账户是否禁止提现，T是，F否
	 */
	@ApiField("is_forbidden_withdraw")
	private String isForbiddenWithdraw;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 用户状态
	 */
	@ApiField("user_status")
	private String userStatus;

	public void setBindedMobile(String bindedMobile) {
		this.bindedMobile = bindedMobile;
	}
	public String getBindedMobile( ) {
		return this.bindedMobile;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail( ) {
		return this.email;
	}

	public void setHavanaId(String havanaId) {
		this.havanaId = havanaId;
	}
	public String getHavanaId( ) {
		return this.havanaId;
	}

	public void setInstType(String instType) {
		this.instType = instType;
	}
	public String getInstType( ) {
		return this.instType;
	}

	public void setIsForbiddenWithdraw(String isForbiddenWithdraw) {
		this.isForbiddenWithdraw = isForbiddenWithdraw;
	}
	public String getIsForbiddenWithdraw( ) {
		return this.isForbiddenWithdraw;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String getUserStatus( ) {
		return this.userStatus;
	}

}
