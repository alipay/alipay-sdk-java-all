package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用服务产品订单查询
 *
 * @author auto create
 * @since 1.0, 2025-03-19 15:59:20
 */
public class ZhimaCreditPeIndustryOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6596376158549638931L;

	/**
	 * 扩展信息字段，格式:json，注意，如果字符串对应的json对象包含中文字符，需要对包含中文的字段进行编码
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商户的外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 签约产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 平台订单号
	 */
	@ApiField("zm_order_id")
	private String zmOrderId;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getZmOrderId() {
		return this.zmOrderId;
	}
	public void setZmOrderId(String zmOrderId) {
		this.zmOrderId = zmOrderId;
	}

}
