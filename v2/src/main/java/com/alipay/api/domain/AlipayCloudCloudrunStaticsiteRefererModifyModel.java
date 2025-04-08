package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 配置防盗链
 *
 * @author auto create
 * @since 1.0, 2023-09-20 16:40:09
 */
public class AlipayCloudCloudrunStaticsiteRefererModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8716269681724968965L;

	/**
	 * 内部使用，uiam角色扮演token
	 */
	@ApiField("assume_token")
	private String assumeToken;

	/**
	 * 是否开启
	 */
	@ApiField("enable")
	private Boolean enable;

	/**
	 * 环境ID，唯一，开通小程序云系统会生成环境ID，请从开通页面获取
	 */
	@ApiField("env")
	private String env;

	/**
	 * 限制类型。
- 黑名单
黑名单内的域名均无法访问当前的资源。
- 白名单
只有白名单内的域名能访问当前资源，白名单以外的域名均无法访问当前的资源。
	 */
	@ApiField("limit_type")
	private String limitType;

	/**
	 * 是否允许空refer。默认允许
	 */
	@ApiField("no_refer_access")
	private Boolean noReferAccess;

	/**
	 * referer配置列表。域名或者域名加端口格式，比如a.com、b.com:8080
	 */
	@ApiListField("refer_list")
	@ApiField("string")
	private List<String> referList;

	public String getAssumeToken() {
		return this.assumeToken;
	}
	public void setAssumeToken(String assumeToken) {
		this.assumeToken = assumeToken;
	}

	public Boolean getEnable() {
		return this.enable;
	}
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

	public String getLimitType() {
		return this.limitType;
	}
	public void setLimitType(String limitType) {
		this.limitType = limitType;
	}

	public Boolean getNoReferAccess() {
		return this.noReferAccess;
	}
	public void setNoReferAccess(Boolean noReferAccess) {
		this.noReferAccess = noReferAccess;
	}

	public List<String> getReferList() {
		return this.referList;
	}
	public void setReferList(List<String> referList) {
		this.referList = referList;
	}

}
