package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlipayPointDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.point.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-02 21:52:21
 */
public class AlipayCommerceAcommunicationPointDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3674636892414246632L;

	/** 
	 * 返回用户积分明细数据
	 */
	@ApiListField("data")
	@ApiField("alipay_point_detail")
	private List<AlipayPointDetail> data;

	/** 
	 * 是否还有下一页
	 */
	@ApiField("has_next")
	private Boolean hasNext;

	public void setData(List<AlipayPointDetail> data) {
		this.data = data;
	}
	public List<AlipayPointDetail> getData( ) {
		return this.data;
	}

	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}
	public Boolean getHasNext( ) {
		return this.hasNext;
	}

}
