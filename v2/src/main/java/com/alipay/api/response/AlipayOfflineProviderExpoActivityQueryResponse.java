package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.NfcExpoActivityInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.expo.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-08 11:12:45
 */
public class AlipayOfflineProviderExpoActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8265963282688983252L;

	/** 
	 * null
	 */
	@ApiListField("activity_list")
	@ApiField("nfc_expo_activity_info_v_o")
	private List<NfcExpoActivityInfoVO> activityList;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/** 
	 * 每页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 总记录数
	 */
	@ApiField("total_count")
	private String totalCount;

	public void setActivityList(List<NfcExpoActivityInfoVO> activityList) {
		this.activityList = activityList;
	}
	public List<NfcExpoActivityInfoVO> getActivityList( ) {
		return this.activityList;
	}

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}
	public String getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

}
