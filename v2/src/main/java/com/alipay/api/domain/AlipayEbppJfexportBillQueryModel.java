package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询支付宝缴费订单
 *
 * @author auto create
 * @since 1.0, 2018-10-19 10:38:53
 */
public class AlipayEbppJfexportBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6475424447874427245L;

	/**
	 * 支付宝的业务订单号，具有唯一性和幂等性
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 业务类型英文名称
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 拓展字段，json串(key-value对)
	 */
	@ApiField("extend_field")
	private String extendField;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getExtendField() {
		return this.extendField;
	}
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

}
