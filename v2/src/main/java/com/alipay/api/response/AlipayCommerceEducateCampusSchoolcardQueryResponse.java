package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SchoolCard;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.campus.schoolcard.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:09
 */
public class AlipayCommerceEducateCampusSchoolcardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4239695843639228749L;

	/** 
	 * 用户校园卡信息
	 */
	@ApiListField("school_card_list")
	@ApiField("school_card")
	private List<SchoolCard> schoolCardList;

	public void setSchoolCardList(List<SchoolCard> schoolCardList) {
		this.schoolCardList = schoolCardList;
	}
	public List<SchoolCard> getSchoolCardList( ) {
		return this.schoolCardList;
	}

}
