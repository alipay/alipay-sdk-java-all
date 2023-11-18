package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantMsgTemplateVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.message.template.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:46:46
 */
public class AlipayOpenMiniMessageTemplateBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4246378765918382723L;

	/** 
	 * 分页页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/** 
	 * 分页大小，规定最大分页大小为10
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 消息子板查询列表
	 */
	@ApiListField("template_list")
	@ApiField("merchant_msg_template_v_o")
	private List<MerchantMsgTemplateVO> templateList;

	/** 
	 * 查询结果总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}
	public String getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTemplateList(List<MerchantMsgTemplateVO> templateList) {
		this.templateList = templateList;
	}
	public List<MerchantMsgTemplateVO> getTemplateList( ) {
		return this.templateList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
