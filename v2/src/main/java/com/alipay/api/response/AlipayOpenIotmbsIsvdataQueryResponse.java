package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotmbs.isvdata.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 09:56:44
 */
public class AlipayOpenIotmbsIsvdataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5158514769491323413L;

	/** 
	 * 参数名：content_list+使用场景：根据查询类型和查询条件返回isv下的酒店id或设备sn或绑定的outfaceId（isv创建并写入的数据）+枚举值：无
	 */
	@ApiListField("content_list")
	@ApiField("string")
	private List<String> contentList;

	/** 
	 * 参数名：list_total_count+使用场景：返回查询的数据的总条数+枚举值：无
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
