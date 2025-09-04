package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GroupInstanceInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.groupinstanceinfo.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-17 17:27:28
 */
public class AlipayMerchantGroupGroupinstanceinfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6326586431979432275L;

	/** 
	 * 群列表
	 */
	@ApiListField("group_instance_list")
	@ApiField("group_instance_info_v_o")
	private List<GroupInstanceInfoVO> groupInstanceList;

	/** 
	 * 分页页号
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 查询结果总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setGroupInstanceList(List<GroupInstanceInfoVO> groupInstanceList) {
		this.groupInstanceList = groupInstanceList;
	}
	public List<GroupInstanceInfoVO> getGroupInstanceList( ) {
		return this.groupInstanceList;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
