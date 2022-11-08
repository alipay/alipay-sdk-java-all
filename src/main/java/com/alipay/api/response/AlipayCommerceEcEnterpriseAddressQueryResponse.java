package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AddressInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.enterprise.address.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-18 15:41:51
 */
public class AlipayCommerceEcEnterpriseAddressQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4566495335633411416L;

	/** 
	 * 页码
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 地址列表
	 */
	@ApiListField("enterprise_address_info_list")
	@ApiField("address_info_d_t_o")
	private List<AddressInfoDTO> enterpriseAddressInfoList;

	/** 
	 * 总数量
	 */
	@ApiField("total_num")
	private Long totalNum;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setEnterpriseAddressInfoList(List<AddressInfoDTO> enterpriseAddressInfoList) {
		this.enterpriseAddressInfoList = enterpriseAddressInfoList;
	}
	public List<AddressInfoDTO> getEnterpriseAddressInfoList( ) {
		return this.enterpriseAddressInfoList;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

}
