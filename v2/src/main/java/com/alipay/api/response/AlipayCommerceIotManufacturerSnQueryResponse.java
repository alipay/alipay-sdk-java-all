package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TagUrlInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.manufacturer.sn.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-10 10:32:45
 */
public class AlipayCommerceIotManufacturerSnQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7426598241184768242L;

	/** 
	 * 查询的sn信息返回值
	 */
	@ApiListField("tag_url_info_list")
	@ApiField("tag_url_info")
	private List<TagUrlInfo> tagUrlInfoList;

	public void setTagUrlInfoList(List<TagUrlInfo> tagUrlInfoList) {
		this.tagUrlInfoList = tagUrlInfoList;
	}
	public List<TagUrlInfo> getTagUrlInfoList( ) {
		return this.tagUrlInfoList;
	}

}
