package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 见证订单查询接口
 *
 * @author auto create
 * @since 1.0, 2023-03-28 16:35:51
 */
public class AlipayFincoreFunddsOrderWitnessQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8391672491662815222L;

	/**
	 * 云资通订单号（fds_no 和 out_request_no 两个参数不能同时为空）
	 */
	@ApiField("fds_no")
	private String fdsNo;

	/**
	 * 外部订单号
（fds_no 和 out_request_no 两个参数不能同时为空）
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

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

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
