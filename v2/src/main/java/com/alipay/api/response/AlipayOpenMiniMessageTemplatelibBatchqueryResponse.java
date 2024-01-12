package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantMsgTemplateLibVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.message.templatelib.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-08 11:56:58
 */
public class AlipayOpenMiniMessageTemplatelibBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7119779876322721222L;

	/** 
	 * 分页页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页大小，规定最大分页大小为10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 消息母板列表
	 */
	@ApiListField("template_lib_list")
	@ApiField("merchant_msg_template_lib_v_o")
	private List<MerchantMsgTemplateLibVO> templateLibList;

	/** 
	 * 查询结果总数
	 */
	@ApiField("total_count")
	private Long totalCount;

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

	public void setTemplateLibList(List<MerchantMsgTemplateLibVO> templateLibList) {
		this.templateLibList = templateLibList;
	}
	public List<MerchantMsgTemplateLibVO> getTemplateLibList( ) {
		return this.templateLibList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
