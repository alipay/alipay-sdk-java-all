package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SignUserInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.user.sign.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-20 14:32:42
 */
public class AlipayIserviceUserSignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2284814489322823366L;

	/** 
	 * 数据信息
	 */
	@ApiField("data_list")
	private SignUserInfo dataList;

	/** 
	 * 数据总数量
	 */
	@ApiField("total")
	private Long total;

	/** 
	 * 总页数
	 */
	@ApiField("total_page")
	private Long totalPage;

	public void setDataList(SignUserInfo dataList) {
		this.dataList = dataList;
	}
	public SignUserInfo getDataList( ) {
		return this.dataList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

}
