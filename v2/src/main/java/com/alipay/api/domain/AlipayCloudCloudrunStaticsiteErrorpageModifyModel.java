package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改自定义错误页面
 *
 * @author auto create
 * @since 1.0, 2023-10-12 10:46:09
 */
public class AlipayCloudCloudrunStaticsiteErrorpageModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6126696139447121219L;

	/**
	 * 内部使用，uiam角色扮演token
	 */
	@ApiField("assume_token")
	private String assumeToken;

	/**
	 * 需要配置错误页面的域名列表，列表中的域名必须是此环境下的默认域名或者自定义域名
	 */
	@ApiListField("domain_list")
	@ApiField("string")
	private List<String> domainList;

	/**
	 * 环境ID，唯一，开通小程序云系统会生成环境ID，请从开通页面获取
	 */
	@ApiField("env")
	private String env;

	/**
	 * 自定义错误页面配置，当前仅支持配置404错误页
	 */
	@ApiField("error_page")
	private ErrorPageSetting errorPage;

	public String getAssumeToken() {
		return this.assumeToken;
	}
	public void setAssumeToken(String assumeToken) {
		this.assumeToken = assumeToken;
	}

	public List<String> getDomainList() {
		return this.domainList;
	}
	public void setDomainList(List<String> domainList) {
		this.domainList = domainList;
	}

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

	public ErrorPageSetting getErrorPage() {
		return this.errorPage;
	}
	public void setErrorPage(ErrorPageSetting errorPage) {
		this.errorPage = errorPage;
	}

}
