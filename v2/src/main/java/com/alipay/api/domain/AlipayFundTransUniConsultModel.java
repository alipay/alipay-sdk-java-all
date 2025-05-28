package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转账独立咨询
 *
 * @author auto create
 * @since 1.0, 2024-08-14 16:29:32
 */
public class AlipayFundTransUniConsultModel extends AlipayObject {

	private static final long serialVersionUID = 7614781144831894873L;

	/**
	 * 描述特定的业务场景，可传的参数如下： DIRECT_TRANSFER：单笔无密转账到支付宝，其他场景以对应的产品接入指南文档为准。
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 转账咨询业务的标题
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 商家侧唯一订单号，由商家自定义。对于不同转账咨询请求，商家需保证该订单号在自身系统唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 收款方信息
	 */
	@ApiField("payee_info")
	private Participant payeeInfo;

	/**
	 * 付款方信息
	 */
	@ApiField("payer_info")
	private Participant payerInfo;

	/**
	 * 业务产品码， 单笔无密转账到支付宝账户固定为: TRANS_ACCOUNT_NO_PWD，其他场景以对应的产品接入指南文档为准。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 业务备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位， TRANS_ACCOUNT_NO_PWD产品取值范围[0.1,100000000]
	 */
	@ApiField("trans_amount")
	private String transAmount;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Participant getPayeeInfo() {
		return this.payeeInfo;
	}
	public void setPayeeInfo(Participant payeeInfo) {
		this.payeeInfo = payeeInfo;
	}

	public Participant getPayerInfo() {
		return this.payerInfo;
	}
	public void setPayerInfo(Participant payerInfo) {
		this.payerInfo = payerInfo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTransAmount() {
		return this.transAmount;
	}
	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

}
