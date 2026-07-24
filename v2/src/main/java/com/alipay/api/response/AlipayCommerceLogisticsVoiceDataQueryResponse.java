package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LogisticsVoiceSceneData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.voice.data.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-09 10:29:31
 */
public class AlipayCommerceLogisticsVoiceDataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8854744856391318369L;

	/** 
	 * 当前页最大数据ID，用于翻页
	 */
	@ApiField("cur_page_max_data_id")
	private String curPageMaxDataId;

	/** 
	 * null
	 */
	@ApiListField("data_list")
	@ApiField("logistics_voice_scene_data")
	private List<LogisticsVoiceSceneData> dataList;

	/** 
	 * 是否有更多数据
	 */
	@ApiField("has_more")
	private String hasMore;

	public void setCurPageMaxDataId(String curPageMaxDataId) {
		this.curPageMaxDataId = curPageMaxDataId;
	}
	public String getCurPageMaxDataId( ) {
		return this.curPageMaxDataId;
	}

	public void setDataList(List<LogisticsVoiceSceneData> dataList) {
		this.dataList = dataList;
	}
	public List<LogisticsVoiceSceneData> getDataList( ) {
		return this.dataList;
	}

	public void setHasMore(String hasMore) {
		this.hasMore = hasMore;
	}
	public String getHasMore( ) {
		return this.hasMore;
	}

}
