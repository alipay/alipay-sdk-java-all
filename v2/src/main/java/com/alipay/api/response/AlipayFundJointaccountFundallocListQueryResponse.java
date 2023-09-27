package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AllocDetailDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.jointaccount.fundalloc.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 02:56:53
 */
public class AlipayFundJointaccountFundallocListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8416162151934193227L;

	/** 
	 * 执行详情列表
	 */
	@ApiListField("alloc_detail_list")
	@ApiField("alloc_detail_d_t_o")
	private List<AllocDetailDTO> allocDetailList;

	/** 
	 * 本次查询最后一条调拨记录的标识
	 */
	@ApiField("last_id")
	private String lastId;

	public void setAllocDetailList(List<AllocDetailDTO> allocDetailList) {
		this.allocDetailList = allocDetailList;
	}
	public List<AllocDetailDTO> getAllocDetailList( ) {
		return this.allocDetailList;
	}

	public void setLastId(String lastId) {
		this.lastId = lastId;
	}
	public String getLastId( ) {
		return this.lastId;
	}

}
