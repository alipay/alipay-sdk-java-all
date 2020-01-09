package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EduOneCardDepositCardQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecard.edu.card.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayEcardEduCardGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3142436285679687952L;

	/** 
	 * 用户是否首次充值标记
	 */
	@ApiField("first_deposit_flag")
	private Boolean firstDepositFlag;

	/** 
	 * 校园一卡通历史充值卡信息查询结果对象
	 */
	@ApiListField("onecard")
	@ApiField("edu_one_card_deposit_card_query_result")
	private List<EduOneCardDepositCardQueryResult> onecard;

	public void setFirstDepositFlag(Boolean firstDepositFlag) {
		this.firstDepositFlag = firstDepositFlag;
	}
	public Boolean getFirstDepositFlag( ) {
		return this.firstDepositFlag;
	}

	public void setOnecard(List<EduOneCardDepositCardQueryResult> onecard) {
		this.onecard = onecard;
	}
	public List<EduOneCardDepositCardQueryResult> getOnecard( ) {
		return this.onecard;
	}

}
