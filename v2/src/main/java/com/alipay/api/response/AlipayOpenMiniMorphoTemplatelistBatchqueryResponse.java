package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MorphoTemplateItem;
import com.alipay.api.domain.MorphoPaginator;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.morpho.templatelist.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 21:18:32
 */
public class AlipayOpenMiniMorphoTemplatelistBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5147238982168285698L;

	/** 
	 * 模板列表
	 */
	@ApiListField("data_list")
	@ApiField("morpho_template_item")
	private List<MorphoTemplateItem> dataList;

	/** 
	 * 分页信息
	 */
	@ApiField("paginator")
	private MorphoPaginator paginator;

	public void setDataList(List<MorphoTemplateItem> dataList) {
		this.dataList = dataList;
	}
	public List<MorphoTemplateItem> getDataList( ) {
		return this.dataList;
	}

	public void setPaginator(MorphoPaginator paginator) {
		this.paginator = paginator;
	}
	public MorphoPaginator getPaginator( ) {
		return this.paginator;
	}

}
