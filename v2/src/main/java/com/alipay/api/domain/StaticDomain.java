package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 静态站点域名信息
 *
 * @author auto create
 * @since 1.0, 2023-08-02 14:17:38
 */
public class StaticDomain extends AlipayObject {

	private static final long serialVersionUID = 1443539948422811236L;

	/**
	 * 域名cname
	 */
	@ApiField("cname")
	private String cname;

	/**
	 * 域名
	 */
	@ApiField("domain_name")
	private String domainName;

	/**
	 * 域名类型
	 */
	@ApiField("domain_type")
	private String domainType;

	/**
	 * 域名状态。
not_exist：表示该域名还未在系统内创建
init：域名正在进行配置初始化
init_fail：域名初始化失败
normal：域名正常提供服务中
stopped：域名已经被停止服务
deleted：域名已经被销毁
	 */
	@ApiField("status")
	private String status;

	public String getCname() {
		return this.cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getDomainName() {
		return this.domainName;
	}
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getDomainType() {
		return this.domainType;
	}
	public void setDomainType(String domainType) {
		this.domainType = domainType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
