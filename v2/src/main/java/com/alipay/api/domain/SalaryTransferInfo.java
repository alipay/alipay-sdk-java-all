package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转账信息
 *
 * @author auto create
 * @since 1.0, 2024-09-14 15:22:04
 */
public class SalaryTransferInfo extends AlipayObject {

	private static final long serialVersionUID = 3186722554993636154L;

	/**
	 * 转账的业务场景码，有限枚举：
1.ENTRUST_TRANSFER
2.DIRECT_TRANSFER
3.CO_MANAGER_DIRECT_TRANSFER
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 收款方信息
	 */
	@ApiField("payee_info")
	private TransferParticipantInfo payeeInfo;

	/**
	 * 付款方信息
	 */
	@ApiField("payer_info")
	private TransferParticipantInfo payerInfo;

	/**
	 * 业务产品码，有限枚举:
1.SINGLE_TRANSFER_NO_PWD
2.TRANS_ACCOUNT_NO_PWD
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 订单总金额，单位为元，不支持千位分隔符，精确到小数点后两位，取值范围[0.1,100000000]。
	 */
	@ApiField("trans_amount")
	private String transAmount;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public TransferParticipantInfo getPayeeInfo() {
		return this.payeeInfo;
	}
	public void setPayeeInfo(TransferParticipantInfo payeeInfo) {
		this.payeeInfo = payeeInfo;
	}

	public TransferParticipantInfo getPayerInfo() {
		return this.payerInfo;
	}
	public void setPayerInfo(TransferParticipantInfo payerInfo) {
		this.payerInfo = payerInfo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTransAmount() {
		return this.transAmount;
	}
	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

}
