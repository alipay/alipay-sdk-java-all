package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转账业务单据主动关单
 *
 * @author auto create
 * @since 1.0, 2020-09-18 10:53:57
 */
public class AlipayFundTransOrderCloseModel extends AlipayObject {

	private static final long serialVersionUID = 1748288977134276618L;

	/**
	 * 描述特定的业务场景，开放网关必须要的参数，在资金这里统一识别配置
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 用户描述关单的原因。可以不填写
	 */
	@ApiField("close_reason")
	private String closeReason;

	/**
	 * 支付宝转账单据号： 本参数和商户转账唯一订单号、支付宝支付资金流水号三者不能同时为空。 当本参数和商户转账唯一订单号、支付宝支付资金流水号三者同时提供时，将用支付宝支付资金流水号进行查询，忽略其余两者； 当本参数和支付宝支付资金流水号同时提供时，将用支付宝支付资金流水号进行查询，忽略本参数。 当本参数和商户转账唯一订单号同时提供时，将用本参数进行查询，忽略商户转账唯一订单号。 （注意 和 out_biz_no 不可以同时为空）
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部业务号，商户的唯一订单标示 （注意和order_id 不能同时为空）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 销售产品码，商家和支付宝签约的产品码，如果传递了out_biz_no则该字段为必传。可传值如下： STD_RED_PACKET：现金红包 TRANS_ACCOUNT_NO_PWD：单笔无密转账到支付宝账户 TRANS_BANKCARD_NO_PWD：单笔无密转账到银行卡
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getCloseReason() {
		return this.closeReason;
	}
	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
