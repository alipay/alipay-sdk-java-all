package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MemberArchiveOpenApiInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.commercial.archive.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-30 10:02:43
 */
public class AlipayCommerceMedicalCommercialArchiveQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4731785571127653668L;

	/** 
	 * 受益人集合
	 */
	@ApiListField("member_archive_list")
	@ApiField("member_archive_open_api_info_d_t_o")
	private List<MemberArchiveOpenApiInfoDTO> memberArchiveList;

	/** 
	 * 记录数量
	 */
	@ApiField("total")
	private Long total;

	public void setMemberArchiveList(List<MemberArchiveOpenApiInfoDTO> memberArchiveList) {
		this.memberArchiveList = memberArchiveList;
	}
	public List<MemberArchiveOpenApiInfoDTO> getMemberArchiveList( ) {
		return this.memberArchiveList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
