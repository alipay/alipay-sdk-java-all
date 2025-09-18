package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务商一体化开通作业添加代运营授权项
 *
 * @author auto create
 * @since 1.0, 2025-09-02 15:07:34
 */
public class AlipayOpenSpInteopOpauthCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6475623215292877925L;

	/**
	 * 业务开通主单号，用于一体化作业过程的申请单串联
	 */
	@ApiField("inteop_order_no")
	private String inteopOrderNo;

	/**
	 * 产品信息
	 */
	@ApiListField("product_codes")
	@ApiField("string")
	private List<String> productCodes;

	public String getInteopOrderNo() {
		return this.inteopOrderNo;
	}
	public void setInteopOrderNo(String inteopOrderNo) {
		this.inteopOrderNo = inteopOrderNo;
	}

	public List<String> getProductCodes() {
		return this.productCodes;
	}
	public void setProductCodes(List<String> productCodes) {
		this.productCodes = productCodes;
	}

}
