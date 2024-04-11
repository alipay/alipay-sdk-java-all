package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CallDetailDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.listcalldetails.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-23 13:48:47
 */
public class AnttechOceanbaseObglobalListcalldetailsBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5394412971212166699L;

	/** 
	 * 业务错误码
	 */
	@ApiField("biz_error_code")
	private String bizErrorCode;

	/** 
	 * 业务错误信息
	 */
	@ApiField("biz_error_msg")
	private String bizErrorMsg;

	/** 
	 * 业务是否成功
	 */
	@ApiField("biz_success")
	private Boolean bizSuccess;

	/** 
	 * 当前页
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 历史通话详情列表
	 */
	@ApiListField("result")
	@ApiField("call_detail_d_t_o")
	private List<CallDetailDTO> result;

	/** 
	 * 记录总数，current_page为1时返回真实记录总数，其他时候返回0
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setBizErrorCode(String bizErrorCode) {
		this.bizErrorCode = bizErrorCode;
	}
	public String getBizErrorCode( ) {
		return this.bizErrorCode;
	}

	public void setBizErrorMsg(String bizErrorMsg) {
		this.bizErrorMsg = bizErrorMsg;
	}
	public String getBizErrorMsg( ) {
		return this.bizErrorMsg;
	}

	public void setBizSuccess(Boolean bizSuccess) {
		this.bizSuccess = bizSuccess;
	}
	public Boolean getBizSuccess( ) {
		return this.bizSuccess;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setResult(List<CallDetailDTO> result) {
		this.result = result;
	}
	public List<CallDetailDTO> getResult( ) {
		return this.result;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
