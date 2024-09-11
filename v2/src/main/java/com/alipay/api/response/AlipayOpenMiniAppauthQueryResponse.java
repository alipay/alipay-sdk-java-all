package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniAppAuthInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.appauth.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:19
 */
public class AlipayOpenMiniAppauthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4811968679123366686L;

	/** 
	 * 商户授权小程序列表
	 */
	@ApiListField("app_auth_list")
	@ApiField("mini_app_auth_info")
	private List<MiniAppAuthInfo> appAuthList;

	/** 
	 * 分页页数
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 分页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总条数
	 */
	@ApiField("total_items")
	private Long totalItems;

	public void setAppAuthList(List<MiniAppAuthInfo> appAuthList) {
		this.appAuthList = appAuthList;
	}
	public List<MiniAppAuthInfo> getAppAuthList( ) {
		return this.appAuthList;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo( ) {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalItems(Long totalItems) {
		this.totalItems = totalItems;
	}
	public Long getTotalItems( ) {
		return this.totalItems;
	}

}
