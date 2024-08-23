package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RegisterApplyInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.enterprise.registerapply.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-22 17:46:35
 */
public class AlipayCommerceEcEnterpriseRegisterapplyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3257747788759645773L;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 单页容量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 注册申请信息列表
	 */
	@ApiListField("register_apply_info_list")
	@ApiField("register_apply_info_d_t_o")
	private List<RegisterApplyInfoDTO> registerApplyInfoList;

	/** 
	 * 总页数
	 */
	@ApiField("total_num")
	private Long totalNum;

	/** 
	 * 总条数
	 */
	@ApiField("total_size")
	private Long totalSize;

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

	public void setRegisterApplyInfoList(List<RegisterApplyInfoDTO> registerApplyInfoList) {
		this.registerApplyInfoList = registerApplyInfoList;
	}
	public List<RegisterApplyInfoDTO> getRegisterApplyInfoList( ) {
		return this.registerApplyInfoList;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
