package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MediaReportDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.media.report.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-16 13:46:37
 */
public class AlipayDataDataserviceMediaReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3878349989368999898L;

	/** 
	 * 商家pid，类型是服务商并且传参里有m_pid的情况才会返回
	 */
	@ApiField("m_pid")
	private String mPid;

	/** 
	 * 商家名称
	 */
	@ApiField("m_pid_name")
	private String mPidName;

	/** 
	 * 媒体报表数据列表
	 */
	@ApiListField("media_report_data_list")
	@ApiField("media_report_detail")
	private List<MediaReportDetail> mediaReportDataList;

	/** 
	 * 当前页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 商户/服务商pid
	 */
	@ApiField("pid")
	private String pid;

	/** 
	 * 总条数
	 */
	@ApiField("total")
	private Long total;

	public void setmPid(String mPid) {
		this.mPid = mPid;
	}
	public String getmPid( ) {
		return this.mPid;
	}

	public void setmPidName(String mPidName) {
		this.mPidName = mPidName;
	}
	public String getmPidName( ) {
		return this.mPidName;
	}

	public void setMediaReportDataList(List<MediaReportDetail> mediaReportDataList) {
		this.mediaReportDataList = mediaReportDataList;
	}
	public List<MediaReportDetail> getMediaReportDataList( ) {
		return this.mediaReportDataList;
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

	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPid( ) {
		return this.pid;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
