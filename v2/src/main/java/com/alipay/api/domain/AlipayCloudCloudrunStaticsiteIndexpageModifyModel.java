package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改索引
 *
 * @author auto create
 * @since 1.0, 2024-03-14 15:01:51
 */
public class AlipayCloudCloudrunStaticsiteIndexpageModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2219539939494348932L;

	/**
	 * 内部使用，uiam角色扮演token
	 */
	@ApiField("assume_token")
	private String assumeToken;

	/**
	 * 需要修改索引配置的域名列表
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
	 * 索引文件名
	 */
	@ApiField("index_file")
	private String indexFile;

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

	public String getIndexFile() {
		return this.indexFile;
	}
	public void setIndexFile(String indexFile) {
		this.indexFile = indexFile;
	}

}
