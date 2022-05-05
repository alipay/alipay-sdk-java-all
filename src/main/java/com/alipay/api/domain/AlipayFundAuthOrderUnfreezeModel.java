package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预授权资金解冻接口
 *
 * @author auto create
 * @since 1.0, 2022-05-05 14:51:30
 */
public class AlipayFundAuthOrderUnfreezeModel extends AlipayObject {

	private static final long serialVersionUID = 4349492817878922376L;

	/**
	 * 本次操作解冻的金额，单位为：元（人民币），精确到小数点后两位。
取值范围：[0.01,100000000.00]
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 支付宝资金授权订单号。
	 */
	@ApiField("auth_no")
	private String authNo;

	/**
	 * 解冻扩展信息。map<string, string>的json格式，目前支持如下key：
unfreezeBizInfo：由芝麻消费，当前支持value如下：
"bizComplete":"true"——标识本次解冻用户已履约，true表示信用单履约完结
	 */
	@ApiField("extra_param")
	private String extraParam;

	/**
	 * 解冻请求流水号。
如果是针对同一笔授权单不同的解冻请求，如第一次解冻1元，第二次解冻2元，则解冻请求流水号必须不重复；
如果是针对同一笔解冻请求的多次发起，则需要保证每次发起，解冻请求流水号和解冻金额都相同
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户对本次解冻操作的附言描述
	 */
	@ApiField("remark")
	private String remark;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAuthNo() {
		return this.authNo;
	}
	public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}

	public String getExtraParam() {
		return this.extraParam;
	}
	public void setExtraParam(String extraParam) {
		this.extraParam = extraParam;
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
