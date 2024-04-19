package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除静态站点缓存配置
 *
 * @author auto create
 * @since 1.0, 2024-03-14 15:02:26
 */
public class AlipayCloudCloudrunStaticsiteCacheruleDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4286391325626463176L;

	/**
	 * 内部使用，uiam角色扮演token
	 */
	@ApiField("assume_token")
	private String assumeToken;

	/**
	 * 缓存内容。类型选择目录时，填写规则如下： 每次只能添加单条目录，可以用正斜线（/）匹配所有目录。 支持输入目录的完整路径，须以正斜线（/）开头，例如/directory/aaa。 类型选择后缀名时，填写规则如下： 支持输入一个或多个文件后缀名，多个文件后缀名用半角逗号（,）分隔，例如jpg,txt。 大小写敏感，注意区分大小写。 不支持用星号（*）匹配所有的文件类型。
	 */
	@ApiField("cache_key")
	private String cacheKey;

	/**
	 * 缓存类型。
目录：为某一路径下所有资源设置相同缓存规则。 后缀名：为某一文件类型资源的设置相同缓存规则。
	 */
	@ApiField("cache_type")
	private String cacheType;

	/**
	 * 环境ID，唯一，开通小程序云系统会生成环境ID，请从开通页面获取
	 */
	@ApiField("env")
	private String env;

	public String getAssumeToken() {
		return this.assumeToken;
	}
	public void setAssumeToken(String assumeToken) {
		this.assumeToken = assumeToken;
	}

	public String getCacheKey() {
		return this.cacheKey;
	}
	public void setCacheKey(String cacheKey) {
		this.cacheKey = cacheKey;
	}

	public String getCacheType() {
		return this.cacheType;
	}
	public void setCacheType(String cacheType) {
		this.cacheType = cacheType;
	}

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

}
