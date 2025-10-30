package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PropertyFileDetectionVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.property.filedetection.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-18 10:42:30
 */
public class AlipayCommercePropertyFiledetectionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2191167963436382549L;

	/** 
	 * 数据列表
	 */
	@ApiListField("list")
	@ApiField("property_file_detection_v_o")
	private List<PropertyFileDetectionVO> list;

	/** 
	 * 总数量
	 */
	@ApiField("total")
	private Long total;

	public void setList(List<PropertyFileDetectionVO> list) {
		this.list = list;
	}
	public List<PropertyFileDetectionVO> getList( ) {
		return this.list;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
