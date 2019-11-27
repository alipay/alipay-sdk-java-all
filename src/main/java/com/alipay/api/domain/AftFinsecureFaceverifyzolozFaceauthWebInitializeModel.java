package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * H5实人认证初始化
 *
 * @author auto create
 * @since 1.0, 2018-12-25 20:12:53
 */
public class AftFinsecureFaceverifyzolozFaceauthWebInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 5619144728933637617L;

	/**
	 * 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 用户身份信息
	 */
	@ApiField("identity_param")
	private String identityParam;

	/**
	 * metainfo环境参数
	 */
	@ApiField("metainfo")
	private String metainfo;

	/**
	 * 产品实例ID
	 */
	@ApiField("product_instance_id")
	private String productInstanceId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
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

	public String getProductInstanceId() {
		return this.productInstanceId;
	}
	public void setProductInstanceId(String productInstanceId) {
		this.productInstanceId = productInstanceId;
	}

}
