package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AntlcNdaProtocolSignRecordExtDO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antlegalchain.ndalist.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 17:06:39
 */
public class AlipayBossProdAntlegalchainNdalistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6893246363712316891L;

	/** 
	 * 每页条数
	 */
	@ApiField("items_per_page")
	private Long itemsPerPage;

	/** 
	 * 当前页码
	 */
	@ApiField("page")
	private Long page;

	/** 
	 * NDA协议签约记录结果
	 */
	@ApiListField("page_list")
	@ApiField("antlc_nda_protocol_sign_record_ext_d_o")
	private List<AntlcNdaProtocolSignRecordExtDO> pageList;

	/** 
	 * 总条数
	 */
	@ApiField("total_items")
	private Long totalItems;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	public void setItemsPerPage(Long itemsPerPage) {
		this.itemsPerPage = itemsPerPage;
	}
	public Long getItemsPerPage( ) {
		return this.itemsPerPage;
	}

	public void setPage(Long page) {
		this.page = page;
	}
	public Long getPage( ) {
		return this.page;
	}

	public void setPageList(List<AntlcNdaProtocolSignRecordExtDO> pageList) {
		this.pageList = pageList;
	}
	public List<AntlcNdaProtocolSignRecordExtDO> getPageList( ) {
		return this.pageList;
	}

	public void setTotalItems(Long totalItems) {
		this.totalItems = totalItems;
	}
	public Long getTotalItems( ) {
		return this.totalItems;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

}
