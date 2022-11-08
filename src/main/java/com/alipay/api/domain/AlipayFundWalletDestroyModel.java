package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钱包销户
 *
 * @author auto create
 * @since 1.0, 2022-08-01 11:59:09
 */
public class AlipayFundWalletDestroyModel extends AlipayObject {

	private static final long serialVersionUID = 5586659761197374744L;

	/**
	 * 金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 外部订单号用户幂等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 用户id
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 枚举值
alipay_user_id,
mechant_user_id
	 */
	@ApiField("principal_type")
	private String principalType;

	/**
	 * 销售产品吗
	 */
	@ApiField("product_code")
	private String productCode;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
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

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getPrincipalType() {
		return this.principalType;
	}
	public void setPrincipalType(String principalType) {
		this.principalType = principalType;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
