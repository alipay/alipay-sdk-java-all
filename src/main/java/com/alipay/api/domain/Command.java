package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 命令对象
 *
 * @author auto create
 * @since 1.0, 2019-03-13 09:28:13
 */
public class Command extends AlipayObject {

	private static final long serialVersionUID = 8727498629731648664L;

	/**
	 * 下发者
	 */
	@ApiField("commander")
	private String commander;

	/**
	 * 键:值
	 */
	@ApiField("content")
	private String content;

	/**
	 * 执行者
	 */
	@ApiField("executor")
	private String executor;

	/**
	 * bean.method
	 */
	@ApiField("key")
	private String key;

	public String getCommander() {
		return this.commander;
	}
	public void setCommander(String commander) {
		this.commander = commander;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getExecutor() {
		return this.executor;
	}
	public void setExecutor(String executor) {
		this.executor = executor;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

}
