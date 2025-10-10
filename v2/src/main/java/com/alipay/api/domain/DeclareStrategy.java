package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 建议策略
 *
 * @author auto create
 * @since 1.0, 2024-12-02 10:48:24
 */
public class DeclareStrategy extends AlipayObject {

	private static final long serialVersionUID = 1859332383746666553L;

	/**
	 * 建议调节量
	 */
	@ApiListField("declare_adjustment")
	@ApiField("load_info_node")
	private List<LoadInfoNode> declareAdjustment;

	/**
	 * 建议申报负荷
	 */
	@ApiListField("declare_load")
	@ApiField("load_info_node")
	private List<LoadInfoNode> declareLoad;

	public List<LoadInfoNode> getDeclareAdjustment() {
		return this.declareAdjustment;
	}
	public void setDeclareAdjustment(List<LoadInfoNode> declareAdjustment) {
		this.declareAdjustment = declareAdjustment;
	}

	public List<LoadInfoNode> getDeclareLoad() {
		return this.declareLoad;
	}
	public void setDeclareLoad(List<LoadInfoNode> declareLoad) {
		this.declareLoad = declareLoad;
	}

}
