package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FailCardReason;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.manage.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-11 14:37:22
 */
public class AlipayCommerceMerchantcardManageTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 3889955138533613574L;

	/** 
	 * 发起成功的卡id集合
	 */
	@ApiListField("card_template_ids")
	@ApiField("string")
	private List<String> cardTemplateIds;

	/** 
	 * 商家确认链接，商家自调用时不返回
	 */
	@ApiField("confirm_link")
	private String confirmLink;

	/** 
	 * 发起转移失败的原因
	 */
	@ApiListField("fail_card_reasons")
	@ApiField("fail_card_reason")
	private List<FailCardReason> failCardReasons;

	public void setCardTemplateIds(List<String> cardTemplateIds) {
		this.cardTemplateIds = cardTemplateIds;
	}
	public List<String> getCardTemplateIds( ) {
		return this.cardTemplateIds;
	}

	public void setConfirmLink(String confirmLink) {
		this.confirmLink = confirmLink;
	}
	public String getConfirmLink( ) {
		return this.confirmLink;
	}

	public void setFailCardReasons(List<FailCardReason> failCardReasons) {
		this.failCardReasons = failCardReasons;
	}
	public List<FailCardReason> getFailCardReasons( ) {
		return this.failCardReasons;
	}

}
