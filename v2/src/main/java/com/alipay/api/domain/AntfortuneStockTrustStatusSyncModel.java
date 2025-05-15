package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券商信托产品状态同步
 *
 * @author auto create
 * @since 1.0, 2023-05-12 10:06:22
 */
public class AntfortuneStockTrustStatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8715875292987694852L;

	/**
	 * 信托产品发行代码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * ON表示在售，OFF表示售罄或下架
	 */
	@ApiField("status")
	private String status;

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
