package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转账额度查询接口
 *
 * @author auto create
 * @since 1.0, 2024-11-27 11:58:10
 */
public class AlipayFundQuotaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8292881875452666467L;

	/**
	 * 描述特定的业务场景，与实际转账场景一致，可传的参数如下： DIRECT_TRANSFER：单笔无密转账到支付宝，单笔无密转账到银行卡，现金红包; DEFAULT：使用alipay.fund.trans.toaccount.transfer转账到户场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 业务产品码， 单笔转账到支付宝账户固定为: TRANS_ACCOUNT_NO_PWD； 收发现金红包固定为: STD_RED_PACKET；单笔付款到卡固定为：TRANS_BANKCARD_NO_PWD；单笔付款到卡固定为：TRANS_BANKCARD_NO_PWD；使用alipay.fund.trans.toaccount.transfer接口固定为DEFAULT
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
