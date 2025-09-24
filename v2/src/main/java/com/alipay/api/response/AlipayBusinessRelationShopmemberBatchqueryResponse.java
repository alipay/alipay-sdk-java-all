package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BusinessRelationShopMemberDigest;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.relation.shopmember.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-31 17:09:35
 */
public class AlipayBusinessRelationShopmemberBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8493855212464591324L;

	/** 
	 * 查询结果
	 */
	@ApiListField("members")
	@ApiField("business_relation_shop_member_digest")
	private List<BusinessRelationShopMemberDigest> members;

	public void setMembers(List<BusinessRelationShopMemberDigest> members) {
		this.members = members;
	}
	public List<BusinessRelationShopMemberDigest> getMembers( ) {
		return this.members;
	}

}
