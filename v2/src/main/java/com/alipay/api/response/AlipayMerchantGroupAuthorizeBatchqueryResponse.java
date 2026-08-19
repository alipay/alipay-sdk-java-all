package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GroupAuthorizeVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.authorize.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-13 10:19:05
 */
public class AlipayMerchantGroupAuthorizeBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2859266954755995521L;

	/** 
	 * 授权信息列表
	 */
	@ApiListField("authorize_info_list")
	@ApiField("group_authorize_v_o")
	private List<GroupAuthorizeVO> authorizeInfoList;

	/** 
	 * 授权记录总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setAuthorizeInfoList(List<GroupAuthorizeVO> authorizeInfoList) {
		this.authorizeInfoList = authorizeInfoList;
	}
	public List<GroupAuthorizeVO> getAuthorizeInfoList( ) {
		return this.authorizeInfoList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
