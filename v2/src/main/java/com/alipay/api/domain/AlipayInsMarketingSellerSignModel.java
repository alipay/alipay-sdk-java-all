package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险受托代扣签约
 *
 * @author auto create
 * @since 1.0, 2019-08-26 16:45:15
 */
public class AlipayInsMarketingSellerSignModel extends AlipayObject {

	private static final long serialVersionUID = 5843342524263674861L;

	/**
	 * 商户生成的外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品编码；由蚂蚁保险平台分配，商户通过该产品编码投保特定的保险产品（如饿了么外卖延误险)
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 卖家
	 */
	@ApiField("seller")
	private InsPerson seller;

	/**
	 * 签约的用户支付宝id
	 */
	@ApiField("sign_alipay_id")
	private String signAlipayId;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public InsPerson getSeller() {
		return this.seller;
	}
	public void setSeller(InsPerson seller) {
		this.seller = seller;
	}

	public String getSignAlipayId() {
		return this.signAlipayId;
	}
	public void setSignAlipayId(String signAlipayId) {
		this.signAlipayId = signAlipayId;
	}

}
