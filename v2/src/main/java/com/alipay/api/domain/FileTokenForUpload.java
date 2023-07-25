package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取上传文件token
 *
 * @author auto create
 * @since 1.0, 2023-05-25 16:28:04
 */
public class FileTokenForUpload extends AlipayObject {

	private static final long serialVersionUID = 6875269645524821717L;

	/**
	 * OSS授权的访问用户
	 */
	@ApiField("access_id")
	private String accessId;

	/**
	 * 授权使用的目录
	 */
	@ApiField("dir")
	private String dir;

	/**
	 * 有效时间
	 */
	@ApiField("expire")
	private String expire;

	/**
	 * 上传OSS的host地址
	 */
	@ApiField("host")
	private String host;

	/**
	 * 设置的使用策略
	 */
	@ApiField("policy")
	private String policy;

	/**
	 * 服务端签名
	 */
	@ApiField("signature")
	private String signature;

	public String getAccessId() {
		return this.accessId;
	}
	public void setAccessId(String accessId) {
		this.accessId = accessId;
	}

	public String getDir() {
		return this.dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}

	public String getExpire() {
		return this.expire;
	}
	public void setExpire(String expire) {
		this.expire = expire;
	}

	public String getHost() {
		return this.host;
	}
	public void setHost(String host) {
		this.host = host;
	}

	public String getPolicy() {
		return this.policy;
	}
	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public String getSignature() {
		return this.signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}

}
