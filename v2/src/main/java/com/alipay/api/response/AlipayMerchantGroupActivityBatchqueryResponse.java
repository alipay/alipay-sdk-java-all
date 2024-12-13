package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GroupActivityRecordVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.activity.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-11 14:17:24
 */
public class AlipayMerchantGroupActivityBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2644316788174527465L;

	/** 
	 * 顶部运营位记录列表
	 */
	@ApiListField("activity_record_list")
	@ApiField("group_activity_record_v_o")
	private List<GroupActivityRecordVO> activityRecordList;

	/** 
	 * 商家配置商家群活动总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setActivityRecordList(List<GroupActivityRecordVO> activityRecordList) {
		this.activityRecordList = activityRecordList;
	}
	public List<GroupActivityRecordVO> getActivityRecordList( ) {
		return this.activityRecordList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
