package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.product.agreement.sign response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-28 17:19:56
 */
public class AlipayInsSceneProductAgreementSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 6228227847731686299L;

	/** 
	 * 商户签约协议号，作为签约协议的唯一业务号码
	 */
	@ApiField("product_sign_no")
	private String productSignNo;

	/** 
	 * 返回签约结果，true为签约成功，false为签约失败
	 */
	@ApiField("sign_result")
	private Boolean signResult;

	public void setProductSignNo(String productSignNo) {
		this.productSignNo = productSignNo;
	}
	public String getProductSignNo( ) {
		return this.productSignNo;
	}

	public void setSignResult(Boolean signResult) {
		this.signResult = signResult;
	}
	public Boolean getSignResult( ) {
		return this.signResult;
	}

}
