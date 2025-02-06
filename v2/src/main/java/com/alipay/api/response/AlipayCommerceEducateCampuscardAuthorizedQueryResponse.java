package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SchoolCardSimpleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.campuscard.authorized.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 21:52:05
 */
public class AlipayCommerceEducateCampuscardAuthorizedQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4346789125842621484L;

	/** 
	 * 学生的校园卡列表
	 */
	@ApiListField("alipay_card_simple_list")
	@ApiField("school_card_simple_info")
	private List<SchoolCardSimpleInfo> alipayCardSimpleList;

	public void setAlipayCardSimpleList(List<SchoolCardSimpleInfo> alipayCardSimpleList) {
		this.alipayCardSimpleList = alipayCardSimpleList;
	}
	public List<SchoolCardSimpleInfo> getAlipayCardSimpleList( ) {
		return this.alipayCardSimpleList;
	}

}
