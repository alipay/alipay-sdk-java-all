package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用服务产品交易查询
 *
 * @author auto create
 * @since 1.0, 2022-12-29 10:39:00
 */
public class ZhimaCreditPeIndustryTradeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1295783181998788674L;

	/**
	 * 扩展信息字段，格式:json，注意，如果字符串对应的json对象包含中文字符，需要对包含中文的字段进行编码
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商户扣款或退款时对应的资金单号
	 */
	@ApiField("out_fund_no")
	private String outFundNo;

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

	public String getOutFundNo() {
		return this.outFundNo;
	}
	public void setOutFundNo(String outFundNo) {
		this.outFundNo = outFundNo;
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
