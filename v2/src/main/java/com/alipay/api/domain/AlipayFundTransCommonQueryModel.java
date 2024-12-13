package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转账业务单据查询接口
 *
 * @author auto create
 * @since 1.0, 2024-10-08 21:45:51
 */
public class AlipayFundTransCommonQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7157155944651199764L;

	/**
	 * 描述特定的业务场景，如果传递了out_biz_no则该字段为必传。可取的业务场景如下：
PERSONAL_PAY：C2C现金红包-发红包；
PERSONAL_COLLECTION：C2C现金红包-领红包；
REFUND：C2C现金红包-红包退回；
DIRECT_TRANSFER：B2C现金红包、单笔无密转账
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 支付宝转账单据号。 本参数和out_biz_no（商户转账唯一订单号）、pay_fund_order_id（支付宝支付资金流水号）三者不能同时为空。 
当三者同时传入时，将用pay_fund_order_id（支付宝支付资金流水号）进行查询，忽略其余两者；
当本参数和pay_fund_order_id（支付宝支付资金流水号）同时提供时，将用支付宝支付资金流水号进行查询，忽略本参数； 
当本参数和out_biz_no（商户转账唯一订单号）同时提供时，将用本参数进行查询，忽略商户转账唯一订单号。
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商户转账唯一订单号，发起转账来源方定义的转账单据ID。 
本参数和order_id（支付宝转账单据号）、pay_fund_order_id（支付宝支付资金流水号）三者不能同时为空。
当三者同时传入时，将用pay_fund_order_id（支付宝支付资金流水号）进行查询，忽略其余两者；
当本参数和支付宝转账单据号同时提供时，将用支付宝转账单据号进行查询，忽略本参数。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付宝支付资金流水号。本参数和支付宝转账单据号、商户转账唯一订单号三者不能同时为空。 
当本参数和out_biz_no（商户转账唯一订单号）、order_id（支付宝转账单据号）同时提供时，将用本参数进行查询，忽略其余两者；
当本参数和order_id（支付宝转账单据号）同时提供时，将用本参数进行查询，忽略支付宝转账单据号； 
当本参数和out_biz_no（商户转账唯一订单号）同时提供时，将用本参数进行查询，忽略商户转账唯一订单号。
	 */
	@ApiField("pay_fund_order_id")
	private String payFundOrderId;

	/**
	 * 销售产品码，商家和支付宝签约的产品码，如果传递了out_biz_no则该字段为必传。可传值如下：
STD_RED_PACKET：现金红包
TRANS_ACCOUNT_NO_PWD：单笔无密转账到支付宝账户
TRANS_BANKCARD_NO_PWD：单笔无密转账到银行卡
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
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

	public String getPayFundOrderId() {
		return this.payFundOrderId;
	}
	public void setPayFundOrderId(String payFundOrderId) {
		this.payFundOrderId = payFundOrderId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
