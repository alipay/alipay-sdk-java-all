package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.StuffInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.sales.kbasset.stuff.pagequerystuffinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:05
 */
public class KoubeiSalesKbassetStuffPagequerystuffinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8772698618479797565L;

	/** 
	 * 异常码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 异常描述
	 */
	@ApiField("error_desc")
	private String errorDesc;

	/** 
	 * 扩展字段，保留
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 分页查询当前页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 分页查询每页数据量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 物料商品信息
	 */
	@ApiListField("stuff_infos")
	@ApiField("stuff_info")
	private List<StuffInfo> stuffInfos;

	/** 
	 * 本次调用是否成功
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 查询数据总量
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}
	public String getErrorDesc( ) {
		return this.errorDesc;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
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

	public void setStuffInfos(List<StuffInfo> stuffInfos) {
		this.stuffInfos = stuffInfos;
	}
	public List<StuffInfo> getStuffInfos( ) {
		return this.stuffInfos;
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
