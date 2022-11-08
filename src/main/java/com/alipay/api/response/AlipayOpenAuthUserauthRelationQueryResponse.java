package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserAuthAgreement;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.userauth.relation.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-08 10:11:35
 */
public class AlipayOpenAuthUserauthRelationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3727672957685674147L;

	/** 
	 * 应用logo地址
	 */
	@ApiField("app_logo")
	private String appLogo;

	/** 
	 * 应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/** 
	 * 授权协议列表，例如：[{"download_link":null,"agreement_name":"校园信息服务须知","link":"https://render.alipay.com/p/c/17gitw20onek"},{"download_link":"https://render.alipay.com/p/yuyan/180020010001196791/preview.html?agreementId=AG00000049","agreement_name":"用户授权协议","link":"https://render.alipay.com/p/yuyan/180020010001196791/preview.html?agreementId=AG00000049"}]
	 */
	@ApiListField("auth_agreements")
	@ApiField("user_auth_agreement")
	private List<UserAuthAgreement> authAgreements;

	/** 
	 * 授权文案，列表类型，一个元素为一行
	 */
	@ApiListField("auth_content")
	@ApiField("string")
	private List<String> authContent;

	/** 
	 * 授权截止有效期，为空表示长期有效
	 */
	@ApiField("auth_end")
	private String authEnd;

	/** 
	 * 授权开始时间
	 */
	@ApiField("auth_start")
	private String authStart;

	public void setAppLogo(String appLogo) {
		this.appLogo = appLogo;
	}
	public String getAppLogo( ) {
		return this.appLogo;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppName( ) {
		return this.appName;
	}

	public void setAuthAgreements(List<UserAuthAgreement> authAgreements) {
		this.authAgreements = authAgreements;
	}
	public List<UserAuthAgreement> getAuthAgreements( ) {
		return this.authAgreements;
	}

	public void setAuthContent(List<String> authContent) {
		this.authContent = authContent;
	}
	public List<String> getAuthContent( ) {
		return this.authContent;
	}

	public void setAuthEnd(String authEnd) {
		this.authEnd = authEnd;
	}
	public String getAuthEnd( ) {
		return this.authEnd;
	}

	public void setAuthStart(String authStart) {
		this.authStart = authStart;
	}
	public String getAuthStart( ) {
		return this.authStart;
	}

}
