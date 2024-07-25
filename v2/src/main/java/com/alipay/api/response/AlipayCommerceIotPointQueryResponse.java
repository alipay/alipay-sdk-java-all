package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PointInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.point.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-17 16:11:50
 */
public class AlipayCommerceIotPointQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8354334715132699198L;

	/** 
	 * 当前分页
	 */
	@ApiField("cur_page")
	private Long curPage;

	/** 
	 * 点位列表
	 */
	@ApiListField("data")
	@ApiField("point_info")
	private List<PointInfo> data;

	/** 
	 * 总点位数
	 */
	@ApiField("total")
	private Long total;

	public void setCurPage(Long curPage) {
		this.curPage = curPage;
	}
	public Long getCurPage( ) {
		return this.curPage;
	}

	public void setData(List<PointInfo> data) {
		this.data = data;
	}
	public List<PointInfo> getData( ) {
		return this.data;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
