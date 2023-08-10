package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SpiDetectionDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.text.detect response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 21:32:03
 */
public class AlipayEcoTextDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 5628644621738827955L;

	/** 
	 * 检测结果
	 */
	@ApiListField("data")
	@ApiField("spi_detection_detail")
	private List<SpiDetectionDetail> data;

	public void setData(List<SpiDetectionDetail> data) {
		this.data = data;
	}
	public List<SpiDetectionDetail> getData( ) {
		return this.data;
	}

}
