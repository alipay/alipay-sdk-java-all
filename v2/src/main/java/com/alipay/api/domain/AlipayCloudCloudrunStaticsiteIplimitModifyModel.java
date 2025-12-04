package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改静态站点IP黑白名单
 *
 * @author auto create
 * @since 1.0, 2024-03-14 15:02:13
 */
public class AlipayCloudCloudrunStaticsiteIplimitModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1729687359262168117L;

	/**
	 * 内部使用，uiam角色扮演token
	 */
	@ApiField("assume_token")
	private String assumeToken;

	/**
	 * 是否开启黑白名单
	 */
	@ApiField("enable")
	private Boolean enable;

	/**
	 * 环境ID，唯一，开通小程序云系统会生成环境ID，请从开通页面获取
	 */
	@ApiField("env")
	private String env;

	/**
	 * IP列表。 输入IP段（不可重复，例如：192.168.0.0/24）或IP地址（例如192.168.0.1）。支持IPv6地址、IPv4地址。 IPv6地址不支持::缩写格式，例如：不支持FC00:0AA3::0023:0003:0300:300A:1234。支持输入IP段，例如：FC00:0AA3:0000:0000:0000:0000:0000:0000/48。
	 */
	@ApiListField("ip_list")
	@ApiField("string")
	private List<String> ipList;

	/**
	 * 限制类型
	 */
	@ApiField("limit_type")
	private String limitType;

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

	public List<String> getIpList() {
		return this.ipList;
	}
	public void setIpList(List<String> ipList) {
		this.ipList = ipList;
	}

	public String getLimitType() {
		return this.limitType;
	}
	public void setLimitType(String limitType) {
		this.limitType = limitType;
	}

}
