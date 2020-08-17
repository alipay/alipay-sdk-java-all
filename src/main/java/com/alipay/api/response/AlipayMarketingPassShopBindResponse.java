package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.pass.shop.bind response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayMarketingPassShopBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 3796116747554534972L;

	/** 
	 * 本次调用绑定的门店数量
	 */
	@ApiField("binded")
	private Long binded;

	/** 
	 * 绑定门店数的总计
	 */
	@ApiField("total_binded")
	private Long totalBinded;

	public void setBinded(Long binded) {
		this.binded = binded;
	}
	public Long getBinded( ) {
		return this.binded;
	}

	public void setTotalBinded(Long totalBinded) {
		this.totalBinded = totalBinded;
	}
	public Long getTotalBinded( ) {
		return this.totalBinded;
	}

}
