package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钱包互转
 *
 * @author auto create
 * @since 1.0, 2025-01-07 15:00:32
 */
public class AlipayFundWalletTransferCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1225321772695246639L;

	/**
	 * 金额大小，单位为元，精确到分
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 互转操作类型
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 操作人的支付宝用户userId。
	 */
	@ApiField("operate_user_id")
	private String operateUserId;

	/**
	 * 外部单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 转入方信息
	 */
	@ApiField("payee_fund_detail")
	private WalletTransferInfo payeeFundDetail;

	/**
	 * 转出方信息
	 */
	@ApiField("payer_fund_detail")
	private WalletTransferInfo payerFundDetail;

	/**
	 * 产品码
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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getOperateUserId() {
		return this.operateUserId;
	}
	public void setOperateUserId(String operateUserId) {
		this.operateUserId = operateUserId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public WalletTransferInfo getPayeeFundDetail() {
		return this.payeeFundDetail;
	}
	public void setPayeeFundDetail(WalletTransferInfo payeeFundDetail) {
		this.payeeFundDetail = payeeFundDetail;
	}

	public WalletTransferInfo getPayerFundDetail() {
		return this.payerFundDetail;
	}
	public void setPayerFundDetail(WalletTransferInfo payerFundDetail) {
		this.payerFundDetail = payerFundDetail;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
