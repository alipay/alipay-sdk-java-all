package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 财务相关主数据记录批量查询
 *
 * @author auto create
 * @since 1.0, 2024-08-29 10:41:51
 */
public class AlipayBossFncGfmdmRecordsBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1117458879667463428L;

	/**
	 * 用于主数据项过滤指定信息的参数列表
	 */
	@ApiListField("conditions")
	@ApiField("fv_pair_list")
	private List<FvPairList> conditions;

	/**
	 * 主数据项代号
	 */
	@ApiField("dicode")
	private String dicode;

	public List<FvPairList> getConditions() {
		return this.conditions;
	}
	public void setConditions(List<FvPairList> conditions) {
		this.conditions = conditions;
	}

	public String getDicode() {
		return this.dicode;
	}
	public void setDicode(String dicode) {
		this.dicode = dicode;
	}

}
