package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AppxVersionConfigVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.inner.versionproportion.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-05 16:21:39
 */
public class AlipayOpenMiniInnerVersionproportionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7645189547856312181L;

	/** 
	 * 查询基础版本库的结果
	 */
	@ApiListField("appx_version_config_vos")
	@ApiField("appx_version_config_vo")
	private List<AppxVersionConfigVo> appxVersionConfigVos;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total_number")
	private String totalNumber;

	public void setAppxVersionConfigVos(List<AppxVersionConfigVo> appxVersionConfigVos) {
		this.appxVersionConfigVos = appxVersionConfigVos;
	}
	public List<AppxVersionConfigVo> getAppxVersionConfigVos( ) {
		return this.appxVersionConfigVos;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalNumber(String totalNumber) {
		this.totalNumber = totalNumber;
	}
	public String getTotalNumber( ) {
		return this.totalNumber;
	}

}
