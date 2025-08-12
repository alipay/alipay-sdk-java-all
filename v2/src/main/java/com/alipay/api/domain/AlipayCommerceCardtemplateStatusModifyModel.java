package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模版状态变更
 *
 * @author auto create
 * @since 1.0, 2023-10-30 15:52:01
 */
public class AlipayCommerceCardtemplateStatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2587423253627478295L;

	/**
	 * 卡模版ID
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 操作
	 */
	@ApiField("operate_status")
	private String operateStatus;

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getOperateStatus() {
		return this.operateStatus;
	}
	public void setOperateStatus(String operateStatus) {
		this.operateStatus = operateStatus;
	}

}
