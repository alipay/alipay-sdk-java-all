package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.kids.relation.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 08:01:10
 */
public class AlipayCommerceKidsRelationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5694139589199316556L;

	/** 
	 * 孩子信息列表
	 */
	@ApiListField("relation_list")
	@ApiField("user_info_v_o")
	private List<UserInfoVO> relationList;

	public void setRelationList(List<UserInfoVO> relationList) {
		this.relationList = relationList;
	}
	public List<UserInfoVO> getRelationList( ) {
		return this.relationList;
	}

}
