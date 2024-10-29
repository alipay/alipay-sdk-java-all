package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniAppVersionBaseInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-02 13:58:41
 */
public class AlipayOpenMiniInnerversionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2296145798781843741L;

	/** 
	 * 总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 版本列表
	 */
	@ApiListField("version_list")
	@ApiField("mini_app_version_base_info")
	private List<MiniAppVersionBaseInfo> versionList;

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setVersionList(List<MiniAppVersionBaseInfo> versionList) {
		this.versionList = versionList;
	}
	public List<MiniAppVersionBaseInfo> getVersionList( ) {
		return this.versionList;
	}

}
