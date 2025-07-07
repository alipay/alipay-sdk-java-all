package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ConvertedDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adconversion.conversionid.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-13 11:42:26
 */
public class AlipayDataDataserviceAdconversionConversionidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1728625962497879135L;

	/** 
	 * 转化事件基础信息列表
	 */
	@ApiListField("converted_detail_list")
	@ApiField("converted_detail")
	private List<ConvertedDetail> convertedDetailList;

	public void setConvertedDetailList(List<ConvertedDetail> convertedDetailList) {
		this.convertedDetailList = convertedDetailList;
	}
	public List<ConvertedDetail> getConvertedDetailList( ) {
		return this.convertedDetailList;
	}

}
