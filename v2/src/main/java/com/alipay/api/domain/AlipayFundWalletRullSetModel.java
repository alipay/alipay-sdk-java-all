package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景钱包核销范围管理
 *
 * @author auto create
 * @since 1.0, 2024-09-05 16:47:21
 */
public class AlipayFundWalletRullSetModel extends AlipayObject {

	private static final long serialVersionUID = 1899342174323922762L;

	/**
	 * biz_scene
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 外部请求号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * product_code
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 配置类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 钱包模版ID
	 */
	@ApiField("wallet_template_id")
	private String walletTemplateId;

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

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getWalletTemplateId() {
		return this.walletTemplateId;
	}
	public void setWalletTemplateId(String walletTemplateId) {
		this.walletTemplateId = walletTemplateId;
	}

	public WalletUseRule getWalletUseRule() {
		return this.walletUseRule;
	}
	public void setWalletUseRule(WalletUseRule walletUseRule) {
		this.walletUseRule = walletUseRule;
	}

}
