package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 内容商品控货校验结果
 *
 * @author auto create
 * @since 1.0, 2024-05-31 16:46:20
 */
public class OpenContentGoodsCheckResult extends AlipayObject {

	private static final long serialVersionUID = 3285614752621258346L;

	/**
	 * 具体每项控货校验子项详情列表
	 */
	@ApiListField("sub_detail_list")
	@ApiField("open_goods_check_detail")
	private List<OpenGoodsCheckDetail> subDetailList;

	/**
	 * 所有控货结果汇总是否通过，true：控货通过，false：控货不通过
	 */
	@ApiField("summary_result")
	private Boolean summaryResult;

	public List<OpenGoodsCheckDetail> getSubDetailList() {
		return this.subDetailList;
	}
	public void setSubDetailList(List<OpenGoodsCheckDetail> subDetailList) {
		this.subDetailList = subDetailList;
	}

	public Boolean getSummaryResult() {
		return this.summaryResult;
	}
	public void setSummaryResult(Boolean summaryResult) {
		this.summaryResult = summaryResult;
	}

}
