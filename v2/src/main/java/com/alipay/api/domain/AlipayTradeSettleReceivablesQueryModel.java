package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直付通微账余额查询
 *
 * @author auto create
 * @since 1.0, 2024-04-17 21:52:49
 */
public class AlipayTradeSettleReceivablesQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1821791267559885322L;

	/**
	 * 收单产品码，商家和支付宝签约的产品码
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * 扩展参数
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 商户信息
	 */
	@ApiField("merchant_info")
	private SettleEntity merchantInfo;

	/**
	 * 外部请求号，32个字符以内，可包含字母、数字、下划线。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 当trade_no不为空时，该字段不生效。
查询历史日期，格式为 yyyyMMdd ，取值范围为昨日起至往前30日内；
不传入时，查询实时待结算余额返回；
传入过去某一天日期，查询对应日期的日终待结算余额返回（注意：日常场景下，昨日日终待结算余额只可在当天 02:00 后查询，在当天 02:00 前查询返回查询错误；大促场景下昨日日终可查时间会适当延后）；
传入过去某一天非近30天内，返回参数错误。
	 */
	@ApiField("query_his_date")
	private String queryHisDate;

	/**
	 * 支付宝交易号，当该笔交易为直付通账期模式，查询该笔交易待确认结算金额时必传
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBizProduct() {
		return this.bizProduct;
	}
	public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public SettleEntity getMerchantInfo() {
		return this.merchantInfo;
	}
	public void setMerchantInfo(SettleEntity merchantInfo) {
		this.merchantInfo = merchantInfo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getQueryHisDate() {
		return this.queryHisDate;
	}
	public void setQueryHisDate(String queryHisDate) {
		this.queryHisDate = queryHisDate;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
