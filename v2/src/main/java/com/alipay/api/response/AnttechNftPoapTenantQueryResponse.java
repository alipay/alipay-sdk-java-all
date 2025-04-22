package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PoapInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.poap.tenant.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-17 17:42:27
 */
public class AnttechNftPoapTenantQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7394484498327522984L;

	/** 
	 * 是否有下一页
	 */
	@ApiField("has_next")
	private Boolean hasNext;

	/** 
	 * 勋章信息列表
	 */
	@ApiListField("medal_list")
	@ApiField("poap_info_d_t_o")
	private List<PoapInfoDTO> medalList;

	/** 
	 * 勋章总数
	 */
	@ApiField("total")
	private Long total;

	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}
	public Boolean getHasNext( ) {
		return this.hasNext;
	}

	public void setMedalList(List<PoapInfoDTO> medalList) {
		this.medalList = medalList;
	}
	public List<PoapInfoDTO> getMedalList( ) {
		return this.medalList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
