package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GroupControlRecordVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.groupcontrol.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 10:37:36
 */
public class AlipayMerchantGroupGroupcontrolBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4333113292636493441L;

	/** 
	 * 广告屏蔽记录列表
	 */
	@ApiField("group_control_list")
	private GroupControlRecordVO groupControlList;

	/** 
	 * 当前第几页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页展示条数，最大展示50条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 广告屏蔽记录总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setGroupControlList(GroupControlRecordVO groupControlList) {
		this.groupControlList = groupControlList;
	}
	public GroupControlRecordVO getGroupControlList( ) {
		return this.groupControlList;
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
