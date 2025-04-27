package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可信价值中心开户进度查询
 *
 * @author auto create
 * @since 1.0, 2024-10-23 17:07:26
 */
public class AnttechBlockchainFinanceTvpAccountprogressQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8349457487978358784L;

	/**
	 * 可信价值中心产品码，由对接业务同学提供
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 申请流水
	 */
	@ApiField("request_no")
	private String requestNo;

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

}
