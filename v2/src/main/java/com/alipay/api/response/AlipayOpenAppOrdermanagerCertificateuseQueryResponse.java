package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CertificateUseInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.ordermanager.certificateuse.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-27 11:12:40
 */
public class AlipayOpenAppOrdermanagerCertificateuseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2463851613132428552L;

	/** 
	 * 核销明细列表
	 */
	@ApiListField("data")
	@ApiField("certificate_use_info_d_t_o")
	private List<CertificateUseInfoDTO> data;

	/** 
	 * 页号
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/** 
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 按查询条件筛选后的总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setData(List<CertificateUseInfoDTO> data) {
		this.data = data;
	}
	public List<CertificateUseInfoDTO> getData( ) {
		return this.data;
	}

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Long getPageIndex( ) {
		return this.pageIndex;
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
