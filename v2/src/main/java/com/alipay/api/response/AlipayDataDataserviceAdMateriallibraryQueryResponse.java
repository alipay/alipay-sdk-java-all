package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AdMaterialDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.materiallibrary.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-28 15:37:26
 */
public class AlipayDataDataserviceAdMateriallibraryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7717879379595741333L;

	/** 
	 * 素材列表值
	 */
	@ApiListField("data_list")
	@ApiField("ad_material_detail")
	private List<AdMaterialDetail> dataList;

	/** 
	 * 返回搜索出的素材总个数
	 */
	@ApiField("total")
	private Long total;

	public void setDataList(List<AdMaterialDetail> dataList) {
		this.dataList = dataList;
	}
	public List<AdMaterialDetail> getDataList( ) {
		return this.dataList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
