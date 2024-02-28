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
 * @since 1.0, 2023-09-04 01:13:32
 */
public class AlipayCommerceEducateCampuscardAuthorizedQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5453897281229637795L;

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
