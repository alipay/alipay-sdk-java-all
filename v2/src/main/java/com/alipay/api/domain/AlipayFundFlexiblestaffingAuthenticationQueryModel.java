package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核身结果查询
 *
 * @author auto create
 * @since 1.0, 2023-07-17 16:04:48
 */
public class AlipayFundFlexiblestaffingAuthenticationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1537359337276148811L;

	/**
	 * 业务场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 商户端的唯一订单号，幂等关键参数。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 业务产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
