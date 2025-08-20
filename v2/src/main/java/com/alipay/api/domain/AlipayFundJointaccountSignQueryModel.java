package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业签约结果查询
 *
 * @author auto create
 * @since 1.0, 2025-04-07 17:13:16
 */
public class AlipayFundJointaccountSignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1369921251197484883L;

	/**
	 * 企业签约账户ID,用于外部商户已获取企业签约ID，查询账户状态
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 场景码，联系支付宝分配
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 外部业务号，查询对应账户状态，优先级高于account_id
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品码，默认值
ENTERPRISE_PAY
	 */
	@ApiField("product_code")
	private String productCode;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
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
