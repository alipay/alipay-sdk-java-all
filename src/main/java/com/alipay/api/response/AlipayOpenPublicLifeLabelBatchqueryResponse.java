package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LifeLabel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.label.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-27 17:51:44
 */
public class AlipayOpenPublicLifeLabelBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3125799791299832929L;

	/** 
	 * 标签列表
	 */
	@ApiListField("labels")
	@ApiField("life_label")
	private List<LifeLabel> labels;

	public void setLabels(List<LifeLabel> labels) {
		this.labels = labels;
	}
	public List<LifeLabel> getLabels( ) {
		return this.labels;
	}

}
