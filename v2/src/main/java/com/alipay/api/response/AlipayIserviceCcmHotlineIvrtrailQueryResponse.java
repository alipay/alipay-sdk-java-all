package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IvrTrackingVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.hotline.ivrtrail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-27 09:42:02
 */
public class AlipayIserviceCcmHotlineIvrtrailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2627125152941587144L;

	/** 
	 * 当前页
	 */
	@ApiField("current")
	private Long current;

	/** 
	 * 数据信息
	 */
	@ApiListField("list")
	@ApiField("ivr_tracking_v_o")
	private List<IvrTrackingVO> list;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总条数
	 */
	@ApiField("total")
	private Long total;

	/** 
	 * 总共页数
	 */
	@ApiField("total_page")
	private String totalPage;

	public void setCurrent(Long current) {
		this.current = current;
	}
	public Long getCurrent( ) {
		return this.current;
	}

	public void setList(List<IvrTrackingVO> list) {
		this.list = list;
	}
	public List<IvrTrackingVO> getList( ) {
		return this.list;
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

	public void setTotalPage(String totalPage) {
		this.totalPage = totalPage;
	}
	public String getTotalPage( ) {
		return this.totalPage;
	}

}
