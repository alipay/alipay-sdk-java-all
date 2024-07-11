package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * H5刷脸认证初始化
 *
 * @author auto create
 * @since 1.0, 2024-01-09 12:51:17
 */
public class ZolozIdentificationUserWebInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 7375954922347431111L;

	/**
	 * 商户请求的唯一标识，该标识作为对账的关键信息，商户要保证其唯一性
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 预留扩展业务参数
	 */
	@ApiField("extern_param")
	private String externParam;

	/**
	 * 用户身份信息
	 */
	@ApiField("identity_param")
	private IdentityParam identityParam;

	/**
	 * 环境参数
	 */
	@ApiField("metainfo")
	private String metainfo;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getExternParam() {
		return this.externParam;
	}
	public void setExternParam(String externParam) {
		this.externParam = externParam;
	}

	public IdentityParam getIdentityParam() {
		return this.identityParam;
	}
	public void setIdentityParam(IdentityParam identityParam) {
		this.identityParam = identityParam;
	}

	public String getMetainfo() {
		return this.metainfo;
	}
	public void setMetainfo(String metainfo) {
		this.metainfo = metainfo;
	}

}
