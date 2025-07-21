package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钱包原路退接口
 *
 * @author auto create
 * @since 1.0, 2024-11-27 18:32:58
 */
public class AlipayFundWalletRefundModel extends AlipayObject {

	private static final long serialVersionUID = 4771643575463578169L;

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
	 * 原充值单号
	 */
	@ApiField("original_deposit_order_id")
	private String originalDepositOrderId;

	/**
	 * 用户唯一请求标识
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 用户唯一表示
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 用户唯一表示
	 */
	@ApiField("principal_open_id")
	private String principalOpenId;

	/**
	 * 主体类型
	 */
	@ApiField("principal_type")
	private String principalType;

	/**
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 充退扩展参数
	 */
	@ApiField("refund_business_extend")
	private RefundBusinessExtend refundBusinessExtend;

	/**
	 * 提现策略，默认为原路退
	 */
	@ApiField("refund_strategy")
	private String refundStrategy;

	/**
	 * 钱包id
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

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

	public String getOriginalDepositOrderId() {
		return this.originalDepositOrderId;
	}
	public void setOriginalDepositOrderId(String originalDepositOrderId) {
		this.originalDepositOrderId = originalDepositOrderId;
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

	public String getPrincipalOpenId() {
		return this.principalOpenId;
	}
	public void setPrincipalOpenId(String principalOpenId) {
		this.principalOpenId = principalOpenId;
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

	public RefundBusinessExtend getRefundBusinessExtend() {
		return this.refundBusinessExtend;
	}
	public void setRefundBusinessExtend(RefundBusinessExtend refundBusinessExtend) {
		this.refundBusinessExtend = refundBusinessExtend;
	}

	public String getRefundStrategy() {
		return this.refundStrategy;
	}
	public void setRefundStrategy(String refundStrategy) {
		this.refundStrategy = refundStrategy;
	}

	public String getUserWalletId() {
		return this.userWalletId;
	}
	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}

}
