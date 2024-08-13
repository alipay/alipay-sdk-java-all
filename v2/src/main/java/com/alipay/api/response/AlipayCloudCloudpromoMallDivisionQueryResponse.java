package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LmDivisionVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.mall.division.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-20 15:17:03
 */
public class AlipayCloudCloudpromoMallDivisionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1726584871578618313L;

	/** 
	 * 父地区码的所有子地区列表
	 */
	@ApiListField("division_list")
	@ApiField("lm_division_v_o")
	private List<LmDivisionVO> divisionList;

	public void setDivisionList(List<LmDivisionVO> divisionList) {
		this.divisionList = divisionList;
	}
	public List<LmDivisionVO> getDivisionList( ) {
		return this.divisionList;
	}

}
