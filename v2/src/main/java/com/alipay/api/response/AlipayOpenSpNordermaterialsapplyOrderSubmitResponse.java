package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nordermaterialsapply.order.submit response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-11 09:57:08
 */
public class AlipayOpenSpNordermaterialsapplyOrderSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 3556431749198413298L;

	/** 
	 * 该申请单下的物料总数
	 */
	@ApiField("materials_num")
	private Long materialsNum;

	/** 
	 * 申请单下的门店数量
	 */
	@ApiField("shop_num")
	private Long shopNum;

	public void setMaterialsNum(Long materialsNum) {
		this.materialsNum = materialsNum;
	}
	public Long getMaterialsNum( ) {
		return this.materialsNum;
	}

	public void setShopNum(Long shopNum) {
		this.shopNum = shopNum;
	}
	public Long getShopNum( ) {
		return this.shopNum;
	}

}
