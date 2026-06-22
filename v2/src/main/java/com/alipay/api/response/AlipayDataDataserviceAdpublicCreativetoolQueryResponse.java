package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.UserPublicQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adpublic.creativetool.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-25 16:12:43
 */
public class AlipayDataDataserviceAdpublicCreativetoolQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4653996714173617837L;

	/** 
	 * 生活号列表值
	 */
	@ApiField("data_list")
	private UserPublicQueryResponse dataList;

	/** 
	 * 返回搜索出的素材总个数
	 */
	@ApiField("total")
	private Long total;

	public void setDataList(UserPublicQueryResponse dataList) {
		this.dataList = dataList;
	}
	public UserPublicQueryResponse getDataList( ) {
		return this.dataList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
