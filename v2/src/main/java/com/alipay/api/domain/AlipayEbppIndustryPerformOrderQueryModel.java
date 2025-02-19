package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询履约单信息
 *
 * @author auto create
 * @since 1.0, 2024-06-07 10:33:49
 */
public class AlipayEbppIndustryPerformOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2137627916397835445L;

	/**
	 * 业务受理平台业务28位订单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 是否间联商户(是间联传Y,其他可不填)
非签约pid调用时必传Y(默认N)
	 */
	@ApiField("is_sub_merchant")
	private String isSubMerchant;

	/**
	 * 商户订单号。
订单支付时传入的商户订单号，商家自定义且保证商家系统中唯一。
	 */
	@ApiField("out_no")
	private String outNo;

	/**
	 * 支付宝交易订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getIsSubMerchant() {
		return this.isSubMerchant;
	}
	public void setIsSubMerchant(String isSubMerchant) {
		this.isSubMerchant = isSubMerchant;
	}

	public String getOutNo() {
		return this.outNo;
	}
	public void setOutNo(String outNo) {
		this.outNo = outNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
