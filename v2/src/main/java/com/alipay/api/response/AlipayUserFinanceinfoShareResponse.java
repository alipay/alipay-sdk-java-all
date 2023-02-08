package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlipayUserCreditCard;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.financeinfo.share response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 14:38:28
 */
public class AlipayUserFinanceinfoShareResponse extends AlipayResponse {

	private static final long serialVersionUID = 8534657215884976981L;

	/** 
	 * 查询出的信用卡列表，包含0到多张卡，每张卡对应一组信息，包含卡号（已脱敏）和开户行代码
	 */
	@ApiListField("credit_card_list")
	@ApiField("alipay_user_credit_card")
	private List<AlipayUserCreditCard> creditCardList;

	public void setCreditCardList(List<AlipayUserCreditCard> creditCardList) {
		this.creditCardList = creditCardList;
	}
	public List<AlipayUserCreditCard> getCreditCardList( ) {
		return this.creditCardList;
	}

}
