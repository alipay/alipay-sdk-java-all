package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 具体咨询扩展
 *
 * @author auto create
 * @since 1.0, 2018-10-25 15:25:04
 */
public class LoanPayConsultOrder extends AlipayObject {

	private static final long serialVersionUID = 8671449135642587749L;

	/**
	 * 外部平台订单号，如果传给支付宝收单时带着前缀，此处也需要
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 卖家支付宝账户ID
	 */
	@ApiField("seller_user_id")
	private String sellerUserId;

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getSellerUserId() {
		return this.sellerUserId;
	}
	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}

}
