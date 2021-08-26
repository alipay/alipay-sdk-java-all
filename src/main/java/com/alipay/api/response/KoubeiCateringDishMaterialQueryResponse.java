package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbdishMaterialInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.material.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-11-23 11:24:15
 */
public class KoubeiCateringDishMaterialQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7699631775552566626L;

	/** 
	 * 加料模型
	 */
	@ApiListField("kb_dish_material_info_list")
	@ApiField("kbdish_material_info")
	private List<KbdishMaterialInfo> kbDishMaterialInfoList;

	/** 
	 * 表示当前页码
	 */
	@ApiField("page_no")
	private String pageNo;

	/** 
	 * 表示每页条数
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 数据总条数
	 */
	@ApiField("total_count")
	private String totalCount;

	/** 
	 * 总页数
	 */
	@ApiField("total_page")
	private String totalPage;

	public void setKbDishMaterialInfoList(List<KbdishMaterialInfo> kbDishMaterialInfoList) {
		this.kbDishMaterialInfoList = kbDishMaterialInfoList;
	}
	public List<KbdishMaterialInfo> getKbDishMaterialInfoList( ) {
		return this.kbDishMaterialInfoList;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}
	public String getPageNo( ) {
		return this.pageNo;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

	public void setTotalPage(String totalPage) {
		this.totalPage = totalPage;
	}
	public String getTotalPage( ) {
		return this.totalPage;
	}

}
