package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LogisticsSnVerifyFailDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.voice.plansnfail.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-09 10:29:33
 */
public class AlipayCommerceLogisticsVoicePlansnfailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3874963792984116468L;

	/** 
	 * 当前页最大数据ID，用于翻页
	 */
	@ApiField("cur_page_max_data_id")
	private String curPageMaxDataId;

	/** 
	 * null
	 */
	@ApiListField("data_list")
	@ApiField("logistics_sn_verify_fail_detail")
	private List<LogisticsSnVerifyFailDetail> dataList;

	/** 
	 * 是否有更多数据
	 */
	@ApiField("has_more")
	private Boolean hasMore;

	/** 
	 * 是否正在保存中
	 */
	@ApiField("saving")
	private Boolean saving;

	public void setCurPageMaxDataId(String curPageMaxDataId) {
		this.curPageMaxDataId = curPageMaxDataId;
	}
	public String getCurPageMaxDataId( ) {
		return this.curPageMaxDataId;
	}

	public void setDataList(List<LogisticsSnVerifyFailDetail> dataList) {
		this.dataList = dataList;
	}
	public List<LogisticsSnVerifyFailDetail> getDataList( ) {
		return this.dataList;
	}

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public Boolean getHasMore( ) {
		return this.hasMore;
	}

	public void setSaving(Boolean saving) {
		this.saving = saving;
	}
	public Boolean getSaving( ) {
		return this.saving;
	}

}
