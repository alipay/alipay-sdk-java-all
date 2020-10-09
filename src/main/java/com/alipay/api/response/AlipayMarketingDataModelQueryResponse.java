package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ModelColumn;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.data.model.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayMarketingDataModelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5499242268759726194L;

	/** 
	 * 模型数据。此为参数列表，输出参数为模型字段及模型结果值; 用于数据实验室算法模型对外输出
alias:列别名。此为模型字段
data:列值。此为模型数值
	 */
	@ApiListField("model_column")
	@ApiField("model_column")
	private List<ModelColumn> modelColumn;

	public void setModelColumn(List<ModelColumn> modelColumn) {
		this.modelColumn = modelColumn;
	}
	public List<ModelColumn> getModelColumn( ) {
		return this.modelColumn;
	}

}
