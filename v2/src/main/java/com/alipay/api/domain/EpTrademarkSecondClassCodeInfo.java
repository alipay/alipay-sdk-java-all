package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业商标商品/服务项目明细
 *
 * @author auto create
 * @since 1.0, 2024-12-19 11:28:16
 */
public class EpTrademarkSecondClassCodeInfo extends AlipayObject {

	private static final long serialVersionUID = 2466929121624322256L;

	/**
	 * 编码
	 */
	@ApiField("coding")
	private String coding;

	/**
	 * 名称
	 */
	@ApiField("designation")
	private String designation;

	public String getCoding() {
		return this.coding;
	}
	public void setCoding(String coding) {
		this.coding = coding;
	}

	public String getDesignation() {
		return this.designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
