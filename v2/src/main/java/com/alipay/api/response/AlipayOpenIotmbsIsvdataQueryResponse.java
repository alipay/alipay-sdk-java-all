package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotmbs.isvdata.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:36:45
 */
public class AlipayOpenIotmbsIsvdataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3838695319965783585L;

	/** 
	 * 根据查询类型和查询条件返回isv下的酒店id或设备sn或绑定的outfaceId（isv创建并写入的数据）
	 */
	@ApiListField("content_list")
	@ApiField("string")
	private List<String> contentList;

	/** 
	 * 返回查询的数据的总条数
	 */
	@ApiField("list_total_count")
	private Long listTotalCount;

	public void setContentList(List<String> contentList) {
		this.contentList = contentList;
	}
	public List<String> getContentList( ) {
		return this.contentList;
	}

	public void setListTotalCount(Long listTotalCount) {
		this.listTotalCount = listTotalCount;
	}
	public Long getListTotalCount( ) {
		return this.listTotalCount;
	}

}
