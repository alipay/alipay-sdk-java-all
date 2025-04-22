package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 内容访问加速域名内容刷新
 *
 * @author auto create
 * @since 1.0, 2024-07-24 15:34:48
 */
public class AlipayCloudCloudrunObjectstorageCdsRefreshModel extends AlipayObject {

	private static final long serialVersionUID = 5898944394875932247L;

	/**
	 * 刷新 URL，格式为加速域名或刷新的文件或目录
	 */
	@ApiListField("content")
	@ApiField("string")
	private List<String> content;

	/**
	 * 小程序云的云托管下对应的环境id，他是以 env开头的随机字符串的形式
	 */
	@ApiField("envid")
	private String envid;

	/**
	 * 通过这个字段判断是按照操作类型
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 操作方式，填写支持的操作方式
	 */
	@ApiField("operatortype")
	private String operatortype;

	public List<String> getContent() {
		return this.content;
	}
	public void setContent(List<String> content) {
		this.content = content;
	}

	public String getEnvid() {
		return this.envid;
	}
	public void setEnvid(String envid) {
		this.envid = envid;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperatortype() {
		return this.operatortype;
	}
	public void setOperatortype(String operatortype) {
		this.operatortype = operatortype;
	}

}
