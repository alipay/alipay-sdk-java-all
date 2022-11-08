package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联营卡兑换码回滚作废
 *
 * @author auto create
 * @since 1.0, 2022-07-22 19:55:23
 */
public class AlipayMarketingCampaignUnicardExcodeRollbackModel extends AlipayObject {

	private static final long serialVersionUID = 3431911117496273274L;

	/**
	 * 支付宝内部生成的兑换码，商家可用该兑换码作为商品出售，用户用兑换码可来支付宝兑换权益。
	 */
	@ApiField("exchange_code")
	private String exchangeCode;

	/**
	 * 参数名：外部业务单号
应用场景：与支付宝的一个业务单号进行绑定，后续可以通过该业务单号进行查询
如何获取：接口使用方自行生成，为了数据查询的准确性，应该确保该单号的唯一性
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getExchangeCode() {
		return this.exchangeCode;
	}
	public void setExchangeCode(String exchangeCode) {
		this.exchangeCode = exchangeCode;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
