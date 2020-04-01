package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniActivityModuleQueryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.activity.module.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-16 15:52:01
 */
public class AlipayOpenMiniActivityModuleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5853575299145751685L;

	/** 
	 * 本次查询的页码
	 */
	@ApiField("current_page_num")
	private Long currentPageNum;

	/** 
	 * 模块的数据项列表
	 */
	@ApiListField("data")
	@ApiField("mini_activity_module_query_info")
	private List<MiniActivityModuleQueryInfo> data;

	/** 
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 每页数量
	 */
	@ApiField("per_page_count")
	private Long perPageCount;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果描述信息
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/** 
	 * 调用是否成功
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 符合条件的总数量
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setCurrentPageNum(Long currentPageNum) {
		this.currentPageNum = currentPageNum;
	}
	public Long getCurrentPageNum( ) {
		return this.currentPageNum;
	}

	public void setData(List<MiniActivityModuleQueryInfo> data) {
		this.data = data;
	}
	public List<MiniActivityModuleQueryInfo> getData( ) {
		return this.data;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setPerPageCount(Long perPageCount) {
		this.perPageCount = perPageCount;
	}
	public Long getPerPageCount( ) {
		return this.perPageCount;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
