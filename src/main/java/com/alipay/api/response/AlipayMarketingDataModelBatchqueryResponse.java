package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ModelMeta;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.data.model.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayMarketingDataModelBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8348261864826569572L;

	/** 
	 * 模型列表信息。此为参数列表，输出参数为模型名称、模型描述、模型唯一查询标识符及查询参数; 用于数据实验室算法模型清单输出
model_name:模型名称。此为输出模型在数据实验室的名称
model_desc:模型描述。此为客户对输出模型功能描述
model_uk:模型唯一查询标识符。用于标识模型的唯一性
query_key:查询参数。此为查询外部用户身份信息类型
	 */
	@ApiListField("model_meta")
	@ApiField("model_meta")
	private List<ModelMeta> modelMeta;

	/** 
	 * 模型总页数。输出参数值为客户制作总模型数；用于查询模型数总量
	 */
	@ApiField("total_page_count")
	private String totalPageCount;

	public void setModelMeta(List<ModelMeta> modelMeta) {
		this.modelMeta = modelMeta;
	}
	public List<ModelMeta> getModelMeta( ) {
		return this.modelMeta;
	}

	public void setTotalPageCount(String totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	public String getTotalPageCount( ) {
		return this.totalPageCount;
	}

}
