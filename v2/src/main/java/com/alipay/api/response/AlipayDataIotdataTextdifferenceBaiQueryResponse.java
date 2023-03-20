package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TextDiff;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.iotdata.textdifference.bai.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 18:41:26
 */
public class AlipayDataIotdataTextdifferenceBaiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6633291359158711752L;

	/** 
	 * 差异化结果以json字符串呈现。
	 */
	@ApiListField("data")
	@ApiField("text_diff")
	private List<TextDiff> data;

	public void setData(List<TextDiff> data) {
		this.data = data;
	}
	public List<TextDiff> getData( ) {
		return this.data;
	}

}
