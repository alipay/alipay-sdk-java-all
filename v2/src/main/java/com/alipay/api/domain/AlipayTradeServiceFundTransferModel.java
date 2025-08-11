package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转账接口
 *
 * @author auto create
 * @since 1.0, 2022-12-30 14:20:51
 */
public class AlipayTradeServiceFundTransferModel extends AlipayObject {

	private static final long serialVersionUID = 3174431119151763832L;

	/**
	 * 转账金额，单位:元，精确到小数点后两位
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 服务对应的业务场景,由支付宝分配. 枚举值列表: LARGE_INFINITE_V2:无限付2.0; YUEBAO_TRANSFER:余额宝大额申购; AD_CHARGE:灯火平台广告费充值; PERSONAL_ACCOUNT_RECHARGE:灯火平台广告费充值; ETC_B2B:区块链ETC_B2B
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 商户端的唯一订单号，对于同一笔转账请求，商户需保证该订单号唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 收款人的蚂蚁统一会员id
	 */
	@ApiField("payee_open_id")
	private String payeeOpenId;

	/**
	 * 收款者支付宝UID
	 */
	@ApiField("payee_user_id")
	private String payeeUserId;

	/**
	 * 付款人的蚂蚁统一会员id
	 */
	@ApiField("payer_open_id")
	private String payerOpenId;

	/**
	 * 付款者支付宝UID
	 */
	@ApiField("payer_user_id")
	private String payerUserId;

	/**
	 * 子业务场景，由支付宝分配.枚举值列表: 1.ACS模式: 2.FUND_ACCOUNT:场景余额 3.SHBANK:上海银行
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPayeeOpenId() {
		return this.payeeOpenId;
	}
	public void setPayeeOpenId(String payeeOpenId) {
		this.payeeOpenId = payeeOpenId;
	}

	public String getPayeeUserId() {
		return this.payeeUserId;
	}
	public void setPayeeUserId(String payeeUserId) {
		this.payeeUserId = payeeUserId;
	}

	public String getPayerOpenId() {
		return this.payerOpenId;
	}
	public void setPayerOpenId(String payerOpenId) {
		this.payerOpenId = payerOpenId;
	}

	public String getPayerUserId() {
		return this.payerUserId;
	}
	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
