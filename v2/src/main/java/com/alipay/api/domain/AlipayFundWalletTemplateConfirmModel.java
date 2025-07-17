package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户确认开通钱包
 *
 * @author auto create
 * @since 1.0, 2025-07-14 13:42:03
 */
public class AlipayFundWalletTemplateConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 5213813338876349194L;

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
	 * 礼品卡模版信息
	 */
	@ApiField("gift_card_template")
	private GiftCardTemplate giftCardTemplate;

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

	public GiftCardTemplate getGiftCardTemplate() {
		return this.giftCardTemplate;
	}
	public void setGiftCardTemplate(GiftCardTemplate giftCardTemplate) {
		this.giftCardTemplate = giftCardTemplate;
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

}
