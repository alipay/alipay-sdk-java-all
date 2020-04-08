package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MorphoAppItem;
import com.alipay.api.domain.MorphoPaginator;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.morpho.applist.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-12-26 15:02:17
 */
public class AlipayOpenMiniMorphoApplistBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2611699156487661362L;

	/** 
	 * 应用列表
	 */
	@ApiListField("data_list")
	@ApiField("morpho_app_item")
	private List<MorphoAppItem> dataList;

	/** 
	 * 批量查询分页信息
	 */
	@ApiField("paginator")
	private MorphoPaginator paginator;

	public void setDataList(List<MorphoAppItem> dataList) {
		this.dataList = dataList;
	}
	public List<MorphoAppItem> getDataList( ) {
		return this.dataList;
	}

	public void setPaginator(MorphoPaginator paginator) {
		this.paginator = paginator;
	}
	public MorphoPaginator getPaginator( ) {
		return this.paginator;
	}

}
