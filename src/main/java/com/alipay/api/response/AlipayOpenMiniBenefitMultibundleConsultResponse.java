package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpBenefitDataVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.benefit.multibundle.consult response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-20 14:50:17
 */
public class AlipayOpenMiniBenefitMultibundleConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2411844398457698527L;

	/** 
	 * 券内容
	 */
	@ApiListField("op_benefit_data_list")
	@ApiField("op_benefit_data_v_o")
	private List<OpBenefitDataVO> opBenefitDataList;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 条数
	 */
	@ApiField("total")
	private Long total;

	public void setOpBenefitDataList(List<OpBenefitDataVO> opBenefitDataList) {
		this.opBenefitDataList = opBenefitDataList;
	}
	public List<OpBenefitDataVO> getOpBenefitDataList( ) {
		return this.opBenefitDataList;
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

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
