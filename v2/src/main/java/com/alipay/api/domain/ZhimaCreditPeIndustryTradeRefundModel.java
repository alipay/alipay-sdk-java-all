package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用服务产品交易退款
 *
 * @author auto create
 * @since 1.0, 2022-12-29 10:38:01
 */
public class ZhimaCreditPeIndustryTradeRefundModel extends AlipayObject {

	private static final long serialVersionUID = 2726831284817949881L;

	/**
	 * 退款金额,单位元,支持两位小数
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 扩展信息字段，格式:json，注意，如果字符串对应的json对象包含中文字符，需要对包含中文的字段进行编码
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 退款描述,该字段在支付宝账单直接展示给用户
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 扣款时传入的扣款资金单号
	 */
	@ApiField("out_fund_no")
	private String outFundNo;

	/**
	 * 退款资金单号，需要保证唯一, 退款失败继续使用该退款资金单号进行退款
	 */
	@ApiField("out_refund_no")
	private String outRefundNo;

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

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutFundNo() {
		return this.outFundNo;
	}
	public void setOutFundNo(String outFundNo) {
		this.outFundNo = outFundNo;
	}

	public String getOutRefundNo() {
		return this.outRefundNo;
	}
	public void setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
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
