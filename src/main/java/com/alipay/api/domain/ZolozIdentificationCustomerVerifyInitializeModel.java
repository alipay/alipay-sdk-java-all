package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 佐罗认证初始化
 *
 * @author auto create
 * @since 1.0, 2018-02-05 14:05:26
 */
public class ZolozIdentificationCustomerVerifyInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 5753132995263741677L;

	/**
	 * 佐罗认证场景码。可选的场景码详见佐罗认证快速接入文档
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 商户请求的唯一标识，由字母数字下划线组成，商户须确保其唯一性。建议：开头使用一段自定义商户简称，中间使用一段日期，末尾使用一个序列
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 预留扩展业务参数
	 */
	@ApiField("extern_param")
	private String externParam;

	/**
	 * 用户身份信息，默认支持大陆居民身份证。不同认证场景码（bizCode）支持的入参类型不同，详见佐罗认证快速接入文档
	 */
	@ApiField("identity_param")
	private String identityParam;

	/**
	 * metainfo 环境参数。不同认证场景码（bizCode）支持的入参类型不同，详见佐罗认证快速接入文档
	 */
	@ApiField("metainfo")
	private String metainfo;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getExternParam() {
		return this.externParam;
	}
	public void setExternParam(String externParam) {
		this.externParam = externParam;
	}

	public String getIdentityParam() {
		return this.identityParam;
	}
	public void setIdentityParam(String identityParam) {
		this.identityParam = identityParam;
	}

	public String getMetainfo() {
		return this.metainfo;
	}
	public void setMetainfo(String metainfo) {
		this.metainfo = metainfo;
	}

}
