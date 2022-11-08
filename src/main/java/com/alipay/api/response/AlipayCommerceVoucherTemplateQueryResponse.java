package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.YunTaskVoucherTemplateInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.voucher.template.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-31 19:51:01
 */
public class AlipayCommerceVoucherTemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8455616683883383238L;

	/** 
	 * 当前页数
	 */
	@ApiField("page")
	private Long page;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total_size")
	private Long totalSize;

	/** 
	 * 券模板列表
	 */
	@ApiListField("voucher_template_list")
	@ApiField("yun_task_voucher_template_info")
	private List<YunTaskVoucherTemplateInfo> voucherTemplateList;

	public void setPage(Long page) {
		this.page = page;
	}
	public Long getPage( ) {
		return this.page;
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

	public void setVoucherTemplateList(List<YunTaskVoucherTemplateInfo> voucherTemplateList) {
		this.voucherTemplateList = voucherTemplateList;
	}
	public List<YunTaskVoucherTemplateInfo> getVoucherTemplateList( ) {
		return this.voucherTemplateList;
	}

}
