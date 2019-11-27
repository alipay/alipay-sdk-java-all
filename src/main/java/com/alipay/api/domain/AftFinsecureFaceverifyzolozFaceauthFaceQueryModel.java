package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 刷脸认证-实人认证查询
 *
 * @author auto create
 * @since 1.0, 2018-12-20 16:41:28
 */
public class AftFinsecureFaceverifyzolozFaceauthFaceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4327456491875442271L;

	/**
	 * 业务单据号，用于核对和排查
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 产品实例ID
	 */
	@ApiField("product_instance_id")
	private String productInstanceId;

	/**
	 * zimId，用于查询认证结果
	 */
	@ApiField("zim_id")
	private String zimId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getProductInstanceId() {
		return this.productInstanceId;
	}
	public void setProductInstanceId(String productInstanceId) {
		this.productInstanceId = productInstanceId;
	}

	public String getZimId() {
		return this.zimId;
	}
	public void setZimId(String zimId) {
		this.zimId = zimId;
	}

}
