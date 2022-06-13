package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑业务授权令牌查询
 *
 * @author auto create
 * @since 1.0, 2019-06-28 16:21:42
 */
public class KoubeiMemberDataOauthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8191949385242929296L;

	/**
	 * 授权业务类型，目前统一只有pay_member
	 */
	@ApiField("auth_type")
	private String authType;

	/**
	 * 授权码，用于换取授权信息如操作人id等.获取方式:跳转isv地址中会带有此code参数。auth_code一次有效，auth_code有效期为3分钟到24小时（开放平台规则会根据具体的业务场景动态调整auth_code的有效期，但是不会低于3分钟，同时也不会超过24小时），超过有效期的auth_code即使未使用也将无法使用。用户的每次授权动作都会生成一个新的auth_code。
	 */
	@ApiField("code")
	private String code;

	/**
	 * 扩展参数，目前保留未用，开发者请忽略此参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	public String getAuthType() {
		return this.authType;
	}
	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

}
