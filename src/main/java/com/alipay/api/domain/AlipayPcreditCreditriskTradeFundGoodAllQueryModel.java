package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * asdasd
 *
 * @author auto create
 * @since 1.0, 2016-09-14 14:45:33
 */
public class AlipayPcreditCreditriskTradeFundGoodAllQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8837726971533154615L;

	/**
	 * sd
	 */
	@ApiField("aaa")
	private AddRemote aaa;

	/**
	 * fuzaleixing
	 */
	@ApiField("complex")
	private ShopIdList complex;

	/**
	 * aas
	 */
	@ApiField("dfd")
	private AlipayDataItemVoucherTemplete dfd;

	public AddRemote getAaa() {
		return this.aaa;
	}
	public void setAaa(AddRemote aaa) {
		this.aaa = aaa;
	}

	public ShopIdList getComplex() {
		return this.complex;
	}
	public void setComplex(ShopIdList complex) {
		this.complex = complex;
	}

	public AlipayDataItemVoucherTemplete getDfd() {
		return this.dfd;
	}
	public void setDfd(AlipayDataItemVoucherTemplete dfd) {
		this.dfd = dfd;
	}

}
