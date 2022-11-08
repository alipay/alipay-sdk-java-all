package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户确认开通钱包
 *
 * @author auto create
 * @since 1.0, 2022-10-14 16:13:15
 */
public class AlipayFundWalletTemplateConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 2535157756545493115L;

	/**
	 * 开户场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

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
	 * 钱包场景码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
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

}
