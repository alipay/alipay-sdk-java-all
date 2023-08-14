package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改索引
 *
 * @author auto create
 * @since 1.0, 2023-08-03 15:44:22
 */
public class AlipayCloudCloudrunStaticsiteIndexpageModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1452959784699153234L;

	/**
	 * 内部使用，uiam角色扮演token
	 */
	@ApiField("assume_token")
	private String assumeToken;

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
