package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查看可配置的默认结算账户
 *
 * @author auto create
 * @since 1.0, 2024-11-15 16:02:19
 */
public class AlipayCommerceMerchantcardSettleaccountBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4284948254752277147L;

	/**
	 * 次卡周期卡场景下，用到了代扣的能力，所以需要support_deduct=true，过滤掉不支持代扣的账号
	 */
	@ApiField("support_deduct")
	private Boolean supportDeduct;

	public Boolean getSupportDeduct() {
		return this.supportDeduct;
	}
	public void setSupportDeduct(Boolean supportDeduct) {
		this.supportDeduct = supportDeduct;
	}

}
