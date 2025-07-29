package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GroupDetailVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.groupinfo.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-17 17:32:29
 */
public class AlipayMerchantGroupGroupinfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3388886613752722311L;

	/** 
	 * 群组列表
	 */
	@ApiListField("group_list")
	@ApiField("group_detail_v_o")
	private List<GroupDetailVO> groupList;

	/** 
	 * 页码
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

	public void setGroupList(List<GroupDetailVO> groupList) {
		this.groupList = groupList;
	}
	public List<GroupDetailVO> getGroupList( ) {
		return this.groupList;
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
