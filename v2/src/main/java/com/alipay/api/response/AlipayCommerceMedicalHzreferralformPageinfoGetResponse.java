package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ReferralFormPageVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hzreferralform.pageinfo.get response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-27 10:47:40
 */
public class AlipayCommerceMedicalHzreferralformPageinfoGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6381649877799251561L;

	/** 
	 * 转诊单分页的页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 转诊单分页列表的每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 转诊分页列表
	 */
	@ApiListField("records")
	@ApiField("referral_form_page_v_o")
	private List<ReferralFormPageVO> records;

	/** 
	 * 转诊单列表的总条数
	 */
	@ApiField("total")
	private Long total;

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

	public void setRecords(List<ReferralFormPageVO> records) {
		this.records = records;
	}
	public List<ReferralFormPageVO> getRecords( ) {
		return this.records;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
