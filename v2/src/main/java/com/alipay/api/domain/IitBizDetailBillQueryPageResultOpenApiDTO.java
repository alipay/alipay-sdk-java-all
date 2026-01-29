package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 结果集
 *
 * @author auto create
 * @since 1.0, 2026-01-21 10:12:42
 */
public class IitBizDetailBillQueryPageResultOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 4216329764329669581L;

	/**
	 * 计税是否完成
	 */
	@ApiField("calc_finish")
	private Boolean calcFinish;

	/**
	 * null
	 */
	@ApiListField("datas")
	@ApiField("iit_biz_detail_bill_detail_open_api_d_t_o")
	private List<IitBizDetailBillDetailOpenApiDTO> datas;

	/**
	 * 总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public Boolean getCalcFinish() {
		return this.calcFinish;
	}
	public void setCalcFinish(Boolean calcFinish) {
		this.calcFinish = calcFinish;
	}

	public List<IitBizDetailBillDetailOpenApiDTO> getDatas() {
		return this.datas;
	}
	public void setDatas(List<IitBizDetailBillDetailOpenApiDTO> datas) {
		this.datas = datas;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

}
