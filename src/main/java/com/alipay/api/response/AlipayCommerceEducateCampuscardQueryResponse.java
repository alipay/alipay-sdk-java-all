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
 * @since 1.0, 2021-08-10 16:57:57
 */
public class AlipayCommerceEducateCampuscardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3259486465524775623L;

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
