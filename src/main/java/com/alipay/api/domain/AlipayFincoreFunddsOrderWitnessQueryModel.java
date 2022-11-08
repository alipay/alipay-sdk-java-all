package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 见证订单查询接口
 *
 * @author auto create
 * @since 1.0, 2022-01-13 16:43:14
 */
public class AlipayFincoreFunddsOrderWitnessQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6276338911527176666L;

	/**
	 * 20211118000000000000000027001023
	 */
	@ApiField("fds_no")
	private String fdsNo;

	/**
	 * 签约产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getFdsNo() {
		return this.fdsNo;
	}
	public void setFdsNo(String fdsNo) {
		this.fdsNo = fdsNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
