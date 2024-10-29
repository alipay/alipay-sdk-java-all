package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DonateBillInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.charity.donatebill.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-13 13:37:09
 */
public class AlipayUserCharityDonatebillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5283614177962491345L;

	/** 
	 * 支付宝用户在公益捐赠项目的流水信息列表
	 */
	@ApiListField("donate_bill_list")
	@ApiField("donate_bill_info")
	private List<DonateBillInfo> donateBillList;

	/** 
	 * 分页查询的当前页数，与入参page_num一致
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每批分页查询的数量，与入参page_size一致
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 用户当日捐赠成功的总数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setDonateBillList(List<DonateBillInfo> donateBillList) {
		this.donateBillList = donateBillList;
	}
	public List<DonateBillInfo> getDonateBillList( ) {
		return this.donateBillList;
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

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
