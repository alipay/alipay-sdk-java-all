package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户确认创建钱包
 *
 * @author auto create
 * @since 1.0, 2023-12-19 17:51:14
 */
public class AlipayFundWalletTemplateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1799594741528361248L;

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
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 钱包场景码
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
