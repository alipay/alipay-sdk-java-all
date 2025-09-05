package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建微应用元数据
 *
 * @author auto create
 * @since 1.0, 2023-11-20 09:54:52
 */
public class AntfortuneStockMiniappMetaCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2464569672878381937L;

	/**
	 * 蚂蚁展业平台生成的应用id
	 */
	@ApiField("ant_app_id")
	private String antAppId;

	/**
	 * 渠道id
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 应用id，三方展业平台生成
	 */
	@ApiField("inst_app_id")
	private String instAppId;

	/**
	 * 机构id
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 密钥
	 */
	@ApiField("secret")
	private String secret;

	public String getAntAppId() {
		return this.antAppId;
	}
	public void setAntAppId(String antAppId) {
		this.antAppId = antAppId;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getInstAppId() {
		return this.instAppId;
	}
	public void setInstAppId(String instAppId) {
		this.instAppId = instAppId;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getSecret() {
		return this.secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}

}
