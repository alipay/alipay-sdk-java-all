package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用服务产品交易支付
 *
 * @author auto create
 * @since 1.0, 2021-03-23 20:44:47
 */
public class ZhimaCreditPeIndustryTradePayModel extends AlipayObject {

	private static final long serialVersionUID = 6489954826814416932L;

	/**
	 * 支付金额,单位元,支持两位小数
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 扩展信息字段，格式:json，注意，如果字符串对应的json对象包含中文字符，需要对包含中文的字段进行编码
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 扣款描述,扣款成后将在用户支付宝账单显示
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户扣款资金单号，需要保证唯一,扣款失败继续使用该订单号进行扣款
	 */
	@ApiField("out_fund_no")
	private String outFundNo;

	/**
	 * 扣款时对应的资金类型,具体业务对应的资金类型请联系业务确认
	 */
	@ApiField("pay_amount_type")
	private String payAmountType;

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

	public String getPayAmountType() {
		return this.payAmountType;
	}
	public void setPayAmountType(String payAmountType) {
		this.payAmountType = payAmountType;
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
