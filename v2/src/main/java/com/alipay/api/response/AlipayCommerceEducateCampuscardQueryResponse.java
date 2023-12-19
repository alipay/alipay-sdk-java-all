package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SchoolCardInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.campuscard.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-18 23:07:00
 */
public class AlipayCommerceEducateCampuscardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5272875873414344331L;

	/** 
	 * 学生的校园卡列表
	 */
	@ApiListField("alipay_card_list")
	@ApiField("school_card_info")
	private List<SchoolCardInfo> alipayCardList;

	public void setAlipayCardList(List<SchoolCardInfo> alipayCardList) {
		this.alipayCardList = alipayCardList;
	}
	public List<SchoolCardInfo> getAlipayCardList( ) {
		return this.alipayCardList;
	}

}
