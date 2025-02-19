package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 静态站点域名信息
 *
 * @author auto create
 * @since 1.0, 2023-10-10 15:12:45
 */
public class StaticDomain extends AlipayObject {

	private static final long serialVersionUID = 6585736131385187829L;

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
	 * true: 已启用HTTPS，false: 未启用HTTPS
	 */
	@ApiField("enable_https")
	private Boolean enableHttps;

	/**
	 * 域名的自定义错误页面
	 */
	@ApiField("error_page")
	private ErrorPageSetting errorPage;

	/**
	 * 默认索引文件，请求的域名路径以 / 结尾时，默认跳转到此文件路径
	 */
	@ApiField("index_file")
	private String indexFile;

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

	public Boolean getEnableHttps() {
		return this.enableHttps;
	}
	public void setEnableHttps(Boolean enableHttps) {
		this.enableHttps = enableHttps;
	}

	public ErrorPageSetting getErrorPage() {
		return this.errorPage;
	}
	public void setErrorPage(ErrorPageSetting errorPage) {
		this.errorPage = errorPage;
	}

	public String getIndexFile() {
		return this.indexFile;
	}
	public void setIndexFile(String indexFile) {
		this.indexFile = indexFile;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
