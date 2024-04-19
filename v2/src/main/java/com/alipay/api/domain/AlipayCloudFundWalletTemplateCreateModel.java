package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云平台开通钱包产品
 *
 * @author auto create
 * @since 1.0, 2024-04-15 11:55:27
 */
public class AlipayCloudFundWalletTemplateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4444138738324219193L;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 钱包名称
	 */
	@ApiField("wallet_template_name")
	private String walletTemplateName;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getWalletTemplateName() {
		return this.walletTemplateName;
	}
	public void setWalletTemplateName(String walletTemplateName) {
		this.walletTemplateName = walletTemplateName;
	}

}
