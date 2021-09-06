package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 完结先享后付记账单
 *
 * @author auto create
 * @since 1.0, 2021-04-13 14:01:24
 */
public class ZhimaCreditPayafteruseCreditbizorderFinishModel extends AlipayObject {

	private static final long serialVersionUID = 1179912353358828782L;

	/**
	 * 芝麻后付订单号
	 */
	@ApiField("credit_biz_order_id")
	private String creditBizOrderId;

	/**
	 * 用户此订单是否守约
	 */
	@ApiField("is_fulfilled")
	private String isFulfilled;

	/**
	 * 商户外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户对本次操作的附言描述
	 */
	@ApiField("remark")
	private String remark;

	public String getCreditBizOrderId() {
		return this.creditBizOrderId;
	}
	public void setCreditBizOrderId(String creditBizOrderId) {
		this.creditBizOrderId = creditBizOrderId;
	}

	public String getIsFulfilled() {
		return this.isFulfilled;
	}
	public void setIsFulfilled(String isFulfilled) {
		this.isFulfilled = isFulfilled;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
