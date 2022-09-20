package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.bill.refund response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-11 16:32:27
 */
public class AlipayEbppBillRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 2548797251465325151L;

	/** 
	 * 回传支付宝流水号。
	 */
	@ApiField("alipay_bill_no")
	private String alipayBillNo;

	/** 
	 * 扩展字段，一系列键值对，示例只是个形式，具体的Key-Value需要根据具体业务另行约定。
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 回传ISV流水号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * ACCEPTED：退款请求被接受
REJECTED：退款请求被驳回
本接口的业务逻辑具备幂等性，一旦拿到确定的结果ACCEPTED/REJECTED，再重试是没有意义的。
	 */
	@ApiField("result")
	private String result;

	public void setAlipayBillNo(String alipayBillNo) {
		this.alipayBillNo = alipayBillNo;
	}
	public String getAlipayBillNo( ) {
		return this.alipayBillNo;
	}

	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}
	public String getExtendField( ) {
		return this.extendField;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
