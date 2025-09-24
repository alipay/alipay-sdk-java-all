package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AccountLogListDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.salary.accountlog.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-06 11:27:26
 */
public class AlipayEbppIndustrySalaryAccountlogQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5198222933522455736L;

	/** 
	 * 本次分页账务内容
	 */
	@ApiListField("account_log_list")
	@ApiField("account_log_list_d_t_o")
	private List<AccountLogListDTO> accountLogList;

	/** 
	 * 页数
	 */
	@ApiField("page_no")
	private String pageNo;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 响应加签xml，通过base64加签
	 */
	@ApiField("sign_xml")
	private String signXml;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private String total;

	public void setAccountLogList(List<AccountLogListDTO> accountLogList) {
		this.accountLogList = accountLogList;
	}
	public List<AccountLogListDTO> getAccountLogList( ) {
		return this.accountLogList;
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

	public void setSignXml(String signXml) {
		this.signXml = signXml;
	}
	public String getSignXml( ) {
		return this.signXml;
	}

	public void setTotal(String total) {
		this.total = total;
	}
	public String getTotal( ) {
		return this.total;
	}

}
