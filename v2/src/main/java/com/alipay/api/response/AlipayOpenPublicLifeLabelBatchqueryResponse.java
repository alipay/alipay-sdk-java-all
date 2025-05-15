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
 * @since 1.0, 2024-09-02 14:42:25
 */
public class AlipayOpenPublicLifeLabelBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7745942531581976723L;

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
