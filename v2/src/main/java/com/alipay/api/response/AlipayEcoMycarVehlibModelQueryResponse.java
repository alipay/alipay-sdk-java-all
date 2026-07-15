package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VehOpenModelDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.vehlib.model.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-06 16:17:56
 */
public class AlipayEcoMycarVehlibModelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6575186916119834593L;

	/** 
	 * null
	 */
	@ApiListField("list")
	@ApiField("veh_open_model_d_t_o")
	private List<VehOpenModelDTO> list;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总页数
	 */
	@ApiField("total_page")
	private Long totalPage;

	/** 
	 * 符合条件的总记录数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setList(List<VehOpenModelDTO> list) {
		this.list = list;
	}
	public List<VehOpenModelDTO> getList( ) {
		return this.list;
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

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
