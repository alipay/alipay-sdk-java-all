package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险产品信息
 *
 * @author auto create
 * @since 1.0, 2025-09-29 10:24:07
 */
public class PolicyProdInfoModel extends AlipayObject {

	private static final long serialVersionUID = 4329939674632976831L;

	/**
	 * 产品名称
	 */
	@ApiField("prod_name")
	private String prodName;

	/**
	 * 产品编号
	 */
	@ApiField("prod_no")
	private String prodNo;

	public String getProdName() {
		return this.prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdNo() {
		return this.prodNo;
	}
	public void setProdNo(String prodNo) {
		this.prodNo = prodNo;
	}

}
