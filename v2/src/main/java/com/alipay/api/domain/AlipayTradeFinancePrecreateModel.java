package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快收服务预下单
 *
 * @author auto create
 * @since 1.0, 2025-09-01 10:31:29
 */
public class AlipayTradeFinancePrecreateModel extends AlipayObject {

	private static final long serialVersionUID = 1265624371772872719L;

	/**
	 * 卖家账户，本次需要和拓展中卖家信息里面的内容一致
alipayAccountType为userId时，传递16位的支付宝20088id；
alipayAccountType为loginName时，传递支付宝登录号，如邮箱地址；
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/**
	 * 卖家账户类型
支付宝账号对应的支付宝唯一用户号: userId
支付宝登录号: loginName
	 */
	@ApiField("alipay_account_type")
	private String alipayAccountType;

	/**
	 * 订单金额，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 业务发生时间，格式参考示例值，不支持传递毫秒
	 */
	@ApiField("biz_date")
	private Date bizDate;

	/**
	 * 用于传递特殊业务场景的拓展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 外部订单号，一般建议32位以内
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 外部请求号，由外部平台生成的全局唯一id，标识一笔请求
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getAlipayAccount() {
		return this.alipayAccount;
	}
	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public String getAlipayAccountType() {
		return this.alipayAccountType;
	}
	public void setAlipayAccountType(String alipayAccountType) {
		this.alipayAccountType = alipayAccountType;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
