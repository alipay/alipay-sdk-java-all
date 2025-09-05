package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户确认创建钱包
 *
 * @author auto create
 * @since 1.0, 2025-07-14 13:40:49
 */
public class AlipayFundWalletTemplateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3199158541446715871L;

	/**
	 * 开户场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 商户确认开通场景钱包能力扩展参数
	 */
	@ApiField("consume_extend")
	private ConsumeExtend consumeExtend;

	/**
	 * 如果存在大量入金笔数不出金场景，将该字段传为true。大量入金笔数且不出金场景，支付宝内部会有性能问题，一个钱包超过2000笔未核销笔数会阻断交易
	 */
	@ApiField("has_large_details_scene")
	private Boolean hasLargeDetailsScene;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 钱包名字
	 */
	@ApiField("wallet_template_name")
	private String walletTemplateName;

	/**
	 * 钱包使用规则
	 */
	@ApiField("wallet_use_rule")
	private WalletUseRule walletUseRule;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public ConsumeExtend getConsumeExtend() {
		return this.consumeExtend;
	}
	public void setConsumeExtend(ConsumeExtend consumeExtend) {
		this.consumeExtend = consumeExtend;
	}

	public Boolean getHasLargeDetailsScene() {
		return this.hasLargeDetailsScene;
	}
	public void setHasLargeDetailsScene(Boolean hasLargeDetailsScene) {
		this.hasLargeDetailsScene = hasLargeDetailsScene;
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

	public String getWalletTemplateName() {
		return this.walletTemplateName;
	}
	public void setWalletTemplateName(String walletTemplateName) {
		this.walletTemplateName = walletTemplateName;
	}

	public WalletUseRule getWalletUseRule() {
		return this.walletUseRule;
	}
	public void setWalletUseRule(WalletUseRule walletUseRule) {
		this.walletUseRule = walletUseRule;
	}

}
