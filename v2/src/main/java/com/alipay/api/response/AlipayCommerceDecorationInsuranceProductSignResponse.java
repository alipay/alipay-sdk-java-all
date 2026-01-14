package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SignProductVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.decoration.insurance.product.sign response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-24 19:27:42
 */
public class AlipayCommerceDecorationInsuranceProductSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 1371629141222195368L;

	/** 
	 * null
	 */
	@ApiListField("sign_product_list")
	@ApiField("sign_product_v_o")
	private List<SignProductVO> signProductList;

	public void setSignProductList(List<SignProductVO> signProductList) {
		this.signProductList = signProductList;
	}
	public List<SignProductVO> getSignProductList( ) {
		return this.signProductList;
	}

}
