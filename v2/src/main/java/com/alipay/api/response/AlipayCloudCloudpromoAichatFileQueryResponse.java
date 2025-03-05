package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FileBriefInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.aichat.file.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-05 17:42:06
 */
public class AlipayCloudCloudpromoAichatFileQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3221156612831756997L;

	/** 
	 * 查询到的文件列表
	 */
	@ApiField("data")
	private FileBriefInfo data;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页显示条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 上传的文件的总的个数，单位：个
	 */
	@ApiField("total")
	private Long total;

	/** 
	 * 上传的所有文件，按照当前分页标准，一共有多少页。单位：页
	 */
	@ApiField("total_page")
	private Long totalPage;

	public void setData(FileBriefInfo data) {
		this.data = data;
	}
	public FileBriefInfo getData( ) {
		return this.data;
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
