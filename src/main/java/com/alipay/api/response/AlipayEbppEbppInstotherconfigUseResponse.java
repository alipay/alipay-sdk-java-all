package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OtherConfigVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.ebpp.instotherconfig.use response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-20 17:26:46
 */
public class AlipayEbppEbppInstotherconfigUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 1376577984317422465L;

	/** 
	 * 当前页面
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 杂项配置数据
	 */
	@ApiListField("other_configs")
	@ApiField("other_config_vo")
	private List<OtherConfigVo> otherConfigs;

	/** 
	 * 每页展示的数据的个数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总的数据大小
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setOtherConfigs(List<OtherConfigVo> otherConfigs) {
		this.otherConfigs = otherConfigs;
	}
	public List<OtherConfigVo> getOtherConfigs( ) {
		return this.otherConfigs;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
